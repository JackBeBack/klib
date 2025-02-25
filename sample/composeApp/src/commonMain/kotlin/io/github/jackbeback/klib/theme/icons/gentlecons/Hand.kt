package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Hand: ImageVector
    get() {
        if (_Hand != null) {
            return _Hand!!
        }
        _Hand = ImageVector.Builder(
            name = "Hand",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.5f, 3f)
                curveTo(13.224f, 3f, 13f, 3.224f, 13f, 3.5f)
                verticalLineTo(12f)
                curveTo(13f, 12.552f, 12.552f, 13f, 12f, 13f)
                curveTo(11.448f, 13f, 11f, 12.552f, 11f, 12f)
                verticalLineTo(5.5f)
                curveTo(11f, 5.224f, 10.776f, 5f, 10.5f, 5f)
                curveTo(10.224f, 5f, 10f, 5.224f, 10f, 5.5f)
                verticalLineTo(13.968f)
                curveTo(10f, 15.076f, 8.627f, 15.592f, 7.897f, 14.758f)
                lineTo(5.35f, 11.847f)
                curveTo(5.192f, 11.666f, 4.955f, 11.576f, 4.717f, 11.606f)
                curveTo(4.153f, 11.676f, 3.888f, 12.34f, 4.248f, 12.779f)
                lineTo(8.938f, 18.512f)
                curveTo(10.227f, 20.087f, 12.154f, 21f, 14.189f, 21f)
                curveTo(17.398f, 21f, 20f, 18.398f, 20f, 15.189f)
                verticalLineTo(7.5f)
                curveTo(20f, 7.224f, 19.776f, 7f, 19.5f, 7f)
                curveTo(19.224f, 7f, 19f, 7.224f, 19f, 7.5f)
                verticalLineTo(12f)
                curveTo(19f, 12.552f, 18.552f, 13f, 18f, 13f)
                curveTo(17.448f, 13f, 17f, 12.552f, 17f, 12f)
                verticalLineTo(5.5f)
                curveTo(17f, 5.224f, 16.776f, 5f, 16.5f, 5f)
                curveTo(16.224f, 5f, 16f, 5.224f, 16f, 5.5f)
                verticalLineTo(12f)
                curveTo(16f, 12.552f, 15.552f, 13f, 15f, 13f)
                curveTo(14.448f, 13f, 14f, 12.552f, 14f, 12f)
                verticalLineTo(3.5f)
                curveTo(14f, 3.224f, 13.776f, 3f, 13.5f, 3f)
                close()
                moveTo(15.961f, 3.058f)
                curveTo(15.752f, 1.888f, 14.73f, 1f, 13.5f, 1f)
                curveTo(12.27f, 1f, 11.248f, 1.888f, 11.039f, 3.058f)
                curveTo(10.865f, 3.02f, 10.685f, 3f, 10.5f, 3f)
                curveTo(9.119f, 3f, 8f, 4.119f, 8f, 5.5f)
                verticalLineTo(11.839f)
                lineTo(6.855f, 10.53f)
                curveTo(6.26f, 9.849f, 5.366f, 9.509f, 4.469f, 9.621f)
                curveTo(2.344f, 9.887f, 1.344f, 12.388f, 2.7f, 14.045f)
                lineTo(7.39f, 19.778f)
                curveTo(9.059f, 21.817f, 11.554f, 23f, 14.189f, 23f)
                curveTo(18.503f, 23f, 22f, 19.503f, 22f, 15.189f)
                verticalLineTo(7.5f)
                curveTo(22f, 6.119f, 20.881f, 5f, 19.5f, 5f)
                curveTo(19.315f, 5f, 19.135f, 5.02f, 18.961f, 5.058f)
                curveTo(18.753f, 3.888f, 17.73f, 3f, 16.5f, 3f)
                curveTo(16.315f, 3f, 16.135f, 3.02f, 15.961f, 3.058f)
                close()
            }
        }.build()

        return _Hand!!
    }

@Suppress("ObjectPropertyName")
private var _Hand: ImageVector? = null
