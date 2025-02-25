package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartUserSquare: ImageVector
    get() {
        if (_ChartUserSquare != null) {
            return _ChartUserSquare!!
        }
        _ChartUserSquare = ImageVector.Builder(
            name = "ChartUserSquare",
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
                moveTo(14f, 16f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 16f, 19.48f, 16f, 19.908f, 15.782f)
                curveTo(20.284f, 15.59f, 20.59f, 15.284f, 20.782f, 14.908f)
                curveTo(21f, 14.48f, 21f, 13.92f, 21f, 12.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 3f, 7.52f, 3f, 7.092f, 3.218f)
                curveTo(6.716f, 3.41f, 6.41f, 3.716f, 6.218f, 4.092f)
                curveTo(6.013f, 4.494f, 6.001f, 5.012f, 6f, 6f)
                moveTo(18f, 6f)
                lineTo(13f, 11f)
                lineTo(10f, 8f)
                moveTo(18f, 6f)
                verticalLineTo(9f)
                moveTo(18f, 6f)
                horizontalLineTo(15f)
                moveTo(9f, 12f)
                curveTo(9f, 13.105f, 8.105f, 14f, 7f, 14f)
                curveTo(5.895f, 14f, 5f, 13.105f, 5f, 12f)
                curveTo(5f, 10.895f, 5.895f, 10f, 7f, 10f)
                curveTo(8.105f, 10f, 9f, 10.895f, 9f, 12f)
                close()
                moveTo(7f, 17f)
                curveTo(7.93f, 17f, 8.395f, 17f, 8.776f, 17.102f)
                curveTo(9.812f, 17.38f, 10.62f, 18.188f, 10.898f, 19.223f)
                curveTo(11f, 19.605f, 11f, 20.07f, 11f, 21f)
                horizontalLineTo(3f)
                curveTo(3f, 20.07f, 3f, 19.605f, 3.102f, 19.223f)
                curveTo(3.38f, 18.188f, 4.188f, 17.38f, 5.224f, 17.102f)
                curveTo(5.605f, 17f, 6.07f, 17f, 7f, 17f)
                close()
            }
        }.build()

        return _ChartUserSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ChartUserSquare: ImageVector? = null
