package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MedalAlt: ImageVector
    get() {
        if (_MedalAlt != null) {
            return _MedalAlt!!
        }
        _MedalAlt = ImageVector.Builder(
            name = "MedalAlt",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 11f)
                lineTo(8f, 3f)
                horizontalLineTo(4f)
                lineTo(8.506f, 12.462f)
                moveTo(12f, 11f)
                lineTo(16f, 3f)
                horizontalLineTo(20f)
                lineTo(15.494f, 12.462f)
                moveTo(12f, 11f)
                curveTo(13.344f, 11f, 14.585f, 11.564f, 15.494f, 12.462f)
                moveTo(12f, 11f)
                curveTo(10.656f, 11f, 9.415f, 11.564f, 8.506f, 12.462f)
                moveTo(15.494f, 12.462f)
                curveTo(16.418f, 13.375f, 17f, 14.634f, 17f, 16f)
                curveTo(17f, 18.761f, 14.761f, 21f, 12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                curveTo(7f, 14.634f, 7.582f, 13.375f, 8.506f, 12.462f)
            }
        }.build()

        return _MedalAlt!!
    }

@Suppress("ObjectPropertyName")
private var _MedalAlt: ImageVector? = null
