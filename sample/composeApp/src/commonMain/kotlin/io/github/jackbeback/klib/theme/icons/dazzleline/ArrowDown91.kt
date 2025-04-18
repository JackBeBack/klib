package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDown91: ImageVector
    get() {
        if (_ArrowDown91 != null) {
            return _ArrowDown91!!
        }
        _ArrowDown91 = ImageVector.Builder(
            name = "ArrowDown91",
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
                moveTo(16.5f, 16f)
                lineTo(18.5f, 14f)
                verticalLineTo(21f)
                moveTo(16.5f, 21f)
                horizontalLineTo(20.5f)
                moveTo(20.5f, 7f)
                lineTo(18f, 10f)
                moveTo(21f, 5.5f)
                curveTo(21f, 6.881f, 19.881f, 8f, 18.5f, 8f)
                curveTo(17.119f, 8f, 16f, 6.881f, 16f, 5.5f)
                curveTo(16f, 4.119f, 17.119f, 3f, 18.5f, 3f)
                curveTo(19.881f, 3f, 21f, 4.119f, 21f, 5.5f)
                close()
            }
        }.build()

        return _ArrowDown91!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown91: ImageVector? = null
