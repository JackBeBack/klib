package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignalStreamSlash: ImageVector
    get() {
        if (_SignalStreamSlash != null) {
            return _SignalStreamSlash!!
        }
        _SignalStreamSlash = ImageVector.Builder(
            name = "SignalStreamSlash",
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
                moveTo(16.243f, 7.757f)
                curveTo(17.67f, 9.184f, 18.228f, 11.151f, 17.917f, 13f)
                moveTo(7.757f, 16.243f)
                curveTo(5.414f, 13.899f, 5.414f, 10.101f, 7.757f, 7.757f)
                moveTo(4.929f, 19.071f)
                curveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f)
                moveTo(19.071f, 4.929f)
                curveTo(21.963f, 7.821f, 22.713f, 12.043f, 21.323f, 15.625f)
                moveTo(10.5f, 10.677f)
                curveTo(10.189f, 11.03f, 10f, 11.493f, 10f, 12f)
                curveTo(10f, 13.105f, 10.895f, 14f, 12f, 14f)
                curveTo(12.507f, 14f, 12.97f, 13.811f, 13.323f, 13.5f)
                moveTo(21f, 21f)
                lineTo(3f, 3f)
            }
        }.build()

        return _SignalStreamSlash!!
    }

@Suppress("ObjectPropertyName")
private var _SignalStreamSlash: ImageVector? = null
