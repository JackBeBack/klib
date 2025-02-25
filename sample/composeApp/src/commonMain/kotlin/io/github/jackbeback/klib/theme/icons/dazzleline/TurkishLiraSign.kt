package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TurkishLiraSign: ImageVector
    get() {
        if (_TurkishLiraSign != null) {
            return _TurkishLiraSign!!
        }
        _TurkishLiraSign = ImageVector.Builder(
            name = "TurkishLiraSign",
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
                moveTo(7f, 12.143f)
                verticalLineTo(20f)
                horizontalLineTo(11.889f)
                curveTo(15.816f, 20f, 19f, 16.816f, 19f, 12.889f)
                verticalLineTo(12f)
                moveTo(7f, 12.143f)
                verticalLineTo(8.143f)
                moveTo(7f, 12.143f)
                lineTo(5f, 13f)
                moveTo(7f, 12.143f)
                lineTo(12f, 10f)
                moveTo(7f, 8.143f)
                verticalLineTo(4f)
                moveTo(7f, 8.143f)
                lineTo(5f, 9f)
                moveTo(7f, 8.143f)
                lineTo(12f, 6f)
            }
        }.build()

        return _TurkishLiraSign!!
    }

@Suppress("ObjectPropertyName")
private var _TurkishLiraSign: ImageVector? = null
