package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Heat: ImageVector
    get() {
        if (_Heat != null) {
            return _Heat!!
        }
        _Heat = ImageVector.Builder(
            name = "Heat",
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
                moveTo(8.5f, 16f)
                curveTo(8.5f, 16f, 9.342f, 16.366f, 9.9f, 16.463f)
                curveTo(11.546f, 16.75f, 12.454f, 15.25f, 14.1f, 15.536f)
                curveTo(14.658f, 15.634f, 15.5f, 16f, 15.5f, 16f)
                moveTo(7.5f, 12f)
                curveTo(7.5f, 12f, 8.583f, 12.366f, 9.3f, 12.464f)
                curveTo(11.416f, 12.75f, 12.584f, 11.25f, 14.7f, 11.536f)
                curveTo(15.417f, 11.634f, 16.5f, 12f, 16.5f, 12f)
                moveTo(8.5f, 8f)
                curveTo(8.5f, 8f, 9.342f, 8.366f, 9.9f, 8.463f)
                curveTo(11.546f, 8.75f, 12.454f, 7.25f, 14.1f, 7.537f)
                curveTo(14.658f, 7.634f, 15.5f, 8f, 15.5f, 8f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _Heat!!
    }

@Suppress("ObjectPropertyName")
private var _Heat: ImageVector? = null
