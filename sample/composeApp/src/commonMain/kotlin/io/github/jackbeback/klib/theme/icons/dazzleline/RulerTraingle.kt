package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RulerTraingle: ImageVector
    get() {
        if (_RulerTraingle != null) {
            return _RulerTraingle!!
        }
        _RulerTraingle = ImageVector.Builder(
            name = "RulerTraingle",
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
                moveTo(6f, 6f)
                lineTo(3f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                lineTo(18f, 18f)
                moveTo(6f, 6f)
                lineTo(9f, 9f)
                moveTo(6f, 6f)
                lineTo(5f, 7f)
                moveTo(9f, 9f)
                lineTo(12f, 12f)
                moveTo(9f, 9f)
                lineTo(8f, 10f)
                moveTo(12f, 12f)
                lineTo(15f, 15f)
                moveTo(12f, 12f)
                lineTo(11f, 13f)
                moveTo(15f, 15f)
                lineTo(14f, 16f)
                moveTo(15f, 15f)
                lineTo(18f, 18f)
                moveTo(18f, 18f)
                lineTo(17f, 19f)
                moveTo(6f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                lineTo(6f, 12f)
                close()
            }
        }.build()

        return _RulerTraingle!!
    }

@Suppress("ObjectPropertyName")
private var _RulerTraingle: ImageVector? = null
