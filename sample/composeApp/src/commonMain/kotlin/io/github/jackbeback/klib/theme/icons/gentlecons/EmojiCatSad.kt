package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiCatSad: ImageVector
    get() {
        if (_EmojiCatSad != null) {
            return _EmojiCatSad!!
        }
        _EmojiCatSad = ImageVector.Builder(
            name = "EmojiCatSad",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 9.5f)
                curveTo(10f, 10.328f, 9.328f, 11f, 8.5f, 11f)
                curveTo(7.672f, 11f, 7f, 10.328f, 7f, 9.5f)
                curveTo(7f, 8.672f, 7.672f, 8f, 8.5f, 8f)
                curveTo(9.328f, 8f, 10f, 8.672f, 10f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.5f, 11f)
                curveTo(16.328f, 11f, 17f, 10.328f, 17f, 9.5f)
                curveTo(17f, 8.672f, 16.328f, 8f, 15.5f, 8f)
                curveTo(14.672f, 8f, 14f, 8.672f, 14f, 9.5f)
                curveTo(14f, 10.328f, 14.672f, 11f, 15.5f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.447f, 16.894f)
                curveTo(15.957f, 17.139f, 15.362f, 16.944f, 15.111f, 16.459f)
                curveTo(15.098f, 16.434f, 14.91f, 16.108f, 14.5f, 15.781f)
                curveTo(14.04f, 15.413f, 13.257f, 15f, 12f, 15f)
                curveTo(10.743f, 15f, 9.96f, 15.413f, 9.5f, 15.781f)
                curveTo(9.091f, 16.108f, 8.902f, 16.434f, 8.889f, 16.459f)
                curveTo(8.638f, 16.944f, 8.043f, 17.139f, 7.553f, 16.894f)
                curveTo(7.065f, 16.65f, 6.861f, 16.039f, 7.106f, 15.552f)
                curveTo(7.192f, 15.389f, 7.293f, 15.235f, 7.403f, 15.087f)
                curveTo(7.586f, 14.844f, 7.862f, 14.53f, 8.25f, 14.219f)
                curveTo(9.04f, 13.587f, 10.257f, 13f, 12f, 13f)
                curveTo(13.743f, 13f, 14.96f, 13.587f, 15.75f, 14.219f)
                curveTo(16.138f, 14.53f, 16.414f, 14.844f, 16.597f, 15.087f)
                curveTo(16.707f, 15.234f, 16.812f, 15.388f, 16.894f, 15.553f)
                curveTo(17.141f, 16.047f, 16.941f, 16.647f, 16.447f, 16.894f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.999f, 5.684f)
                verticalLineTo(1.5f)
                curveTo(20.999f, 0.442f, 19.931f, -0.283f, 18.946f, 0.107f)
                lineTo(15.348f, 1.533f)
                curveTo(14.292f, 1.196f, 13.167f, 1.015f, 12f, 1.015f)
                curveTo(10.82f, 1.015f, 9.684f, 1.2f, 8.619f, 1.544f)
                lineTo(5.053f, 0.13f)
                curveTo(4.068f, -0.26f, 3f, 0.465f, 3f, 1.524f)
                verticalLineTo(5.685f)
                curveTo(1.74f, 7.474f, 1f, 9.654f, 1f, 12.007f)
                curveTo(1f, 18.078f, 5.925f, 23f, 12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.078f, 23f, 12.007f)
                curveTo(23f, 9.654f, 22.26f, 7.473f, 20.999f, 5.684f)
                close()
                moveTo(18.999f, 6.364f)
                verticalLineTo(2.236f)
                curveTo(17.771f, 2.723f, 15.292f, 3.634f, 15.292f, 3.634f)
                curveTo(15.292f, 3.634f, 13.285f, 3.02f, 12f, 3.02f)
                curveTo(10.715f, 3.02f, 8.687f, 3.65f, 8.687f, 3.65f)
                lineTo(5f, 2.26f)
                verticalLineTo(6.365f)
                curveTo(3.753f, 7.907f, 3.007f, 9.87f, 3.007f, 12.007f)
                curveTo(3.007f, 16.971f, 7.033f, 20.994f, 12f, 20.994f)
                curveTo(16.967f, 20.994f, 20.993f, 16.971f, 20.993f, 12.007f)
                curveTo(20.993f, 9.87f, 20.246f, 7.906f, 18.999f, 6.364f)
                close()
            }
        }.build()

        return _EmojiCatSad!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiCatSad: ImageVector? = null
