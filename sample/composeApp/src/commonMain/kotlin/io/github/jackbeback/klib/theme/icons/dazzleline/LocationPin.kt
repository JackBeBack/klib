package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationPin: ImageVector
    get() {
        if (_LocationPin != null) {
            return _LocationPin!!
        }
        _LocationPin = ImageVector.Builder(
            name = "LocationPin",
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
                moveTo(12f, 13f)
                curveTo(13.657f, 13f, 15f, 11.657f, 15f, 10f)
                curveTo(15f, 8.343f, 13.657f, 7f, 12f, 7f)
                curveTo(10.343f, 7f, 9f, 8.343f, 9f, 10f)
                curveTo(9f, 11.657f, 10.343f, 13f, 12f, 13f)
                close()
            }
        }.build()

        return _LocationPin!!
    }

@Suppress("ObjectPropertyName")
private var _LocationPin: ImageVector? = null
