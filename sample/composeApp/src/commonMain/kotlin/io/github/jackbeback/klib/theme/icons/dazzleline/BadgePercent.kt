package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BadgePercent: ImageVector
    get() {
        if (_BadgePercent != null) {
            return _BadgePercent!!
        }
        _BadgePercent = ImageVector.Builder(
            name = "BadgePercent",
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
                moveTo(15.5f, 8.5f)
                lineTo(8.5f, 15.5f)
                moveTo(9.5f, 9.5f)
                horizontalLineTo(9.51f)
                moveTo(14.5f, 14.5f)
                horizontalLineTo(14.51f)
                moveTo(10f, 9.5f)
                curveTo(10f, 9.776f, 9.776f, 10f, 9.5f, 10f)
                curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
                curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
                curveTo(9.776f, 9f, 10f, 9.224f, 10f, 9.5f)
                close()
                moveTo(15f, 14.5f)
                curveTo(15f, 14.776f, 14.776f, 15f, 14.5f, 15f)
                curveTo(14.224f, 15f, 14f, 14.776f, 14f, 14.5f)
                curveTo(14f, 14.224f, 14.224f, 14f, 14.5f, 14f)
                curveTo(14.776f, 14f, 15f, 14.224f, 15f, 14.5f)
                close()
                moveTo(16.329f, 4.759f)
                curveTo(17.068f, 4.78f, 17.8f, 5.072f, 18.364f, 5.636f)
                curveTo(18.928f, 6.2f, 19.22f, 6.932f, 19.241f, 7.671f)
                curveTo(19.262f, 8.402f, 19.273f, 8.768f, 19.294f, 8.853f)
                curveTo(19.34f, 9.035f, 19.287f, 8.906f, 19.383f, 9.068f)
                curveTo(19.428f, 9.143f, 19.679f, 9.409f, 20.181f, 9.94f)
                curveTo(20.689f, 10.478f, 21f, 11.203f, 21f, 12f)
                curveTo(21f, 12.797f, 20.689f, 13.522f, 20.181f, 14.059f)
                curveTo(19.679f, 14.591f, 19.428f, 14.857f, 19.383f, 14.932f)
                curveTo(19.287f, 15.094f, 19.34f, 14.965f, 19.294f, 15.147f)
                curveTo(19.273f, 15.232f, 19.262f, 15.598f, 19.241f, 16.329f)
                curveTo(19.22f, 17.068f, 18.928f, 17.8f, 18.364f, 18.364f)
                curveTo(17.8f, 18.928f, 17.068f, 19.22f, 16.329f, 19.241f)
                curveTo(15.598f, 19.262f, 15.232f, 19.273f, 15.147f, 19.294f)
                curveTo(14.965f, 19.34f, 15.094f, 19.287f, 14.932f, 19.383f)
                curveTo(14.857f, 19.428f, 14.591f, 19.679f, 14.059f, 20.181f)
                curveTo(13.522f, 20.689f, 12.797f, 21f, 12f, 21f)
                curveTo(11.203f, 21f, 10.478f, 20.689f, 9.94f, 20.181f)
                curveTo(9.409f, 19.679f, 9.143f, 19.428f, 9.068f, 19.383f)
                curveTo(8.906f, 19.287f, 9.035f, 19.34f, 8.853f, 19.294f)
                curveTo(8.768f, 19.273f, 8.402f, 19.262f, 7.671f, 19.241f)
                curveTo(6.932f, 19.22f, 6.2f, 18.928f, 5.636f, 18.364f)
                curveTo(5.072f, 17.8f, 4.78f, 17.068f, 4.759f, 16.329f)
                curveTo(4.738f, 15.598f, 4.727f, 15.232f, 4.706f, 15.147f)
                curveTo(4.66f, 14.965f, 4.713f, 15.094f, 4.617f, 14.932f)
                curveTo(4.572f, 14.857f, 4.321f, 14.591f, 3.819f, 14.059f)
                curveTo(3.311f, 13.522f, 3f, 12.797f, 3f, 12f)
                curveTo(3f, 11.203f, 3.311f, 10.478f, 3.819f, 9.94f)
                curveTo(4.321f, 9.409f, 4.572f, 9.143f, 4.617f, 9.068f)
                curveTo(4.713f, 8.906f, 4.66f, 9.035f, 4.706f, 8.853f)
                curveTo(4.727f, 8.768f, 4.738f, 8.402f, 4.759f, 7.671f)
                curveTo(4.78f, 6.932f, 5.072f, 6.2f, 5.636f, 5.636f)
                curveTo(6.2f, 5.072f, 6.932f, 4.78f, 7.671f, 4.759f)
                curveTo(8.402f, 4.738f, 8.768f, 4.727f, 8.853f, 4.706f)
                curveTo(9.035f, 4.66f, 8.906f, 4.713f, 9.068f, 4.617f)
                curveTo(9.143f, 4.572f, 9.409f, 4.321f, 9.94f, 3.819f)
                curveTo(10.478f, 3.311f, 11.203f, 3f, 12f, 3f)
                curveTo(12.797f, 3f, 13.522f, 3.311f, 14.059f, 3.819f)
                curveTo(14.591f, 4.321f, 14.857f, 4.572f, 14.932f, 4.617f)
                curveTo(15.094f, 4.713f, 14.965f, 4.66f, 15.147f, 4.706f)
                curveTo(15.232f, 4.727f, 15.598f, 4.738f, 16.329f, 4.759f)
                close()
            }
        }.build()

        return _BadgePercent!!
    }

@Suppress("ObjectPropertyName")
private var _BadgePercent: ImageVector? = null
