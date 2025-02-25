package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Weight: ImageVector
    get() {
        if (_Weight != null) {
            return _Weight!!
        }
        _Weight = ImageVector.Builder(
            name = "Weight",
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
                moveTo(12f, 6f)
                lineTo(11.006f, 9f)
                moveTo(16.5f, 6f)
                curveTo(17.898f, 6f, 18.597f, 6f, 19.148f, 6.228f)
                curveTo(19.883f, 6.533f, 20.467f, 7.117f, 20.772f, 7.852f)
                curveTo(21f, 8.403f, 21f, 9.102f, 21f, 10.5f)
                verticalLineTo(16.2f)
                curveTo(21f, 17.88f, 21f, 18.72f, 20.673f, 19.362f)
                curveTo(20.385f, 19.927f, 19.927f, 20.385f, 19.362f, 20.673f)
                curveTo(18.72f, 21f, 17.88f, 21f, 16.2f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(10.5f)
                curveTo(3f, 9.102f, 3f, 8.403f, 3.228f, 7.852f)
                curveTo(3.533f, 7.117f, 4.117f, 6.533f, 4.852f, 6.228f)
                curveTo(5.403f, 6f, 6.102f, 6f, 7.5f, 6f)
                moveTo(10f, 17f)
                horizontalLineTo(14f)
                moveTo(10.542f, 3f)
                horizontalLineTo(13.459f)
                curveTo(14.54f, 3f, 15.08f, 3f, 15.48f, 3.185f)
                curveTo(16.014f, 3.433f, 16.411f, 3.902f, 16.567f, 4.469f)
                curveTo(16.684f, 4.894f, 16.596f, 5.427f, 16.418f, 6.493f)
                curveTo(16.286f, 7.284f, 16.22f, 7.679f, 16.045f, 7.988f)
                curveTo(15.811f, 8.399f, 15.439f, 8.715f, 14.994f, 8.878f)
                curveTo(14.661f, 9f, 14.26f, 9f, 13.459f, 9f)
                horizontalLineTo(10.542f)
                curveTo(9.74f, 9f, 9.339f, 9f, 9.006f, 8.878f)
                curveTo(8.561f, 8.715f, 8.189f, 8.399f, 7.955f, 7.988f)
                curveTo(7.78f, 7.679f, 7.714f, 7.284f, 7.582f, 6.493f)
                curveTo(7.405f, 5.427f, 7.316f, 4.894f, 7.433f, 4.469f)
                curveTo(7.589f, 3.902f, 7.987f, 3.433f, 8.52f, 3.185f)
                curveTo(8.92f, 3f, 9.461f, 3f, 10.542f, 3f)
                close()
            }
        }.build()

        return _Weight!!
    }

@Suppress("ObjectPropertyName")
private var _Weight: ImageVector? = null
