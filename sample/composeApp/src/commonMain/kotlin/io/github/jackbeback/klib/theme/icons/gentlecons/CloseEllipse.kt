package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CloseEllipse: ImageVector
    get() {
        if (_CloseEllipse != null) {
            return _CloseEllipse!!
        }
        _CloseEllipse = ImageVector.Builder(
            name = "CloseEllipse",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.004f, 9.418f)
                curveTo(7.613f, 9.028f, 7.613f, 8.394f, 8.004f, 8.004f)
                curveTo(8.394f, 7.613f, 9.028f, 7.613f, 9.418f, 8.004f)
                lineTo(12.006f, 10.592f)
                lineTo(14.591f, 8.007f)
                curveTo(14.981f, 7.616f, 15.614f, 7.616f, 16.005f, 8.007f)
                curveTo(16.396f, 8.397f, 16.396f, 9.03f, 16.005f, 9.421f)
                lineTo(13.42f, 12.006f)
                lineTo(16.004f, 14.59f)
                curveTo(16.394f, 14.98f, 16.394f, 15.613f, 16.004f, 16.004f)
                curveTo(15.613f, 16.395f, 14.98f, 16.395f, 14.59f, 16.004f)
                lineTo(12.006f, 13.42f)
                lineTo(9.421f, 16.005f)
                curveTo(9.03f, 16.395f, 8.397f, 16.395f, 8.007f, 16.005f)
                curveTo(7.616f, 15.614f, 7.616f, 14.981f, 8.007f, 14.59f)
                lineTo(10.592f, 12.006f)
                lineTo(8.004f, 9.418f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _CloseEllipse!!
    }

@Suppress("ObjectPropertyName")
private var _CloseEllipse: ImageVector? = null
