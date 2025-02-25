package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Scooter: ImageVector
    get() {
        if (_Scooter != null) {
            return _Scooter!!
        }
        _Scooter = ImageVector.Builder(
            name = "Scooter",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 4f)
                curveTo(12f, 3.448f, 12.448f, 3f, 13f, 3f)
                horizontalLineTo(14.559f)
                curveTo(15.85f, 3f, 16.996f, 3.826f, 17.404f, 5.051f)
                lineTo(20.753f, 15.095f)
                curveTo(22.045f, 15.429f, 23f, 16.603f, 23f, 18f)
                curveTo(23f, 19.657f, 21.657f, 21f, 20f, 21f)
                curveTo(18.343f, 21f, 17f, 19.657f, 17f, 18f)
                curveTo(17f, 16.805f, 17.699f, 15.773f, 18.71f, 15.291f)
                lineTo(18.015f, 13.207f)
                lineTo(15.947f, 17.342f)
                curveTo(15.439f, 18.358f, 14.4f, 19f, 13.264f, 19f)
                horizontalLineTo(6.829f)
                curveTo(6.417f, 20.165f, 5.306f, 21f, 4f, 21f)
                curveTo(2.343f, 21f, 1f, 19.657f, 1f, 18f)
                curveTo(1f, 16.343f, 2.343f, 15f, 4f, 15f)
                curveTo(5.306f, 15f, 6.417f, 15.835f, 6.829f, 17f)
                horizontalLineTo(13.264f)
                curveTo(13.643f, 17f, 13.989f, 16.786f, 14.158f, 16.447f)
                lineTo(17.106f, 10.553f)
                lineTo(17.135f, 10.568f)
                lineTo(15.507f, 5.684f)
                curveTo(15.371f, 5.275f, 14.989f, 5f, 14.559f, 5f)
                horizontalLineTo(13f)
                curveTo(12.448f, 5f, 12f, 4.552f, 12f, 4f)
                close()
                moveTo(4f, 19.003f)
                curveTo(3.446f, 19.003f, 2.997f, 18.554f, 2.997f, 18f)
                curveTo(2.997f, 17.446f, 3.446f, 16.997f, 4f, 16.997f)
                curveTo(4.554f, 16.997f, 5.003f, 17.446f, 5.003f, 18f)
                curveTo(5.003f, 18.554f, 4.554f, 19.003f, 4f, 19.003f)
                close()
                moveTo(20f, 19.003f)
                curveTo(19.446f, 19.003f, 18.997f, 18.554f, 18.997f, 18f)
                curveTo(18.997f, 17.446f, 19.446f, 16.997f, 20f, 16.997f)
                curveTo(20.554f, 16.997f, 21.003f, 17.446f, 21.003f, 18f)
                curveTo(21.003f, 18.554f, 20.554f, 19.003f, 20f, 19.003f)
                close()
            }
        }.build()

        return _Scooter!!
    }

@Suppress("ObjectPropertyName")
private var _Scooter: ImageVector? = null
