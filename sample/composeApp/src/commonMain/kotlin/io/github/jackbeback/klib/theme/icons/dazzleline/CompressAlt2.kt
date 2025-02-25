package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CompressAlt2: ImageVector
    get() {
        if (_CompressAlt2 != null) {
            return _CompressAlt2!!
        }
        _CompressAlt2 = ImageVector.Builder(
            name = "CompressAlt2",
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
                moveTo(13f, 11f)
                lineTo(21f, 3f)
                moveTo(13f, 11f)
                lineTo(17.5f, 11f)
                moveTo(13f, 11f)
                verticalLineTo(6.5f)
                moveTo(3f, 21f)
                lineTo(11f, 13f)
                moveTo(11f, 13f)
                horizontalLineTo(6.5f)
                moveTo(11f, 13f)
                verticalLineTo(17.5f)
            }
        }.build()

        return _CompressAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _CompressAlt2: ImageVector? = null
