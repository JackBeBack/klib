package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Route: ImageVector
    get() {
        if (_Route != null) {
            return _Route!!
        }
        _Route = ImageVector.Builder(
            name = "Route",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.707f, 2.621f)
                curveTo(12.317f, 2.231f, 11.683f, 2.231f, 11.293f, 2.621f)
                lineTo(2.621f, 11.293f)
                curveTo(2.231f, 11.683f, 2.231f, 12.316f, 2.621f, 12.707f)
                lineTo(11.293f, 21.379f)
                curveTo(11.683f, 21.769f, 12.317f, 21.769f, 12.707f, 21.379f)
                lineTo(21.379f, 12.707f)
                curveTo(21.769f, 12.316f, 21.769f, 11.683f, 21.379f, 11.293f)
                lineTo(12.707f, 2.621f)
                close()
                moveTo(9.879f, 1.207f)
                curveTo(11.05f, 0.035f, 12.95f, 0.035f, 14.121f, 1.207f)
                lineTo(22.793f, 9.879f)
                curveTo(23.965f, 11.05f, 23.965f, 12.95f, 22.793f, 14.121f)
                lineTo(14.121f, 22.793f)
                curveTo(12.95f, 23.964f, 11.05f, 23.964f, 9.879f, 22.793f)
                lineTo(1.207f, 14.121f)
                curveTo(0.036f, 12.95f, 0.036f, 11.05f, 1.207f, 9.879f)
                lineTo(9.879f, 1.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12.757f, 7.707f)
                curveTo(13.148f, 7.317f, 13.781f, 7.317f, 14.172f, 7.707f)
                lineTo(17f, 10.535f)
                curveTo(17.781f, 11.316f, 17.781f, 12.583f, 17f, 13.364f)
                lineTo(14.172f, 16.192f)
                curveTo(13.781f, 16.583f, 13.148f, 16.583f, 12.757f, 16.192f)
                curveTo(12.367f, 15.802f, 12.367f, 15.169f, 12.757f, 14.778f)
                lineTo(14.535f, 13f)
                horizontalLineTo(11f)
                curveTo(10.448f, 13f, 10f, 13.448f, 10f, 14f)
                verticalLineTo(15f)
                curveTo(10f, 15.552f, 9.552f, 16f, 9f, 16f)
                curveTo(8.448f, 16f, 8f, 15.552f, 8f, 15f)
                verticalLineTo(13f)
                curveTo(8f, 11.895f, 8.895f, 11f, 10f, 11f)
                horizontalLineTo(14.636f)
                lineTo(12.757f, 9.121f)
                curveTo(12.367f, 8.731f, 12.367f, 8.098f, 12.757f, 7.707f)
                close()
            }
        }.build()

        return _Route!!
    }

@Suppress("ObjectPropertyName")
private var _Route: ImageVector? = null
