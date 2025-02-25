package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Mortarboard: ImageVector
    get() {
        if (_Mortarboard != null) {
            return _Mortarboard!!
        }
        _Mortarboard = ImageVector.Builder(
            name = "Mortarboard",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.449f, 3.078f)
                curveTo(12.167f, 2.935f, 11.833f, 2.935f, 11.55f, 3.078f)
                lineTo(0.551f, 8.608f)
                curveTo(-0.182f, 8.976f, -0.184f, 10.023f, 0.548f, 10.393f)
                lineTo(5f, 12.646f)
                verticalLineTo(17f)
                curveTo(5f, 19.209f, 6.791f, 21f, 9f, 21f)
                horizontalLineTo(15f)
                curveTo(17.209f, 21f, 19f, 19.209f, 19f, 17f)
                verticalLineTo(12.635f)
                lineTo(22f, 11.124f)
                verticalLineTo(14f)
                curveTo(22f, 14.552f, 22.448f, 15f, 23f, 15f)
                curveTo(23.552f, 15f, 24f, 14.552f, 24f, 14f)
                verticalLineTo(9.63f)
                curveTo(24f, 9.207f, 23.839f, 8.811f, 23.442f, 8.611f)
                curveTo(19.778f, 6.767f, 16.114f, 4.922f, 12.449f, 3.078f)
                close()
                moveTo(12f, 5.09f)
                lineTo(3.22f, 9.504f)
                lineTo(11.974f, 13.935f)
                lineTo(20.769f, 9.505f)
                lineTo(12f, 5.09f)
                close()
                moveTo(7f, 17f)
                verticalLineTo(13.659f)
                lineTo(11.522f, 15.947f)
                curveTo(11.805f, 16.091f, 12.139f, 16.091f, 12.423f, 15.948f)
                lineTo(17f, 13.643f)
                verticalLineTo(17f)
                curveTo(17f, 18.105f, 16.105f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                curveTo(7.895f, 19f, 7f, 18.105f, 7f, 17f)
                close()
            }
        }.build()

        return _Mortarboard!!
    }

@Suppress("ObjectPropertyName")
private var _Mortarboard: ImageVector? = null
