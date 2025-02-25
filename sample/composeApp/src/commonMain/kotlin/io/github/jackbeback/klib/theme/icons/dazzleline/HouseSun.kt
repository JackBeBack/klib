package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseSun: ImageVector
    get() {
        if (_HouseSun != null) {
            return _HouseSun!!
        }
        _HouseSun = ImageVector.Builder(
            name = "HouseSun",
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
                moveTo(8f, 3f)
                verticalLineTo(3.417f)
                moveTo(3.417f, 8f)
                horizontalLineTo(3f)
                moveTo(4.667f, 4.667f)
                lineTo(4.25f, 4.25f)
                moveTo(11.333f, 4.667f)
                lineTo(11.75f, 4.25f)
                moveTo(4.667f, 11.333f)
                lineTo(4.25f, 11.75f)
                moveTo(9.732f, 7f)
                curveTo(9.387f, 6.402f, 8.74f, 6f, 8f, 6f)
                curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
                curveTo(6f, 8.74f, 6.402f, 9.387f, 7f, 9.732f)
                moveTo(6f, 15f)
                lineTo(12.408f, 9.019f)
                curveTo(12.793f, 8.66f, 12.985f, 8.48f, 13.204f, 8.413f)
                curveTo(13.397f, 8.353f, 13.603f, 8.353f, 13.796f, 8.413f)
                curveTo(14.015f, 8.48f, 14.207f, 8.66f, 14.592f, 9.019f)
                lineTo(21f, 15f)
                moveTo(8f, 13.133f)
                verticalLineTo(19.4f)
                curveTo(8f, 19.96f, 8f, 20.24f, 8.109f, 20.454f)
                curveTo(8.205f, 20.642f, 8.358f, 20.795f, 8.546f, 20.891f)
                curveTo(8.76f, 21f, 9.04f, 21f, 9.6f, 21f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 21f, 18.24f, 21f, 18.454f, 20.891f)
                curveTo(18.642f, 20.795f, 18.795f, 20.642f, 18.891f, 20.454f)
                curveTo(19f, 20.24f, 19f, 19.96f, 19f, 19.4f)
                verticalLineTo(13.133f)
            }
        }.build()

        return _HouseSun!!
    }

@Suppress("ObjectPropertyName")
private var _HouseSun: ImageVector? = null
