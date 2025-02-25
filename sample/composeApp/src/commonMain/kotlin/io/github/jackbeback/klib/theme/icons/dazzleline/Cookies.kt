package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cookies: ImageVector
    get() {
        if (_Cookies != null) {
            return _Cookies!!
        }
        _Cookies = ImageVector.Builder(
            name = "Cookies",
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
                moveTo(9f, 15f)
                curveTo(9f, 18.314f, 11.686f, 21f, 15f, 21f)
                curveTo(18.314f, 21f, 21f, 18.314f, 21f, 15f)
                curveTo(21f, 11.686f, 18.314f, 9f, 15f, 9f)
                moveTo(9f, 15f)
                curveTo(12.314f, 15f, 15f, 12.314f, 15f, 9f)
                moveTo(9f, 15f)
                curveTo(5.686f, 15f, 3f, 12.314f, 3f, 9f)
                curveTo(3f, 5.686f, 5.686f, 3f, 9f, 3f)
                curveTo(12.314f, 3f, 15f, 5.686f, 15f, 9f)
                moveTo(6.5f, 9f)
                horizontalLineTo(6.51f)
                moveTo(9f, 11.5f)
                horizontalLineTo(9.01f)
                moveTo(13.5f, 17f)
                horizontalLineTo(13.51f)
                moveTo(9f, 6.5f)
                horizontalLineTo(9.01f)
                moveTo(11.5f, 9f)
                horizontalLineTo(11.51f)
                moveTo(17f, 17f)
                horizontalLineTo(17.01f)
                moveTo(17f, 13.5f)
                horizontalLineTo(17.01f)
            }
        }.build()

        return _Cookies!!
    }

@Suppress("ObjectPropertyName")
private var _Cookies: ImageVector? = null
