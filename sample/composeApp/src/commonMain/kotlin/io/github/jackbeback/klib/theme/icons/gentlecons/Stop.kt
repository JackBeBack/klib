package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Stop",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 12f)
                curveTo(6f, 12.552f, 6.448f, 13f, 7f, 13f)
                lineTo(17f, 13f)
                curveTo(17.552f, 13f, 18f, 12.552f, 18f, 12f)
                curveTo(18f, 11.448f, 17.552f, 11f, 17f, 11f)
                horizontalLineTo(7f)
                curveTo(6.448f, 11f, 6f, 11.448f, 6f, 12f)
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
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
