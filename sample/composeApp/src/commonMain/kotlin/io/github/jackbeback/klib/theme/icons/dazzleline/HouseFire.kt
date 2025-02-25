package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseFire: ImageVector
    get() {
        if (_HouseFire != null) {
            return _HouseFire!!
        }
        _HouseFire = ImageVector.Builder(
            name = "HouseFire",
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
                moveTo(11f, 21f)
                horizontalLineTo(9.8f)
                curveTo(8.12f, 21f, 7.28f, 21f, 6.638f, 20.673f)
                curveTo(6.074f, 20.385f, 5.615f, 19.927f, 5.327f, 19.362f)
                curveTo(5f, 18.72f, 5f, 17.88f, 5f, 16.2f)
                verticalLineTo(9.778f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.652f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.652f)
                curveTo(10.284f, 3.905f, 9.667f, 4.592f, 8.431f, 5.965f)
                lineTo(3f, 12f)
                moveTo(19.975f, 19.959f)
                curveTo(18.608f, 21.347f, 16.392f, 21.347f, 15.025f, 19.959f)
                curveTo(14.342f, 19.264f, 14f, 18.354f, 14f, 17.444f)
                curveTo(14f, 16.535f, 14.342f, 15.625f, 15.025f, 14.93f)
                curveTo(15.025f, 14.93f, 15.313f, 15.667f, 16.188f, 16.111f)
                curveTo(16.188f, 15.222f, 16.406f, 13.889f, 17.494f, 13f)
                curveTo(18.375f, 13.889f, 19.29f, 14.234f, 19.975f, 14.93f)
                curveTo(20.658f, 15.625f, 21f, 16.535f, 21f, 17.444f)
                curveTo(21f, 18.354f, 20.658f, 19.264f, 19.975f, 19.959f)
                close()
            }
        }.build()

        return _HouseFire!!
    }

@Suppress("ObjectPropertyName")
private var _HouseFire: ImageVector? = null
