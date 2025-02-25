package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Eclipse: ImageVector
    get() {
        if (_Eclipse != null) {
            return _Eclipse!!
        }
        _Eclipse = ImageVector.Builder(
            name = "Eclipse",
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
                moveTo(13.11f, 19.295f)
                lineTo(12.715f, 20.08f)
                curveTo(12.484f, 20.538f, 12.369f, 20.766f, 12.214f, 20.84f)
                curveTo(12.079f, 20.904f, 11.922f, 20.904f, 11.786f, 20.84f)
                curveTo(11.631f, 20.766f, 11.516f, 20.538f, 11.285f, 20.08f)
                lineTo(10.092f, 17.71f)
                curveTo(9.982f, 17.49f, 9.926f, 17.38f, 9.842f, 17.312f)
                curveTo(9.767f, 17.252f, 9.676f, 17.215f, 9.581f, 17.205f)
                curveTo(9.473f, 17.194f, 9.356f, 17.233f, 9.123f, 17.311f)
                lineTo(6.516f, 18.185f)
                curveTo(6.009f, 18.355f, 5.755f, 18.441f, 5.59f, 18.38f)
                curveTo(5.447f, 18.328f, 5.335f, 18.213f, 5.287f, 18.068f)
                curveTo(5.232f, 17.901f, 5.326f, 17.65f, 5.512f, 17.148f)
                lineTo(6.382f, 14.807f)
                curveTo(6.473f, 14.561f, 6.519f, 14.438f, 6.508f, 14.324f)
                curveTo(6.499f, 14.224f, 6.459f, 14.129f, 6.395f, 14.051f)
                curveTo(6.322f, 13.963f, 6.202f, 13.909f, 5.963f, 13.8f)
                lineTo(3.603f, 12.728f)
                curveTo(3.094f, 12.497f, 2.839f, 12.381f, 2.76f, 12.221f)
                curveTo(2.692f, 12.082f, 2.692f, 11.918f, 2.76f, 11.779f)
                curveTo(2.839f, 11.619f, 3.094f, 11.503f, 3.603f, 11.272f)
                lineTo(5.963f, 10.2f)
                curveTo(6.202f, 10.091f, 6.322f, 10.037f, 6.395f, 9.949f)
                curveTo(6.459f, 9.871f, 6.499f, 9.776f, 6.508f, 9.676f)
                curveTo(6.519f, 9.562f, 6.473f, 9.439f, 6.382f, 9.193f)
                lineTo(5.512f, 6.852f)
                curveTo(5.326f, 6.35f, 5.232f, 6.099f, 5.287f, 5.932f)
                curveTo(5.335f, 5.787f, 5.447f, 5.672f, 5.59f, 5.62f)
                curveTo(5.755f, 5.559f, 6.009f, 5.645f, 6.516f, 5.815f)
                lineTo(9.123f, 6.689f)
                curveTo(9.356f, 6.767f, 9.473f, 6.806f, 9.581f, 6.795f)
                curveTo(9.676f, 6.785f, 9.767f, 6.748f, 9.842f, 6.688f)
                curveTo(9.926f, 6.62f, 9.982f, 6.51f, 10.092f, 6.29f)
                lineTo(11.285f, 3.92f)
                curveTo(11.516f, 3.462f, 11.631f, 3.234f, 11.786f, 3.16f)
                curveTo(11.922f, 3.096f, 12.079f, 3.096f, 12.214f, 3.16f)
                curveTo(12.369f, 3.234f, 12.484f, 3.462f, 12.715f, 3.92f)
                lineTo(13.11f, 4.705f)
                moveTo(9.764f, 10f)
                curveTo(9.289f, 10.531f, 9f, 11.232f, 9f, 12f)
                curveTo(9f, 12.768f, 9.289f, 13.469f, 9.764f, 14f)
                moveTo(22f, 12f)
                curveTo(22f, 14.761f, 19.761f, 17f, 17f, 17f)
                curveTo(14.239f, 17f, 12f, 14.761f, 12f, 12f)
                curveTo(12f, 9.239f, 14.239f, 7f, 17f, 7f)
                curveTo(19.761f, 7f, 22f, 9.239f, 22f, 12f)
                close()
            }
        }.build()

        return _Eclipse!!
    }

@Suppress("ObjectPropertyName")
private var _Eclipse: ImageVector? = null
