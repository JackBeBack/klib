package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpShortWide: ImageVector
    get() {
        if (_ArrowUpShortWide != null) {
            return _ArrowUpShortWide!!
        }
        _ArrowUpShortWide = ImageVector.Builder(
            name = "ArrowUpShortWide",
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
                moveTo(7f, 3f)
                lineTo(11f, 7f)
                moveTo(7f, 3f)
                lineTo(3f, 7f)
                moveTo(14f, 3f)
                horizontalLineTo(15f)
                moveTo(14f, 9f)
                horizontalLineTo(17f)
                moveTo(14f, 15f)
                horizontalLineTo(19f)
                moveTo(14f, 21f)
                horizontalLineTo(21f)
            }
        }.build()

        return _ArrowUpShortWide!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpShortWide: ImageVector? = null
