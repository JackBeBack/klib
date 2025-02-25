package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Webcam: ImageVector
    get() {
        if (_Webcam != null) {
            return _Webcam!!
        }
        _Webcam = ImageVector.Builder(
            name = "Webcam",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 9f)
                curveTo(15f, 10.657f, 13.657f, 12f, 12f, 12f)
                curveTo(10.343f, 12f, 9f, 10.657f, 9f, 9f)
                curveTo(9f, 7.343f, 10.343f, 6f, 12f, 6f)
                curveTo(13.657f, 6f, 15f, 7.343f, 15f, 9f)
                close()
                moveTo(10.943f, 9f)
                curveTo(10.943f, 9.584f, 11.416f, 10.057f, 12f, 10.057f)
                curveTo(12.584f, 10.057f, 13.057f, 9.584f, 13.057f, 9f)
                curveTo(13.057f, 8.416f, 12.584f, 7.943f, 12f, 7.943f)
                curveTo(11.416f, 7.943f, 10.943f, 8.416f, 10.943f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.278f, 13.959f)
                curveTo(19.356f, 12.596f, 20f, 10.873f, 20f, 9f)
                curveTo(20f, 4.582f, 16.418f, 1f, 12f, 1f)
                curveTo(7.582f, 1f, 4f, 4.582f, 4f, 9f)
                curveTo(4f, 10.873f, 4.644f, 12.596f, 5.722f, 13.959f)
                curveTo(5.503f, 14.24f, 5.239f, 14.608f, 4.963f, 15.058f)
                curveTo(4.28f, 16.169f, 3.513f, 17.792f, 3.175f, 19.845f)
                curveTo(2.878f, 21.655f, 4.396f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.604f, 23f, 21.122f, 21.655f, 20.825f, 19.845f)
                curveTo(20.487f, 17.792f, 19.72f, 16.169f, 19.037f, 15.058f)
                curveTo(18.761f, 14.608f, 18.497f, 14.24f, 18.278f, 13.959f)
                close()
                moveTo(16.839f, 15.371f)
                curveTo(15.495f, 16.393f, 13.819f, 17f, 12f, 17f)
                curveTo(10.181f, 17f, 8.505f, 16.393f, 7.161f, 15.371f)
                curveTo(7.012f, 15.573f, 6.843f, 15.818f, 6.667f, 16.105f)
                curveTo(6.087f, 17.049f, 5.435f, 18.429f, 5.149f, 20.17f)
                curveTo(5.088f, 20.54f, 5.395f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.605f, 21f, 18.912f, 20.54f, 18.851f, 20.17f)
                curveTo(18.565f, 18.429f, 17.913f, 17.049f, 17.333f, 16.105f)
                curveTo(17.157f, 15.818f, 16.988f, 15.573f, 16.839f, 15.371f)
                close()
                moveTo(5.978f, 9f)
                curveTo(5.978f, 12.326f, 8.674f, 15.023f, 12f, 15.023f)
                curveTo(15.326f, 15.023f, 18.022f, 12.326f, 18.022f, 9f)
                curveTo(18.022f, 5.674f, 15.326f, 2.978f, 12f, 2.978f)
                curveTo(8.674f, 2.978f, 5.978f, 5.674f, 5.978f, 9f)
                close()
            }
        }.build()

        return _Webcam!!
    }

@Suppress("ObjectPropertyName")
private var _Webcam: ImageVector? = null
