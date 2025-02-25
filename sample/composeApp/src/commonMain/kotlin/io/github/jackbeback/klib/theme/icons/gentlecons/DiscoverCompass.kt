package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.DiscoverCompass: ImageVector
    get() {
        if (_DiscoverCompass != null) {
            return _DiscoverCompass!!
        }
        _DiscoverCompass = ImageVector.Builder(
            name = "DiscoverCompass",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.982f, 8.998f)
                curveTo(17.54f, 7.743f, 16.257f, 6.46f, 15.002f, 7.018f)
                lineTo(10.002f, 9.24f)
                curveTo(9.662f, 9.391f, 9.391f, 9.662f, 9.24f, 10.002f)
                lineTo(7.018f, 15.002f)
                curveTo(6.46f, 16.257f, 7.743f, 17.54f, 8.998f, 16.982f)
                lineTo(13.998f, 14.76f)
                curveTo(14.337f, 14.609f, 14.609f, 14.337f, 14.76f, 13.998f)
                lineTo(16.982f, 8.998f)
                close()
                moveTo(10.99f, 10.99f)
                lineTo(14.626f, 9.374f)
                lineTo(13.01f, 13.01f)
                lineTo(9.374f, 14.626f)
                lineTo(10.99f, 10.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.987f)
                curveTo(7.037f, 20.987f, 3.013f, 16.963f, 3.013f, 12f)
                curveTo(3.013f, 7.037f, 7.037f, 3.013f, 12f, 3.013f)
                curveTo(16.963f, 3.013f, 20.987f, 7.037f, 20.987f, 12f)
                curveTo(20.987f, 16.963f, 16.963f, 20.987f, 12f, 20.987f)
                close()
            }
        }.build()

        return _DiscoverCompass!!
    }

@Suppress("ObjectPropertyName")
private var _DiscoverCompass: ImageVector? = null
