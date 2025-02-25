package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.LogIn: ImageVector
    get() {
        if (_LogIn != null) {
            return _LogIn!!
        }
        _LogIn = ImageVector.Builder(
            name = "LogIn",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 23f)
                lineTo(12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                curveTo(11f, 21.448f, 11.448f, 21f, 12f, 21f)
                lineTo(20f, 21f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                lineTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                lineTo(12f, 3f)
                curveTo(11.448f, 3f, 11f, 2.552f, 11f, 2f)
                curveTo(11f, 1.448f, 11.448f, 1f, 12f, 1f)
                lineTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                lineTo(23f, 20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.688f, 10.69f)
                curveTo(19.34f, 11.442f, 19.34f, 12.558f, 18.688f, 13.31f)
                lineTo(14.511f, 18.129f)
                curveTo(13.299f, 19.528f, 11f, 18.671f, 11f, 16.819f)
                lineTo(11f, 15f)
                lineTo(5f, 15f)
                curveTo(3.895f, 15f, 3f, 14.105f, 3f, 13f)
                lineTo(3f, 11f)
                curveTo(3f, 9.895f, 3.895f, 9f, 5f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 7.181f)
                curveTo(11f, 5.329f, 13.299f, 4.472f, 14.511f, 5.871f)
                lineTo(18.688f, 10.69f)
                close()
                moveTo(16.609f, 12.655f)
                curveTo(16.935f, 12.279f, 16.935f, 11.721f, 16.609f, 11.345f)
                lineTo(13f, 7.181f)
                lineTo(13f, 9.5f)
                curveTo(13f, 10.328f, 12.328f, 11f, 11.5f, 11f)
                lineTo(5f, 11f)
                lineTo(5f, 13f)
                lineTo(11.5f, 13f)
                curveTo(12.328f, 13f, 13f, 13.672f, 13f, 14.5f)
                lineTo(13f, 16.819f)
                lineTo(16.609f, 12.655f)
                close()
            }
        }.build()

        return _LogIn!!
    }

@Suppress("ObjectPropertyName")
private var _LogIn: ImageVector? = null
