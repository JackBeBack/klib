package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CompressWide: ImageVector
    get() {
        if (_CompressWide != null) {
            return _CompressWide!!
        }
        _CompressWide = ImageVector.Builder(
            name = "CompressWide",
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
                moveTo(8f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                moveTo(16f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                moveTo(3f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                moveTo(16f, 19f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
            }
        }.build()

        return _CompressWide!!
    }

@Suppress("ObjectPropertyName")
private var _CompressWide: ImageVector? = null
