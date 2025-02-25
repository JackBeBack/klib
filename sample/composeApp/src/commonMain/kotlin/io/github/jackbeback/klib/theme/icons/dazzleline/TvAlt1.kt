package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TvAlt1: ImageVector
    get() {
        if (_TvAlt1 != null) {
            return _TvAlt1!!
        }
        _TvAlt1 = ImageVector.Builder(
            name = "TvAlt1",
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
                moveTo(7f, 18f)
                verticalLineTo(21f)
                moveTo(17f, 18f)
                verticalLineTo(21f)
                moveTo(7.8f, 18f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 18f, 18.72f, 18f, 19.362f, 17.673f)
                curveTo(19.927f, 17.385f, 20.385f, 16.927f, 20.673f, 16.362f)
                curveTo(21f, 15.72f, 21f, 14.88f, 21f, 13.2f)
                verticalLineTo(7.8f)
                curveTo(21f, 6.12f, 21f, 5.28f, 20.673f, 4.638f)
                curveTo(20.385f, 4.074f, 19.927f, 3.615f, 19.362f, 3.327f)
                curveTo(18.72f, 3f, 17.88f, 3f, 16.2f, 3f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 3f, 5.28f, 3f, 4.638f, 3.327f)
                curveTo(4.074f, 3.615f, 3.615f, 4.074f, 3.327f, 4.638f)
                curveTo(3f, 5.28f, 3f, 6.12f, 3f, 7.8f)
                verticalLineTo(13.2f)
                curveTo(3f, 14.88f, 3f, 15.72f, 3.327f, 16.362f)
                curveTo(3.615f, 16.927f, 4.074f, 17.385f, 4.638f, 17.673f)
                curveTo(5.28f, 18f, 6.12f, 18f, 7.8f, 18f)
                close()
            }
        }.build()

        return _TvAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _TvAlt1: ImageVector? = null
