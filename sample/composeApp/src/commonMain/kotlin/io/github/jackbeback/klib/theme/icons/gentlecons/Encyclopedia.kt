package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Encyclopedia: ImageVector
    get() {
        if (_Encyclopedia != null) {
            return _Encyclopedia!!
        }
        _Encyclopedia = ImageVector.Builder(
            name = "Encyclopedia",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 23f)
                horizontalLineTo(7f)
                curveTo(4.275f, 23f, 2f, 20.705f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 3.239f, 4.239f, 1f, 7f, 1f)
                horizontalLineTo(19f)
                curveTo(20.657f, 1f, 22f, 2.343f, 22f, 4f)
                verticalLineTo(20f)
                curveTo(22f, 21.657f, 20.657f, 23f, 19f, 23f)
                close()
                moveTo(7f, 3f)
                curveTo(5.343f, 3f, 4f, 4.343f, 4f, 6f)
                verticalLineTo(15f)
                curveTo(4.836f, 14.372f, 5.874f, 14f, 7f, 14f)
                horizontalLineTo(19f)
                curveTo(19.351f, 14f, 19.687f, 14.06f, 20f, 14.171f)
                verticalLineTo(4f)
                curveTo(20f, 3.448f, 19.552f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                curveTo(18f, 9.369f, 17.797f, 9.708f, 17.472f, 9.882f)
                curveTo(17.147f, 10.056f, 16.752f, 10.037f, 16.445f, 9.832f)
                lineTo(14f, 8.202f)
                lineTo(11.555f, 9.832f)
                curveTo(11.248f, 10.037f, 10.853f, 10.056f, 10.528f, 9.882f)
                curveTo(10.203f, 9.708f, 10f, 9.369f, 10f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                close()
                moveTo(12f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(7.131f)
                lineTo(14.555f, 6.168f)
                curveTo(14.219f, 5.944f, 13.781f, 5.944f, 13.445f, 6.168f)
                lineTo(12f, 7.131f)
                verticalLineTo(3f)
                close()
                moveTo(19f, 16f)
                curveTo(19.552f, 16f, 20f, 16.448f, 20f, 17f)
                verticalLineTo(20f)
                curveTo(20f, 20.552f, 19.552f, 21f, 19f, 21f)
                horizontalLineTo(7f)
                curveTo(5.514f, 21f, 4.041f, 19.916f, 4.041f, 18.5f)
                curveTo(4.041f, 17.053f, 5.514f, 16f, 7f, 16f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _Encyclopedia!!
    }

@Suppress("ObjectPropertyName")
private var _Encyclopedia: ImageVector? = null
