package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Write: ImageVector
    get() {
        if (_Write != null) {
            return _Write!!
        }
        _Write = ImageVector.Builder(
            name = "Write",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 22f)
                curveTo(1f, 21.448f, 1.448f, 21f, 2f, 21f)
                horizontalLineTo(22f)
                curveTo(22.552f, 21f, 23f, 21.448f, 23f, 22f)
                curveTo(23f, 22.552f, 22.552f, 23f, 22f, 23f)
                horizontalLineTo(2f)
                curveTo(1.448f, 23f, 1f, 22.552f, 1f, 22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.306f, 1.879f)
                curveTo(17.134f, 0.707f, 15.235f, 0.707f, 14.063f, 1.879f)
                lineTo(3.389f, 12.553f)
                curveTo(2.986f, 12.956f, 2.706f, 13.466f, 2.582f, 14.023f)
                lineTo(2.049f, 16.421f)
                curveTo(1.731f, 17.85f, 3.006f, 19.124f, 4.435f, 18.807f)
                lineTo(6.833f, 18.274f)
                curveTo(7.39f, 18.15f, 7.9f, 17.87f, 8.303f, 17.467f)
                lineTo(18.977f, 6.793f)
                curveTo(20.149f, 5.621f, 20.149f, 3.722f, 18.977f, 2.55f)
                lineTo(18.306f, 1.879f)
                close()
                moveTo(15.477f, 3.293f)
                curveTo(15.868f, 2.902f, 16.501f, 2.902f, 16.891f, 3.293f)
                lineTo(17.563f, 3.964f)
                curveTo(17.954f, 4.355f, 17.954f, 4.988f, 17.563f, 5.379f)
                lineTo(15.641f, 7.3f)
                lineTo(13.556f, 5.214f)
                lineTo(15.477f, 3.293f)
                close()
                moveTo(12.141f, 6.629f)
                lineTo(4.803f, 13.967f)
                curveTo(4.669f, 14.101f, 4.575f, 14.271f, 4.534f, 14.457f)
                lineTo(4.001f, 16.854f)
                lineTo(6.399f, 16.322f)
                curveTo(6.585f, 16.281f, 6.755f, 16.187f, 6.889f, 16.053f)
                lineTo(14.227f, 8.714f)
                lineTo(12.141f, 6.629f)
                close()
            }
        }.build()

        return _Write!!
    }

@Suppress("ObjectPropertyName")
private var _Write: ImageVector? = null
