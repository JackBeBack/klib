package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketCurly: ImageVector
    get() {
        if (_BracketCurly != null) {
            return _BracketCurly!!
        }
        _BracketCurly = ImageVector.Builder(
            name = "BracketCurly",
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
                moveTo(14f, 21f)
                curveTo(12.895f, 21f, 12f, 20.105f, 12f, 19f)
                verticalLineTo(15.325f)
                curveTo(12f, 14.836f, 12f, 14.592f, 11.945f, 14.361f)
                curveTo(11.896f, 14.158f, 11.815f, 13.962f, 11.705f, 13.783f)
                curveTo(11.582f, 13.582f, 11.409f, 13.409f, 11.063f, 13.063f)
                lineTo(10f, 12f)
                lineTo(11.063f, 10.937f)
                curveTo(11.409f, 10.591f, 11.582f, 10.418f, 11.705f, 10.217f)
                curveTo(11.815f, 10.038f, 11.896f, 9.843f, 11.945f, 9.638f)
                curveTo(12f, 9.408f, 12f, 9.164f, 12f, 8.675f)
                verticalLineTo(5f)
                curveTo(12f, 3.895f, 12.895f, 3f, 14f, 3f)
            }
        }.build()

        return _BracketCurly!!
    }

@Suppress("ObjectPropertyName")
private var _BracketCurly: ImageVector? = null
