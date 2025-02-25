package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.StarHalfStroke: ImageVector
    get() {
        if (_StarHalfStroke != null) {
            return _StarHalfStroke!!
        }
        _StarHalfStroke = ImageVector.Builder(
            name = "StarHalfStroke",
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
                moveTo(12f, 3.194f)
                verticalLineTo(17.373f)
                moveTo(8.734f, 8.67f)
                lineTo(4.212f, 9.206f)
                curveTo(3.664f, 9.271f, 3.39f, 9.303f, 3.266f, 9.431f)
                curveTo(3.158f, 9.542f, 3.108f, 9.696f, 3.13f, 9.849f)
                curveTo(3.155f, 10.025f, 3.358f, 10.213f, 3.763f, 10.587f)
                lineTo(7.106f, 13.679f)
                curveTo(7.226f, 13.79f, 7.286f, 13.846f, 7.325f, 13.913f)
                curveTo(7.358f, 13.972f, 7.38f, 14.038f, 7.387f, 14.106f)
                curveTo(7.396f, 14.182f, 7.38f, 14.262f, 7.348f, 14.423f)
                lineTo(6.46f, 18.889f)
                curveTo(6.353f, 19.431f, 6.299f, 19.701f, 6.382f, 19.858f)
                curveTo(6.455f, 19.995f, 6.586f, 20.09f, 6.738f, 20.117f)
                curveTo(6.913f, 20.148f, 7.154f, 20.013f, 7.636f, 19.743f)
                lineTo(11.609f, 17.519f)
                curveTo(11.752f, 17.439f, 11.823f, 17.399f, 11.899f, 17.383f)
                curveTo(11.966f, 17.37f, 12.035f, 17.37f, 12.102f, 17.383f)
                curveTo(12.177f, 17.399f, 12.248f, 17.439f, 12.391f, 17.519f)
                lineTo(16.365f, 19.743f)
                curveTo(16.846f, 20.013f, 17.087f, 20.148f, 17.262f, 20.117f)
                curveTo(17.415f, 20.09f, 17.546f, 19.995f, 17.618f, 19.858f)
                curveTo(17.701f, 19.701f, 17.648f, 19.431f, 17.54f, 18.889f)
                lineTo(16.653f, 14.423f)
                curveTo(16.621f, 14.262f, 16.605f, 14.182f, 16.613f, 14.106f)
                curveTo(16.621f, 14.038f, 16.642f, 13.972f, 16.676f, 13.913f)
                curveTo(16.714f, 13.846f, 16.774f, 13.79f, 16.894f, 13.679f)
                lineTo(20.237f, 10.587f)
                curveTo(20.643f, 10.213f, 20.846f, 10.025f, 20.871f, 9.849f)
                curveTo(20.892f, 9.696f, 20.842f, 9.542f, 20.735f, 9.431f)
                curveTo(20.611f, 9.303f, 20.337f, 9.271f, 19.788f, 9.206f)
                lineTo(15.266f, 8.67f)
                curveTo(15.104f, 8.65f, 15.023f, 8.641f, 14.953f, 8.609f)
                curveTo(14.89f, 8.581f, 14.835f, 8.54f, 14.789f, 8.49f)
                curveTo(14.737f, 8.433f, 14.703f, 8.359f, 14.634f, 8.21f)
                lineTo(12.727f, 4.075f)
                curveTo(12.495f, 3.574f, 12.38f, 3.323f, 12.22f, 3.245f)
                curveTo(12.081f, 3.177f, 11.919f, 3.177f, 11.78f, 3.245f)
                curveTo(11.621f, 3.323f, 11.505f, 3.574f, 11.274f, 4.075f)
                lineTo(9.366f, 8.21f)
                curveTo(9.298f, 8.359f, 9.264f, 8.433f, 9.212f, 8.49f)
                curveTo(9.166f, 8.54f, 9.11f, 8.581f, 9.048f, 8.609f)
                curveTo(8.978f, 8.641f, 8.896f, 8.65f, 8.734f, 8.67f)
                close()
            }
        }.build()

        return _StarHalfStroke!!
    }

@Suppress("ObjectPropertyName")
private var _StarHalfStroke: ImageVector? = null
