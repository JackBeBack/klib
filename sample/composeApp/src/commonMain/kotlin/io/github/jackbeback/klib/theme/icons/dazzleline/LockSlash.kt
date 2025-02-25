package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LockSlash: ImageVector
    get() {
        if (_LockSlash != null) {
            return _LockSlash!!
        }
        _LockSlash = ImageVector.Builder(
            name = "LockSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(17f, 10f)
                verticalLineTo(8f)
                curveTo(17f, 5.239f, 14.761f, 3f, 12f, 3f)
                curveTo(11.028f, 3f, 10.121f, 3.277f, 9.354f, 3.757f)
                moveTo(7.084f, 7.083f)
                curveTo(7.029f, 7.381f, 7f, 7.687f, 7f, 8f)
                verticalLineTo(10.029f)
                moveTo(19.561f, 19.562f)
                curveTo(19.273f, 20.035f, 18.858f, 20.42f, 18.362f, 20.673f)
                curveTo(17.72f, 21f, 16.88f, 21f, 15.2f, 21f)
                horizontalLineTo(8.8f)
                curveTo(7.12f, 21f, 6.28f, 21f, 5.638f, 20.673f)
                curveTo(5.074f, 20.385f, 4.615f, 19.927f, 4.327f, 19.362f)
                curveTo(4f, 18.72f, 4f, 17.88f, 4f, 16.2f)
                verticalLineTo(14.8f)
                curveTo(4f, 13.12f, 4f, 12.28f, 4.327f, 11.638f)
                curveTo(4.615f, 11.073f, 5.074f, 10.615f, 5.638f, 10.327f)
                curveTo(5.994f, 10.146f, 6.412f, 10.065f, 7f, 10.029f)
                moveTo(20f, 14.402f)
                curveTo(19.998f, 12.983f, 19.973f, 12.227f, 19.673f, 11.638f)
                curveTo(19.385f, 11.073f, 18.927f, 10.615f, 18.362f, 10.327f)
                curveTo(17.773f, 10.027f, 17.017f, 10.002f, 15.598f, 10f)
                moveTo(10f, 10f)
                horizontalLineTo(8.8f)
                curveTo(8.053f, 10f, 7.471f, 10f, 7f, 10.029f)
            }
        }.build()

        return _LockSlash!!
    }

@Suppress("ObjectPropertyName")
private var _LockSlash: ImageVector? = null
