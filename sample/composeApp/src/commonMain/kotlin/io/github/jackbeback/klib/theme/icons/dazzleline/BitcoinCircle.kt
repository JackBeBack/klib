package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BitcoinCircle: ImageVector
    get() {
        if (_BitcoinCircle != null) {
            return _BitcoinCircle!!
        }
        _BitcoinCircle = ImageVector.Builder(
            name = "BitcoinCircle",
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
                moveTo(10f, 8f)
                horizontalLineTo(14f)
                curveTo(15.105f, 8f, 16f, 8.895f, 16f, 10f)
                curveTo(16f, 11.105f, 15.105f, 12f, 14f, 12f)
                moveTo(10f, 8f)
                verticalLineTo(12f)
                moveTo(10f, 8f)
                horizontalLineTo(8.5f)
                moveTo(10f, 8f)
                verticalLineTo(6.5f)
                moveTo(14f, 12f)
                horizontalLineTo(10f)
                moveTo(14f, 12f)
                curveTo(15.105f, 12f, 16f, 12.895f, 16f, 14f)
                curveTo(16f, 15.105f, 15.105f, 16f, 14f, 16f)
                horizontalLineTo(10f)
                moveTo(10f, 12f)
                verticalLineTo(16f)
                moveTo(10f, 16f)
                horizontalLineTo(8.5f)
                moveTo(10f, 16f)
                verticalLineTo(17.5f)
                moveTo(13f, 8f)
                verticalLineTo(6.5f)
                moveTo(13f, 17.5f)
                verticalLineTo(16f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _BitcoinCircle!!
    }

@Suppress("ObjectPropertyName")
private var _BitcoinCircle: ImageVector? = null
