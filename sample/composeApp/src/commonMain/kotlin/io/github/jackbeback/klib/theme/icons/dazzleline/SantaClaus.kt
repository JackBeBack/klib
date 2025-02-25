package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SantaClaus: ImageVector
    get() {
        if (_SantaClaus != null) {
            return _SantaClaus!!
        }
        _SantaClaus = ImageVector.Builder(
            name = "SantaClaus",
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
                moveTo(7.63f, 10f)
                curveTo(6.659f, 10.805f, 5.105f, 13.8f, 6.659f, 15.345f)
                curveTo(7.819f, 16.498f, 9.592f, 15.929f, 10.888f, 15.165f)
                curveTo(11.383f, 14.873f, 11.631f, 14.727f, 11.788f, 14.693f)
                curveTo(11.974f, 14.653f, 12.026f, 14.653f, 12.212f, 14.693f)
                curveTo(12.369f, 14.727f, 12.617f, 14.873f, 13.112f, 15.165f)
                curveTo(14.408f, 15.929f, 16.181f, 16.498f, 17.341f, 15.345f)
                curveTo(18.895f, 13.8f, 17.341f, 10.805f, 16.37f, 10f)
                moveTo(7.498f, 10f)
                curveTo(4.174f, 11.6f, 0.265f, 16.24f, 11.999f, 22f)
                moveTo(16.501f, 10f)
                curveTo(19.826f, 11.6f, 23.735f, 16.24f, 12.001f, 22f)
                moveTo(7f, 7f)
                curveTo(7f, 5f, 11f, -2f, 19f, 4f)
                curveTo(15f, 2.5f, 14.998f, 5f, 17f, 7f)
                moveTo(10f, 12.5f)
                horizontalLineTo(10.01f)
                moveTo(14f, 12.5f)
                horizontalLineTo(14.01f)
                moveTo(11f, 18f)
                curveTo(11.103f, 18.052f, 11.155f, 18.077f, 11.205f, 18.099f)
                curveTo(11.712f, 18.319f, 12.288f, 18.319f, 12.795f, 18.099f)
                curveTo(12.845f, 18.077f, 12.897f, 18.052f, 13f, 18f)
                moveTo(6.5f, 10f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 10f, 19f, 9.328f, 19f, 8.5f)
                curveTo(19f, 7.672f, 18.328f, 7f, 17.5f, 7f)
                horizontalLineTo(6.5f)
                curveTo(5.672f, 7f, 5f, 7.672f, 5f, 8.5f)
                curveTo(5f, 9.328f, 5.672f, 10f, 6.5f, 10f)
                close()
                moveTo(20f, 4f)
                curveTo(20f, 4.552f, 19.552f, 5f, 19f, 5f)
                curveTo(18.448f, 5f, 18f, 4.552f, 18f, 4f)
                curveTo(18f, 3.448f, 18.448f, 3f, 19f, 3f)
                curveTo(19.552f, 3f, 20f, 3.448f, 20f, 4f)
                close()
            }
        }.build()

        return _SantaClaus!!
    }

@Suppress("ObjectPropertyName")
private var _SantaClaus: ImageVector? = null
