package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Download: ImageVector
    get() {
        if (_Download != null) {
            return _Download!!
        }
        _Download = ImageVector.Builder(
            name = "Download",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 22f)
                curveTo(23f, 22.552f, 22.552f, 23f, 22f, 23f)
                horizontalLineTo(2f)
                curveTo(1.448f, 23f, 1f, 22.552f, 1f, 22f)
                curveTo(1f, 21.448f, 1.448f, 21f, 2f, 21f)
                horizontalLineTo(22f)
                curveTo(22.552f, 21f, 23f, 21.448f, 23f, 22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.31f, 18.688f)
                curveTo(12.558f, 19.34f, 11.442f, 19.34f, 10.69f, 18.688f)
                lineTo(5.871f, 14.511f)
                curveTo(4.472f, 13.299f, 5.329f, 11f, 7.181f, 11f)
                lineTo(9f, 11f)
                verticalLineTo(3f)
                curveTo(9f, 1.895f, 9.895f, 1f, 11f, 1f)
                lineTo(13f, 1f)
                curveTo(14.105f, 1f, 15f, 1.895f, 15f, 3f)
                lineTo(15f, 11f)
                horizontalLineTo(16.819f)
                curveTo(18.671f, 11f, 19.528f, 13.299f, 18.129f, 14.511f)
                lineTo(13.31f, 18.688f)
                close()
                moveTo(11.345f, 16.609f)
                curveTo(11.721f, 16.935f, 12.279f, 16.935f, 12.655f, 16.609f)
                lineTo(16.819f, 13f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 13f, 13f, 12.328f, 13f, 11.5f)
                verticalLineTo(3f)
                lineTo(11f, 3f)
                verticalLineTo(11.5f)
                curveTo(11f, 12.328f, 10.328f, 13f, 9.5f, 13f)
                lineTo(7.181f, 13f)
                lineTo(11.345f, 16.609f)
                close()
            }
        }.build()

        return _Download!!
    }

@Suppress("ObjectPropertyName")
private var _Download: ImageVector? = null
