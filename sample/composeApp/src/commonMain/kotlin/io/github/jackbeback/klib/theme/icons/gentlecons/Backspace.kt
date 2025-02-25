package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Backspace: ImageVector
    get() {
        if (_Backspace != null) {
            return _Backspace!!
        }
        _Backspace = ImageVector.Builder(
            name = "Backspace",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.707f, 15.294f)
                curveTo(11.317f, 14.903f, 11.317f, 14.27f, 11.707f, 13.88f)
                lineTo(13.584f, 12.003f)
                lineTo(11.708f, 10.127f)
                curveTo(11.317f, 9.736f, 11.317f, 9.103f, 11.708f, 8.712f)
                curveTo(12.098f, 8.322f, 12.732f, 8.322f, 13.122f, 8.712f)
                lineTo(14.998f, 10.589f)
                lineTo(16.88f, 8.707f)
                curveTo(17.27f, 8.316f, 17.903f, 8.316f, 18.294f, 8.707f)
                curveTo(18.684f, 9.098f, 18.684f, 9.731f, 18.294f, 10.121f)
                lineTo(16.412f, 12.003f)
                lineTo(18.293f, 13.883f)
                curveTo(18.684f, 14.274f, 18.684f, 14.907f, 18.293f, 15.297f)
                curveTo(17.903f, 15.688f, 17.269f, 15.688f, 16.879f, 15.297f)
                lineTo(14.998f, 13.417f)
                lineTo(13.121f, 15.294f)
                curveTo(12.731f, 15.684f, 12.098f, 15.684f, 11.707f, 15.294f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.613f, 5.147f)
                curveTo(6.182f, 4.423f, 7.051f, 4f, 7.972f, 4f)
                horizontalLineTo(20f)
                curveTo(21.657f, 4f, 23f, 5.343f, 23f, 7f)
                verticalLineTo(17f)
                curveTo(23f, 18.657f, 21.657f, 20f, 20f, 20f)
                horizontalLineTo(7.972f)
                curveTo(7.051f, 20f, 6.182f, 19.577f, 5.613f, 18.854f)
                lineTo(1.685f, 13.854f)
                curveTo(0.83f, 12.766f, 0.83f, 11.234f, 1.685f, 10.146f)
                lineTo(5.613f, 5.147f)
                close()
                moveTo(7.972f, 6f)
                curveTo(7.665f, 6f, 7.375f, 6.141f, 7.186f, 6.382f)
                lineTo(3.257f, 11.382f)
                curveTo(2.972f, 11.745f, 2.972f, 12.255f, 3.257f, 12.618f)
                lineTo(7.186f, 17.618f)
                curveTo(7.375f, 17.859f, 7.665f, 18f, 7.972f, 18f)
                horizontalLineTo(20f)
                curveTo(20.552f, 18f, 21f, 17.552f, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                horizontalLineTo(7.972f)
                close()
            }
        }.build()

        return _Backspace!!
    }

@Suppress("ObjectPropertyName")
private var _Backspace: ImageVector? = null
