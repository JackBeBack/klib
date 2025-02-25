package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Upload: ImageVector
    get() {
        if (_Upload != null) {
            return _Upload!!
        }
        _Upload = ImageVector.Builder(
            name = "Upload",
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
                moveTo(10.69f, 1.312f)
                curveTo(11.442f, 0.66f, 12.558f, 0.66f, 13.31f, 1.312f)
                lineTo(18.129f, 5.489f)
                curveTo(19.528f, 6.701f, 18.671f, 9f, 16.819f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                curveTo(15f, 18.105f, 14.105f, 19f, 13f, 19f)
                horizontalLineTo(11f)
                curveTo(9.895f, 19f, 9f, 18.105f, 9f, 17f)
                verticalLineTo(9f)
                horizontalLineTo(7.181f)
                curveTo(5.329f, 9f, 4.472f, 6.701f, 5.871f, 5.489f)
                lineTo(10.69f, 1.312f)
                close()
                moveTo(12.655f, 3.391f)
                curveTo(12.279f, 3.065f, 11.721f, 3.065f, 11.345f, 3.391f)
                lineTo(7.181f, 7f)
                lineTo(9.5f, 7f)
                curveTo(10.328f, 7f, 11f, 7.672f, 11f, 8.5f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(8.5f)
                curveTo(13f, 7.672f, 13.672f, 7f, 14.5f, 7f)
                horizontalLineTo(16.819f)
                lineTo(12.655f, 3.391f)
                close()
            }
        }.build()

        return _Upload!!
    }

@Suppress("ObjectPropertyName")
private var _Upload: ImageVector? = null
