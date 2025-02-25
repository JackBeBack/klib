package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Loop: ImageVector
    get() {
        if (_Loop != null) {
            return _Loop!!
        }
        _Loop = ImageVector.Builder(
            name = "Loop",
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
                moveTo(18f, 4f)
                lineTo(21f, 7f)
                moveTo(21f, 7f)
                lineTo(18f, 10f)
                moveTo(21f, 7f)
                horizontalLineTo(7f)
                curveTo(4.791f, 7f, 3f, 8.791f, 3f, 11f)
                moveTo(6f, 20f)
                lineTo(3f, 17f)
                moveTo(3f, 17f)
                lineTo(6f, 14f)
                moveTo(3f, 17f)
                horizontalLineTo(17f)
                curveTo(19.209f, 17f, 21f, 15.209f, 21f, 13f)
            }
        }.build()

        return _Loop!!
    }

@Suppress("ObjectPropertyName")
private var _Loop: ImageVector? = null
