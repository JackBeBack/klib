package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bug: ImageVector
    get() {
        if (_Bug != null) {
            return _Bug!!
        }
        _Bug = ImageVector.Builder(
            name = "Bug",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 19f)
                curveTo(9.239f, 19f, 7f, 16.761f, 7f, 14f)
                moveTo(12f, 19f)
                curveTo(14.761f, 19f, 17f, 16.761f, 17f, 14f)
                moveTo(12f, 19f)
                verticalLineTo(14f)
                moveTo(7f, 14f)
                verticalLineTo(11.857f)
                curveTo(7f, 11.059f, 7f, 10.66f, 7.112f, 10.339f)
                curveTo(7.313f, 9.765f, 7.765f, 9.313f, 8.339f, 9.112f)
                curveTo(8.66f, 9f, 9.059f, 9f, 9.857f, 9f)
                horizontalLineTo(14.143f)
                curveTo(14.941f, 9f, 15.34f, 9f, 15.661f, 9.112f)
                curveTo(16.235f, 9.313f, 16.687f, 9.765f, 16.888f, 10.339f)
                curveTo(17f, 10.66f, 17f, 11.059f, 17f, 11.857f)
                verticalLineTo(14f)
                moveTo(7f, 14f)
                horizontalLineTo(4f)
                moveTo(17f, 14f)
                horizontalLineTo(20f)
                moveTo(17f, 10f)
                lineTo(19.5f, 7.5f)
                moveTo(4.5f, 20.5f)
                lineTo(8f, 17f)
                moveTo(7f, 10f)
                lineTo(4.5f, 7.5f)
                moveTo(19.5f, 20.5f)
                lineTo(16f, 17f)
                moveTo(14f, 6f)
                verticalLineTo(5f)
                curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
                curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Bug!!
    }

@Suppress("ObjectPropertyName")
private var _Bug: ImageVector? = null
