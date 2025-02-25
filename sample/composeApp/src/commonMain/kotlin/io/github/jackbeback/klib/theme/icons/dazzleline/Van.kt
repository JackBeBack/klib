package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Van: ImageVector
    get() {
        if (_Van != null) {
            return _Van!!
        }
        _Van = ImageVector.Builder(
            name = "Van",
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
                moveTo(2f, 12f)
                horizontalLineTo(21.928f)
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                moveTo(8f, 17f)
                curveTo(8f, 18.105f, 7.105f, 19f, 6f, 19f)
                curveTo(4.895f, 19f, 4f, 18.105f, 4f, 17f)
                moveTo(8f, 17f)
                curveTo(8f, 15.895f, 7.105f, 15f, 6f, 15f)
                curveTo(4.895f, 15f, 4f, 15.895f, 4f, 17f)
                moveTo(16f, 17f)
                curveTo(16f, 18.105f, 16.895f, 19f, 18f, 19f)
                curveTo(19.105f, 19f, 20f, 18.105f, 20f, 17f)
                moveTo(16f, 17f)
                curveTo(16f, 15.895f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
                moveTo(14f, 5f)
                verticalLineTo(12f)
                moveTo(8f, 5f)
                verticalLineTo(12f)
                moveTo(4f, 17f)
                curveTo(2.895f, 17f, 2f, 16.105f, 2f, 15f)
                verticalLineTo(8.2f)
                curveTo(2f, 7.08f, 2f, 6.52f, 2.218f, 6.092f)
                curveTo(2.41f, 5.716f, 2.716f, 5.41f, 3.092f, 5.218f)
                curveTo(3.52f, 5f, 4.08f, 5f, 5.2f, 5f)
                horizontalLineTo(16.143f)
                curveTo(16.819f, 5f, 17.157f, 5f, 17.46f, 5.099f)
                curveTo(17.728f, 5.186f, 17.974f, 5.329f, 18.182f, 5.518f)
                curveTo(18.418f, 5.732f, 18.586f, 6.025f, 18.921f, 6.612f)
                lineTo(21.578f, 11.262f)
                curveTo(21.735f, 11.537f, 21.814f, 11.674f, 21.869f, 11.82f)
                curveTo(21.919f, 11.95f, 21.954f, 12.084f, 21.976f, 12.221f)
                curveTo(22f, 12.375f, 22f, 12.533f, 22f, 12.85f)
                verticalLineTo(15f)
                curveTo(22f, 16.105f, 21.105f, 17f, 20f, 17f)
            }
        }.build()

        return _Van!!
    }

@Suppress("ObjectPropertyName")
private var _Van: ImageVector? = null
