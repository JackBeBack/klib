package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpZA: ImageVector
    get() {
        if (_ArrowUpZA != null) {
            return _ArrowUpZA!!
        }
        _ArrowUpZA = ImageVector.Builder(
            name = "ArrowUpZA",
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
                moveTo(7f, 3f)
                lineTo(11f, 7f)
                moveTo(7f, 3f)
                lineTo(3f, 7f)
                moveTo(15.5f, 14f)
                horizontalLineTo(20.5f)
                lineTo(15.5f, 21f)
                horizontalLineTo(20.5f)
                moveTo(16f, 9f)
                horizontalLineTo(20f)
                moveTo(15f, 10f)
                lineTo(18f, 3f)
                lineTo(21f, 10f)
            }
        }.build()

        return _ArrowUpZA!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpZA: ImageVector? = null
