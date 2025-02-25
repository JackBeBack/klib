package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Heading: ImageVector
    get() {
        if (_Heading != null) {
            return _Heading!!
        }
        _Heading = ImageVector.Builder(
            name = "Heading",
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
                moveTo(6f, 3f)
                verticalLineTo(21f)
                moveTo(18f, 12f)
                horizontalLineTo(7f)
                moveTo(18f, 3f)
                verticalLineTo(21f)
                moveTo(4f, 21f)
                horizontalLineTo(8f)
                moveTo(4f, 3f)
                horizontalLineTo(8f)
                moveTo(16f, 21f)
                horizontalLineTo(20f)
                moveTo(16f, 3f)
                horizontalLineTo(20f)
            }
        }.build()

        return _Heading!!
    }

@Suppress("ObjectPropertyName")
private var _Heading: ImageVector? = null
