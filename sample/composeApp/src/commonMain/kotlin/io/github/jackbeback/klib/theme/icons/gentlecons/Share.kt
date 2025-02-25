package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Share: ImageVector
    get() {
        if (_Share != null) {
            return _Share!!
        }
        _Share = ImageVector.Builder(
            name = "Share",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 5.5f)
                curveTo(23f, 7.985f, 20.985f, 10f, 18.5f, 10f)
                curveTo(17.099f, 10f, 15.848f, 9.36f, 15.023f, 8.357f)
                lineTo(9.873f, 10.932f)
                curveTo(9.956f, 11.273f, 10f, 11.63f, 10f, 11.997f)
                curveTo(10f, 12.366f, 9.956f, 12.725f, 9.872f, 13.068f)
                lineTo(15.023f, 15.643f)
                curveTo(15.848f, 14.64f, 17.099f, 14f, 18.5f, 14f)
                curveTo(20.985f, 14f, 23f, 16.015f, 23f, 18.5f)
                curveTo(23f, 20.985f, 20.985f, 23f, 18.5f, 23f)
                curveTo(16.015f, 23f, 14f, 20.985f, 14f, 18.5f)
                curveTo(14f, 18.132f, 14.044f, 17.774f, 14.128f, 17.432f)
                lineTo(8.976f, 14.856f)
                curveTo(8.15f, 15.858f, 6.9f, 16.497f, 5.5f, 16.497f)
                curveTo(3.015f, 16.497f, 1f, 14.482f, 1f, 11.997f)
                curveTo(1f, 9.512f, 3.015f, 7.497f, 5.5f, 7.497f)
                curveTo(6.902f, 7.497f, 8.154f, 8.138f, 8.979f, 9.143f)
                lineTo(14.127f, 6.568f)
                curveTo(14.044f, 6.226f, 14f, 5.868f, 14f, 5.5f)
                curveTo(14f, 3.015f, 16.015f, 1f, 18.5f, 1f)
                curveTo(20.985f, 1f, 23f, 3.015f, 23f, 5.5f)
                close()
                moveTo(16.003f, 5.5f)
                curveTo(16.003f, 6.879f, 17.121f, 7.997f, 18.5f, 7.997f)
                curveTo(19.879f, 7.997f, 20.997f, 6.879f, 20.997f, 5.5f)
                curveTo(20.997f, 4.121f, 19.879f, 3.003f, 18.5f, 3.003f)
                curveTo(17.121f, 3.003f, 16.003f, 4.121f, 16.003f, 5.5f)
                close()
                moveTo(16.003f, 18.5f)
                curveTo(16.003f, 19.879f, 17.121f, 20.997f, 18.5f, 20.997f)
                curveTo(19.879f, 20.997f, 20.997f, 19.879f, 20.997f, 18.5f)
                curveTo(20.997f, 17.121f, 19.879f, 16.003f, 18.5f, 16.003f)
                curveTo(17.121f, 16.003f, 16.003f, 17.121f, 16.003f, 18.5f)
                close()
                moveTo(5.5f, 14.494f)
                curveTo(4.121f, 14.494f, 3.003f, 13.376f, 3.003f, 11.997f)
                curveTo(3.003f, 10.618f, 4.121f, 9.5f, 5.5f, 9.5f)
                curveTo(6.879f, 9.5f, 7.997f, 10.618f, 7.997f, 11.997f)
                curveTo(7.997f, 13.376f, 6.879f, 14.494f, 5.5f, 14.494f)
                close()
            }
        }.build()

        return _Share!!
    }

@Suppress("ObjectPropertyName")
private var _Share: ImageVector? = null
