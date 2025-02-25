package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationPinAlt1: ImageVector
    get() {
        if (_LocationPinAlt1 != null) {
            return _LocationPinAlt1!!
        }
        _LocationPinAlt1 = ImageVector.Builder(
            name = "LocationPinAlt1",
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
                moveTo(12f, 21f)
                curveTo(15.5f, 17.4f, 19f, 14.176f, 19f, 10.2f)
                curveTo(19f, 6.224f, 15.866f, 3f, 12f, 3f)
                curveTo(8.134f, 3f, 5f, 6.224f, 5f, 10.2f)
                curveTo(5f, 14.176f, 8.5f, 17.4f, 12f, 21f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                curveTo(13.105f, 12f, 14f, 11.105f, 14f, 10f)
                curveTo(14f, 8.895f, 13.105f, 8f, 12f, 8f)
                curveTo(10.895f, 8f, 10f, 8.895f, 10f, 10f)
                curveTo(10f, 11.105f, 10.895f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _LocationPinAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _LocationPinAlt1: ImageVector? = null
