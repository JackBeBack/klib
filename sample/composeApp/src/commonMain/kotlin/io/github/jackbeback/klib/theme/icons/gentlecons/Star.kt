package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.151f, 2.365f)
                curveTo(10.831f, 0.714f, 13.169f, 0.714f, 13.849f, 2.365f)
                lineTo(16.186f, 8.039f)
                lineTo(21.426f, 8.347f)
                curveTo(23.263f, 8.455f, 23.991f, 10.779f, 22.544f, 11.916f)
                lineTo(18.182f, 15.343f)
                lineTo(19.92f, 20.269f)
                curveTo(20.565f, 22.096f, 18.497f, 23.68f, 16.901f, 22.583f)
                lineTo(12f, 19.213f)
                lineTo(7.099f, 22.583f)
                curveTo(5.503f, 23.68f, 3.435f, 22.096f, 4.08f, 20.269f)
                lineTo(5.818f, 15.343f)
                lineTo(1.456f, 11.916f)
                curveTo(0.009f, 10.779f, 0.737f, 8.455f, 2.575f, 8.347f)
                lineTo(7.814f, 8.039f)
                lineTo(10.151f, 2.365f)
                close()
                moveTo(12f, 3.126f)
                lineTo(9.186f, 9.961f)
                lineTo(2.692f, 10.343f)
                lineTo(8.182f, 14.657f)
                lineTo(5.966f, 20.935f)
                lineTo(12f, 16.787f)
                lineTo(18.034f, 20.935f)
                lineTo(15.818f, 14.657f)
                lineTo(21.308f, 10.343f)
                lineTo(14.814f, 9.961f)
                lineTo(12f, 3.126f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
