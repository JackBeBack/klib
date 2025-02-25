package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Stopwatch: ImageVector
    get() {
        if (_Stopwatch != null) {
            return _Stopwatch!!
        }
        _Stopwatch = ImageVector.Builder(
            name = "Stopwatch",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 6f)
                curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
                curveTo(12.552f, 5f, 13f, 5.448f, 13f, 6f)
                verticalLineTo(10.268f)
                curveTo(13.598f, 10.613f, 14f, 11.26f, 14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                curveTo(10f, 11.26f, 10.402f, 10.613f, 11f, 10.268f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                curveTo(11.448f, 0f, 11f, 0.448f, 11f, 1f)
                verticalLineTo(1.045f)
                curveTo(8.957f, 1.229f, 7.075f, 1.972f, 5.507f, 3.12f)
                lineTo(4.679f, 2.291f)
                curveTo(4.288f, 1.9f, 3.654f, 1.901f, 3.264f, 2.291f)
                curveTo(2.873f, 2.682f, 2.873f, 3.315f, 3.263f, 3.706f)
                lineTo(4.004f, 4.446f)
                curveTo(2.142f, 6.417f, 1f, 9.075f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 9.075f, 21.858f, 6.417f, 19.996f, 4.446f)
                lineTo(20.737f, 3.706f)
                curveTo(21.127f, 3.315f, 21.127f, 2.682f, 20.736f, 2.291f)
                curveTo(20.346f, 1.901f, 19.712f, 1.9f, 19.321f, 2.291f)
                lineTo(18.493f, 3.12f)
                curveTo(16.926f, 1.972f, 15.043f, 1.229f, 13f, 1.045f)
                verticalLineTo(1f)
                curveTo(13f, 0.448f, 12.552f, 0f, 12f, 0f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Stopwatch!!
    }

@Suppress("ObjectPropertyName")
private var _Stopwatch: ImageVector? = null
