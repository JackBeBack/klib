package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Mouse: ImageVector
    get() {
        if (_Mouse != null) {
            return _Mouse!!
        }
        _Mouse = ImageVector.Builder(
            name = "Mouse",
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
                moveTo(13.363f, 21f)
                curveTo(10.401f, 21f, 8f, 18.599f, 8f, 15.637f)
                verticalLineTo(5.679f)
                curveTo(8f, 3.81f, 9.756f, 2.439f, 11.569f, 2.892f)
                lineTo(16.642f, 4.161f)
                curveTo(18.616f, 4.654f, 20f, 6.427f, 20f, 8.461f)
                verticalLineTo(14.363f)
                curveTo(20f, 18.029f, 17.029f, 21f, 13.363f, 21f)
                close()
                moveTo(13.363f, 21f)
                horizontalLineTo(13f)
                curveTo(8.029f, 21f, 4f, 17.822f, 4f, 13.902f)
                curveTo(4f, 11.442f, 5.588f, 9.273f, 8f, 8f)
                moveTo(14f, 8f)
                verticalLineTo(10f)
            }
        }.build()

        return _Mouse!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse: ImageVector? = null
