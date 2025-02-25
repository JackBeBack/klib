package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LeftIndent: ImageVector
    get() {
        if (_LeftIndent != null) {
            return _LeftIndent!!
        }
        _LeftIndent = ImageVector.Builder(
            name = "LeftIndent",
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
                moveTo(5f, 10f)
                lineTo(3f, 12f)
                lineTo(5f, 14f)
            }
        }.build()

        return _LeftIndent!!
    }

@Suppress("ObjectPropertyName")
private var _LeftIndent: ImageVector? = null
