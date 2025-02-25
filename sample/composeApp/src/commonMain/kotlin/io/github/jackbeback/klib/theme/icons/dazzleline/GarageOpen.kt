package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GarageOpen: ImageVector
    get() {
        if (_GarageOpen != null) {
            return _GarageOpen!!
        }
        _GarageOpen = ImageVector.Builder(
            name = "GarageOpen",
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
                moveTo(7f, 20f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 20f, 3.76f, 20f, 3.546f, 19.891f)
                curveTo(3.358f, 19.795f, 3.205f, 19.642f, 3.109f, 19.454f)
                curveTo(3f, 19.24f, 3f, 18.96f, 3f, 18.4f)
                verticalLineTo(9.04f)
                curveTo(3f, 8.663f, 3f, 8.475f, 3.059f, 8.311f)
                curveTo(3.112f, 8.166f, 3.197f, 8.035f, 3.308f, 7.928f)
                curveTo(3.434f, 7.807f, 3.606f, 7.731f, 3.95f, 7.578f)
                lineTo(12f, 4f)
                lineTo(20.05f, 7.578f)
                curveTo(20.394f, 7.731f, 20.566f, 7.807f, 20.692f, 7.928f)
                curveTo(20.803f, 8.035f, 20.889f, 8.166f, 20.941f, 8.311f)
                curveTo(21f, 8.475f, 21f, 8.663f, 21f, 9.04f)
                verticalLineTo(18.4f)
                curveTo(21f, 18.96f, 21f, 19.24f, 20.891f, 19.454f)
                curveTo(20.795f, 19.642f, 20.642f, 19.795f, 20.454f, 19.891f)
                curveTo(20.24f, 20f, 19.96f, 20f, 19.4f, 20f)
                horizontalLineTo(17f)
                moveTo(7f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                moveTo(7f, 20f)
                horizontalLineTo(17f)
            }
        }.build()

        return _GarageOpen!!
    }

@Suppress("ObjectPropertyName")
private var _GarageOpen: ImageVector? = null
