package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleDollarToSlot: ImageVector
    get() {
        if (_CircleDollarToSlot != null) {
            return _CircleDollarToSlot!!
        }
        _CircleDollarToSlot = ImageVector.Builder(
            name = "CircleDollarToSlot",
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
                moveTo(14f, 7.146f)
                curveTo(13.5f, 7.004f, 12.685f, 6.999f, 12f, 7.004f)
                curveTo(11.771f, 7.006f, 11.909f, 6.994f, 11.6f, 7.004f)
                curveTo(10.793f, 7.033f, 10.002f, 7.418f, 10f, 8.509f)
                curveTo(9.998f, 9.671f, 11f, 10.015f, 12f, 10.015f)
                curveTo(13f, 10.015f, 14f, 10.28f, 14f, 11.521f)
                curveTo(14f, 12.454f, 13.193f, 12.862f, 12.186f, 12.997f)
                curveTo(11.386f, 12.997f, 11f, 13.027f, 10f, 12.884f)
                moveTo(12f, 13f)
                verticalLineTo(14f)
                moveTo(12f, 6f)
                verticalLineTo(7f)
                moveTo(21f, 17f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(17f)
                moveTo(19f, 10f)
                curveTo(19f, 13.866f, 15.866f, 17f, 12f, 17f)
                curveTo(8.134f, 17f, 5f, 13.866f, 5f, 10f)
                curveTo(5f, 6.134f, 8.134f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.134f, 19f, 10f)
                close()
            }
        }.build()

        return _CircleDollarToSlot!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDollarToSlot: ImageVector? = null
