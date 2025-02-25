package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TvAlt: ImageVector
    get() {
        if (_TvAlt != null) {
            return _TvAlt!!
        }
        _TvAlt = ImageVector.Builder(
            name = "TvAlt",
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
                moveTo(7f, 21f)
                lineTo(12f, 17f)
                lineTo(17f, 21f)
                moveTo(7.8f, 17f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 17f, 18.72f, 17f, 19.362f, 16.673f)
                curveTo(19.927f, 16.385f, 20.385f, 15.927f, 20.673f, 15.362f)
                curveTo(21f, 14.72f, 21f, 13.88f, 21f, 12.2f)
                verticalLineTo(7.8f)
                curveTo(21f, 6.12f, 21f, 5.28f, 20.673f, 4.638f)
                curveTo(20.385f, 4.074f, 19.927f, 3.615f, 19.362f, 3.327f)
                curveTo(18.72f, 3f, 17.88f, 3f, 16.2f, 3f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 3f, 5.28f, 3f, 4.638f, 3.327f)
                curveTo(4.074f, 3.615f, 3.615f, 4.074f, 3.327f, 4.638f)
                curveTo(3f, 5.28f, 3f, 6.12f, 3f, 7.8f)
                verticalLineTo(12.2f)
                curveTo(3f, 13.88f, 3f, 14.72f, 3.327f, 15.362f)
                curveTo(3.615f, 15.927f, 4.074f, 16.385f, 4.638f, 16.673f)
                curveTo(5.28f, 17f, 6.12f, 17f, 7.8f, 17f)
                close()
            }
        }.build()

        return _TvAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TvAlt: ImageVector? = null
