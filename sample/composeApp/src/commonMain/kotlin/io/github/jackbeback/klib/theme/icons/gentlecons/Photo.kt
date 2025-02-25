package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Photo: ImageVector
    get() {
        if (_Photo != null) {
            return _Photo!!
        }
        _Photo = ImageVector.Builder(
            name = "Photo",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 18f)
                curveTo(14.761f, 18f, 17f, 15.761f, 17f, 13f)
                curveTo(17f, 10.239f, 14.761f, 8f, 12f, 8f)
                curveTo(9.239f, 8f, 7f, 10.239f, 7f, 13f)
                curveTo(7f, 15.761f, 9.239f, 18f, 12f, 18f)
                close()
                moveTo(12f, 16.007f)
                curveTo(10.339f, 16.007f, 8.993f, 14.661f, 8.993f, 13f)
                curveTo(8.993f, 11.339f, 10.339f, 9.993f, 12f, 9.993f)
                curveTo(13.661f, 9.993f, 15.007f, 11.339f, 15.007f, 13f)
                curveTo(15.007f, 14.661f, 13.661f, 16.007f, 12f, 16.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.562f, 2f)
                curveTo(8.185f, 2f, 6.985f, 2.937f, 6.651f, 4.272f)
                lineTo(6.219f, 6f)
                horizontalLineTo(4f)
                curveTo(2.343f, 6f, 1f, 7.343f, 1f, 9f)
                verticalLineTo(19f)
                curveTo(1f, 20.657f, 2.343f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.657f, 22f, 23f, 20.657f, 23f, 19f)
                verticalLineTo(9f)
                curveTo(23f, 7.343f, 21.657f, 6f, 20f, 6f)
                horizontalLineTo(17.781f)
                lineTo(17.349f, 4.272f)
                curveTo(17.015f, 2.937f, 15.815f, 2f, 14.438f, 2f)
                horizontalLineTo(9.562f)
                close()
                moveTo(8.591f, 4.757f)
                curveTo(8.703f, 4.312f, 9.103f, 4f, 9.562f, 4f)
                horizontalLineTo(14.438f)
                curveTo(14.897f, 4f, 15.297f, 4.312f, 15.409f, 4.757f)
                lineTo(15.84f, 6.485f)
                curveTo(16.063f, 7.375f, 16.863f, 8f, 17.781f, 8f)
                horizontalLineTo(20f)
                curveTo(20.552f, 8f, 21f, 8.448f, 21f, 9f)
                verticalLineTo(19f)
                curveTo(21f, 19.552f, 20.552f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(3.448f, 20f, 3f, 19.552f, 3f, 19f)
                verticalLineTo(9f)
                curveTo(3f, 8.448f, 3.448f, 8f, 4f, 8f)
                horizontalLineTo(6.219f)
                curveTo(7.137f, 8f, 7.937f, 7.375f, 8.16f, 6.485f)
                lineTo(8.591f, 4.757f)
                close()
            }
        }.build()

        return _Photo!!
    }

@Suppress("ObjectPropertyName")
private var _Photo: ImageVector? = null
