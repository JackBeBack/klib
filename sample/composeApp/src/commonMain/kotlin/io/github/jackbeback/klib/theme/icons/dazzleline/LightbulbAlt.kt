package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LightbulbAlt: ImageVector
    get() {
        if (_LightbulbAlt != null) {
            return _LightbulbAlt!!
        }
        _LightbulbAlt = ImageVector.Builder(
            name = "LightbulbAlt",
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
                moveTo(10f, 16.584f)
                verticalLineTo(19f)
                curveTo(10f, 20.104f, 10.895f, 21f, 12f, 21f)
                curveTo(13.105f, 21f, 14f, 20.104f, 14f, 19f)
                lineTo(14f, 16.584f)
                moveTo(12f, 3f)
                verticalLineTo(4f)
                moveTo(18.364f, 5.636f)
                lineTo(17.657f, 6.343f)
                moveTo(5.636f, 5.636f)
                lineTo(6.343f, 6.343f)
                moveTo(4f, 12f)
                horizontalLineTo(3f)
                moveTo(21f, 12f)
                horizontalLineTo(20f)
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                close()
            }
        }.build()

        return _LightbulbAlt!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbAlt: ImageVector? = null
