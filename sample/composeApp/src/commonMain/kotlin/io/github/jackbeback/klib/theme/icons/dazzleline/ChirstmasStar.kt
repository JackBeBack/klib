package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChirstmasStar: ImageVector
    get() {
        if (_ChirstmasStar != null) {
            return _ChirstmasStar!!
        }
        _ChirstmasStar = ImageVector.Builder(
            name = "ChirstmasStar",
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
                moveTo(15f, 9f)
                lineTo(19f, 5f)
                moveTo(15f, 15f)
                lineTo(19f, 19f)
                moveTo(9f, 9f)
                lineTo(5f, 5f)
                moveTo(9f, 15f)
                lineTo(5f, 19f)
                moveTo(12f, 3f)
                lineTo(10.01f, 8.173f)
                curveTo(9.823f, 8.661f, 9.729f, 8.906f, 9.582f, 9.111f)
                curveTo(9.453f, 9.294f, 9.294f, 9.453f, 9.111f, 9.582f)
                curveTo(8.906f, 9.729f, 8.661f, 9.823f, 8.173f, 10.01f)
                lineTo(3f, 12f)
                lineTo(8.173f, 13.99f)
                curveTo(8.661f, 14.177f, 8.906f, 14.271f, 9.111f, 14.418f)
                curveTo(9.294f, 14.547f, 9.453f, 14.706f, 9.582f, 14.889f)
                curveTo(9.729f, 15.094f, 9.823f, 15.339f, 10.01f, 15.827f)
                lineTo(12f, 21f)
                lineTo(13.99f, 15.827f)
                curveTo(14.177f, 15.339f, 14.271f, 15.094f, 14.418f, 14.889f)
                curveTo(14.547f, 14.706f, 14.706f, 14.547f, 14.889f, 14.418f)
                curveTo(15.094f, 14.271f, 15.339f, 14.177f, 15.827f, 13.99f)
                lineTo(21f, 12f)
                lineTo(15.827f, 10.01f)
                curveTo(15.339f, 9.823f, 15.094f, 9.729f, 14.889f, 9.582f)
                curveTo(14.706f, 9.453f, 14.547f, 9.294f, 14.418f, 9.111f)
                curveTo(14.271f, 8.906f, 14.177f, 8.661f, 13.99f, 8.173f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _ChirstmasStar!!
    }

@Suppress("ObjectPropertyName")
private var _ChirstmasStar: ImageVector? = null
