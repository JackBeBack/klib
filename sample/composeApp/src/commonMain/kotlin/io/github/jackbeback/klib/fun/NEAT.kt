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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.button.LargeFloatingActionButton
import io.github.jackbeback.klib.Utility.log
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine
import io.github.jackbeback.klib.theme.icons.dazzleline.Pause
import io.github.jackbeback.klib.theme.icons.dazzleline.Play
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.random.Random

@Composable
fun Neat() {
    var cells by remember { mutableStateOf(listOf<CellBlock>()) }
    val obstacles by remember { mutableStateOf(listOf<Obstacle>(
        Obstacle(topLeft = Offset(400f, 400f), bottomEnd = Offset(500f, 500f), color = Color.Red),
    )) }
    var genePool by remember { mutableStateOf(listOf<CellBlock>()) }
    val genePoolScore by derivedStateOf { genePool.map { it.highScore }.average() }
    //val maxScore = derivedStateOf { cells.maxOf { it.highScore } }

    val topScores by derivedStateOf { cells.sortedBy { it.highScore }.reversed().take(5) }
    val gravity by remember { mutableStateOf(Offset(0f, 0f)) }
    var lastAverageScore by remember { mutableStateOf(0f) }

    val maxAge = 500L
    val maxCells = 100
    val genePoolSize = 25
    val dropOut = 0.2f

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


    LaunchedEffect(running, target, spawn) {
        launch(Dispatchers.IO) {
            while (true) {
                if (running) {
                    if (time % 100 == 0L) {
                        //delete 10% of the worst performing gene pool
                        genePool = genePool.sortedBy { it.score }.take(maxCells - (genePoolSize*dropOut).toInt()).toMutableList()
                        println("Dropped ${(dropOut*genePool.size).toInt()} Cells")
                    }

                    //apply physics
                    cells = cells.map {
                        if (!it.alive) return@map it
                        it.copy(
                            pos = it.pos + it.vel.times(1f / FPS),
                            vel = it.vel + it.acc.times(1f / FPS),
                            acc = calcAccFromGene(it.gene, it.pos, Size(center.x*2, center.y*2), 1f),
                            alive = if (!it.alive) false else !obstacles.any { obstacle ->  obstacle.contains(it.pos) },
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
                            if (genePool.size < genePoolSize) {
                                //spawn random Cell
                                add(CellBlock(pos = spawn, vel = Offset.Zero, acc = Offset.Zero, gene = generateGene(4,
                                    (center.y*2).toInt()
                                )))
                            }else{
                                //spawn mutation from genePool
                                add(genePool.nextCell(spawn, Size(center.x*2, center.y*2)))
                            }
                        }.toList()
                    }

                    //remove old cells
                    cells = cells.filter {
                        val isAlive = it.age < maxAge
                        if (!isAlive && it.score > lastAverageScore) {
                            genePool = genePool.toMutableList().apply {
                                add(it.copy(highScore = if (it.score > it.highScore) it.score else it.highScore, score = 0f))
                            }
                        }
                        isAlive
                    }
                    //keep genePool a max Cell size
                    genePool = genePool.sortedBy { it.score }.reversed().take(genePoolSize)

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
            cells.forEach { cell ->
                drawCircle(cell.color, radius = if (cell in topScores) 20f else 10f, center = cell.pos)
            }
            obstacles.forEach { obstacle -> drawRect(obstacle.color, topLeft = obstacle.topLeft, size = Size(obstacle.bottomEnd.x - obstacle.topLeft.x, obstacle.bottomEnd.y - obstacle.topLeft.y)) }

            drawCircle(Color.Green, radius = 10f, center = spawn)
            drawCircle(Color.Red, radius = 10f, center = target)
        }
        Column(modifier = Modifier.align(Alignment.TopEnd)) {
            Text("Number of Cells = ${cells.size} | ${lastAverageScore.toInt()}", modifier = Modifier)
            Text("GenePool = ${genePool.size} | ${genePoolScore.toInt()}", modifier = Modifier)
            topScores.forEach { cell ->
                //Text("${cell.age} -> ${cell.score}", color = cell.color, modifier = Modifier)
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
    val angle = Random.nextFloat() * (2 * PI).toFloat() // Random angle in radians
    val length = Random.nextFloat() * scale // Random length scaled
    val x = length * kotlin.math.cos(angle)
    val y = length * kotlin.math.sin(angle)
    return Offset(x, y)
}

fun CellBlock.mutate(chance: Float = 1f, screenSize: Size): CellBlock {
    val increase = Random.nextBoolean()
    val mutationScale = 1f
    return if (Random.nextFloat() < chance) {
        this.copy(
            vel = this.vel,
            acc = if (increase) this.acc + Offset.random(mutationScale) else this.acc - Offset.random(mutationScale),
            gene = this.gene.mutate(0.5f, 1, screenSize.height.toInt(), 0),
            highScore = max(
                this.highScore,
                if (this.score > this.highScore) this.score else this.highScore
            )
        )
    }else {
        this
    }

}

fun List<Int>.mutate(chance: Float = 0.5f, mutationStep: Int = 1, maxValue: Int = 100, minValue: Int = 0): List<Int> {
    return this.map { gene ->
        if (Random.nextFloat() < chance) { // Apply mutation based on mutation chance
            val increase = Random.nextBoolean() // Randomly decide whether to increment or decrement
            val mutation = if (increase) {
                min(gene + Random.nextInt(1, mutationStep + 1), maxValue)
            } else {
                max(gene - Random.nextInt(1, mutationStep + 1), minValue)
            }
            mutation
        } else {
            gene // Keep the original value
        }
    }
}

fun List<CellBlock>.nextCell(spawn: Offset, screenSize: Size): CellBlock {
    val selectedCell = this.random()
    return  selectedCell.copy(pos = spawn, vel = Offset.Zero, age = 0L, score = 0F).mutate(screenSize = screenSize)
}


fun List<CellBlock>.random(biasFactor: Double = 1.5): CellBlock {
    // Calculate the total weight after applying the bias to the scores
    val totalWeight = this.sumOf { it.score.toDouble().pow(1.0 / biasFactor) }

    // Generate a random value in the range [0.0, totalWeight]
    val randomValue = Random.nextDouble() * totalWeight

    // Perform roulette-wheel selection using biased weights
    var cumulativeWeight = 0.0
    for (cell in this) {
        // Add the biased weight of the current cell to the cumulative weight
        cumulativeWeight += cell.score.toDouble().pow(1.0 / biasFactor)

        // If the random value is less than the cumulative weight, select the cell
        if (randomValue <= cumulativeWeight) {
            return cell
        }
    }

    // In case of floating-point rounding issues, return the last cell as a fallback
    return this.last()
}

fun generateGene(size: Int, max: Int): List<Int> {
    val ret = mutableListOf<Int>()
    repeat(size) {
        ret.add(Random.nextInt(0, max))
    }
    return ret.toList()
}



data class CellBlock(
    val pos: Offset = Offset.Zero,
    val vel: Offset = Offset.Zero,
    val acc: Offset = Offset.Zero,
    val alive: Boolean = true,
    val age: Long = 0L,
    val color: Color = Color.random(),
    val score: Float = 0f,
    val gene: List<Int> = listOf(),
    val highScore: Float = 0f
)

data class Obstacle(
    val topLeft: Offset,
    val bottomEnd: Offset,
    val color: Color
)

fun calcAccFromGene(gene: List<Int>, pos: Offset, screenSize: Size, scale: Float): Offset {
    val size = gene.size
    val step = screenSize.width / size
    val velY = gene[pos.x.div(step).toInt().coerceIn(gene.indices)].toFloat().minus(screenSize.height / 2f)
    return Offset(pos.x+step, velY).minus(pos)
}

fun Obstacle.contains(offset: Offset): Boolean {
    return offset.x in topLeft.x..bottomEnd.x && offset.y in topLeft.y..bottomEnd.y
}

private fun Color.Companion.random(): Color {
    return Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat(), 0f)
}

fun Offset.random(): Offset {
    return Offset(Random.nextFloat(), Random.nextFloat())
}