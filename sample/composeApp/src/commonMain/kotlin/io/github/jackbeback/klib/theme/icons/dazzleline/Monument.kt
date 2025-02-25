package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Monument: ImageVector
    get() {
        if (_Monument != null) {
            return _Monument!!
        }
        _Monument = ImageVector.Builder(
            name = "Monument",
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
                moveTo(7f, 21f)
                lineTo(9f, 5f)
                lineTo(12f, 3f)
                lineTo(15f, 5f)
                lineTo(17f, 21f)
                moveTo(11f, 14f)
                horizontalLineTo(13f)
                moveTo(5f, 21f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Monument!!
    }

@Suppress("ObjectPropertyName")
private var _Monument: ImageVector? = null
