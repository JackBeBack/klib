package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.LogOut: ImageVector
    get() {
        if (_LogOut != null) {
            return _LogOut!!
        }
        _LogOut = ImageVector.Builder(
            name = "LogOut",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 23f)
                horizontalLineTo(11f)
                curveTo(10.448f, 23f, 10f, 22.552f, 10f, 22f)
                curveTo(10f, 21.448f, 10.448f, 21f, 11f, 21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 3.448f, 19.552f, 3f, 19f, 3f)
                lineTo(11f, 3f)
                curveTo(10.448f, 3f, 10f, 2.552f, 10f, 2f)
                curveTo(10f, 1.448f, 10.448f, 1f, 11f, 1f)
                lineTo(19f, 1f)
                curveTo(20.657f, 1f, 22f, 2.343f, 22f, 4f)
                verticalLineTo(20f)
                curveTo(22f, 21.657f, 20.657f, 23f, 19f, 23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.489f, 13.31f)
                curveTo(1.837f, 12.558f, 1.837f, 11.442f, 2.489f, 10.69f)
                lineTo(6.665f, 5.871f)
                curveTo(7.878f, 4.472f, 10.177f, 5.329f, 10.177f, 7.181f)
                lineTo(10.177f, 9f)
                horizontalLineTo(16.177f)
                curveTo(17.281f, 9f, 18.177f, 9.895f, 18.177f, 11f)
                verticalLineTo(13f)
                curveTo(18.177f, 14.105f, 17.281f, 15f, 16.177f, 15f)
                lineTo(10.177f, 15f)
                verticalLineTo(16.819f)
                curveTo(10.177f, 18.671f, 7.878f, 19.528f, 6.665f, 18.129f)
                lineTo(2.489f, 13.31f)
                close()
                moveTo(4.568f, 11.345f)
                curveTo(4.242f, 11.721f, 4.242f, 12.279f, 4.568f, 12.655f)
                lineTo(8.177f, 16.819f)
                verticalLineTo(14.5f)
                curveTo(8.177f, 13.672f, 8.848f, 13f, 9.677f, 13f)
                lineTo(16.177f, 13f)
                verticalLineTo(11f)
                lineTo(9.677f, 11f)
                curveTo(8.848f, 11f, 8.177f, 10.328f, 8.177f, 9.5f)
                lineTo(8.177f, 7.181f)
                lineTo(4.568f, 11.345f)
                close()
            }
        }.build()

        return _LogOut!!
    }

@Suppress("ObjectPropertyName")
private var _LogOut: ImageVector? = null
