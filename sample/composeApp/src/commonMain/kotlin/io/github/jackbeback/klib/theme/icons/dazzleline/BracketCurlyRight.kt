package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketCurlyRight: ImageVector
    get() {
        if (_BracketCurlyRight != null) {
            return _BracketCurlyRight!!
        }
        _BracketCurlyRight = ImageVector.Builder(
            name = "BracketCurlyRight",
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
                moveTo(10f, 21f)
                curveTo(11.105f, 21f, 12f, 20.105f, 12f, 19f)
                verticalLineTo(15.325f)
                curveTo(12f, 14.836f, 12f, 14.592f, 12.055f, 14.361f)
                curveTo(12.104f, 14.158f, 12.185f, 13.962f, 12.295f, 13.783f)
                curveTo(12.418f, 13.582f, 12.591f, 13.409f, 12.937f, 13.063f)
                lineTo(14f, 12f)
                lineTo(12.937f, 10.937f)
                curveTo(12.591f, 10.591f, 12.418f, 10.418f, 12.295f, 10.217f)
                curveTo(12.185f, 10.038f, 12.104f, 9.843f, 12.055f, 9.638f)
                curveTo(12f, 9.408f, 12f, 9.164f, 12f, 8.675f)
                verticalLineTo(5f)
                curveTo(12f, 3.895f, 11.105f, 3f, 10f, 3f)
            }
        }.build()

        return _BracketCurlyRight!!
    }

@Suppress("ObjectPropertyName")
private var _BracketCurlyRight: ImageVector? = null
