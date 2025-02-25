package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDownZA: ImageVector
    get() {
        if (_ArrowDownZA != null) {
            return _ArrowDownZA!!
        }
        _ArrowDownZA = ImageVector.Builder(
            name = "ArrowDownZA",
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
                moveTo(15.5f, 3f)
                horizontalLineTo(20.5f)
                lineTo(15.5f, 10f)
                horizontalLineTo(20.5f)
                moveTo(16f, 20f)
                horizontalLineTo(20f)
                moveTo(15f, 21f)
                lineTo(18f, 14f)
                lineTo(21f, 21f)
            }
        }.build()

        return _ArrowDownZA!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownZA: ImageVector? = null
