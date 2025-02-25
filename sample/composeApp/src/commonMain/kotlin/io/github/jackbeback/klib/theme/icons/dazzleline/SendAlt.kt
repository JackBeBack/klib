package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SendAlt: ImageVector
    get() {
        if (_SendAlt != null) {
            return _SendAlt!!
        }
        _SendAlt = ImageVector.Builder(
            name = "SendAlt",
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
                moveTo(12f, 18.582f)
                verticalLineTo(12.5f)
                moveTo(12.798f, 18.754f)
                lineTo(15.81f, 19.763f)
                curveTo(17.451f, 20.312f, 18.271f, 20.586f, 18.777f, 20.389f)
                curveTo(19.217f, 20.218f, 19.55f, 19.851f, 19.677f, 19.396f)
                curveTo(19.824f, 18.874f, 19.47f, 18.084f, 18.762f, 16.505f)
                lineTo(14.22f, 6.367f)
                curveTo(13.528f, 4.823f, 13.182f, 4.051f, 12.7f, 3.812f)
                curveTo(12.281f, 3.604f, 11.79f, 3.603f, 11.37f, 3.81f)
                curveTo(10.888f, 4.047f, 10.539f, 4.818f, 9.843f, 6.36f)
                lineTo(5.256f, 16.508f)
                curveTo(4.543f, 18.086f, 4.187f, 18.875f, 4.332f, 19.398f)
                curveTo(4.458f, 19.853f, 4.79f, 20.222f, 5.229f, 20.394f)
                curveTo(5.734f, 20.593f, 6.556f, 20.32f, 8.199f, 19.774f)
                lineTo(11.28f, 18.752f)
                curveTo(11.561f, 18.659f, 11.702f, 18.612f, 11.846f, 18.593f)
                curveTo(11.974f, 18.577f, 12.104f, 18.577f, 12.231f, 18.594f)
                curveTo(12.375f, 18.613f, 12.516f, 18.66f, 12.798f, 18.754f)
                close()
            }
        }.build()

        return _SendAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SendAlt: ImageVector? = null
