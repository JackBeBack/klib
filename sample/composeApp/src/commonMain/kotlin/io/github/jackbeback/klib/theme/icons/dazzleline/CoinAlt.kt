package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CoinAlt: ImageVector
    get() {
        if (_CoinAlt != null) {
            return _CoinAlt!!
        }
        _CoinAlt = ImageVector.Builder(
            name = "CoinAlt",
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
                moveTo(21f, 9.5f)
                curveTo(21f, 11.985f, 16.971f, 14f, 12f, 14f)
                moveTo(21f, 9.5f)
                curveTo(21f, 7.015f, 16.971f, 5f, 12f, 5f)
                curveTo(7.029f, 5f, 3f, 7.015f, 3f, 9.5f)
                moveTo(21f, 9.5f)
                verticalLineTo(15f)
                curveTo(21f, 17.209f, 16.971f, 19f, 12f, 19f)
                moveTo(12f, 14f)
                curveTo(7.029f, 14f, 3f, 11.985f, 3f, 9.5f)
                moveTo(12f, 14f)
                verticalLineTo(19f)
                moveTo(3f, 9.5f)
                verticalLineTo(15f)
                curveTo(3f, 17.209f, 7.029f, 19f, 12f, 19f)
                moveTo(7f, 18.326f)
                verticalLineTo(13.242f)
                moveTo(17f, 18.326f)
                verticalLineTo(13.242f)
            }
        }.build()

        return _CoinAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CoinAlt: ImageVector? = null
