package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CoinVertical: ImageVector
    get() {
        if (_CoinVertical != null) {
            return _CoinVertical!!
        }
        _CoinVertical = ImageVector.Builder(
            name = "CoinVertical",
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
                moveTo(9.5f, 3f)
                curveTo(11.985f, 3f, 14f, 7.029f, 14f, 12f)
                moveTo(9.5f, 3f)
                curveTo(7.015f, 3f, 5f, 7.029f, 5f, 12f)
                curveTo(5f, 16.971f, 7.015f, 21f, 9.5f, 21f)
                moveTo(9.5f, 3f)
                horizontalLineTo(15f)
                curveTo(17.209f, 3f, 19f, 7.029f, 19f, 12f)
                moveTo(14f, 12f)
                curveTo(14f, 16.971f, 11.985f, 21f, 9.5f, 21f)
                moveTo(14f, 12f)
                horizontalLineTo(19f)
                moveTo(9.5f, 21f)
                horizontalLineTo(15f)
                curveTo(17.209f, 21f, 19f, 16.971f, 19f, 12f)
                moveTo(18.326f, 17f)
                horizontalLineTo(13.242f)
                moveTo(18.326f, 7f)
                horizontalLineTo(13.242f)
                moveTo(9.5f, 8f)
                curveTo(10.328f, 8f, 11f, 9.791f, 11f, 12f)
                curveTo(11f, 14.209f, 10.328f, 16f, 9.5f, 16f)
                curveTo(8.672f, 16f, 8f, 14.209f, 8f, 12f)
                curveTo(8f, 9.791f, 8.672f, 8f, 9.5f, 8f)
                close()
            }
        }.build()

        return _CoinVertical!!
    }

@Suppress("ObjectPropertyName")
private var _CoinVertical: ImageVector? = null
