package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CompressAlt: ImageVector
    get() {
        if (_CompressAlt != null) {
            return _CompressAlt!!
        }
        _CompressAlt = ImageVector.Builder(
            name = "CompressAlt",
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
                moveTo(14f, 10f)
                lineTo(21f, 3f)
                moveTo(14f, 10f)
                horizontalLineTo(18.5f)
                moveTo(14f, 10f)
                verticalLineTo(5.5f)
                moveTo(10f, 14f)
                lineTo(3f, 21f)
                moveTo(10f, 14f)
                horizontalLineTo(5.5f)
                moveTo(10f, 14f)
                lineTo(10f, 18.5f)
            }
        }.build()

        return _CompressAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CompressAlt: ImageVector? = null
