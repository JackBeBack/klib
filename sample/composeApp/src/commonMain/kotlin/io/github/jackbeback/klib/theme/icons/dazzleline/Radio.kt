package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Radio: ImageVector
    get() {
        if (_Radio != null) {
            return _Radio!!
        }
        _Radio = ImageVector.Builder(
            name = "Radio",
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
                moveTo(19f, 4f)
                horizontalLineTo(9f)
                curveTo(8.07f, 4f, 7.605f, 4f, 7.224f, 4.102f)
                curveTo(6.188f, 4.38f, 5.38f, 5.188f, 5.102f, 6.224f)
                curveTo(5f, 6.605f, 5f, 7.089f, 5f, 8.019f)
                moveTo(5f, 8.019f)
                curveTo(5.314f, 8f, 5.702f, 8f, 6.2f, 8f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 8f, 19.48f, 8f, 19.908f, 8.218f)
                curveTo(20.284f, 8.41f, 20.59f, 8.716f, 20.782f, 9.092f)
                curveTo(21f, 9.52f, 21f, 10.08f, 21f, 11.2f)
                verticalLineTo(16.8f)
                curveTo(21f, 17.92f, 21f, 18.48f, 20.782f, 18.908f)
                curveTo(20.59f, 19.284f, 20.284f, 19.59f, 19.908f, 19.782f)
                curveTo(19.48f, 20f, 18.92f, 20f, 17.8f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                verticalLineTo(11.2f)
                curveTo(3f, 10.08f, 3f, 9.52f, 3.218f, 9.092f)
                curveTo(3.41f, 8.716f, 3.716f, 8.41f, 4.092f, 8.218f)
                curveTo(4.33f, 8.097f, 4.608f, 8.043f, 5f, 8.019f)
                close()
                moveTo(14f, 12f)
                horizontalLineTo(18f)
                moveTo(14f, 16f)
                horizontalLineTo(18f)
                moveTo(10f, 14f)
                curveTo(10f, 15.105f, 9.105f, 16f, 8f, 16f)
                curveTo(6.895f, 16f, 6f, 15.105f, 6f, 14f)
                curveTo(6f, 12.895f, 6.895f, 12f, 8f, 12f)
                curveTo(9.105f, 12f, 10f, 12.895f, 10f, 14f)
                close()
            }
        }.build()

        return _Radio!!
    }

@Suppress("ObjectPropertyName")
private var _Radio: ImageVector? = null
