package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.LocationStraight: ImageVector
    get() {
        if (_LocationStraight != null) {
            return _LocationStraight!!
        }
        _LocationStraight = ImageVector.Builder(
            name = "LocationStraight",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.283f, 2.869f)
                curveTo(10.994f, 1.305f, 13.214f, 1.305f, 13.925f, 2.869f)
                lineTo(21.5f, 19.534f)
                curveTo(22.342f, 21.387f, 20.2f, 23.167f, 18.532f, 22f)
                lineTo(12.104f, 17.5f)
                lineTo(5.676f, 22f)
                curveTo(4.008f, 23.167f, 1.866f, 21.387f, 2.708f, 19.534f)
                lineTo(10.283f, 2.869f)
                close()
                moveTo(12.104f, 3.696f)
                lineTo(4.529f, 20.361f)
                lineTo(10.957f, 15.862f)
                curveTo(11.646f, 15.38f, 12.562f, 15.38f, 13.251f, 15.862f)
                lineTo(19.679f, 20.361f)
                lineTo(12.104f, 3.696f)
                close()
            }
        }.build()

        return _LocationStraight!!
    }

@Suppress("ObjectPropertyName")
private var _LocationStraight: ImageVector? = null
