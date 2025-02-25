package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AudioDescription: ImageVector
    get() {
        if (_AudioDescription != null) {
            return _AudioDescription!!
        }
        _AudioDescription = ImageVector.Builder(
            name = "AudioDescription",
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
                moveTo(6.417f, 14f)
                lineTo(8.5f, 9f)
                lineTo(10.583f, 14f)
                moveTo(6.417f, 14f)
                lineTo(6f, 15f)
                moveTo(6.417f, 14f)
                horizontalLineTo(10.583f)
                moveTo(10.583f, 14f)
                lineTo(11f, 15f)
                moveTo(13.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.776f, 13.724f, 15f, 14f, 15f)
                horizontalLineTo(15f)
                curveTo(16.657f, 15f, 18f, 13.657f, 18f, 12f)
                curveTo(18f, 10.343f, 16.657f, 9f, 15f, 9f)
                horizontalLineTo(14f)
                curveTo(13.724f, 9f, 13.5f, 9.224f, 13.5f, 9.5f)
                close()
                moveTo(5f, 19f)
                horizontalLineTo(19f)
                curveTo(20.105f, 19f, 21f, 18.105f, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 5.895f, 20.105f, 5f, 19f, 5f)
                horizontalLineTo(5f)
                curveTo(3.895f, 5f, 3f, 5.895f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 18.105f, 3.895f, 19f, 5f, 19f)
                close()
            }
        }.build()

        return _AudioDescription!!
    }

@Suppress("ObjectPropertyName")
private var _AudioDescription: ImageVector? = null
