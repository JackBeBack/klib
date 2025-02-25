package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WarehouseFull: ImageVector
    get() {
        if (_WarehouseFull != null) {
            return _WarehouseFull!!
        }
        _WarehouseFull = ImageVector.Builder(
            name = "WarehouseFull",
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
                moveTo(7f, 21f)
                verticalLineTo(11.6f)
                curveTo(7f, 11.04f, 7f, 10.76f, 7.109f, 10.546f)
                curveTo(7.205f, 10.358f, 7.358f, 10.205f, 7.546f, 10.109f)
                curveTo(7.76f, 10f, 8.04f, 10f, 8.6f, 10f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 10f, 16.24f, 10f, 16.454f, 10.109f)
                curveTo(16.642f, 10.205f, 16.795f, 10.358f, 16.891f, 10.546f)
                curveTo(17f, 10.76f, 17f, 11.04f, 17f, 11.6f)
                verticalLineTo(21f)
                moveTo(10f, 14f)
                horizontalLineTo(14f)
                moveTo(10f, 18f)
                horizontalLineTo(14f)
                moveTo(3f, 10.488f)
                verticalLineTo(19.4f)
                curveTo(3f, 19.96f, 3f, 20.24f, 3.109f, 20.454f)
                curveTo(3.205f, 20.642f, 3.358f, 20.795f, 3.546f, 20.891f)
                curveTo(3.76f, 21f, 4.04f, 21f, 4.6f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(10.488f)
                curveTo(21f, 9.414f, 21f, 8.877f, 20.837f, 8.403f)
                curveTo(20.692f, 7.984f, 20.457f, 7.601f, 20.147f, 7.284f)
                curveTo(19.797f, 6.925f, 19.317f, 6.684f, 18.358f, 6.201f)
                lineTo(14.158f, 4.086f)
                curveTo(13.367f, 3.688f, 12.972f, 3.489f, 12.556f, 3.411f)
                curveTo(12.189f, 3.341f, 11.811f, 3.341f, 11.444f, 3.411f)
                curveTo(11.028f, 3.489f, 10.633f, 3.688f, 9.842f, 4.086f)
                lineTo(5.642f, 6.201f)
                curveTo(4.683f, 6.684f, 4.203f, 6.925f, 3.853f, 7.284f)
                curveTo(3.543f, 7.601f, 3.307f, 7.984f, 3.163f, 8.403f)
                curveTo(3f, 8.877f, 3f, 9.414f, 3f, 10.488f)
                close()
            }
        }.build()

        return _WarehouseFull!!
    }

@Suppress("ObjectPropertyName")
private var _WarehouseFull: ImageVector? = null
