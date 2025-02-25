package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListMusic: ImageVector
    get() {
        if (_ListMusic != null) {
            return _ListMusic!!
        }
        _ListMusic = ImageVector.Builder(
            name = "ListMusic",
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
                moveTo(16f, 5f)
                verticalLineTo(18f)
                moveTo(16f, 18f)
                curveTo(16f, 19.105f, 14.657f, 20f, 13f, 20f)
                curveTo(11.343f, 20f, 10f, 19.105f, 10f, 18f)
                curveTo(10f, 16.895f, 11.343f, 16f, 13f, 16f)
                curveTo(14.657f, 16f, 16f, 16.895f, 16f, 18f)
                close()
                moveTo(4f, 5f)
                horizontalLineTo(12f)
                moveTo(4f, 9f)
                horizontalLineTo(12f)
                moveTo(4f, 13f)
                horizontalLineTo(8f)
                moveTo(16f, 4f)
                lineTo(20f, 3f)
                verticalLineTo(7f)
                lineTo(16f, 8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ListMusic!!
    }

@Suppress("ObjectPropertyName")
private var _ListMusic: ImageVector? = null
