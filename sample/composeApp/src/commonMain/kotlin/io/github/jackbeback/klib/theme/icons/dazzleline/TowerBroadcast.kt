package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TowerBroadcast: ImageVector
    get() {
        if (_TowerBroadcast != null) {
            return _TowerBroadcast!!
        }
        _TowerBroadcast = ImageVector.Builder(
            name = "TowerBroadcast",
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
                moveTo(16.243f, 5.757f)
                curveTo(18.586f, 8.1f, 18.586f, 11.899f, 16.243f, 14.243f)
                moveTo(7.758f, 14.243f)
                curveTo(5.414f, 11.899f, 5.414f, 8.1f, 7.758f, 5.757f)
                moveTo(4.929f, 17.071f)
                curveTo(1.024f, 13.166f, 1.024f, 6.834f, 4.929f, 2.929f)
                moveTo(19.072f, 2.929f)
                curveTo(22.977f, 6.834f, 22.977f, 13.166f, 19.072f, 17.071f)
                moveTo(12f, 12f)
                curveTo(13.105f, 12f, 14f, 11.105f, 14f, 10f)
                curveTo(14f, 8.895f, 13.105f, 8f, 12f, 8f)
                curveTo(10.896f, 8f, 10f, 8.895f, 10f, 10f)
                curveTo(10f, 11.105f, 10.896f, 12f, 12f, 12f)
                close()
                moveTo(12f, 12f)
                verticalLineTo(21f)
            }
        }.build()

        return _TowerBroadcast!!
    }

@Suppress("ObjectPropertyName")
private var _TowerBroadcast: ImageVector? = null
