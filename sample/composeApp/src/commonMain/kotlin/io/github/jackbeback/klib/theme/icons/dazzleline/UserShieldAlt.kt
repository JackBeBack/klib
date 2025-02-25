package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserShieldAlt: ImageVector
    get() {
        if (_UserShieldAlt != null) {
            return _UserShieldAlt!!
        }
        _UserShieldAlt = ImageVector.Builder(
            name = "UserShieldAlt",
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
                moveTo(11f, 21f)
                horizontalLineTo(5.6f)
                curveTo(5.04f, 21f, 4.76f, 21f, 4.546f, 20.891f)
                curveTo(4.358f, 20.795f, 4.205f, 20.642f, 4.109f, 20.454f)
                curveTo(4f, 20.24f, 4f, 19.96f, 4f, 19.4f)
                verticalLineTo(17.684f)
                curveTo(4f, 17.049f, 4f, 16.731f, 4.048f, 16.466f)
                curveTo(4.271f, 15.234f, 5.234f, 14.271f, 6.466f, 14.048f)
                curveTo(6.543f, 14.034f, 6.624f, 14.024f, 6.716f, 14.017f)
                curveTo(6.941f, 14f, 7.053f, 13.991f, 7.204f, 14.003f)
                curveTo(7.36f, 14.014f, 7.447f, 14.03f, 7.598f, 14.072f)
                curveTo(7.743f, 14.113f, 8.004f, 14.231f, 8.527f, 14.468f)
                curveTo(8.99f, 14.678f, 9.484f, 14.83f, 10f, 14.917f)
                moveTo(19.873f, 15.204f)
                curveTo(19.804f, 15.208f, 19.736f, 15.21f, 19.667f, 15.21f)
                curveTo(18.642f, 15.21f, 17.708f, 14.752f, 17f, 14f)
                curveTo(16.292f, 14.752f, 15.358f, 15.21f, 14.333f, 15.21f)
                curveTo(14.264f, 15.21f, 14.196f, 15.208f, 14.127f, 15.204f)
                curveTo(14.044f, 15.585f, 14f, 15.986f, 14f, 16.398f)
                curveTo(14f, 18.612f, 15.275f, 20.472f, 17f, 21f)
                curveTo(18.725f, 20.472f, 20f, 18.612f, 20f, 16.398f)
                curveTo(20f, 15.986f, 19.956f, 15.585f, 19.873f, 15.204f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 9.209f, 13.209f, 11f, 11f, 11f)
                curveTo(8.791f, 11f, 7f, 9.209f, 7f, 7f)
                curveTo(7f, 4.791f, 8.791f, 3f, 11f, 3f)
                curveTo(13.209f, 3f, 15f, 4.791f, 15f, 7f)
                close()
            }
        }.build()

        return _UserShieldAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserShieldAlt: ImageVector? = null
