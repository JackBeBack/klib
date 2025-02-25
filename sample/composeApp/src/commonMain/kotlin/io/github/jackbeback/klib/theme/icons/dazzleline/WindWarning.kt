package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WindWarning: ImageVector
    get() {
        if (_WindWarning != null) {
            return _WindWarning!!
        }
        _WindWarning = ImageVector.Builder(
            name = "WindWarning",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11f, 16f)
                curveTo(10.165f, 16.628f, 9.126f, 17f, 8f, 17f)
                curveTo(5.239f, 17f, 3f, 14.761f, 3f, 12f)
                curveTo(3f, 9.239f, 5.239f, 7f, 8f, 7f)
                curveTo(10.05f, 7f, 11.812f, 8.234f, 12.584f, 10f)
                moveTo(8f, 10f)
                verticalLineTo(11f)
                moveTo(8f, 14f)
                horizontalLineTo(8.01f)
                moveTo(16f, 10f)
                horizontalLineTo(18.5f)
                curveTo(19.881f, 10f, 21f, 8.881f, 21f, 7.5f)
                curveTo(21f, 6.119f, 19.881f, 5f, 18.5f, 5f)
                horizontalLineTo(17f)
                moveTo(11f, 13f)
                horizontalLineTo(18f)
                curveTo(19.657f, 13f, 21f, 14.343f, 21f, 16f)
                curveTo(21f, 17.657f, 19.657f, 19f, 18f, 19f)
                horizontalLineTo(16f)
            }
        }.build()

        return _WindWarning!!
    }

@Suppress("ObjectPropertyName")
private var _WindWarning: ImageVector? = null
