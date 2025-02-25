package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ColorPalette: ImageVector
    get() {
        if (_ColorPalette != null) {
            return _ColorPalette!!
        }
        _ColorPalette = ImageVector.Builder(
            name = "ColorPalette",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 12.5f)
                curveTo(14f, 13.328f, 13.328f, 14f, 12.5f, 14f)
                curveTo(11.672f, 14f, 11f, 13.328f, 11f, 12.5f)
                curveTo(11f, 11.672f, 11.672f, 11f, 12.5f, 11f)
                curveTo(13.328f, 11f, 14f, 11.672f, 14f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.5f, 10f)
                curveTo(17.328f, 10f, 18f, 9.329f, 18f, 8.5f)
                curveTo(18f, 7.672f, 17.328f, 7f, 16.5f, 7f)
                curveTo(15.672f, 7f, 15f, 7.672f, 15f, 8.5f)
                curveTo(15f, 9.329f, 15.672f, 10f, 16.5f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 6.5f)
                curveTo(13f, 7.329f, 12.328f, 8f, 11.5f, 8f)
                curveTo(10.672f, 8f, 10f, 7.329f, 10f, 6.5f)
                curveTo(10f, 5.672f, 10.672f, 5f, 11.5f, 5f)
                curveTo(12.328f, 5f, 13f, 5.672f, 13f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.5f, 12f)
                curveTo(8.328f, 12f, 9f, 11.328f, 9f, 10.5f)
                curveTo(9f, 9.672f, 8.328f, 9f, 7.5f, 9f)
                curveTo(6.672f, 9f, 6f, 9.672f, 6f, 10.5f)
                curveTo(6f, 11.328f, 6.672f, 12f, 7.5f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 17.5f)
                curveTo(14f, 18.329f, 13.328f, 19f, 12.5f, 19f)
                curveTo(11.672f, 19f, 11f, 18.329f, 11f, 17.5f)
                curveTo(11f, 16.672f, 11.672f, 16f, 12.5f, 16f)
                curveTo(13.328f, 16f, 14f, 16.672f, 14f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7.5f, 17f)
                curveTo(8.328f, 17f, 9f, 16.329f, 9f, 15.5f)
                curveTo(9f, 14.672f, 8.328f, 14f, 7.5f, 14f)
                curveTo(6.672f, 14f, 6f, 14.672f, 6f, 15.5f)
                curveTo(6f, 16.329f, 6.672f, 17f, 7.5f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.502f, 1.022f)
                curveTo(15.405f, 0.792f, 19.564f, 2.324f, 21.809f, 5.411f)
                curveTo(22.508f, 6.373f, 22.823f, 7.636f, 22.649f, 8.832f)
                curveTo(22.471f, 10.054f, 21.773f, 11.231f, 20.447f, 11.894f)
                curveTo(19.639f, 12.299f, 18.773f, 12.947f, 18.24f, 13.668f)
                curveTo(17.716f, 14.378f, 17.614f, 14.992f, 17.894f, 15.553f)
                curveTo(18.423f, 16.61f, 18.889f, 17.926f, 18.811f, 19.188f)
                curveTo(18.77f, 19.837f, 18.583f, 20.495f, 18.166f, 21.08f)
                curveTo(17.749f, 21.667f, 17.145f, 22.119f, 16.371f, 22.429f)
                curveTo(14.609f, 23.133f, 12.628f, 23.164f, 10.808f, 22.821f)
                curveTo(8.986f, 22.476f, 7.245f, 21.742f, 5.927f, 20.819f)
                curveTo(4.006f, 19.475f, 2.475f, 17.689f, 1.714f, 15.446f)
                curveTo(0.95f, 13.196f, 0.996f, 10.585f, 2.06f, 7.658f)
                curveTo(3.644f, 3.304f, 7.562f, 1.255f, 11.502f, 1.022f)
                close()
                moveTo(11.62f, 3.019f)
                curveTo(8.266f, 3.217f, 5.185f, 4.918f, 3.94f, 8.341f)
                curveTo(3.004f, 10.915f, 3.014f, 13.054f, 3.608f, 14.804f)
                curveTo(4.204f, 16.561f, 5.423f, 18.025f, 7.073f, 19.181f)
                curveTo(8.144f, 19.93f, 9.617f, 20.56f, 11.179f, 20.855f)
                curveTo(12.744f, 21.151f, 14.318f, 21.096f, 15.629f, 20.572f)
                curveTo(16.308f, 20.3f, 16.768f, 19.81f, 16.815f, 19.063f)
                curveTo(16.861f, 18.324f, 16.577f, 17.39f, 16.106f, 16.447f)
                curveTo(15.364f, 14.964f, 15.854f, 13.532f, 16.632f, 12.48f)
                curveTo(17.4f, 11.439f, 18.545f, 10.609f, 19.553f, 10.106f)
                curveTo(20.227f, 9.769f, 20.575f, 9.196f, 20.67f, 8.544f)
                curveTo(20.769f, 7.864f, 20.583f, 7.126f, 20.191f, 6.588f)
                curveTo(18.436f, 4.175f, 15.009f, 2.819f, 11.62f, 3.019f)
                close()
            }
        }.build()

        return _ColorPalette!!
    }

@Suppress("ObjectPropertyName")
private var _ColorPalette: ImageVector? = null
