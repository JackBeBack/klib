package io.github.jackbeback.klib.UI.plot

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import kotlinx.coroutines.delay
import kotlin.math.abs

@Composable
fun PlotView(modifier: Modifier, props: PlotProperties, data: List<Offset>) {
    val textMeasurer = rememberTextMeasurer()
    var zoom by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (zoom) 2f else 1f,
        finishedListener = { zoom = !zoom },
        animationSpec = tween(5000)
    )

    LaunchedEffect(Unit) {
        delay(2000)
        zoom = !zoom
    }
    Canvas(modifier = modifier) {
        scale(scale, Offset.Zero.copy(y = size.height)) {
            translate(props) {
                drawAxis(props, textMeasurer)
                drawDataPoint(props, data, scale)
            }
        }
    }
}

@Composable
fun AutoScalePlotView(modifier: Modifier, props: PlotProperties, data: List<Offset>) {
    val canvasSize = remember { mutableStateOf(Size.Zero) }
    val p by derivedStateOf {
        props.copy(
            scale = Offset(
                (canvasSize.value.width-props.padding*2) / props.window.getSize().width,
                (canvasSize.value.height-props.padding*2) / props.window.getSize().height
            )
        )
    }
    val textMeasurer = rememberTextMeasurer()

    val scale = 1f

    Canvas(modifier = modifier) {
        canvasSize.value = size
        translate(p) {
            drawAxis(p, textMeasurer)
            drawDataPoint(p, data, scale)
        }
    }
}

private fun DrawScope.drawDataPoint(props: PlotProperties, points: List<Offset>, scale: Float = 1f) {
    val size = 10f / scale
    val data = points.map { it.copy((it.x - props.window.minValues.x) * props.scale.x, (it.y - props.window.minValues.y) * props.scale.y) }
    data.forEach {
        when (props.pointType) {
            PointType.CIRCLE -> drawCircle(props.dataColor, center = it.copy(y = -it.y), radius = size)
            PointType.SQUARE -> drawRect(
                props.dataColor,
                topLeft = it.copy(x = it.x - size / 2f, y = -(it.y + size / 2f)),
                size = Size(size, size)
            )
        }
    }
    when (props.lineConnector) {
        LineConnector.DASHED -> {
            val pathEffect = PathEffect.dashPathEffect(floatArrayOf(size, size), 0f)
            for (i in 0 until data.size - 1) {
                drawLine(
                    color = props.dataColor,
                    start = data[i].copy(y = -data[i].y),
                    end = data[i + 1].copy(y = -data[i + 1].y),
                    pathEffect = pathEffect,
                    strokeWidth = 2f
                )
            }
        }

        LineConnector.SOLID -> {
            for (i in 0 until data.size - 1) {
                drawLine(
                    color = props.dataColor,
                    start = data[i].copy(y = -data[i].y),
                    end = data[i + 1].copy(y = -data[i + 1].y),
                    strokeWidth = 2f
                )
            }
        }

        null -> {
            // Do nothing
        }
    }
}

private fun DrawScope.translate(props: PlotProperties, content: DrawScope.() -> Unit) {
    when (props.quadrant) {
        PlotQuadrant.FIRST -> translate(left = center.x, top = center.y, block = content)
        PlotQuadrant.SECOND -> translate(left = props.padding, top = size.height - props.padding, block = content)
        PlotQuadrant.THIRD -> TODO()
        PlotQuadrant.FOURTH -> TODO()
        PlotQuadrant.ALL -> translate(left = center.x, top = center.y, block = content)
    }
}

private fun DrawScope.drawAxis(props: PlotProperties, textMeasurer: TextMeasurer) {
    var xStart = 0f
    var xEnd = props.window.getSize().width * props.scale.x
    var yStart = 0f
    var yEnd = -props.window.getSize().height * props.scale.y

    when (props.quadrant) {
        PlotQuadrant.ALL -> {
            xStart = -size.width / 2f + props.padding
            xEnd = size.width / 2f - props.padding
            yStart = size.height / 2f - props.padding
            yEnd = -size.height / 2f + props.padding

            val arrowSize = 20f

            //Y axis
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset.Zero.copy(y = yStart),
                end = Offset.Zero.copy(y = yEnd)
            )
            //X axis
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset.Zero.copy(x = xStart),
                end = Offset.Zero.copy(x = xEnd)
            )
            if (props.drawAxisArrow) {
                // X Arrow
                drawPath(Path().apply {
                    moveTo(xEnd, 0f)
                    lineTo(xEnd - arrowSize, arrowSize / 2)
                    lineTo(xEnd - arrowSize, -arrowSize / 2)
                    close()
                }, color = props.axisColor)

                // Y Arrow
                drawPath(Path().apply {
                    moveTo(0f, yEnd)
                    lineTo(arrowSize / 2, yEnd + arrowSize)
                    lineTo(-arrowSize / 2, yEnd + arrowSize)
                    close()
                }, color = props.axisColor)
            }
        }

        PlotQuadrant.SECOND -> {
            val arrowSize = 20f

            //Y axis
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset.Zero.copy(y = yStart + props.axisStrokeWidth / 2f),
                end = Offset.Zero.copy(y = yEnd)
            )
            //X axis
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset.Zero.copy(x = xStart),
                end = Offset.Zero.copy(x = xEnd)
            )
            if (props.drawAxisArrow) {
                // X Arrow
                drawPath(Path().apply {
                    moveTo(xEnd, 0f)
                    lineTo(xEnd - arrowSize, arrowSize / 2)
                    lineTo(xEnd - arrowSize, -arrowSize / 2)
                    close()
                }, color = props.axisColor)

                // Y Arrow
                drawPath(Path().apply {
                    moveTo(0f, yEnd)
                    lineTo(arrowSize / 2, yEnd + arrowSize)
                    lineTo(-arrowSize / 2, yEnd + arrowSize)
                    close()
                }, color = props.axisColor)
            }

        }

        else -> {}
    }
    if (props.drawGrid) {
        val pathEffect = PathEffect.dashPathEffect(floatArrayOf(30f, 15f), 0f)
        for (x in 0..props.window.maxValues.x.toInt() step props.tickSteps.width.toInt()) {
            drawLine(
                color = props.axisColor.copy(alpha = 0.1f),
                strokeWidth = props.axisStrokeWidth,
                pathEffect = pathEffect,
                start = Offset(x.toFloat() * props.scale.x, yStart),
                end = Offset(x.toFloat() * props.scale.x, yEnd)
            )
        }
        for (x in props.tickSteps.width.toInt() downTo props.window.minValues.x.toInt() step props.tickSteps.width.toInt()) {
            drawLine(
                color = props.axisColor.copy(alpha = 0.1f),
                strokeWidth = props.axisStrokeWidth,
                pathEffect = pathEffect,
                start = Offset(x.toFloat() * props.scale.x, yStart),
                end = Offset(x.toFloat() * props.scale.x, yEnd)
            )
        }
        for (y in 0 downTo -props.window.maxValues.y.toInt() step props.tickSteps.height.toInt()) {
            drawLine(
                color = props.axisColor.copy(alpha = 0.1f),
                strokeWidth = props.axisStrokeWidth,
                pathEffect = pathEffect,
                start = Offset(xStart, y.toFloat() * props.scale.y),
                end = Offset(xEnd, y.toFloat() * props.scale.y)
            )
        }
        for (y in 0..props.window.minValues.y.toInt() step props.tickSteps.height.toInt()) {
            drawLine(
                color = props.axisColor.copy(alpha = 0.1f),
                strokeWidth = props.axisStrokeWidth,
                pathEffect = pathEffect,
                start = Offset(xStart, y.toFloat() * props.scale.y),
                end = Offset(xEnd, y.toFloat() * props.scale.y)
            )
        }
    }
    if (props.drawTicks) {
        // X Positive Direction
        for (x in (if (props.quadrant == PlotQuadrant.ALL) props.tickSteps.width.toInt() else 0)..xEnd.toInt() step props.tickSteps.width.toInt()) {
            val realX = x + props.window.minValues.x.toInt()
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset(x.toFloat() * props.scale.x, (props.axisStrokeWidth / 2f)),
                end = Offset(x.toFloat() * props.scale.x, -10f)
            )

            drawText(
                textMeasurer = textMeasurer,
                text = realX.toString(),
                topLeft = Offset(
                    (x.toFloat() * props.scale.x - textMeasurer.measure(realX.toString()).size.width / 2f),
                    10f
                ),
                size = Size(100f, 100f)
            )

        }
        // X Negative Direction
        for (x in -props.tickSteps.width.toInt() downTo xStart.toInt() step props.tickSteps.width.toInt()) {
            val realX = x + props.window.minValues.x.toInt()
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset(x.toFloat() * props.scale.x, (props.axisStrokeWidth / 2f)),
                end = Offset(x.toFloat() * props.scale.x, -10f)
            )
            drawText(
                textMeasurer = textMeasurer,
                text = realX.toString(),
                topLeft = Offset(
                    (x.toFloat() * props.scale.x - textMeasurer.measure(realX.toString()).size.height / 2f), 10f
                )
            )
        }
        // Y Positive Direction
        for (y in 0 downTo -props.window.getSize().height.toInt() step props.tickSteps.height.toInt()) {
            val realY = y - props.window.minValues.y.toInt()
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset((-props.axisStrokeWidth / 2), y.toFloat() * props.scale.y),
                end = Offset(10f, y.toFloat() * props.scale.y)
            )
            drawText(
                textMeasurer = textMeasurer,
                style = TextStyle(color = props.axisColor),
                text = (realY * -1).toString(),
                topLeft = Offset(
                    (-textMeasurer.measure((realY * -1).toString()).size.width.toFloat() - 10f),
                    (y.toFloat() * props.scale.y - textMeasurer.measure((realY * -1).toString()).size.height.toFloat() / 2)
                )
            )
        }
        // Y Negative Direction
        for (y in 0..props.window.minValues.y.toInt() step props.tickSteps.height.toInt()) {
            val realY = y - props.window.minValues.y.toInt()
            drawLine(
                color = props.axisColor,
                strokeWidth = props.axisStrokeWidth,
                start = Offset((-props.axisStrokeWidth / 2) * props.scale.x, y.toFloat() * props.scale.y),
                end = Offset(10f * props.scale.x, y.toFloat() * props.scale.y)
            )
            drawText(
                textMeasurer = textMeasurer,
                style = TextStyle(color = props.axisColor),
                text = (realY * -1).toString(),
                topLeft = Offset(
                    (-textMeasurer.measure((realY * -1).toString()).size.width.toFloat() - 10f),
                    (y.toFloat() * props.scale.y - textMeasurer.measure((realY * -1).toString()).size.height.toFloat() / 2)
                )
            )
        }
    }
}

@Composable
fun getDefaultsPlotProperties(): PlotProperties {
    return PlotProperties().copy(axisColor = MaterialTheme.colorScheme.onBackground)
}

enum class PlotType {
    LINE
}

enum class PointType {
    CIRCLE,
    SQUARE
}

enum class LineConnector {
    DASHED,
    SOLID,
}

enum class PlotQuadrant {
    FIRST,  // X Negative Y Positive
    SECOND, // X Positive Y Positive
    THIRD,
    FOURTH,
    ALL
}

@Composable
fun OvertimePlot(modifier: Modifier = Modifier, data: List<Float>, timeStep: Float) {
    PlotView(
        modifier = modifier,
        props = getDefaultsPlotProperties(),
        data = data.mapIndexed { index, fl -> Offset(x = (data.size - index) * timeStep, y = fl) })
}

data class PlotWindow(
    val minValues: Offset = Offset(100f, -100f),
    val maxValues: Offset = Offset(400f, 400f),
)

fun PlotWindow.getSize(): Size {
    return Size(width = abs(maxValues.x - minValues.x), height = abs(maxValues.y - minValues.y))
}

@Composable
fun PlotSample() {
    var data by remember { mutableStateOf(listOf<Offset>(
        Offset(100f, -100f),
        Offset(400f, 400f)
    )) }
    LaunchedEffect(Unit) {
        while (false) {
            data = data.plus(Offset(x = (100..400).random().toFloat(), y = (-100..400).random().toFloat()))
            delay(1000)
        }
    }
    AutoScalePlotView(modifier = Modifier.fillMaxSize(), getDefaultsPlotProperties(), data)
    //OvertimePlot(modifier = Modifier.fillMaxSize(), data.map { it.y }, timeStep = 10f)
}

data class PlotProperties(
    val plotType: PlotType = PlotType.LINE,
    val quadrant: PlotQuadrant = PlotQuadrant.SECOND,
    val axisColor: Color = Color.Black,
    val drawAxis: Boolean = true,
    val drawAxisArrow: Boolean = true,
    val axisStrokeWidth: Float = 4f,
    val padding: Float = 100f,
    val dataColor: Color = Color.Blue,
    val drawTicks: Boolean = true,
    val drawGrid: Boolean = true,
    val tickSteps: Size = Size(100f, 100f),
    val pointType: PointType = PointType.SQUARE,
    val lineConnector: LineConnector? = LineConnector.DASHED,
    val window: PlotWindow = PlotWindow(),
    val scale: Offset = Offset(2f, 2f)
)