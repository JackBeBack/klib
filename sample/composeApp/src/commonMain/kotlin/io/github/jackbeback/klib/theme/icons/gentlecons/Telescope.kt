package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Telescope: ImageVector
    get() {
        if (_Telescope != null) {
            return _Telescope!!
        }
        _Telescope = ImageVector.Builder(
            name = "Telescope",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.83f, 4.033f)
                lineTo(4.168f, 6.741f)
                curveTo(3.097f, 7.013f, 2.45f, 8.101f, 2.722f, 9.171f)
                lineTo(1.753f, 9.418f)
                curveTo(1.217f, 9.554f, 0.894f, 10.098f, 1.029f, 10.633f)
                curveTo(1.165f, 11.168f, 1.71f, 11.492f, 2.245f, 11.356f)
                lineTo(3.214f, 11.11f)
                curveTo(3.486f, 12.181f, 4.574f, 12.828f, 5.645f, 12.556f)
                lineTo(9f, 11.704f)
                lineTo(9f, 13.001f)
                curveTo(9f, 13.175f, 9.028f, 13.348f, 9.07f, 13.516f)
                lineTo(3.293f, 19.293f)
                curveTo(2.902f, 19.684f, 2.902f, 20.317f, 3.293f, 20.707f)
                curveTo(3.683f, 21.098f, 4.317f, 21.098f, 4.707f, 20.707f)
                lineTo(10.303f, 15.111f)
                curveTo(10.509f, 15.224f, 10.741f, 15.316f, 11f, 15.382f)
                verticalLineTo(22f)
                curveTo(11f, 22.552f, 11.448f, 23f, 12f, 23f)
                curveTo(12.552f, 23f, 13f, 22.552f, 13f, 22f)
                verticalLineTo(15.382f)
                curveTo(13.259f, 15.316f, 13.491f, 15.224f, 13.697f, 15.111f)
                lineTo(19.293f, 20.707f)
                curveTo(19.683f, 21.098f, 20.317f, 21.098f, 20.707f, 20.707f)
                curveTo(21.098f, 20.317f, 21.098f, 19.684f, 20.707f, 19.293f)
                lineTo(14.93f, 13.516f)
                curveTo(14.972f, 13.347f, 15f, 13.174f, 15f, 13f)
                verticalLineTo(10.18f)
                lineTo(16.306f, 9.848f)
                curveTo(16.578f, 10.919f, 17.667f, 11.566f, 18.737f, 11.295f)
                lineTo(20.676f, 10.802f)
                curveTo(22.281f, 10.394f, 23.253f, 8.762f, 22.845f, 7.156f)
                lineTo(21.86f, 3.279f)
                curveTo(21.452f, 1.673f, 19.82f, 0.702f, 18.214f, 1.11f)
                lineTo(16.276f, 1.602f)
                curveTo(15.205f, 1.874f, 14.558f, 2.962f, 14.83f, 4.033f)
                close()
                moveTo(18.706f, 3.048f)
                lineTo(16.768f, 3.541f)
                lineTo(18.245f, 9.356f)
                lineTo(20.183f, 8.864f)
                curveTo(20.719f, 8.728f, 21.042f, 8.184f, 20.906f, 7.648f)
                lineTo(19.922f, 3.771f)
                curveTo(19.786f, 3.236f, 19.242f, 2.912f, 18.706f, 3.048f)
                close()
                moveTo(15.814f, 7.91f)
                lineTo(15.322f, 5.971f)
                lineTo(4.66f, 8.679f)
                lineTo(5.153f, 10.618f)
                lineTo(15.814f, 7.91f)
                close()
                moveTo(11f, 11.196f)
                verticalLineTo(12.975f)
                curveTo(11.056f, 13.437f, 11.634f, 13.5f, 12f, 13.5f)
                curveTo(12.366f, 13.5f, 12.945f, 13.434f, 13f, 12.975f)
                verticalLineTo(10.688f)
                lineTo(11f, 11.196f)
                close()
            }
        }.build()

        return _Telescope!!
    }

@Suppress("ObjectPropertyName")
private var _Telescope: ImageVector? = null
