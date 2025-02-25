package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LightEmergency: ImageVector
    get() {
        if (_LightEmergency != null) {
            return _LightEmergency!!
        }
        _LightEmergency = ImageVector.Builder(
            name = "LightEmergency",
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
                moveTo(10.063f, 8.5f)
                curveTo(10.022f, 8.34f, 10f, 8.173f, 10f, 8f)
                curveTo(10f, 6.895f, 10.895f, 6f, 12f, 6f)
                curveTo(12.141f, 6f, 12.279f, 6.015f, 12.412f, 6.043f)
                moveTo(5.6f, 21f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 21f, 19.24f, 21f, 19.454f, 20.891f)
                curveTo(19.642f, 20.795f, 19.795f, 20.642f, 19.891f, 20.454f)
                curveTo(20f, 20.24f, 20f, 19.96f, 20f, 19.4f)
                verticalLineTo(18.6f)
                curveTo(20f, 18.04f, 20f, 17.76f, 19.891f, 17.546f)
                curveTo(19.795f, 17.358f, 19.642f, 17.205f, 19.454f, 17.109f)
                curveTo(19.24f, 17f, 18.96f, 17f, 18.4f, 17f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 17f, 4.76f, 17f, 4.546f, 17.109f)
                curveTo(4.358f, 17.205f, 4.205f, 17.358f, 4.109f, 17.546f)
                curveTo(4f, 17.76f, 4f, 18.04f, 4f, 18.6f)
                verticalLineTo(19.4f)
                curveTo(4f, 19.96f, 4f, 20.24f, 4.109f, 20.454f)
                curveTo(4.205f, 20.642f, 4.358f, 20.795f, 4.546f, 20.891f)
                curveTo(4.76f, 21f, 5.04f, 21f, 5.6f, 21f)
                close()
                moveTo(17f, 14f)
                verticalLineTo(8f)
                curveTo(17f, 5.239f, 14.761f, 3f, 12f, 3f)
                curveTo(9.239f, 3f, 7f, 5.239f, 7f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _LightEmergency!!
    }

@Suppress("ObjectPropertyName")
private var _LightEmergency: ImageVector? = null
