package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Layers: ImageVector
    get() {
        if (_Layers != null) {
            return _Layers!!
        }
        _Layers = ImageVector.Builder(
            name = "Layers",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.678f, 2.303f)
                curveTo(11.51f, 1.899f, 12.49f, 1.899f, 13.322f, 2.303f)
                lineTo(20.638f, 5.858f)
                curveTo(22.454f, 6.741f, 22.454f, 9.259f, 20.638f, 10.142f)
                lineTo(13.322f, 13.697f)
                curveTo(12.49f, 14.101f, 11.51f, 14.101f, 10.678f, 13.697f)
                lineTo(3.362f, 10.142f)
                curveTo(1.546f, 9.259f, 1.546f, 6.741f, 3.362f, 5.858f)
                lineTo(10.678f, 2.303f)
                close()
                moveTo(12.441f, 4.017f)
                curveTo(12.163f, 3.882f, 11.837f, 3.882f, 11.559f, 4.017f)
                lineTo(4.244f, 7.572f)
                curveTo(3.88f, 7.748f, 3.88f, 8.252f, 4.244f, 8.428f)
                lineTo(11.559f, 11.983f)
                curveTo(11.837f, 12.118f, 12.163f, 12.118f, 12.441f, 11.983f)
                lineTo(19.756f, 8.428f)
                curveTo(20.12f, 8.252f, 20.119f, 7.748f, 19.756f, 7.572f)
                lineTo(12.441f, 4.017f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.106f, 16.817f)
                curveTo(2.353f, 16.323f, 2.953f, 16.123f, 3.447f, 16.37f)
                lineTo(11.553f, 20.423f)
                curveTo(11.834f, 20.563f, 12.166f, 20.563f, 12.447f, 20.423f)
                lineTo(20.553f, 16.37f)
                curveTo(21.047f, 16.123f, 21.647f, 16.323f, 21.894f, 16.817f)
                curveTo(22.141f, 17.311f, 21.941f, 17.912f, 21.447f, 18.159f)
                lineTo(13.342f, 22.212f)
                curveTo(12.497f, 22.634f, 11.503f, 22.634f, 10.658f, 22.212f)
                lineTo(2.553f, 18.159f)
                curveTo(2.059f, 17.912f, 1.859f, 17.311f, 2.106f, 16.817f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3.447f, 12.106f)
                curveTo(2.953f, 11.859f, 2.353f, 12.059f, 2.106f, 12.553f)
                curveTo(1.859f, 13.047f, 2.059f, 13.648f, 2.553f, 13.895f)
                lineTo(10.659f, 17.947f)
                curveTo(11.503f, 18.37f, 12.497f, 18.37f, 13.342f, 17.947f)
                lineTo(21.447f, 13.895f)
                curveTo(21.941f, 13.648f, 22.142f, 13.047f, 21.895f, 12.553f)
                curveTo(21.648f, 12.059f, 21.047f, 11.859f, 20.553f, 12.106f)
                lineTo(12.447f, 16.159f)
                curveTo(12.166f, 16.299f, 11.835f, 16.299f, 11.553f, 16.159f)
                lineTo(3.447f, 12.106f)
                close()
            }
        }.build()

        return _Layers!!
    }

@Suppress("ObjectPropertyName")
private var _Layers: ImageVector? = null
