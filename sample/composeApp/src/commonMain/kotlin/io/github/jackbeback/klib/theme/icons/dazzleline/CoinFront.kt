package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CoinFront: ImageVector
    get() {
        if (_CoinFront != null) {
            return _CoinFront!!
        }
        _CoinFront = ImageVector.Builder(
            name = "CoinFront",
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
                moveTo(12f, 10f)
                verticalLineTo(14f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                close()
            }
        }.build()

        return _CoinFront!!
    }

@Suppress("ObjectPropertyName")
private var _CoinFront: ImageVector? = null
