package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.IndustryWindows: ImageVector
    get() {
        if (_IndustryWindows != null) {
            return _IndustryWindows!!
        }
        _IndustryWindows = ImageVector.Builder(
            name = "IndustryWindows",
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
                moveTo(7f, 16f)
                horizontalLineTo(8f)
                moveTo(11.5f, 16f)
                horizontalLineTo(12.5f)
                moveTo(16f, 16f)
                horizontalLineTo(17f)
                moveTo(18.4f, 20f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 20f, 4.76f, 20f, 4.546f, 19.891f)
                curveTo(4.358f, 19.795f, 4.205f, 19.642f, 4.109f, 19.454f)
                curveTo(4f, 19.24f, 4f, 18.96f, 4f, 18.4f)
                verticalLineTo(4.8f)
                curveTo(4f, 4.52f, 4f, 4.38f, 4.055f, 4.273f)
                curveTo(4.102f, 4.179f, 4.179f, 4.102f, 4.273f, 4.055f)
                curveTo(4.38f, 4f, 4.52f, 4f, 4.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(7.48f, 4f, 7.62f, 4f, 7.727f, 4.055f)
                curveTo(7.821f, 4.102f, 7.898f, 4.179f, 7.945f, 4.273f)
                curveTo(8f, 4.38f, 8f, 4.52f, 8f, 4.8f)
                verticalLineTo(9.069f)
                curveTo(8f, 9.674f, 8f, 9.977f, 8.12f, 10.118f)
                curveTo(8.224f, 10.239f, 8.38f, 10.304f, 8.539f, 10.291f)
                curveTo(8.723f, 10.277f, 8.937f, 10.063f, 9.366f, 9.634f)
                lineTo(12.634f, 6.366f)
                curveTo(13.063f, 5.937f, 13.277f, 5.723f, 13.461f, 5.709f)
                curveTo(13.62f, 5.696f, 13.776f, 5.761f, 13.88f, 5.882f)
                curveTo(14f, 6.023f, 14f, 6.326f, 14f, 6.931f)
                verticalLineTo(9.069f)
                curveTo(14f, 9.674f, 14f, 9.977f, 14.12f, 10.118f)
                curveTo(14.224f, 10.239f, 14.38f, 10.304f, 14.539f, 10.291f)
                curveTo(14.723f, 10.277f, 14.937f, 10.063f, 15.366f, 9.634f)
                lineTo(18.634f, 6.366f)
                curveTo(19.063f, 5.937f, 19.277f, 5.723f, 19.461f, 5.709f)
                curveTo(19.62f, 5.696f, 19.776f, 5.761f, 19.88f, 5.882f)
                curveTo(20f, 6.023f, 20f, 6.326f, 20f, 6.931f)
                verticalLineTo(18.4f)
                curveTo(20f, 18.96f, 20f, 19.24f, 19.891f, 19.454f)
                curveTo(19.795f, 19.642f, 19.642f, 19.795f, 19.454f, 19.891f)
                curveTo(19.24f, 20f, 18.96f, 20f, 18.4f, 20f)
                close()
            }
        }.build()

        return _IndustryWindows!!
    }

@Suppress("ObjectPropertyName")
private var _IndustryWindows: ImageVector? = null
