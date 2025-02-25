package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Unlock: ImageVector
    get() {
        if (_Unlock != null) {
            return _Unlock!!
        }
        _Unlock = ImageVector.Builder(
            name = "Unlock",
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
                moveTo(16.584f, 6f)
                curveTo(15.812f, 4.234f, 14.05f, 3f, 12f, 3f)
                curveTo(9.239f, 3f, 7f, 5.239f, 7f, 8f)
                verticalLineTo(10.029f)
                moveTo(7f, 10.029f)
                curveTo(7.471f, 10f, 8.053f, 10f, 8.8f, 10f)
                horizontalLineTo(15.2f)
                curveTo(16.88f, 10f, 17.72f, 10f, 18.362f, 10.327f)
                curveTo(18.927f, 10.615f, 19.385f, 11.073f, 19.673f, 11.638f)
                curveTo(20f, 12.28f, 20f, 13.12f, 20f, 14.8f)
                verticalLineTo(16.2f)
                curveTo(20f, 17.88f, 20f, 18.72f, 19.673f, 19.362f)
                curveTo(19.385f, 19.927f, 18.927f, 20.385f, 18.362f, 20.673f)
                curveTo(17.72f, 21f, 16.88f, 21f, 15.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(14.8f)
                curveTo(4f, 13.12f, 4f, 12.28f, 4.327f, 11.638f)
                curveTo(4.615f, 11.073f, 5.074f, 10.615f, 5.638f, 10.327f)
                curveTo(5.994f, 10.146f, 6.412f, 10.065f, 7f, 10.029f)
                close()
            }
        }.build()

        return _Unlock!!
    }

@Suppress("ObjectPropertyName")
private var _Unlock: ImageVector? = null
