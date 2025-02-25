package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Camcorder: ImageVector
    get() {
        if (_Camcorder != null) {
            return _Camcorder!!
        }
        _Camcorder = ImageVector.Builder(
            name = "Camcorder",
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
                moveTo(14f, 4f)
                horizontalLineTo(8f)
                curveTo(7.068f, 4f, 6.602f, 4f, 6.235f, 4.152f)
                curveTo(5.745f, 4.355f, 5.355f, 4.745f, 5.152f, 5.235f)
                curveTo(5f, 5.602f, 5f, 6.568f, 5f, 7.5f)
                verticalLineTo(8.001f)
                moveTo(6f, 11f)
                horizontalLineTo(13f)
                moveTo(5f, 8.001f)
                curveTo(5.122f, 8f, 5.255f, 8f, 5.4f, 8f)
                horizontalLineTo(13.6f)
                curveTo(14.44f, 8f, 14.86f, 8f, 15.181f, 8.163f)
                curveTo(15.463f, 8.307f, 15.693f, 8.537f, 15.837f, 8.819f)
                curveTo(16f, 9.14f, 16f, 9.56f, 16f, 10.4f)
                verticalLineTo(16.8f)
                curveTo(16f, 17.92f, 16f, 18.48f, 15.782f, 18.908f)
                curveTo(15.59f, 19.284f, 15.284f, 19.59f, 14.908f, 19.782f)
                curveTo(14.48f, 20f, 13.92f, 20f, 12.8f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                verticalLineTo(10.4f)
                curveTo(3f, 9.56f, 3f, 9.14f, 3.163f, 8.819f)
                curveTo(3.307f, 8.537f, 3.537f, 8.307f, 3.819f, 8.163f)
                curveTo(4.084f, 8.028f, 4.418f, 8.005f, 5f, 8.001f)
                close()
                moveTo(16f, 12f)
                lineTo(19.788f, 9.727f)
                curveTo(20.185f, 9.489f, 20.383f, 9.37f, 20.546f, 9.385f)
                curveTo(20.689f, 9.399f, 20.819f, 9.472f, 20.903f, 9.587f)
                curveTo(21f, 9.719f, 21f, 9.95f, 21f, 10.413f)
                verticalLineTo(17.587f)
                curveTo(21f, 18.049f, 21f, 18.281f, 20.903f, 18.413f)
                curveTo(20.819f, 18.528f, 20.689f, 18.601f, 20.546f, 18.615f)
                curveTo(20.383f, 18.63f, 20.185f, 18.511f, 19.788f, 18.273f)
                lineTo(16f, 16f)
            }
        }.build()

        return _Camcorder!!
    }

@Suppress("ObjectPropertyName")
private var _Camcorder: ImageVector? = null
