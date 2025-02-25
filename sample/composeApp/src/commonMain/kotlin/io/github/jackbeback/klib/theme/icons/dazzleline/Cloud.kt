package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
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
                moveTo(3f, 13.649f)
                curveTo(3f, 16.604f, 5.418f, 19f, 8.4f, 19f)
                lineTo(16.5f, 19f)
                curveTo(18.985f, 19f, 21f, 16.984f, 21f, 14.497f)
                curveTo(21f, 12.65f, 19.889f, 10.945f, 18.3f, 10.25f)
                curveTo(18.132f, 7.323f, 15.684f, 5f, 12.689f, 5f)
                curveTo(10.351f, 5f, 8.347f, 6.486f, 7.5f, 8.5f)
                curveTo(4.8f, 8.938f, 3f, 11.2f, 3f, 13.649f)
                close()
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
