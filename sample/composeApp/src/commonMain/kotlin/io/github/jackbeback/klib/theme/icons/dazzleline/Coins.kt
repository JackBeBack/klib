package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Coins: ImageVector
    get() {
        if (_Coins != null) {
            return _Coins!!
        }
        _Coins = ImageVector.Builder(
            name = "Coins",
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
                moveTo(11f, 20f)
                horizontalLineTo(5f)
                curveTo(3.895f, 20f, 3f, 19.105f, 3f, 18f)
                curveTo(3f, 16.895f, 3.895f, 16f, 5f, 16f)
                moveTo(11f, 20f)
                curveTo(12.105f, 20f, 13f, 19.105f, 13f, 18f)
                curveTo(13f, 16.895f, 12.105f, 16f, 11f, 16f)
                moveTo(11f, 20f)
                horizontalLineTo(19f)
                curveTo(20.105f, 20f, 21f, 19.105f, 21f, 18f)
                curveTo(21f, 16.895f, 20.105f, 16f, 19f, 16f)
                moveTo(11f, 16f)
                horizontalLineTo(5f)
                moveTo(11f, 16f)
                horizontalLineTo(19f)
                moveTo(11f, 16f)
                curveTo(12.105f, 16f, 13f, 15.105f, 13f, 14f)
                curveTo(13f, 12.895f, 12.105f, 12f, 11f, 12f)
                moveTo(5f, 16f)
                curveTo(3.895f, 16f, 3f, 15.105f, 3f, 14f)
                curveTo(3f, 12.895f, 3.895f, 12f, 5f, 12f)
                moveTo(19f, 16f)
                curveTo(20.105f, 16f, 21f, 15.105f, 21f, 14f)
                curveTo(21f, 12.895f, 20.105f, 12f, 19f, 12f)
                moveTo(11f, 12f)
                horizontalLineTo(19f)
                moveTo(11f, 12f)
                horizontalLineTo(5f)
                moveTo(11f, 12f)
                curveTo(12.105f, 12f, 13f, 11.105f, 13f, 10f)
                curveTo(13f, 8.895f, 12.105f, 8f, 11f, 8f)
                moveTo(19f, 12f)
                curveTo(20.105f, 12f, 21f, 11.105f, 21f, 10f)
                curveTo(21f, 8.895f, 20.105f, 8f, 19f, 8f)
                horizontalLineTo(11f)
                moveTo(11f, 8f)
                horizontalLineTo(5f)
                moveTo(11f, 8f)
                curveTo(12.105f, 8f, 13f, 7.105f, 13f, 6f)
                curveTo(13f, 4.895f, 12.105f, 4f, 11f, 4f)
                horizontalLineTo(5f)
                curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
                curveTo(3f, 7.105f, 3.895f, 8f, 5f, 8f)
                moveTo(5f, 12f)
                curveTo(3.895f, 12f, 3f, 11.105f, 3f, 10f)
                curveTo(3f, 8.895f, 3.895f, 8f, 5f, 8f)
            }
        }.build()

        return _Coins!!
    }

@Suppress("ObjectPropertyName")
private var _Coins: ImageVector? = null
