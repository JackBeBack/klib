package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TombstoneBlank: ImageVector
    get() {
        if (_TombstoneBlank != null) {
            return _TombstoneBlank!!
        }
        _TombstoneBlank = ImageVector.Builder(
            name = "TombstoneBlank",
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
                moveTo(19f, 21f)
                verticalLineTo(10f)
                curveTo(19f, 6.134f, 15.866f, 3f, 12f, 3f)
                curveTo(8.134f, 3f, 5f, 6.134f, 5f, 10f)
                verticalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
            }
        }.build()

        return _TombstoneBlank!!
    }

@Suppress("ObjectPropertyName")
private var _TombstoneBlank: ImageVector? = null
