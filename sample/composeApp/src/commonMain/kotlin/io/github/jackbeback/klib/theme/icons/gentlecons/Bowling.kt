package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bowling: ImageVector
    get() {
        if (_Bowling != null) {
            return _Bowling!!
        }
        _Bowling = ImageVector.Builder(
            name = "Bowling",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10.5f, 8f)
                curveTo(11.328f, 8f, 12f, 7.328f, 12f, 6.5f)
                curveTo(12f, 5.672f, 11.328f, 5f, 10.5f, 5f)
                curveTo(9.672f, 5f, 9f, 5.672f, 9f, 6.5f)
                curveTo(9f, 7.328f, 9.672f, 8f, 10.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 10.5f)
                curveTo(8f, 11.328f, 7.328f, 12f, 6.5f, 12f)
                curveTo(5.672f, 12f, 5f, 11.328f, 5f, 10.5f)
                curveTo(5f, 9.672f, 5.672f, 9f, 6.5f, 9f)
                curveTo(7.328f, 9f, 8f, 9.672f, 8f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.5f, 13f)
                curveTo(12.328f, 13f, 13f, 12.328f, 13f, 11.5f)
                curveTo(13f, 10.672f, 12.328f, 10f, 11.5f, 10f)
                curveTo(10.672f, 10f, 10f, 10.672f, 10f, 11.5f)
                curveTo(10f, 12.328f, 10.672f, 13f, 11.5f, 13f)
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
                curveTo(7.033f, 20.993f, 3.007f, 16.966f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.966f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Bowling!!
    }

@Suppress("ObjectPropertyName")
private var _Bowling: ImageVector? = null
