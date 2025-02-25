package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WatchAlt2: ImageVector
    get() {
        if (_WatchAlt2 != null) {
            return _WatchAlt2!!
        }
        _WatchAlt2 = ImageVector.Builder(
            name = "WatchAlt2",
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
                moveTo(16.01f, 7.537f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7.998f, 7.53f)
                moveTo(15.998f, 16.474f)
                lineTo(15f, 21f)
                horizontalLineTo(9f)
                lineTo(8.007f, 16.478f)
                moveTo(12f, 9.5f)
                verticalLineTo(12f)
                lineTo(14f, 13.5f)
                moveTo(12f, 18f)
                curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _WatchAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _WatchAlt2: ImageVector? = null
