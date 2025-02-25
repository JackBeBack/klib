package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LampDesk: ImageVector
    get() {
        if (_LampDesk != null) {
            return _LampDesk!!
        }
        _LampDesk = ImageVector.Builder(
            name = "LampDesk",
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
                moveTo(18.196f, 8.804f)
                curveTo(18.973f, 9.228f, 19.5f, 10.053f, 19.5f, 11f)
                curveTo(19.5f, 12.381f, 18.381f, 13.5f, 17f, 13.5f)
                curveTo(16.052f, 13.5f, 15.228f, 12.973f, 14.804f, 12.196f)
                moveTo(18.196f, 8.804f)
                lineTo(21f, 6f)
                lineTo(16f, 6f)
                lineTo(14f, 4f)
                curveTo(12.895f, 2.895f, 11.104f, 2.895f, 10f, 4f)
                curveTo(8.895f, 5.105f, 8.895f, 6.895f, 10f, 8f)
                lineTo(12f, 10f)
                lineTo(12f, 15f)
                lineTo(14.804f, 12.196f)
                moveTo(18.196f, 8.804f)
                lineTo(14.804f, 12.196f)
                moveTo(9f, 21f)
                lineTo(7f, 12f)
                lineTo(10.5f, 8.5f)
                moveTo(3f, 21f)
                lineTo(15f, 21f)
            }
        }.build()

        return _LampDesk!!
    }

@Suppress("ObjectPropertyName")
private var _LampDesk: ImageVector? = null
