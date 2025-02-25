package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Wind: ImageVector
    get() {
        if (_Wind != null) {
            return _Wind!!
        }
        _Wind = ImageVector.Builder(
            name = "Wind",
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
                moveTo(15.764f, 7f)
                curveTo(16.313f, 6.386f, 17.111f, 6f, 18f, 6f)
                curveTo(19.657f, 6f, 21f, 7.343f, 21f, 9f)
                curveTo(21f, 10.657f, 19.657f, 12f, 18f, 12f)
                horizontalLineTo(3f)
                moveTo(8.509f, 4.667f)
                curveTo(8.875f, 4.258f, 9.408f, 4f, 10f, 4f)
                curveTo(11.105f, 4f, 12f, 4.895f, 12f, 6f)
                curveTo(12f, 7.105f, 11.105f, 8f, 10f, 8f)
                horizontalLineTo(3f)
                moveTo(11.509f, 19.333f)
                curveTo(11.875f, 19.743f, 12.408f, 20f, 13f, 20f)
                curveTo(14.105f, 20f, 15f, 19.105f, 15f, 18f)
                curveTo(15f, 16.895f, 14.105f, 16f, 13f, 16f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Wind!!
    }

@Suppress("ObjectPropertyName")
private var _Wind: ImageVector? = null
