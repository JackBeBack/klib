package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Restrict: ImageVector
    get() {
        if (_Restrict != null) {
            return _Restrict!!
        }
        _Restrict = ImageVector.Builder(
            name = "Restrict",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                curveTo(3.007f, 9.877f, 3.743f, 7.926f, 4.973f, 6.387f)
                lineTo(17.613f, 19.027f)
                curveTo(16.074f, 20.257f, 14.123f, 20.993f, 12f, 20.993f)
                close()
                moveTo(19.027f, 17.613f)
                curveTo(20.257f, 16.074f, 20.993f, 14.123f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(9.877f, 3.007f, 7.926f, 3.743f, 6.387f, 4.973f)
                lineTo(19.027f, 17.613f)
                close()
            }
        }.build()

        return _Restrict!!
    }

@Suppress("ObjectPropertyName")
private var _Restrict: ImageVector? = null
