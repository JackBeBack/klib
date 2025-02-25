package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.TimeRemove: ImageVector
    get() {
        if (_TimeRemove != null) {
            return _TimeRemove!!
        }
        _TimeRemove = ImageVector.Builder(
            name = "TimeRemove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22.95f, 13.051f)
                curveTo(22.983f, 12.705f, 23f, 12.354f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                curveTo(12.354f, 23f, 12.705f, 22.983f, 13.051f, 22.95f)
                curveTo(12.484f, 22.384f, 12.014f, 21.72f, 11.667f, 20.987f)
                curveTo(6.855f, 20.812f, 3.007f, 16.855f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.855f, 3.007f, 20.812f, 6.855f, 20.987f, 11.667f)
                curveTo(21.72f, 12.014f, 22.384f, 12.484f, 22.95f, 13.051f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.843f, 12.368f)
                lineTo(13f, 11.881f)
                verticalLineTo(6f)
                curveTo(13f, 5.448f, 12.552f, 5f, 12f, 5f)
                curveTo(11.448f, 5f, 11f, 5.448f, 11f, 6f)
                verticalLineTo(12.467f)
                curveTo(11f, 12.467f, 11f, 12.727f, 11.127f, 12.924f)
                curveTo(11.212f, 13.09f, 11.344f, 13.234f, 11.517f, 13.335f)
                lineTo(12.377f, 13.831f)
                curveTo(12.79f, 13.274f, 13.285f, 12.78f, 13.843f, 12.368f)
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

        return _TimeRemove!!
    }

@Suppress("ObjectPropertyName")
private var _TimeRemove: ImageVector? = null
