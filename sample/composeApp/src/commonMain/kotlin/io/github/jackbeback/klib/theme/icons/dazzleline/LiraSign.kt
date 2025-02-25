package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LiraSign: ImageVector
    get() {
        if (_LiraSign != null) {
            return _LiraSign!!
        }
        _LiraSign = ImageVector.Builder(
            name = "LiraSign",
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
                moveTo(19f, 13f)
                curveTo(19f, 17.418f, 14.523f, 21f, 9f, 21f)
                verticalLineTo(3f)
                moveTo(15f, 10f)
                lineTo(5f, 12f)
                moveTo(15f, 6f)
                lineTo(5f, 8f)
            }
        }.build()

        return _LiraSign!!
    }

@Suppress("ObjectPropertyName")
private var _LiraSign: ImageVector? = null
