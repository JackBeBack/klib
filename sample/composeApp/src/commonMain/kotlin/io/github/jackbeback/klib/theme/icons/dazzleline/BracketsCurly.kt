package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BracketsCurly: ImageVector
    get() {
        if (_BracketsCurly != null) {
            return _BracketsCurly!!
        }
        _BracketsCurly = ImageVector.Builder(
            name = "BracketsCurly",
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
                moveTo(9f, 21f)
                curveTo(7.895f, 21f, 7f, 20.105f, 7f, 19f)
                verticalLineTo(15.325f)
                curveTo(7f, 14.836f, 7f, 14.592f, 6.945f, 14.361f)
                curveTo(6.896f, 14.158f, 6.815f, 13.962f, 6.705f, 13.783f)
                curveTo(6.582f, 13.582f, 6.409f, 13.409f, 6.063f, 13.063f)
                lineTo(5f, 12f)
                lineTo(6.063f, 10.937f)
                curveTo(6.409f, 10.591f, 6.582f, 10.418f, 6.705f, 10.217f)
                curveTo(6.815f, 10.038f, 6.896f, 9.843f, 6.945f, 9.638f)
                curveTo(7f, 9.408f, 7f, 9.164f, 7f, 8.675f)
                verticalLineTo(5f)
                curveTo(7f, 3.895f, 7.895f, 3f, 9f, 3f)
                moveTo(15f, 21f)
                curveTo(16.105f, 21f, 17f, 20.105f, 17f, 19f)
                verticalLineTo(15.325f)
                curveTo(17f, 14.836f, 17f, 14.592f, 17.055f, 14.361f)
                curveTo(17.104f, 14.158f, 17.185f, 13.962f, 17.295f, 13.783f)
                curveTo(17.418f, 13.582f, 17.591f, 13.409f, 17.937f, 13.063f)
                lineTo(19f, 12f)
                lineTo(17.937f, 10.937f)
                curveTo(17.591f, 10.591f, 17.418f, 10.418f, 17.295f, 10.217f)
                curveTo(17.185f, 10.038f, 17.104f, 9.843f, 17.055f, 9.638f)
                curveTo(17f, 9.408f, 17f, 9.164f, 17f, 8.675f)
                verticalLineTo(5f)
                curveTo(17f, 3.895f, 16.105f, 3f, 15f, 3f)
            }
        }.build()

        return _BracketsCurly!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurly: ImageVector? = null
