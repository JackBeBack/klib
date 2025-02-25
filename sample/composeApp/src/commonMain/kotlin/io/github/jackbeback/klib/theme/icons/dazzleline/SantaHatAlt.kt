package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SantaHatAlt: ImageVector
    get() {
        if (_SantaHatAlt != null) {
            return _SantaHatAlt!!
        }
        _SantaHatAlt = ImageVector.Builder(
            name = "SantaHatAlt",
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
                moveTo(16.999f, 17f)
                lineTo(12.569f, 5.58f)
                curveTo(13.122f, 5.213f, 13.786f, 5f, 14.499f, 5f)
                curveTo(15.304f, 5f, 16.046f, 5.272f, 16.637f, 5.729f)
                curveTo(15.949f, 4.124f, 14.355f, 3f, 12.499f, 3f)
                curveTo(10.758f, 3f, 9.247f, 3.989f, 8.499f, 5.436f)
                lineTo(8.467f, 5.5f)
                lineTo(4f, 17f)
                moveTo(4.6f, 21f)
                horizontalLineTo(16.4f)
                curveTo(16.96f, 21f, 17.24f, 21f, 17.454f, 20.891f)
                curveTo(17.642f, 20.795f, 17.795f, 20.642f, 17.891f, 20.454f)
                curveTo(18f, 20.24f, 18f, 19.96f, 18f, 19.4f)
                verticalLineTo(18.6f)
                curveTo(18f, 18.04f, 18f, 17.76f, 17.891f, 17.546f)
                curveTo(17.795f, 17.358f, 17.642f, 17.205f, 17.454f, 17.109f)
                curveTo(17.24f, 17f, 16.96f, 17f, 16.4f, 17f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 17f, 3.76f, 17f, 3.546f, 17.109f)
                curveTo(3.358f, 17.205f, 3.205f, 17.358f, 3.109f, 17.546f)
                curveTo(3f, 17.76f, 3f, 18.04f, 3f, 18.6f)
                verticalLineTo(19.4f)
                curveTo(3f, 19.96f, 3f, 20.24f, 3.109f, 20.454f)
                curveTo(3.205f, 20.642f, 3.358f, 20.795f, 3.546f, 20.891f)
                curveTo(3.76f, 21f, 4.04f, 21f, 4.6f, 21f)
                close()
                moveTo(18.264f, 7.825f)
                curveTo(18.43f, 7.884f, 18.614f, 7.808f, 18.69f, 7.649f)
                curveTo(18.814f, 7.388f, 19.186f, 7.388f, 19.31f, 7.649f)
                curveTo(19.386f, 7.808f, 19.57f, 7.884f, 19.736f, 7.825f)
                curveTo(20.008f, 7.729f, 20.271f, 7.992f, 20.175f, 8.264f)
                curveTo(20.116f, 8.43f, 20.192f, 8.614f, 20.351f, 8.69f)
                curveTo(20.612f, 8.814f, 20.612f, 9.186f, 20.351f, 9.31f)
                curveTo(20.192f, 9.386f, 20.116f, 9.57f, 20.175f, 9.736f)
                curveTo(20.271f, 10.008f, 20.008f, 10.271f, 19.736f, 10.175f)
                curveTo(19.57f, 10.116f, 19.386f, 10.192f, 19.31f, 10.351f)
                curveTo(19.186f, 10.612f, 18.814f, 10.612f, 18.69f, 10.351f)
                curveTo(18.614f, 10.192f, 18.43f, 10.116f, 18.264f, 10.175f)
                curveTo(17.992f, 10.271f, 17.729f, 10.008f, 17.825f, 9.736f)
                curveTo(17.884f, 9.57f, 17.808f, 9.386f, 17.649f, 9.31f)
                curveTo(17.388f, 9.186f, 17.388f, 8.814f, 17.649f, 8.69f)
                curveTo(17.808f, 8.614f, 17.884f, 8.43f, 17.825f, 8.264f)
                curveTo(17.729f, 7.992f, 17.992f, 7.729f, 18.264f, 7.825f)
                close()
            }
        }.build()

        return _SantaHatAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SantaHatAlt: ImageVector? = null
