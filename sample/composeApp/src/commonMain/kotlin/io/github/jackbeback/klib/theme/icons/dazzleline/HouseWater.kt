package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseWater: ImageVector
    get() {
        if (_HouseWater != null) {
            return _HouseWater!!
        }
        _HouseWater = ImageVector.Builder(
            name = "HouseWater",
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
                moveTo(19f, 9.778f)
                verticalLineTo(15f)
                moveTo(5f, 15f)
                verticalLineTo(9.777f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.651f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.651f)
                curveTo(10.284f, 3.905f, 9.667f, 4.591f, 8.431f, 5.964f)
                lineTo(3f, 12f)
                moveTo(3f, 20.005f)
                curveTo(3f, 20.005f, 3.694f, 18.886f, 4.8f, 19.01f)
                curveTo(6.061f, 19.151f, 7.133f, 21f, 8.4f, 21f)
                curveTo(9.667f, 21f, 10.733f, 19.01f, 12f, 19.01f)
                curveTo(13.267f, 19.01f, 14.333f, 21f, 15.6f, 21f)
                curveTo(16.867f, 21f, 17.939f, 19.151f, 19.2f, 19.01f)
                curveTo(20.306f, 18.886f, 21f, 20.005f, 21f, 20.005f)
                moveTo(10f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _HouseWater!!
    }

@Suppress("ObjectPropertyName")
private var _HouseWater: ImageVector? = null
