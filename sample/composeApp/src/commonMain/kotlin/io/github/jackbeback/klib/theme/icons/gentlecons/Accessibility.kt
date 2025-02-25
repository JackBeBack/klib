package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Accessibility: ImageVector
    get() {
        if (_Accessibility != null) {
            return _Accessibility!!
        }
        _Accessibility = ImageVector.Builder(
            name = "Accessibility",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.5f, 6.5f)
                curveTo(13.5f, 7.329f, 12.828f, 8f, 12f, 8f)
                curveTo(11.172f, 8f, 10.5f, 7.329f, 10.5f, 6.5f)
                curveTo(10.5f, 5.672f, 11.172f, 5f, 12f, 5f)
                curveTo(12.828f, 5f, 13.5f, 5.672f, 13.5f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.051f, 8.684f)
                curveTo(5.877f, 9.208f, 6.16f, 9.774f, 6.684f, 9.949f)
                curveTo(6.859f, 10.007f, 7.036f, 10.061f, 7.213f, 10.114f)
                curveTo(7.536f, 10.211f, 7.989f, 10.341f, 8.507f, 10.47f)
                curveTo(9.089f, 10.616f, 9.781f, 10.769f, 10.478f, 10.873f)
                curveTo(10.432f, 11.765f, 10.321f, 12.406f, 10.217f, 12.831f)
                lineTo(8.106f, 17.053f)
                curveTo(7.859f, 17.547f, 8.059f, 18.148f, 8.553f, 18.395f)
                curveTo(9.047f, 18.642f, 9.647f, 18.441f, 9.894f, 17.948f)
                lineTo(12f, 13.736f)
                lineTo(14.106f, 17.948f)
                curveTo(14.353f, 18.441f, 14.953f, 18.642f, 15.447f, 18.395f)
                curveTo(15.941f, 18.148f, 16.141f, 17.547f, 15.894f, 17.053f)
                lineTo(13.783f, 12.831f)
                curveTo(13.679f, 12.406f, 13.568f, 11.765f, 13.522f, 10.873f)
                curveTo(14.219f, 10.769f, 14.911f, 10.616f, 15.493f, 10.47f)
                curveTo(16.011f, 10.341f, 16.464f, 10.211f, 16.787f, 10.114f)
                curveTo(16.963f, 10.062f, 17.138f, 10.008f, 17.313f, 9.95f)
                curveTo(17.826f, 9.78f, 18.12f, 9.198f, 17.949f, 8.684f)
                curveTo(17.774f, 8.16f, 17.208f, 7.877f, 16.684f, 8.052f)
                curveTo(16.528f, 8.103f, 16.37f, 8.151f, 16.213f, 8.199f)
                curveTo(15.911f, 8.289f, 15.489f, 8.41f, 15.007f, 8.53f)
                curveTo(14.022f, 8.777f, 12.871f, 9f, 12f, 9f)
                curveTo(11.129f, 9f, 9.978f, 8.777f, 8.993f, 8.53f)
                curveTo(8.511f, 8.41f, 8.089f, 8.289f, 7.787f, 8.199f)
                curveTo(7.632f, 8.152f, 7.476f, 8.104f, 7.322f, 8.053f)
                curveTo(6.802f, 7.882f, 6.225f, 8.162f, 6.051f, 8.684f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _Accessibility!!
    }

@Suppress("ObjectPropertyName")
private var _Accessibility: ImageVector? = null
