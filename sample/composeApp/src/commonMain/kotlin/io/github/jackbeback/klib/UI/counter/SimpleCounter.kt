package io.github.jackbeback.klib.UI.counter

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import kotlinx.coroutines.delay
import kotlin.random.Random


@Composable
fun SimpleCounter(
    count: Int,
    maxDigits: Int = 6,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.titleLarge
) {
    var oldCount by remember {
        mutableStateOf(count)
    }
    SideEffect {
        oldCount = count
    }
    Row(modifier = modifier) {
        val countString = count.toString().padStart(maxDigits, '0')
        val oldCountString = oldCount.toString()
        for (i in countString.indices) {
            val oldChar = oldCountString.getOrNull(i)
            val newChar = countString[i]
            val char = if (oldChar == newChar) {
                oldCountString[i]
            } else {
                countString[i]
            }
            AnimatedContent(
                targetState = char,
                transitionSpec = {
                    slideInVertically { it } togetherWith slideOutVertically { -it }
                }
            ) { char: Char ->
                Text(
                    text = char.toString(),
                    style = style,
                    softWrap = false
                )
            }
        }
    }

}

data class Duration(
    val hours: Int,
    val minutes: Int,
    val seconds: Int,
)

fun Duration.passTime(seconds: Int): Duration {
    val totalSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds - seconds
    val adjustedSeconds = if (totalSeconds >= 0) totalSeconds else 0 // Ensure no negative duration

    val adjustedHours = adjustedSeconds / 3600
    val adjustedMinutes = (adjustedSeconds % 3600) / 60
    val remainingSeconds = adjustedSeconds % 60

    return Duration(
        hours = adjustedHours,
        minutes = adjustedMinutes,
        seconds = remainingSeconds
    )
}

fun randomDuration(): Duration{
    return Duration(
        hours = Random.nextInt(24),
        minutes = Random.nextInt(60),
        seconds = Random.nextInt(60)
    )
}


@Composable
fun CountDown(
    initialTime: Duration = randomDuration(),
    style: TextStyle = MaterialTheme.typography.displayLarge.copy(
        fontFamily = FontFamily.Monospace
    )
){
    var currentTime by remember { mutableStateOf(initialTime) }
    val hours by derivedStateOf { currentTime.hours }
    val minutes by derivedStateOf { currentTime.minutes }
    val seconds by derivedStateOf { currentTime.seconds }

    LaunchedEffect(Unit){
        while (true){
            currentTime = currentTime.passTime(1)
            delay(1000L)
        }
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        SimpleCounter(count = hours, maxDigits = 2, style = style)
        Text(text = ":", style = style)
        SimpleCounter(count = minutes, maxDigits = 2, style = style)
        Text(text = ":", style = style)
        SimpleCounter(count = seconds, maxDigits = 2, style = style)
    }
}

@Composable
fun SampleCounter() {
    var count by remember { mutableStateOf(123456) }
    Box(modifier = Modifier.fillMaxSize()){
        Column(Modifier.align(Alignment.Center)) {
            SimpleCounter(count = count)
            CountDown()
        }
        Button(modifier = Modifier.align(Alignment.BottomCenter), onClick = { count = Random.nextInt(1000000) }) {}
    }
}