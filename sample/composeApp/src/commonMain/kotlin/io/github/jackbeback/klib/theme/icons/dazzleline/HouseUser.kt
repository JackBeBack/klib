package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseUser: ImageVector
    get() {
        if (_HouseUser != null) {
            return _HouseUser!!
        }
        _HouseUser = ImageVector.Builder(
            name = "HouseUser",
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
                verticalLineTo(16.2f)
                curveTo(19f, 17.88f, 19f, 18.72f, 18.673f, 19.362f)
                curveTo(18.385f, 19.926f, 17.927f, 20.385f, 17.362f, 20.673f)
                curveTo(17.211f, 20.75f, 17.049f, 20.809f, 16.868f, 20.854f)
                moveTo(5f, 9.777f)
                verticalLineTo(16.2f)
                curveTo(5f, 17.88f, 5f, 18.72f, 5.327f, 19.362f)
                curveTo(5.615f, 19.926f, 6.074f, 20.385f, 6.638f, 20.673f)
                curveTo(6.789f, 20.75f, 6.951f, 20.809f, 7.132f, 20.854f)
                moveTo(21f, 12f)
                lineTo(15.567f, 5.964f)
                curveTo(14.331f, 4.591f, 13.713f, 3.905f, 12.986f, 3.651f)
                curveTo(12.347f, 3.429f, 11.651f, 3.429f, 11.012f, 3.652f)
                curveTo(10.284f, 3.905f, 9.667f, 4.592f, 8.431f, 5.964f)
                lineTo(3f, 12f)
                moveTo(7.132f, 20.854f)
                curveTo(7.65f, 18.645f, 9.633f, 17f, 12f, 17f)
                curveTo(14.367f, 17f, 16.35f, 18.645f, 16.868f, 20.854f)
                moveTo(7.132f, 20.854f)
                curveTo(7.721f, 21f, 8.515f, 21f, 9.8f, 21f)
                horizontalLineTo(14.2f)
                curveTo(15.485f, 21f, 16.279f, 21f, 16.868f, 20.854f)
                moveTo(14f, 12f)
                curveTo(14f, 13.104f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.104f, 10f, 12f)
                curveTo(10f, 10.895f, 10.895f, 10f, 12f, 10f)
                curveTo(13.105f, 10f, 14f, 10.895f, 14f, 12f)
                close()
            }
        }.build()

        return _HouseUser!!
    }

@Suppress("ObjectPropertyName")
private var _HouseUser: ImageVector? = null
