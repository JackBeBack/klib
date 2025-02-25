package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Colors: ImageVector
    get() {
        if (_Colors != null) {
            return _Colors!!
        }
        _Colors = ImageVector.Builder(
            name = "Colors",
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
                moveTo(16.883f, 10.078f)
                curveTo(19.223f, 10.495f, 21f, 12.54f, 21f, 15f)
                curveTo(21f, 17.761f, 18.761f, 20f, 16f, 20f)
                curveTo(14.364f, 20f, 12.912f, 19.215f, 12f, 18f)
                moveTo(16.883f, 10.078f)
                curveTo(16.96f, 9.731f, 17f, 9.37f, 17f, 9f)
                curveTo(17f, 6.239f, 14.761f, 4f, 12f, 4f)
                curveTo(9.239f, 4f, 7f, 6.239f, 7f, 9f)
                curveTo(7f, 9.37f, 7.04f, 9.731f, 7.116f, 10.078f)
                moveTo(16.883f, 10.078f)
                curveTo(16.453f, 12.038f, 14.872f, 13.568f, 12.884f, 13.922f)
                moveTo(12.884f, 13.922f)
                curveTo(12.597f, 13.973f, 12.302f, 14f, 12f, 14f)
                curveTo(9.609f, 14f, 7.609f, 12.321f, 7.116f, 10.078f)
                moveTo(12.884f, 13.922f)
                curveTo(12.96f, 14.269f, 13f, 14.63f, 13f, 15f)
                curveTo(13f, 16.126f, 12.628f, 17.165f, 12f, 18f)
                moveTo(7.116f, 10.078f)
                curveTo(4.776f, 10.495f, 3f, 12.54f, 3f, 15f)
                curveTo(3f, 17.761f, 5.239f, 20f, 8f, 20f)
                curveTo(9.636f, 20f, 11.088f, 19.215f, 12f, 18f)
            }
        }.build()

        return _Colors!!
    }

@Suppress("ObjectPropertyName")
private var _Colors: ImageVector? = null
