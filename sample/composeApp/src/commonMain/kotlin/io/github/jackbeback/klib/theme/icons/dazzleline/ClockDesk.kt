package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClockDesk: ImageVector
    get() {
        if (_ClockDesk != null) {
            return _ClockDesk!!
        }
        _ClockDesk = ImageVector.Builder(
            name = "ClockDesk",
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
                moveTo(19f, 10f)
                curveTo(19f, 13.866f, 15.866f, 17f, 12f, 17f)
                curveTo(8.134f, 17f, 5f, 13.866f, 5f, 10f)
                moveTo(19f, 10f)
                curveTo(19f, 6.134f, 15.866f, 3f, 12f, 3f)
                curveTo(8.134f, 3f, 5f, 6.134f, 5f, 10f)
                moveTo(19f, 10f)
                verticalLineTo(14.8f)
                verticalLineTo(16.2f)
                curveTo(19f, 17.88f, 19f, 18.72f, 18.673f, 19.362f)
                curveTo(18.385f, 19.926f, 17.927f, 20.385f, 17.362f, 20.673f)
                curveTo(16.72f, 21f, 15.88f, 21f, 14.2f, 21f)
                horizontalLineTo(9.8f)
                curveTo(8.12f, 21f, 7.28f, 21f, 6.638f, 20.673f)
                curveTo(6.074f, 20.385f, 5.615f, 19.926f, 5.327f, 19.362f)
                curveTo(5f, 18.72f, 5f, 17.88f, 5f, 16.2f)
                verticalLineTo(14.8f)
                verticalLineTo(10f)
                moveTo(12f, 7f)
                verticalLineTo(10f)
                lineTo(14f, 11.5f)
            }
        }.build()

        return _ClockDesk!!
    }

@Suppress("ObjectPropertyName")
private var _ClockDesk: ImageVector? = null
