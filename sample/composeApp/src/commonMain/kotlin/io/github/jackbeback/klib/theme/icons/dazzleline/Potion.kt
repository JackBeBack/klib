package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Potion: ImageVector
    get() {
        if (_Potion != null) {
            return _Potion!!
        }
        _Potion = ImageVector.Builder(
            name = "Potion",
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
                moveTo(10f, 7.304f)
                verticalLineTo(3f)
                moveTo(14f, 7.304f)
                verticalLineTo(3f)
                moveTo(16f, 10f)
                lineTo(16.007f, 10.007f)
                moveTo(8f, 3f)
                horizontalLineTo(16f)
                moveTo(8f, 13.5f)
                lineTo(8.627f, 13.124f)
                curveTo(8.743f, 13.054f, 8.801f, 13.019f, 8.857f, 12.988f)
                curveTo(9.9f, 12.407f, 11.149f, 12.322f, 12.261f, 12.757f)
                curveTo(12.321f, 12.78f, 12.383f, 12.807f, 12.507f, 12.86f)
                curveTo(12.601f, 12.9f, 12.648f, 12.92f, 12.693f, 12.939f)
                curveTo(13.54f, 13.277f, 14.477f, 13.316f, 15.349f, 13.049f)
                curveTo(15.396f, 13.035f, 15.444f, 13.019f, 15.541f, 12.986f)
                lineTo(17f, 12.5f)
                lineTo(12f, 17.2f)
                lineTo(8f, 13.5f)
                close()
                moveTo(12f, 8.726f)
                curveTo(10.401f, 6.888f, 7.728f, 6.319f, 5.724f, 8.003f)
                curveTo(3.72f, 9.686f, 3.438f, 12.501f, 5.011f, 14.492f)
                curveTo(6.32f, 16.148f, 10.28f, 19.639f, 11.578f, 20.769f)
                curveTo(11.723f, 20.896f, 11.795f, 20.959f, 11.88f, 20.984f)
                curveTo(11.954f, 21.005f, 12.035f, 21.005f, 12.109f, 20.984f)
                curveTo(12.194f, 20.959f, 12.266f, 20.896f, 12.411f, 20.769f)
                curveTo(13.709f, 19.639f, 17.669f, 16.148f, 18.978f, 14.492f)
                curveTo(20.552f, 12.501f, 20.304f, 9.669f, 18.265f, 8.003f)
                curveTo(16.227f, 6.337f, 13.599f, 6.888f, 12f, 8.726f)
                close()
            }
        }.build()

        return _Potion!!
    }

@Suppress("ObjectPropertyName")
private var _Potion: ImageVector? = null
