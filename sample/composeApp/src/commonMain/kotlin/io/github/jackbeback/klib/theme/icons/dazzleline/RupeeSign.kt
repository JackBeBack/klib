package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RupeeSign: ImageVector
    get() {
        if (_RupeeSign != null) {
            return _RupeeSign!!
        }
        _RupeeSign = ImageVector.Builder(
            name = "RupeeSign",
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
                moveTo(6f, 4f)
                horizontalLineTo(10.5f)
                moveTo(10.5f, 4f)
                curveTo(12.985f, 4f, 15f, 6.015f, 15f, 8.5f)
                curveTo(15f, 10.985f, 12.985f, 13f, 10.5f, 13f)
                horizontalLineTo(6f)
                lineTo(13f, 20f)
                moveTo(10.5f, 4f)
                horizontalLineTo(18f)
                moveTo(6f, 8.5f)
                horizontalLineTo(18f)
            }
        }.build()

        return _RupeeSign!!
    }

@Suppress("ObjectPropertyName")
private var _RupeeSign: ImageVector? = null
