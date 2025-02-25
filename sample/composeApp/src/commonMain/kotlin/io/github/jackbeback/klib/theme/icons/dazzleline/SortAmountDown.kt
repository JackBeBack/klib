package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SortAmountDown: ImageVector
    get() {
        if (_SortAmountDown != null) {
            return _SortAmountDown!!
        }
        _SortAmountDown = ImageVector.Builder(
            name = "SortAmountDown",
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
                moveTo(13f, 12f)
                horizontalLineTo(21f)
                moveTo(13f, 8f)
                horizontalLineTo(21f)
                moveTo(13f, 16f)
                horizontalLineTo(21f)
                moveTo(6f, 7f)
                verticalLineTo(17f)
                moveTo(6f, 17f)
                lineTo(3f, 14f)
                moveTo(6f, 17f)
                lineTo(9f, 14f)
            }
        }.build()

        return _SortAmountDown!!
    }

@Suppress("ObjectPropertyName")
private var _SortAmountDown: ImageVector? = null
