package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDownWideShort: ImageVector
    get() {
        if (_ArrowDownWideShort != null) {
            return _ArrowDownWideShort!!
        }
        _ArrowDownWideShort = ImageVector.Builder(
            name = "ArrowDownWideShort",
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
                moveTo(7f, 3f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                lineTo(3f, 17f)
                moveTo(7f, 21f)
                lineTo(11f, 17f)
                moveTo(14f, 3f)
                horizontalLineTo(21f)
                moveTo(14f, 9f)
                horizontalLineTo(19f)
                moveTo(14f, 15f)
                horizontalLineTo(17f)
                moveTo(14f, 21f)
                horizontalLineTo(15f)
            }
        }.build()

        return _ArrowDownWideShort!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownWideShort: ImageVector? = null
