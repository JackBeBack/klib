package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Airplane: ImageVector
    get() {
        if (_Airplane != null) {
            return _Airplane!!
        }
        _Airplane = ImageVector.Builder(
            name = "Airplane",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.829f, 1.728f)
                curveTo(19.618f, 1.372f, 21.045f, 0.981f, 22.146f, 2.082f)
                curveTo(23.247f, 3.182f, 22.856f, 4.609f, 22.5f, 5.399f)
                curveTo(22.241f, 5.974f, 21.885f, 6.585f, 21.434f, 7.036f)
                lineTo(18.303f, 10.167f)
                lineTo(20.75f, 19.953f)
                curveTo(21.069f, 21.227f, 19.402f, 22.014f, 18.621f, 20.957f)
                lineTo(13.9f, 14.57f)
                lineTo(11.068f, 17.402f)
                lineTo(10.482f, 21.504f)
                curveTo(10.326f, 22.594f, 8.906f, 22.916f, 8.295f, 22f)
                lineTo(5.863f, 18.352f)
                lineTo(1.895f, 15.604f)
                curveTo(0.961f, 14.958f, 1.365f, 13.496f, 2.498f, 13.42f)
                lineTo(6.855f, 13.13f)
                lineTo(9.657f, 10.328f)
                lineTo(3.271f, 5.607f)
                curveTo(2.214f, 4.826f, 3f, 3.159f, 4.275f, 3.478f)
                lineTo(14.061f, 5.924f)
                lineTo(17.192f, 2.793f)
                curveTo(17.642f, 2.342f, 18.254f, 1.987f, 18.829f, 1.728f)
                close()
                moveTo(18.583f, 4.231f)
                lineTo(15.155f, 7.659f)
                curveTo(14.857f, 7.957f, 14.424f, 8.076f, 14.015f, 7.974f)
                lineTo(7.704f, 6.396f)
                lineTo(11.593f, 9.271f)
                curveTo(12.183f, 9.707f, 12.247f, 10.566f, 11.729f, 11.085f)
                lineTo(8.057f, 14.757f)
                curveTo(7.851f, 14.962f, 7.578f, 15.086f, 7.288f, 15.105f)
                lineTo(4.916f, 15.264f)
                lineTo(7.316f, 16.925f)
                lineTo(8.798f, 19.148f)
                lineTo(9.126f, 16.856f)
                curveTo(9.162f, 16.599f, 9.281f, 16.36f, 9.465f, 16.177f)
                lineTo(13.143f, 12.499f)
                curveTo(13.661f, 11.98f, 14.52f, 12.044f, 14.956f, 12.634f)
                lineTo(17.831f, 16.524f)
                lineTo(16.253f, 10.212f)
                curveTo(16.151f, 9.803f, 16.271f, 9.371f, 16.569f, 9.073f)
                lineTo(19.997f, 5.645f)
                curveTo(20.081f, 5.545f, 20.441f, 5.101f, 20.677f, 4.577f)
                curveTo(20.965f, 3.938f, 20.883f, 3.648f, 20.732f, 3.496f)
                curveTo(20.58f, 3.344f, 20.289f, 3.263f, 19.65f, 3.551f)
                curveTo(19.127f, 3.787f, 18.683f, 4.146f, 18.583f, 4.231f)
                close()
            }
        }.build()

        return _Airplane!!
    }

@Suppress("ObjectPropertyName")
private var _Airplane: ImageVector? = null
