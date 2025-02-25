package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SantaGlove: ImageVector
    get() {
        if (_SantaGlove != null) {
            return _SantaGlove!!
        }
        _SantaGlove = ImageVector.Builder(
            name = "SantaGlove",
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
                moveTo(5f, 17f)
                horizontalLineTo(17f)
                moveTo(5f, 17f)
                curveTo(3.895f, 17f, 3f, 17.895f, 3f, 19f)
                curveTo(3f, 20.105f, 3.895f, 21f, 5f, 21f)
                horizontalLineTo(17f)
                curveTo(18.105f, 21f, 19f, 20.105f, 19f, 19f)
                curveTo(19f, 17.895f, 18.105f, 17f, 17f, 17f)
                moveTo(5f, 17f)
                verticalLineTo(10f)
                moveTo(17f, 17f)
                lineTo(17f, 14f)
                lineTo(20.078f, 11.537f)
                curveTo(21.149f, 10.681f, 21.335f, 9.113f, 20.512f, 8.016f)
                curveTo(19.683f, 6.911f, 18.105f, 6.672f, 17f, 7.5f)
                moveTo(17f, 9.429f)
                verticalLineTo(9f)
                curveTo(17f, 5.686f, 14.314f, 3f, 11f, 3f)
                curveTo(7.686f, 3f, 5f, 5.686f, 5f, 9f)
                verticalLineTo(12f)
            }
        }.build()

        return _SantaGlove!!
    }

@Suppress("ObjectPropertyName")
private var _SantaGlove: ImageVector? = null
