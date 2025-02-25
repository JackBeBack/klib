package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Keyboard",
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
                moveTo(6f, 13f)
                horizontalLineTo(6.01f)
                moveTo(6f, 17f)
                horizontalLineTo(6.01f)
                moveTo(10f, 13f)
                horizontalLineTo(10.01f)
                moveTo(14f, 13f)
                horizontalLineTo(14.01f)
                moveTo(18f, 17f)
                horizontalLineTo(18.01f)
                moveTo(18f, 13f)
                horizontalLineTo(18.01f)
                moveTo(16f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(10f, 17f)
                horizontalLineTo(14f)
                moveTo(5.2f, 21f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 21f, 20.48f, 21f, 20.908f, 20.782f)
                curveTo(21.284f, 20.59f, 21.59f, 20.284f, 21.782f, 19.908f)
                curveTo(22f, 19.48f, 22f, 18.92f, 22f, 17.8f)
                verticalLineTo(12.2f)
                curveTo(22f, 11.08f, 22f, 10.52f, 21.782f, 10.092f)
                curveTo(21.59f, 9.716f, 21.284f, 9.41f, 20.908f, 9.218f)
                curveTo(20.48f, 9f, 19.92f, 9f, 18.8f, 9f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 9f, 3.52f, 9f, 3.092f, 9.218f)
                curveTo(2.716f, 9.41f, 2.41f, 9.716f, 2.218f, 10.092f)
                curveTo(2f, 10.52f, 2f, 11.08f, 2f, 12.2f)
                verticalLineTo(17.8f)
                curveTo(2f, 18.92f, 2f, 19.48f, 2.218f, 19.908f)
                curveTo(2.41f, 20.284f, 2.716f, 20.59f, 3.092f, 20.782f)
                curveTo(3.52f, 21f, 4.08f, 21f, 5.2f, 21f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
