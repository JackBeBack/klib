package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Industry: ImageVector
    get() {
        if (_Industry != null) {
            return _Industry!!
        }
        _Industry = ImageVector.Builder(
            name = "Industry",
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
                moveTo(5.6f, 20f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 20f, 19.24f, 20f, 19.454f, 19.891f)
                curveTo(19.642f, 19.795f, 19.795f, 19.642f, 19.891f, 19.454f)
                curveTo(20f, 19.24f, 20f, 18.96f, 20f, 18.4f)
                verticalLineTo(6.931f)
                curveTo(20f, 6.326f, 20f, 6.023f, 19.88f, 5.882f)
                curveTo(19.776f, 5.761f, 19.62f, 5.696f, 19.461f, 5.709f)
                curveTo(19.277f, 5.723f, 19.063f, 5.937f, 18.634f, 6.366f)
                lineTo(15.366f, 9.634f)
                curveTo(14.937f, 10.063f, 14.723f, 10.277f, 14.539f, 10.291f)
                curveTo(14.38f, 10.304f, 14.224f, 10.239f, 14.12f, 10.118f)
                curveTo(14f, 9.977f, 14f, 9.674f, 14f, 9.069f)
                verticalLineTo(6.931f)
                curveTo(14f, 6.326f, 14f, 6.023f, 13.88f, 5.882f)
                curveTo(13.776f, 5.761f, 13.62f, 5.696f, 13.461f, 5.709f)
                curveTo(13.277f, 5.723f, 13.063f, 5.937f, 12.634f, 6.366f)
                lineTo(9.366f, 9.634f)
                curveTo(8.937f, 10.063f, 8.723f, 10.277f, 8.539f, 10.291f)
                curveTo(8.38f, 10.304f, 8.224f, 10.239f, 8.12f, 10.118f)
                curveTo(8f, 9.977f, 8f, 9.674f, 8f, 9.069f)
                verticalLineTo(4.8f)
                curveTo(8f, 4.52f, 8f, 4.38f, 7.945f, 4.273f)
                curveTo(7.898f, 4.179f, 7.821f, 4.102f, 7.727f, 4.055f)
                curveTo(7.62f, 4f, 7.48f, 4f, 7.2f, 4f)
                horizontalLineTo(4.8f)
                curveTo(4.52f, 4f, 4.38f, 4f, 4.273f, 4.055f)
                curveTo(4.179f, 4.102f, 4.102f, 4.179f, 4.055f, 4.273f)
                curveTo(4f, 4.38f, 4f, 4.52f, 4f, 4.8f)
                verticalLineTo(18.4f)
                curveTo(4f, 18.96f, 4f, 19.24f, 4.109f, 19.454f)
                curveTo(4.205f, 19.642f, 4.358f, 19.795f, 4.546f, 19.891f)
                curveTo(4.76f, 20f, 5.04f, 20f, 5.6f, 20f)
                close()
            }
        }.build()

        return _Industry!!
    }

@Suppress("ObjectPropertyName")
private var _Industry: ImageVector? = null
