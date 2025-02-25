package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Superscript: ImageVector
    get() {
        if (_Superscript != null) {
            return _Superscript!!
        }
        _Superscript = ImageVector.Builder(
            name = "Superscript",
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
                moveTo(9f, 13f)
                lineTo(5f, 6f)
                horizontalLineTo(3f)
                moveTo(9f, 13f)
                lineTo(13f, 20f)
                horizontalLineTo(15f)
                moveTo(9f, 13f)
                lineTo(13f, 6f)
                horizontalLineTo(15f)
                moveTo(9f, 13f)
                lineTo(5f, 20f)
                horizontalLineTo(3f)
                moveTo(17f, 4f)
                lineTo(19f, 3f)
                verticalLineTo(9f)
                moveTo(19f, 9f)
                horizontalLineTo(17f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Superscript!!
    }

@Suppress("ObjectPropertyName")
private var _Superscript: ImageVector? = null
