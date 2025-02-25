package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Scissors: ImageVector
    get() {
        if (_Scissors != null) {
            return _Scissors!!
        }
        _Scissors = ImageVector.Builder(
            name = "Scissors",
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
                moveTo(8.152f, 15.85f)
                lineTo(21f, 4f)
                moveTo(12.325f, 12f)
                lineTo(8.15f, 8.15f)
                moveTo(21f, 20f)
                lineTo(15f, 14.467f)
                moveTo(9f, 6f)
                curveTo(9f, 7.657f, 7.657f, 9f, 6f, 9f)
                curveTo(4.343f, 9f, 3f, 7.657f, 3f, 6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                curveTo(7.657f, 3f, 9f, 4.343f, 9f, 6f)
                close()
                moveTo(9f, 18f)
                curveTo(9f, 19.657f, 7.657f, 21f, 6f, 21f)
                curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
                curveTo(3f, 16.343f, 4.343f, 15f, 6f, 15f)
                curveTo(7.657f, 15f, 9f, 16.343f, 9f, 18f)
                close()
            }
        }.build()

        return _Scissors!!
    }

@Suppress("ObjectPropertyName")
private var _Scissors: ImageVector? = null
