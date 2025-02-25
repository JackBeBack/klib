package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CalendarRemove: ImageVector
    get() {
        if (_CalendarRemove != null) {
            return _CalendarRemove!!
        }
        _CalendarRemove = ImageVector.Builder(
            name = "CalendarRemove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                curveTo(6.448f, 1f, 6f, 1.448f, 6f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.343f, 3f, 2f, 4.343f, 2f, 6f)
                verticalLineTo(20f)
                curveTo(2f, 21.657f, 3.343f, 23f, 5f, 23f)
                horizontalLineTo(13.101f)
                curveTo(12.515f, 22.426f, 12.03f, 21.75f, 11.674f, 21f)
                horizontalLineTo(5f)
                curveTo(4.448f, 21f, 4f, 20.552f, 4f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(11.29f)
                curveTo(20.722f, 11.505f, 21.396f, 11.833f, 22f, 12.255f)
                verticalLineTo(6f)
                curveTo(22f, 4.343f, 20.657f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                curveTo(18f, 1.448f, 17.552f, 1f, 17f, 1f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveTo(8f, 1.448f, 7.552f, 1f, 7f, 1f)
                close()
                moveTo(16f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                curveTo(8f, 6.552f, 7.552f, 7f, 7f, 7f)
                curveTo(6.448f, 7f, 6f, 6.552f, 6f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                curveTo(18f, 6.552f, 17.552f, 7f, 17f, 7f)
                curveTo(16.448f, 7f, 16f, 6.552f, 16f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 17f)
                curveTo(15.448f, 17f, 15f, 17.448f, 15f, 18f)
                curveTo(15f, 18.552f, 15.448f, 19f, 16f, 19f)
                horizontalLineTo(20f)
                curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                horizontalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 18f)
                curveTo(24f, 21.314f, 21.314f, 24f, 18f, 24f)
                curveTo(14.686f, 24f, 12f, 21.314f, 12f, 18f)
                curveTo(12f, 14.686f, 14.686f, 12f, 18f, 12f)
                curveTo(21.314f, 12f, 24f, 14.686f, 24f, 18f)
                close()
                moveTo(13.982f, 18f)
                curveTo(13.982f, 20.219f, 15.781f, 22.018f, 18f, 22.018f)
                curveTo(20.219f, 22.018f, 22.018f, 20.219f, 22.018f, 18f)
                curveTo(22.018f, 15.781f, 20.219f, 13.982f, 18f, 13.982f)
                curveTo(15.781f, 13.982f, 13.982f, 15.781f, 13.982f, 18f)
                close()
            }
        }.build()

        return _CalendarRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarRemove: ImageVector? = null
