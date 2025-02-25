package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tent: ImageVector
    get() {
        if (_Tent != null) {
            return _Tent!!
        }
        _Tent = ImageVector.Builder(
            name = "Tent",
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
                moveTo(12f, 4f)
                lineTo(5.294f, 10.259f)
                curveTo(5f, 10.534f, 4.852f, 10.671f, 4.737f, 10.831f)
                curveTo(4.635f, 10.973f, 4.552f, 11.128f, 4.49f, 11.291f)
                curveTo(4.421f, 11.476f, 4.388f, 11.674f, 4.321f, 12.072f)
                lineTo(3.31f, 18.137f)
                curveTo(3.204f, 18.778f, 3.15f, 19.098f, 3.243f, 19.348f)
                curveTo(3.324f, 19.567f, 3.48f, 19.751f, 3.683f, 19.867f)
                curveTo(3.914f, 20f, 4.239f, 20f, 4.889f, 20f)
                horizontalLineTo(12f)
                moveTo(12f, 4f)
                lineTo(18.706f, 10.259f)
                curveTo(19f, 10.534f, 19.147f, 10.671f, 19.263f, 10.831f)
                curveTo(19.365f, 10.973f, 19.448f, 11.128f, 19.51f, 11.291f)
                curveTo(19.579f, 11.476f, 19.612f, 11.674f, 19.679f, 12.072f)
                lineTo(20.69f, 18.137f)
                curveTo(20.796f, 18.778f, 20.85f, 19.098f, 20.757f, 19.348f)
                curveTo(20.676f, 19.567f, 20.52f, 19.751f, 20.317f, 19.867f)
                curveTo(20.086f, 20f, 19.761f, 20f, 19.111f, 20f)
                horizontalLineTo(17f)
                moveTo(12f, 4f)
                verticalLineTo(12f)
                moveTo(17f, 20f)
                horizontalLineTo(12f)
                moveTo(17f, 20f)
                lineTo(12f, 12f)
                moveTo(12f, 20f)
                verticalLineTo(12f)
            }
        }.build()

        return _Tent!!
    }

@Suppress("ObjectPropertyName")
private var _Tent: ImageVector? = null
