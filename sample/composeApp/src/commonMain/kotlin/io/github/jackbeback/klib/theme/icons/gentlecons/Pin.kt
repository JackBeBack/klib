package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Pin: ImageVector
    get() {
        if (_Pin != null) {
            return _Pin!!
        }
        _Pin = ImageVector.Builder(
            name = "Pin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.122f, 1.87f)
                curveTo(15.757f, 0.506f, 13.478f, 0.766f, 12.456f, 2.403f)
                lineTo(9.611f, 6.959f)
                curveTo(9.61f, 6.96f, 9.609f, 6.962f, 9.604f, 6.965f)
                curveTo(9.597f, 6.97f, 9.583f, 6.978f, 9.56f, 6.985f)
                curveTo(9.509f, 6.999f, 9.442f, 6.998f, 9.383f, 6.976f)
                curveTo(8.412f, 6.616f, 6.745f, 6.221f, 5.014f, 6.873f)
                curveTo(4.081f, 7.224f, 3.616f, 8.032f, 3.565f, 8.852f)
                curveTo(3.517f, 9.635f, 3.833f, 10.439f, 4.414f, 11.021f)
                lineTo(7.95f, 14.556f)
                lineTo(1.27f, 21.236f)
                curveTo(0.879f, 21.627f, 0.879f, 22.26f, 1.27f, 22.651f)
                curveTo(1.66f, 23.041f, 2.293f, 23.041f, 2.684f, 22.651f)
                lineTo(9.364f, 15.97f)
                lineTo(12.899f, 19.506f)
                curveTo(13.481f, 20.087f, 14.285f, 20.403f, 15.068f, 20.355f)
                curveTo(15.888f, 20.304f, 16.697f, 19.839f, 17.048f, 18.906f)
                curveTo(17.7f, 17.176f, 17.304f, 15.509f, 16.944f, 14.538f)
                curveTo(16.922f, 14.478f, 16.921f, 14.411f, 16.935f, 14.36f)
                curveTo(16.942f, 14.337f, 16.95f, 14.323f, 16.955f, 14.316f)
                curveTo(16.959f, 14.311f, 16.961f, 14.31f, 16.961f, 14.31f)
                lineTo(21.518f, 11.465f)
                curveTo(23.155f, 10.442f, 23.415f, 8.163f, 22.05f, 6.799f)
                lineTo(17.122f, 1.87f)
                close()
                moveTo(14.152f, 3.462f)
                curveTo(14.493f, 2.916f, 15.253f, 2.83f, 15.708f, 3.284f)
                lineTo(20.636f, 8.213f)
                curveTo(21.091f, 8.668f, 21.004f, 9.427f, 20.458f, 9.768f)
                lineTo(15.902f, 12.613f)
                curveTo(14.957f, 13.203f, 14.747f, 14.364f, 15.069f, 15.233f)
                curveTo(15.355f, 16.004f, 15.583f, 17.122f, 15.176f, 18.201f)
                curveTo(15.148f, 18.275f, 15.118f, 18.302f, 15.099f, 18.315f)
                curveTo(15.074f, 18.332f, 15.027f, 18.354f, 14.944f, 18.359f)
                curveTo(14.767f, 18.37f, 14.514f, 18.292f, 14.314f, 18.092f)
                lineTo(5.828f, 9.607f)
                curveTo(5.629f, 9.407f, 5.55f, 9.153f, 5.561f, 8.976f)
                curveTo(5.567f, 8.894f, 5.589f, 8.846f, 5.605f, 8.822f)
                curveTo(5.619f, 8.803f, 5.645f, 8.772f, 5.719f, 8.744f)
                curveTo(6.799f, 8.337f, 7.917f, 8.565f, 8.688f, 8.851f)
                curveTo(9.557f, 9.173f, 10.717f, 8.963f, 11.307f, 8.018f)
                lineTo(14.152f, 3.462f)
                close()
            }
        }.build()

        return _Pin!!
    }

@Suppress("ObjectPropertyName")
private var _Pin: ImageVector? = null
