package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ExpandWide: ImageVector
    get() {
        if (_ExpandWide != null) {
            return _ExpandWide!!
        }
        _ExpandWide = ImageVector.Builder(
            name = "ExpandWide",
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
                moveTo(3f, 10f)
                verticalLineTo(5f)
                lineTo(8f, 5f)
                moveTo(3f, 14f)
                verticalLineTo(19f)
                lineTo(8f, 19f)
                moveTo(16f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(21f, 14f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
            }
        }.build()

        return _ExpandWide!!
    }

@Suppress("ObjectPropertyName")
private var _ExpandWide: ImageVector? = null
