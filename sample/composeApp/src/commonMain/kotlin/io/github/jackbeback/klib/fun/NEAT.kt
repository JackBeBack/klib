package io.github.jackbeback.klib.`fun`

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.button.LargeFloatingActionButton
import io.github.jackbeback.klib.UI.text.DefaultText
import io.github.jackbeback.klib.Utility.log
import io.github.jackbeback.klib.theme.icons.dazzleline.Clouds
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine
import io.github.jackbeback.klib.theme.icons.dazzleline.Pause
import io.github.jackbeback.klib.theme.icons.dazzleline.Play
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import kotlin.math.max
import kotlin.random.Random

@Composable
fun Neat() {
    var cells by remember { mutableStateOf(listOf<CellBlock>()) }
    var genePool by remember { mutableStateOf(listOf<CellBlock>()) }

    val topScores by derivedStateOf { cells.sortedBy { it.score }.reversed().take(5) }
    val gravity by remember { mutableStateOf(Offset(0f, 0f)) }
    var lastAverageScore by remember { mutableStateOf(0f) }

    val maxAge = 300L
    val maxCells = 100
    val dropOut = 0.05f

    var spawnLoop by remember { mutableStateOf(false) }

    var center by remember { mutableStateOf(Offset.Zero) }
    var spawn by rememberSaveable(center) { mutableStateOf(Offset(0f, center.y)) }
    var target by rememberSaveable(center) { mutableStateOf(Offset(center.x * 2, center.y)) }

    val FPS = 90
    var running by remember { mutableStateOf(false) }

    var time by remember { mutableStateOf(0L) }

    LaunchedEffect(running) {
        if (cells.isEmpty()) return@LaunchedEffect
        if (!running) {
            val average = cells.map { it.score }.average().toFloat()
            log.i("Max SCORE: ${cells.maxOf { it.score }} ($average) ")
            log.i("Trend: ${average - lastAverageScore}")
            lastAverageScore = average
            delay(1000L)
            //cells = cells.nextGeneration(spawn, maxCells)
        } else {
            log.i("Started with ${cells.size} cells")
        }
    }


    LaunchedEffect(running, target) {
        launch(Dispatchers.IO) {
            while (true) {
                if (running) {
                    if (time % 100 == 0L) {
                        //delete 10% of the worst performing gene pool
                        genePool = genePool.sortedBy { it.score }.take(maxCells - (maxCells*dropOut).toInt()).toMutableList()
                        println("Dropped ${dropOut*cells.size} Cells")
                    }

                    //apply physics
                    cells = cells.map {
                        it.copy(
                            pos = it.pos + it.vel.times(1f / FPS),
                            vel = it.vel + it.acc + gravity.times(1f / FPS),
                            age = it.age + 1L,
                            color = it.color.copy(
                                alpha = if (it.age > maxAge && !topScores.contains(it)) 0f else max(
                                    0f,
                                    minOf(1f, it.age / 100f)
                                )
                            ),
                            score = max(0f, target.minus(spawn).getDistance() - target.minus(it.pos).getDistance())
                        )
                    }
                    //calc average score
                    lastAverageScore = cells.map { it.score }.average().toFloat()

                    // create new cells when needed
                    if (cells.size < maxCells) {
                        cells = cells.toMutableList().apply {
                            if (genePool.size < maxCells) {
                                //spawn random Cell
                                add(CellBlock(pos = spawn, vel = Offset.Zero, acc = Offset(1f, 0f)))
                            }else{
                                //spawn mutation from genePool
                                add(genePool.nextCell(spawn))
                            }
                        }.toList()
                    }

                    //remove old cells
                    cells = cells.filter {
                        val isAlive = it.age < maxAge
                        if (!isAlive && it.score > lastAverageScore) {
                            genePool = genePool.toMutableList().apply { add(it) }
                        }
                        isAlive
                    }
                    //keep genePool a max Cell size
                    genePool = genePool.sortedBy { it.score }.take(maxCells)

                    if (cells.none { it.age < maxAge }) {
                        running = false
                    }

                    time += 1
                    delay(1000L / FPS)
                }
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            center = this.center
            cells.forEach { cell -> drawCircle(cell.color, radius = 10f, center = cell.pos) }

            drawCircle(Color.Green, radius = 10f, center = spawn)
            drawCircle(Color.Red, radius = 10f, center = target)
        }
        Column(modifier = Modifier.align(Alignment.TopEnd)) {
            Text("Number of Cells = ${cells.size} | ${lastAverageScore.toInt()}", modifier = Modifier)
            Text("GenePool = ${genePool.size} | ${genePool.map { it.score }.average().toInt()}", modifier = Modifier)
            topScores.forEach { cell ->
                Text("${cell.age} -> ${cell.score}", color = cell.color, modifier = Modifier)
            }
        }
        LargeFloatingActionButton(
            onClick = {
                running = !running
            },
            modifier = Modifier.align(Alignment.BottomStart).padding(32.dp),
            enabled = true,
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.errorContainer,
            disabledContentColor = Color.DarkGray,
            icon = if (running) DazzleLine.Pause else DazzleLine.Play
        )
    }
}

private fun Offset.Companion.random(scale: Float = 0f): Offset {
    return Offset((Random.nextFloat() - 0.5f) * scale, (Random.nextFloat() - 0.5f) * scale)
}

private fun Offset.Companion.founten(scale: Float = 0f): Offset {
    return Offset((Random.nextFloat() - 0.5f) * scale * 0.4f, (Random.nextFloat() - 1f) * scale)
}

fun List<CellBlock>.mutate(): List<CellBlock> {
    val increase = Random.nextBoolean()
    return this.map {
        it.copy(
            vel = it.vel,
            acc = if (increase) it.acc + Offset.random(1f) else it.acc - Offset.random(0.1f),
        )
    }
}

fun CellBlock.mutate(): CellBlock {
    val increase = Random.nextBoolean()
    val mutationScale = 0.5f
    return this.copy(
        vel = this.vel,
        acc = if (increase) this.acc + Offset.random(mutationScale) else this.acc - Offset.random(mutationScale),
    )
}

fun List<CellBlock>.nextGeneration(spawn: Offset, maxCells: Int): List<CellBlock> {
    val totalScore = this.sumOf { it.score.toDouble() }
    val averageScore = totalScore / this.size
    val newGeneration = mutableListOf<CellBlock>()
    repeat(maxCells) {
        newGeneration.add(
            this.filter { it.score < averageScore }.random().copy(pos = spawn, vel = Offset.Zero, age = 0L, score = 0F)
                .mutate()
        )
    }
    return newGeneration
}

fun List<CellBlock>.nextCell(spawn: Offset): CellBlock {
    val selectedCell = this.random()
    return  selectedCell.copy(pos = spawn, vel = Offset.Zero, age = 0L, score = 0F).mutate()
}

fun List<CellBlock>.random(): CellBlock {

    val totalScore = this.sumOf { it.score.toDouble() }

    val randomValue = Random.nextFloat() * totalScore
    var cumulativeScore = 0.0

    for (cell in this) {
        cumulativeScore += cell.score
        if (cumulativeScore >= randomValue) {
            return cell
        }
    }
    return CellBlock()
}


data class CellBlock(
    val pos: Offset = Offset.Zero,
    val vel: Offset = Offset.Zero,
    val acc: Offset = Offset.Zero,
    val age: Long = 0L,
    val color: Color = Color.random(),
    val score: Float = 0f
)

private fun Color.Companion.random(): Color {
    return Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 0f)
}

fun Offset.random(): Offset {
    return Offset(Random.nextFloat(), Random.nextFloat())
}