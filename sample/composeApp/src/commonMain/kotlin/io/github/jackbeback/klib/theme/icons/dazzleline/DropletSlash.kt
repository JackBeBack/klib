package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DropletSlash: ImageVector
    get() {
        if (_DropletSlash != null) {
            return _DropletSlash!!
        }
        _DropletSlash = ImageVector.Builder(
            name = "DropletSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(7.712f, 7.755f)
                curveTo(6.726f, 8.979f, 5.862f, 10.203f, 5.509f, 11.1f)
                curveTo(5.181f, 11.934f, 5f, 12.845f, 5f, 13.8f)
                curveTo(5f, 17.776f, 8.134f, 21f, 12f, 21f)
                curveTo(14.413f, 21f, 16.542f, 19.744f, 17.8f, 17.832f)
                moveTo(10.38f, 4.694f)
                curveTo(11.313f, 3.688f, 12f, 3f, 12f, 3f)
                curveTo(12f, 3f, 17.453f, 8.461f, 18.491f, 11.1f)
                curveTo(18.758f, 11.779f, 18.928f, 12.509f, 18.982f, 13.273f)
            }
        }.build()

        return _DropletSlash!!
    }

@Suppress("ObjectPropertyName")
private var _DropletSlash: ImageVector? = null
