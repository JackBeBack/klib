package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignalSteam: ImageVector
    get() {
        if (_SignalSteam != null) {
            return _SignalSteam!!
        }
        _SignalSteam = ImageVector.Builder(
            name = "SignalSteam",
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
                curveTo(18.586f, 10.101f, 18.586f, 13.899f, 16.243f, 16.243f)
                moveTo(7.757f, 16.243f)
                curveTo(5.414f, 13.899f, 5.414f, 10.101f, 7.757f, 7.757f)
                moveTo(4.929f, 19.071f)
                curveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f)
                moveTo(19.071f, 4.929f)
                curveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f)
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 10.896f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.896f, 14f, 12f)
                close()
            }
        }.build()

        return _SignalSteam!!
    }

@Suppress("ObjectPropertyName")
private var _SignalSteam: ImageVector? = null
