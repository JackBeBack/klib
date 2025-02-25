package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LayerGroup: ImageVector
    get() {
        if (_LayerGroup != null) {
            return _LayerGroup!!
        }
        _LayerGroup = ImageVector.Builder(
            name = "LayerGroup",
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
                moveTo(17.4f, 10f)
                lineTo(21f, 12f)
                lineTo(17.4f, 14f)
                moveTo(17.4f, 10f)
                lineTo(12f, 13f)
                lineTo(6.6f, 10f)
                moveTo(17.4f, 10f)
                lineTo(21f, 8f)
                lineTo(12f, 3f)
                lineTo(3f, 8f)
                lineTo(6.6f, 10f)
                moveTo(6.6f, 10f)
                lineTo(3f, 12f)
                lineTo(6.6f, 14f)
                moveTo(17.4f, 14f)
                lineTo(21f, 16f)
                lineTo(12f, 21f)
                lineTo(3f, 16f)
                lineTo(6.6f, 14f)
                moveTo(17.4f, 14f)
                lineTo(12f, 17f)
                lineTo(6.6f, 14f)
            }
        }.build()

        return _LayerGroup!!
    }

@Suppress("ObjectPropertyName")
private var _LayerGroup: ImageVector? = null
