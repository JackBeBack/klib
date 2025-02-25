package io.github.jackbeback.klib.UI

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.foundation.Canvas
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.drawscope.*
import androidx.compose.ui.unit.dp
import kotlin.math.*

data class GaugeSettings( // Settings to customize the appearance
    val backgroundColor: Color,         // Background arc color
    val progressColor: Color,         // Foreground arc (progress) color
    val needleColor: Color,                 // Needle color
    val textColor: Color,                   // Text color
    val strokeWidthFactor: Float = 0.1f,                  // Proportional stroke width (relative to size)
    val needleWidthFactor: Float = 0.4f                   // Proportional needle width (relative to stroke width)
)

@Composable
fun DefaultGaugeSettings(): GaugeSettings = GaugeSettings(
    backgroundColor = MaterialTheme.colorScheme.surface,         // Background arc color
    progressColor = MaterialTheme.colorScheme.primary,              // Foreground arc (progress) color
    needleColor = MaterialTheme.colorScheme.onBackground,           // Needle color
    textColor = MaterialTheme.colorScheme.onBackground              // Text color
)

@Composable
fun GaugeDisplay(
    value: Float,
    unit: String = "%",
    modifier: Modifier = Modifier.size(400.dp),
    minValue: Float = 0f,
    maxValue: Float = 100f,
    gaugeSettings: GaugeSettings = DefaultGaugeSettings() // Use settings for customization
) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Gauge(
            value = value,
            minValue = minValue,
            maxValue = maxValue,
            settings = gaugeSettings,
            modifier = Modifier.fillMaxSize()
        )
        Text(
            text = "$value $unit",
            color = gaugeSettings.textColor // Dynamic text color
        )
    }
}

@Composable
fun Gauge(
    value: Float,
    minValue: Float = 0f,
    maxValue: Float = 1f,
    settings: GaugeSettings = DefaultGaugeSettings(),
    modifier: Modifier = Modifier
) {
    // Animate the incoming value
    val animatedValue by animateFloatAsState(
        targetValue = value.coerceIn(minValue, maxValue),
        animationSpec = tween(durationMillis = 800, easing = FastOutSlowInEasing)
    )

    // Angles for the 3/4 circle
    val startAngle = 135f
    val sweepAngle = 270f

    Canvas(modifier = modifier) {
        // Initialize parameters
        val center = center
        val strokeWidth = size.minDimension * settings.strokeWidthFactor
        val radius = (size.minDimension - strokeWidth) / 2f

        // Draw background arc
        drawArc(
            color = settings.backgroundColor,
            startAngle = startAngle,
            sweepAngle = sweepAngle,
            useCenter = false,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
        )

        // Calculate progress sweep angle based on value
        val progressAngle = (animatedValue - minValue) / (maxValue - minValue) * sweepAngle

        // Draw progress arc
        drawArc(
            color = settings.progressColor,
            startAngle = startAngle,
            sweepAngle = progressAngle,
            useCenter = false,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
        )

        // Draw needle
        val needleAngle = (startAngle + progressAngle) * (PI / 180f)
        val needleEnd = Offset(
            x = center.x + radius * cos(needleAngle).toFloat(),
            y = center.y + radius * sin(needleAngle).toFloat()
        )
        val needleDir = center.minus(needleEnd)
        val needleStart = center.minus(needleDir.div(needleDir.getDistance()).times(80f))
        drawLine(
            color = settings.needleColor,
            start = needleStart,
            end = needleEnd,
            strokeWidth = strokeWidth * settings.needleWidthFactor,
            cap = StrokeCap.Round
        )
    }
}