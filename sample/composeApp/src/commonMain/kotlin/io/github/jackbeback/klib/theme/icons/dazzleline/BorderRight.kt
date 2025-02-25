package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BorderRight: ImageVector
    get() {
        if (_BorderRight != null) {
            return _BorderRight!!
        }
        _BorderRight = ImageVector.Builder(
            name = "BorderRight",
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
                moveTo(8.012f, 4f)
                horizontalLineTo(8.002f)
                moveTo(8.012f, 12f)
                horizontalLineTo(8.002f)
                moveTo(12.012f, 4f)
                horizontalLineTo(12.002f)
                moveTo(12.012f, 8f)
                horizontalLineTo(12.002f)
                moveTo(12.012f, 12f)
                horizontalLineTo(12.002f)
                moveTo(12.012f, 16f)
                horizontalLineTo(12.002f)
                moveTo(12.012f, 20f)
                horizontalLineTo(12.002f)
                moveTo(8.012f, 20f)
                horizontalLineTo(8.002f)
                moveTo(16.012f, 4f)
                horizontalLineTo(16.002f)
                moveTo(16.012f, 12f)
                horizontalLineTo(16.002f)
                moveTo(16.012f, 20f)
                horizontalLineTo(16.002f)
                moveTo(4.012f, 4f)
                horizontalLineTo(4.002f)
                moveTo(4.012f, 8f)
                horizontalLineTo(4.002f)
                moveTo(4.012f, 12f)
                horizontalLineTo(4.002f)
                moveTo(4.012f, 16f)
                horizontalLineTo(4.002f)
                moveTo(4.012f, 20f)
                horizontalLineTo(4.002f)
                moveTo(20.012f, 4f)
                verticalLineTo(20f)
            }
        }.build()

        return _BorderRight!!
    }

@Suppress("ObjectPropertyName")
private var _BorderRight: ImageVector? = null
