package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GamingPad: ImageVector
    get() {
        if (_GamingPad != null) {
            return _GamingPad!!
        }
        _GamingPad = ImageVector.Builder(
            name = "GamingPad",
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
                moveTo(6f, 15f)
                horizontalLineTo(10f)
                moveTo(8f, 13f)
                verticalLineTo(17f)
                moveTo(18f, 16f)
                horizontalLineTo(18.01f)
                moveTo(15f, 14f)
                horizontalLineTo(15.01f)
                moveTo(16f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                moveTo(8f, 21f)
                curveTo(4.686f, 21f, 2f, 18.314f, 2f, 15f)
                curveTo(2f, 11.686f, 4.686f, 9f, 8f, 9f)
                horizontalLineTo(16f)
                curveTo(19.314f, 9f, 22f, 11.686f, 22f, 15f)
                curveTo(22f, 18.314f, 19.314f, 21f, 16f, 21f)
                curveTo(14.478f, 21f, 13.058f, 20.406f, 12f, 19.472f)
                curveTo(10.939f, 20.422f, 9.537f, 21f, 8f, 21f)
                close()
            }
        }.build()

        return _GamingPad!!
    }

@Suppress("ObjectPropertyName")
private var _GamingPad: ImageVector? = null
