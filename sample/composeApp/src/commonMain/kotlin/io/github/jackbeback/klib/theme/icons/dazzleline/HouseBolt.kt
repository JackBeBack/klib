package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseBolt: ImageVector
    get() {
        if (_HouseBolt != null) {
            return _HouseBolt!!
        }
        _HouseBolt = ImageVector.Builder(
            name = "HouseBolt",
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
                moveTo(11.5f, 11f)
                lineTo(10f, 14f)
                horizontalLineTo(14f)
                lineTo(12.5f, 17f)
                moveTo(19f, 9.778f)
                verticalLineTo(16.2f)
                curveTo(19f, 17.88f, 19f, 18.72f, 18.673f, 19.362f)
                curveTo(18.385f, 19.927f, 17.927f, 20.385f, 17.362f, 20.673f)
                curveTo(16.72f, 21f, 15.88f, 21f, 14.2f, 21f)
                horizontalLineTo(9.8f)
                curveTo(8.12f, 21f, 7.28f, 21f, 6.638f, 20.673f)
                curveTo(6.074f, 20.385f, 5.615f, 19.927f, 5.327f, 19.362f)
                curveTo(5f, 18.72f, 5f, 17.88f, 5f, 16.2f)
                verticalLineTo(9.777f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.651f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.652f)
                curveTo(10.284f, 3.905f, 9.667f, 4.592f, 8.431f, 5.965f)
                lineTo(3f, 12f)
            }
        }.build()

        return _HouseBolt!!
    }

@Suppress("ObjectPropertyName")
private var _HouseBolt: ImageVector? = null
