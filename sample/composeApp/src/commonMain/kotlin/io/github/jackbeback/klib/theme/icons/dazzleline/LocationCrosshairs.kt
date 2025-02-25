package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationCrosshairs: ImageVector
    get() {
        if (_LocationCrosshairs != null) {
            return _LocationCrosshairs!!
        }
        _LocationCrosshairs = ImageVector.Builder(
            name = "LocationCrosshairs",
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
                moveTo(19f, 12f)
                curveTo(19f, 15.866f, 15.866f, 19f, 12f, 19f)
                moveTo(19f, 12f)
                curveTo(19f, 8.134f, 15.866f, 5f, 12f, 5f)
                moveTo(19f, 12f)
                horizontalLineTo(21f)
                moveTo(12f, 19f)
                curveTo(8.134f, 19f, 5f, 15.866f, 5f, 12f)
                moveTo(12f, 19f)
                verticalLineTo(21f)
                moveTo(5f, 12f)
                curveTo(5f, 8.134f, 8.134f, 5f, 12f, 5f)
                moveTo(5f, 12f)
                horizontalLineTo(3f)
                moveTo(12f, 5f)
                verticalLineTo(3f)
                moveTo(15f, 12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
                curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
                close()
            }
        }.build()

        return _LocationCrosshairs!!
    }

@Suppress("ObjectPropertyName")
private var _LocationCrosshairs: ImageVector? = null
