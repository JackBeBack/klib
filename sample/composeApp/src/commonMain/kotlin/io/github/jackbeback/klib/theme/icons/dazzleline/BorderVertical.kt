package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BorderVertical: ImageVector
    get() {
        if (_BorderVertical != null) {
            return _BorderVertical!!
        }
        _BorderVertical = ImageVector.Builder(
            name = "BorderVertical",
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
                moveTo(16f, 4f)
                horizontalLineTo(16.01f)
                moveTo(16f, 12f)
                horizontalLineTo(16.01f)
                moveTo(16f, 20f)
                horizontalLineTo(16.01f)
                moveTo(8f, 4f)
                horizontalLineTo(8.01f)
                moveTo(8f, 12f)
                horizontalLineTo(8.01f)
                moveTo(4f, 4f)
                horizontalLineTo(4.01f)
                moveTo(4f, 8f)
                horizontalLineTo(4.01f)
                moveTo(4f, 12f)
                horizontalLineTo(4.01f)
                moveTo(4f, 16f)
                horizontalLineTo(4.01f)
                moveTo(4f, 20f)
                horizontalLineTo(4.01f)
                moveTo(8f, 20f)
                horizontalLineTo(8.01f)
                moveTo(20f, 4f)
                horizontalLineTo(20.01f)
                moveTo(20f, 8f)
                horizontalLineTo(20.01f)
                moveTo(20f, 12f)
                horizontalLineTo(20.01f)
                moveTo(20f, 16f)
                horizontalLineTo(20.01f)
                moveTo(20f, 20f)
                horizontalLineTo(20.01f)
                moveTo(12.012f, 4f)
                verticalLineTo(20f)
            }
        }.build()

        return _BorderVertical!!
    }

@Suppress("ObjectPropertyName")
private var _BorderVertical: ImageVector? = null
