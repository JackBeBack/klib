package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AccessLowVision: ImageVector
    get() {
        if (_AccessLowVision != null) {
            return _AccessLowVision!!
        }
        _AccessLowVision = ImageVector.Builder(
            name = "AccessLowVision",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 4f)
                curveTo(10f, 5.306f, 9.165f, 6.418f, 8f, 6.83f)
                verticalLineTo(7.526f)
                lineTo(13.133f, 11.726f)
                curveTo(13.561f, 12.076f, 13.624f, 12.706f, 13.274f, 13.134f)
                curveTo(12.924f, 13.561f, 12.294f, 13.624f, 11.867f, 13.274f)
                lineTo(8f, 10.111f)
                verticalLineTo(13.819f)
                lineTo(10.936f, 21.649f)
                curveTo(11.13f, 22.166f, 10.868f, 22.743f, 10.351f, 22.937f)
                curveTo(9.834f, 23.131f, 9.258f, 22.868f, 9.064f, 22.351f)
                lineTo(7f, 16.848f)
                lineTo(4.936f, 22.351f)
                curveTo(4.742f, 22.868f, 4.166f, 23.131f, 3.649f, 22.937f)
                curveTo(3.132f, 22.743f, 2.87f, 22.166f, 3.064f, 21.649f)
                lineTo(6f, 13.819f)
                verticalLineTo(9.618f)
                lineTo(4.223f, 10.507f)
                lineTo(4.949f, 12.684f)
                curveTo(5.123f, 13.208f, 4.84f, 13.774f, 4.316f, 13.949f)
                curveTo(3.792f, 14.124f, 3.226f, 13.84f, 3.051f, 13.316f)
                lineTo(2.326f, 11.139f)
                curveTo(2.011f, 10.195f, 2.438f, 9.163f, 3.329f, 8.718f)
                lineTo(6f, 7.382f)
                verticalLineTo(6.83f)
                curveTo(4.835f, 6.418f, 4f, 5.306f, 4f, 4f)
                curveTo(4f, 2.343f, 5.343f, 1f, 7f, 1f)
                curveTo(8.657f, 1f, 10f, 2.343f, 10f, 4f)
                close()
                moveTo(5.893f, 4f)
                curveTo(5.893f, 4.612f, 6.388f, 5.108f, 7f, 5.108f)
                curveTo(7.612f, 5.108f, 8.107f, 4.612f, 8.107f, 4f)
                curveTo(8.107f, 3.389f, 7.612f, 2.893f, 7f, 2.893f)
                curveTo(6.388f, 2.893f, 5.893f, 3.389f, 5.893f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.759f, 14.349f)
                curveTo(15.4f, 13.93f, 14.769f, 13.882f, 14.349f, 14.241f)
                curveTo(13.93f, 14.6f, 13.881f, 15.232f, 14.241f, 15.651f)
                lineTo(20.241f, 22.651f)
                curveTo(20.6f, 23.07f, 21.232f, 23.119f, 21.651f, 22.76f)
                curveTo(22.07f, 22.4f, 22.119f, 21.769f, 21.759f, 21.35f)
                lineTo(15.759f, 14.349f)
                close()
            }
        }.build()

        return _AccessLowVision!!
    }

@Suppress("ObjectPropertyName")
private var _AccessLowVision: ImageVector? = null
