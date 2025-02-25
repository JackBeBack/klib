package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LoopVertical: ImageVector
    get() {
        if (_LoopVertical != null) {
            return _LoopVertical!!
        }
        _LoopVertical = ImageVector.Builder(
            name = "LoopVertical",
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
                moveTo(4f, 6f)
                lineTo(7f, 3f)
                moveTo(7f, 3f)
                lineTo(10f, 6f)
                moveTo(7f, 3f)
                verticalLineTo(17f)
                curveTo(7f, 19.209f, 8.791f, 21f, 11f, 21f)
                moveTo(20f, 18f)
                lineTo(17f, 21f)
                moveTo(17f, 21f)
                lineTo(14f, 18f)
                moveTo(17f, 21f)
                verticalLineTo(7f)
                curveTo(17f, 4.791f, 15.209f, 3f, 13f, 3f)
            }
        }.build()

        return _LoopVertical!!
    }

@Suppress("ObjectPropertyName")
private var _LoopVertical: ImageVector? = null
