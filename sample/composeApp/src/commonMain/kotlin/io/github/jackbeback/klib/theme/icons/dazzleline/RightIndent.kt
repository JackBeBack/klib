package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RightIndent: ImageVector
    get() {
        if (_RightIndent != null) {
            return _RightIndent!!
        }
        _RightIndent = ImageVector.Builder(
            name = "RightIndent",
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
                moveTo(21f, 6f)
                horizontalLineTo(13f)
                moveTo(9f, 6f)
                verticalLineTo(18f)
                moveTo(21f, 10f)
                horizontalLineTo(13f)
                moveTo(21f, 14f)
                horizontalLineTo(13f)
                moveTo(21f, 18f)
                horizontalLineTo(13f)
                moveTo(3f, 10f)
                lineTo(5f, 12f)
                lineTo(3f, 14f)
            }
        }.build()

        return _RightIndent!!
    }

@Suppress("ObjectPropertyName")
private var _RightIndent: ImageVector? = null
