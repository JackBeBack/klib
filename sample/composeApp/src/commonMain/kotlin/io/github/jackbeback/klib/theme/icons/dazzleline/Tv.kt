package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tv: ImageVector
    get() {
        if (_Tv != null) {
            return _Tv!!
        }
        _Tv = ImageVector.Builder(
            name = "Tv",
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
                moveTo(15f, 7f)
                verticalLineTo(21f)
                moveTo(18f, 11f)
                horizontalLineTo(18.01f)
                moveTo(18f, 14f)
                horizontalLineTo(18.01f)
                moveTo(18f, 17f)
                horizontalLineTo(18.01f)
                moveTo(17f, 3f)
                lineTo(12f, 7f)
                lineTo(7f, 3f)
                moveTo(7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 10.12f, 21f, 9.28f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.72f, 7f, 17.88f, 7f, 16.2f, 7f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 7f, 5.28f, 7f, 4.638f, 7.327f)
                curveTo(4.074f, 7.615f, 3.615f, 8.074f, 3.327f, 8.638f)
                curveTo(3f, 9.28f, 3f, 10.12f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                close()
            }
        }.build()

        return _Tv!!
    }

@Suppress("ObjectPropertyName")
private var _Tv: ImageVector? = null
