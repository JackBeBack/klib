package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.FastRewind: ImageVector
    get() {
        if (_FastRewind != null) {
            return _FastRewind!!
        }
        _FastRewind = ImageVector.Builder(
            name = "FastRewind",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.054f, 18.405f)
                curveTo(20.072f, 19.84f, 23f, 18.516f, 23f, 16.169f)
                verticalLineTo(7.831f)
                curveTo(23f, 5.484f, 20.072f, 4.16f, 18.054f, 5.595f)
                lineTo(13f, 9.19f)
                verticalLineTo(7.831f)
                curveTo(13f, 5.484f, 10.071f, 4.16f, 8.054f, 5.595f)
                lineTo(2.193f, 9.764f)
                curveTo(0.602f, 10.895f, 0.602f, 13.105f, 2.193f, 14.236f)
                lineTo(8.054f, 18.405f)
                curveTo(10.071f, 19.84f, 13f, 18.516f, 13f, 16.169f)
                verticalLineTo(14.81f)
                lineTo(18.054f, 18.405f)
                close()
                moveTo(20.954f, 16.169f)
                curveTo(20.954f, 16.952f, 19.978f, 17.393f, 19.305f, 16.915f)
                lineTo(13.444f, 12.745f)
                curveTo(12.914f, 12.368f, 12.914f, 11.632f, 13.444f, 11.255f)
                lineTo(19.305f, 7.085f)
                curveTo(19.978f, 6.607f, 20.954f, 7.048f, 20.954f, 7.831f)
                verticalLineTo(16.169f)
                close()
                moveTo(10.954f, 16.169f)
                curveTo(10.954f, 16.952f, 9.978f, 17.393f, 9.305f, 16.915f)
                lineTo(3.444f, 12.745f)
                curveTo(2.914f, 12.368f, 2.914f, 11.632f, 3.444f, 11.255f)
                lineTo(9.305f, 7.085f)
                curveTo(9.978f, 6.607f, 10.954f, 7.048f, 10.954f, 7.831f)
                lineTo(10.954f, 16.169f)
                close()
            }
        }.build()

        return _FastRewind!!
    }

@Suppress("ObjectPropertyName")
private var _FastRewind: ImageVector? = null
