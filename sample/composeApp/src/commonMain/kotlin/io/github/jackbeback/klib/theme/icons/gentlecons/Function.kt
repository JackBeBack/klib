package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Function: ImageVector
    get() {
        if (_Function != null) {
            return _Function!!
        }
        _Function = ImageVector.Builder(
            name = "Function",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.928f, 6.398f)
                curveTo(3.166f, 4.888f, 4.234f, 2f, 6.555f, 2f)
                horizontalLineTo(19f)
                curveTo(19.552f, 2f, 20f, 2.448f, 20f, 3f)
                curveTo(20f, 3.552f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(6.555f)
                curveTo(6.091f, 4f, 5.877f, 4.578f, 6.229f, 4.88f)
                lineTo(12.322f, 10.102f)
                curveTo(13.486f, 11.1f, 13.486f, 12.9f, 12.322f, 13.898f)
                lineTo(6.229f, 19.12f)
                curveTo(5.877f, 19.423f, 6.091f, 20f, 6.555f, 20f)
                horizontalLineTo(19f)
                curveTo(19.552f, 20f, 20f, 20.448f, 20f, 21f)
                curveTo(20f, 21.552f, 19.552f, 22f, 19f, 22f)
                horizontalLineTo(6.555f)
                curveTo(4.234f, 22f, 3.166f, 19.112f, 4.928f, 17.602f)
                lineTo(11.021f, 12.38f)
                curveTo(11.253f, 12.18f, 11.253f, 11.82f, 11.021f, 11.62f)
                lineTo(4.928f, 6.398f)
                close()
            }
        }.build()

        return _Function!!
    }

@Suppress("ObjectPropertyName")
private var _Function: ImageVector? = null
