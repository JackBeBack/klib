package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EmojiCatLaugh: ImageVector
    get() {
        if (_EmojiCatLaugh != null) {
            return _EmojiCatLaugh!!
        }
        _EmojiCatLaugh = ImageVector.Builder(
            name = "EmojiCatLaugh",
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
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.017f, 14.294f)
                curveTo(6.944f, 13.536f, 7.561f, 13f, 8.2f, 13f)
                horizontalLineTo(15.8f)
                curveTo(16.438f, 13f, 17.056f, 13.536f, 16.983f, 14.294f)
                curveTo(16.94f, 14.749f, 16.768f, 15.788f, 16.045f, 16.734f)
                curveTo(15.283f, 17.731f, 14.001f, 18.5f, 12f, 18.5f)
                curveTo(9.999f, 18.5f, 8.717f, 17.731f, 7.955f, 16.734f)
                curveTo(7.232f, 15.788f, 7.061f, 14.749f, 7.017f, 14.294f)
                close()
                moveTo(9.241f, 15f)
                curveTo(9.317f, 15.173f, 9.415f, 15.351f, 9.544f, 15.519f)
                curveTo(9.902f, 15.988f, 10.578f, 16.5f, 12f, 16.5f)
                curveTo(13.422f, 16.5f, 14.098f, 15.988f, 14.456f, 15.519f)
                curveTo(14.585f, 15.351f, 14.683f, 15.173f, 14.759f, 15f)
                horizontalLineTo(9.241f)
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

        return _EmojiCatLaugh!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiCatLaugh: ImageVector? = null
