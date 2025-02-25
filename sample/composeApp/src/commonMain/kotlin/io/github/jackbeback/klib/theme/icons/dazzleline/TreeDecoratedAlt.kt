package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TreeDecoratedAlt: ImageVector
    get() {
        if (_TreeDecoratedAlt != null) {
            return _TreeDecoratedAlt!!
        }
        _TreeDecoratedAlt = ImageVector.Builder(
            name = "TreeDecoratedAlt",
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
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                lineTo(12f, 2f)
                lineTo(19f, 17f)
                close()
                moveTo(19f, 17f)
                lineTo(8f, 11f)
                moveTo(16f, 11.5f)
                lineTo(9.5f, 8f)
                moveTo(9f, 22f)
                horizontalLineTo(15f)
                moveTo(12f, 22f)
                verticalLineTo(17f)
            }
        }.build()

        return _TreeDecoratedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDecoratedAlt: ImageVector? = null
