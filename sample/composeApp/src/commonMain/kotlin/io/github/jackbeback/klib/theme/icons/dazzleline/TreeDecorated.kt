package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TreeDecorated: ImageVector
    get() {
        if (_TreeDecorated != null) {
            return _TreeDecorated!!
        }
        _TreeDecorated = ImageVector.Builder(
            name = "TreeDecorated",
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
                moveTo(12f, 9f)
                horizontalLineTo(12.01f)
                moveTo(14f, 14f)
                horizontalLineTo(14.01f)
                moveTo(11f, 18f)
                horizontalLineTo(11.01f)
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                lineTo(8f, 16f)
                horizontalLineTo(5f)
                lineTo(9f, 11f)
                horizontalLineTo(6f)
                lineTo(12f, 3f)
                lineTo(18f, 11f)
                horizontalLineTo(15f)
                lineTo(19f, 16f)
                horizontalLineTo(16f)
                lineTo(20f, 21f)
                close()
            }
        }.build()

        return _TreeDecorated!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDecorated: ImageVector? = null
