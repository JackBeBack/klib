package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Stars: ImageVector
    get() {
        if (_Stars != null) {
            return _Stars!!
        }
        _Stars = ImageVector.Builder(
            name = "Stars",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 16f)
                verticalLineTo(20f)
                moveTo(6f, 4f)
                verticalLineTo(8f)
                moveTo(7f, 18f)
                horizontalLineTo(3f)
                moveTo(8f, 6f)
                horizontalLineTo(4f)
                moveTo(13f, 4f)
                lineTo(14.753f, 8.444f)
                curveTo(14.941f, 8.921f, 15.035f, 9.159f, 15.179f, 9.36f)
                curveTo(15.306f, 9.538f, 15.462f, 9.694f, 15.64f, 9.821f)
                curveTo(15.841f, 9.965f, 16.079f, 10.059f, 16.556f, 10.247f)
                lineTo(21f, 12f)
                lineTo(16.556f, 13.753f)
                curveTo(16.079f, 13.941f, 15.841f, 14.035f, 15.64f, 14.179f)
                curveTo(15.462f, 14.306f, 15.306f, 14.462f, 15.179f, 14.64f)
                curveTo(15.035f, 14.841f, 14.941f, 15.079f, 14.753f, 15.556f)
                lineTo(13f, 20f)
                lineTo(11.247f, 15.556f)
                curveTo(11.059f, 15.079f, 10.965f, 14.841f, 10.821f, 14.64f)
                curveTo(10.694f, 14.462f, 10.538f, 14.306f, 10.36f, 14.179f)
                curveTo(10.159f, 14.035f, 9.921f, 13.941f, 9.444f, 13.753f)
                lineTo(5f, 12f)
                lineTo(9.444f, 10.247f)
                curveTo(9.921f, 10.059f, 10.159f, 9.965f, 10.36f, 9.821f)
                curveTo(10.538f, 9.694f, 10.694f, 9.538f, 10.821f, 9.36f)
                curveTo(10.965f, 9.159f, 11.059f, 8.921f, 11.247f, 8.444f)
                lineTo(13f, 4f)
                close()
            }
        }.build()

        return _Stars!!
    }

@Suppress("ObjectPropertyName")
private var _Stars: ImageVector? = null
