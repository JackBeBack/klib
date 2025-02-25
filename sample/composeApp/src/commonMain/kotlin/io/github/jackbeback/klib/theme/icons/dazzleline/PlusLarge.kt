package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PlusLarge: ImageVector
    get() {
        if (_PlusLarge != null) {
            return _PlusLarge!!
        }
        _PlusLarge = ImageVector.Builder(
            name = "PlusLarge",
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
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                moveTo(12f, 4f)
                verticalLineTo(20f)
            }
        }.build()

        return _PlusLarge!!
    }

@Suppress("ObjectPropertyName")
private var _PlusLarge: ImageVector? = null
