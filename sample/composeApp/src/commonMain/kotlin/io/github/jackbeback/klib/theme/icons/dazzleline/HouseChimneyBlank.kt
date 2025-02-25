package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseChimneyBlank: ImageVector
    get() {
        if (_HouseChimneyBlank != null) {
            return _HouseChimneyBlank!!
        }
        _HouseChimneyBlank = ImageVector.Builder(
            name = "HouseChimneyBlank",
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
                moveTo(5f, 9.777f)
                verticalLineTo(16.2f)
                curveTo(5f, 17.88f, 5f, 18.72f, 5.327f, 19.362f)
                curveTo(5.615f, 19.927f, 6.074f, 20.385f, 6.638f, 20.673f)
                curveTo(7.28f, 21f, 8.12f, 21f, 9.8f, 21f)
                horizontalLineTo(14.2f)
                curveTo(15.88f, 21f, 16.72f, 21f, 17.362f, 20.673f)
                curveTo(17.927f, 20.385f, 18.385f, 19.927f, 18.673f, 19.362f)
                curveTo(19f, 18.72f, 19f, 17.88f, 19f, 16.2f)
                verticalLineTo(5f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.651f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.652f)
                curveTo(10.284f, 3.905f, 9.667f, 4.592f, 8.431f, 5.965f)
                lineTo(3f, 12f)
            }
        }.build()

        return _HouseChimneyBlank!!
    }

@Suppress("ObjectPropertyName")
private var _HouseChimneyBlank: ImageVector? = null
