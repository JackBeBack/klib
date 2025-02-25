package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PowerBank: ImageVector
    get() {
        if (_PowerBank != null) {
            return _PowerBank!!
        }
        _PowerBank = ImageVector.Builder(
            name = "PowerBank",
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
                moveTo(20f, 18f)
                verticalLineTo(7.8f)
                curveTo(20f, 6.12f, 20f, 5.28f, 19.673f, 4.638f)
                curveTo(19.385f, 4.074f, 18.927f, 3.615f, 18.362f, 3.327f)
                curveTo(17.72f, 3f, 16.88f, 3f, 15.2f, 3f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 3f, 6.28f, 3f, 5.638f, 3.327f)
                curveTo(5.074f, 3.615f, 4.615f, 4.074f, 4.327f, 4.638f)
                curveTo(4f, 5.28f, 4f, 6.12f, 4f, 7.8f)
                verticalLineTo(18f)
                moveTo(20f, 18f)
                curveTo(20f, 19.657f, 18.657f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(5.343f, 21f, 4f, 19.657f, 4f, 18f)
                moveTo(20f, 18f)
                curveTo(20f, 16.343f, 18.657f, 15f, 17f, 15f)
                horizontalLineTo(7f)
                curveTo(5.343f, 15f, 4f, 16.343f, 4f, 18f)
                moveTo(11.5f, 6.5f)
                lineTo(10.5f, 9f)
                horizontalLineTo(13.5f)
                lineTo(12.5f, 11.5f)
                moveTo(7f, 18f)
                horizontalLineTo(9f)
            }
        }.build()

        return _PowerBank!!
    }

@Suppress("ObjectPropertyName")
private var _PowerBank: ImageVector? = null
