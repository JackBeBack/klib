package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Percent: ImageVector
    get() {
        if (_Percent != null) {
            return _Percent!!
        }
        _Percent = ImageVector.Builder(
            name = "Percent",
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
                moveTo(5f, 19f)
                lineTo(19f, 5f)
                moveTo(9f, 7f)
                curveTo(9f, 8.105f, 8.105f, 9f, 7f, 9f)
                curveTo(5.895f, 9f, 5f, 8.105f, 5f, 7f)
                curveTo(5f, 5.895f, 5.895f, 5f, 7f, 5f)
                curveTo(8.105f, 5f, 9f, 5.895f, 9f, 7f)
                close()
                moveTo(19f, 17f)
                curveTo(19f, 18.105f, 18.105f, 19f, 17f, 19f)
                curveTo(15.895f, 19f, 15f, 18.105f, 15f, 17f)
                curveTo(15f, 15.895f, 15.895f, 15f, 17f, 15f)
                curveTo(18.105f, 15f, 19f, 15.895f, 19f, 17f)
                close()
            }
        }.build()

        return _Percent!!
    }

@Suppress("ObjectPropertyName")
private var _Percent: ImageVector? = null
