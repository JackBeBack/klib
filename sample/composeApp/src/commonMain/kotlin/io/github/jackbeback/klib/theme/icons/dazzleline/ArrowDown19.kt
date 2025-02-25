package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDown19: ImageVector
    get() {
        if (_ArrowDown19 != null) {
            return _ArrowDown19!!
        }
        _ArrowDown19 = ImageVector.Builder(
            name = "ArrowDown19",
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
                moveTo(16.5f, 5f)
                lineTo(18.5f, 3f)
                verticalLineTo(10f)
                moveTo(16.5f, 10f)
                horizontalLineTo(20.5f)
                moveTo(20.5f, 18f)
                lineTo(18f, 21f)
                moveTo(21f, 16.5f)
                curveTo(21f, 17.881f, 19.881f, 19f, 18.5f, 19f)
                curveTo(17.119f, 19f, 16f, 17.881f, 16f, 16.5f)
                curveTo(16f, 15.119f, 17.119f, 14f, 18.5f, 14f)
                curveTo(19.881f, 14f, 21f, 15.119f, 21f, 16.5f)
                close()
            }
        }.build()

        return _ArrowDown19!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDown19: ImageVector? = null
