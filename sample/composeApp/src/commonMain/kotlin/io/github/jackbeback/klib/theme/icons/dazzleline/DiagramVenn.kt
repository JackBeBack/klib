package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramVenn: ImageVector
    get() {
        if (_DiagramVenn != null) {
            return _DiagramVenn!!
        }
        _DiagramVenn = ImageVector.Builder(
            name = "DiagramVenn",
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
                moveTo(8.29f, 10f)
                horizontalLineTo(15.71f)
                moveTo(8.29f, 10f)
                curveTo(8.101f, 10.634f, 8f, 11.305f, 8f, 12f)
                curveTo(8f, 12.695f, 8.101f, 13.366f, 8.29f, 14f)
                moveTo(8.29f, 10f)
                curveTo(8.859f, 8.087f, 10.224f, 6.517f, 12f, 5.674f)
                moveTo(8.29f, 14f)
                horizontalLineTo(15.71f)
                moveTo(8.29f, 14f)
                curveTo(8.859f, 15.913f, 10.224f, 17.483f, 12f, 18.326f)
                moveTo(12f, 5.674f)
                curveTo(11.091f, 5.242f, 10.074f, 5f, 9f, 5f)
                curveTo(5.134f, 5f, 2f, 8.134f, 2f, 12f)
                curveTo(2f, 15.866f, 5.134f, 19f, 9f, 19f)
                curveTo(10.074f, 19f, 11.091f, 18.758f, 12f, 18.326f)
                moveTo(12f, 5.674f)
                curveTo(12.909f, 5.242f, 13.926f, 5f, 15f, 5f)
                curveTo(18.866f, 5f, 22f, 8.134f, 22f, 12f)
                curveTo(22f, 15.866f, 18.866f, 19f, 15f, 19f)
                curveTo(13.926f, 19f, 12.909f, 18.758f, 12f, 18.326f)
                moveTo(12f, 5.674f)
                curveTo(14.365f, 6.797f, 16f, 9.208f, 16f, 12f)
                curveTo(16f, 14.792f, 14.365f, 17.203f, 12f, 18.326f)
            }
        }.build()

        return _DiagramVenn!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramVenn: ImageVector? = null
