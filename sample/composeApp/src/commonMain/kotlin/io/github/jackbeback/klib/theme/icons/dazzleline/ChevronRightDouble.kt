package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChevronRightDouble: ImageVector
    get() {
        if (_ChevronRightDouble != null) {
            return _ChevronRightDouble!!
        }
        _ChevronRightDouble = ImageVector.Builder(
            name = "ChevronRightDouble",
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
                moveTo(6f, 17f)
                lineTo(11f, 12f)
                lineTo(6f, 7f)
                moveTo(13f, 17f)
                lineTo(18f, 12f)
                lineTo(13f, 7f)
            }
        }.build()

        return _ChevronRightDouble!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronRightDouble: ImageVector? = null
