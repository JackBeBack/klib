package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BitcoinSign: ImageVector
    get() {
        if (_BitcoinSign != null) {
            return _BitcoinSign!!
        }
        _BitcoinSign = ImageVector.Builder(
            name = "BitcoinSign",
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
                moveTo(10f, 6f)
                horizontalLineTo(15f)
                curveTo(16.657f, 6f, 18f, 7.343f, 18f, 9f)
                curveTo(18f, 10.657f, 16.657f, 12f, 15f, 12f)
                moveTo(10f, 6f)
                verticalLineTo(12f)
                moveTo(10f, 6f)
                horizontalLineTo(7f)
                moveTo(10f, 6f)
                verticalLineTo(3f)
                moveTo(15f, 12f)
                horizontalLineTo(10f)
                moveTo(15f, 12f)
                curveTo(16.657f, 12f, 18f, 13.343f, 18f, 15f)
                curveTo(18f, 16.657f, 16.657f, 18f, 15f, 18f)
                horizontalLineTo(10f)
                moveTo(10f, 12f)
                verticalLineTo(18f)
                moveTo(10f, 18f)
                horizontalLineTo(7f)
                moveTo(10f, 18f)
                verticalLineTo(21f)
                moveTo(13f, 6f)
                verticalLineTo(3f)
                moveTo(13f, 21f)
                verticalLineTo(18f)
            }
        }.build()

        return _BitcoinSign!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinSign: ImageVector? = null
