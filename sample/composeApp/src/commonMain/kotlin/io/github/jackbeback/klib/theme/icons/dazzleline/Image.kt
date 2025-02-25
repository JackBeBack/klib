package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Image",
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
                moveTo(13.413f, 15f)
                lineTo(10.542f, 10.934f)
                curveTo(10.085f, 10.286f, 9.856f, 9.962f, 9.575f, 9.853f)
                curveTo(9.329f, 9.757f, 9.056f, 9.763f, 8.814f, 9.868f)
                curveTo(8.538f, 9.989f, 8.322f, 10.321f, 7.892f, 10.987f)
                lineTo(4.257f, 16.604f)
                curveTo(4.162f, 16.751f, 4.114f, 16.825f, 4.08f, 16.904f)
                curveTo(4.05f, 16.975f, 4.029f, 17.048f, 4.016f, 17.124f)
                curveTo(4.001f, 17.209f, 4.001f, 17.297f, 4.001f, 17.472f)
                lineTo(4f, 20f)
                horizontalLineTo(20.001f)
                lineTo(20.001f, 17.46f)
                curveTo(20.001f, 17.289f, 20.001f, 17.204f, 19.987f, 17.12f)
                curveTo(19.974f, 17.047f, 19.953f, 16.975f, 19.925f, 16.906f)
                curveTo(19.893f, 16.828f, 19.847f, 16.755f, 19.756f, 16.61f)
                lineTo(18.79f, 15.07f)
                curveTo(17.936f, 13.71f, 17.509f, 13.029f, 16.955f, 12.781f)
                curveTo(16.469f, 12.564f, 15.918f, 12.549f, 15.422f, 12.74f)
                curveTo(14.855f, 12.957f, 14.392f, 13.613f, 13.465f, 14.926f)
                lineTo(13.413f, 15f)
                close()
                moveTo(13.413f, 15f)
                lineTo(16.955f, 20f)
                moveTo(20.001f, 6f)
                curveTo(20.001f, 7.105f, 19.105f, 8f, 18.001f, 8f)
                curveTo(16.896f, 8f, 16.001f, 7.105f, 16.001f, 6f)
                curveTo(16.001f, 4.895f, 16.896f, 4f, 18.001f, 4f)
                curveTo(19.105f, 4f, 20.001f, 4.895f, 20.001f, 6f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
