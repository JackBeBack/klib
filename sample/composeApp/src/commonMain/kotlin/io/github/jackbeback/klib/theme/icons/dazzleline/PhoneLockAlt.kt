package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneLockAlt: ImageVector
    get() {
        if (_PhoneLockAlt != null) {
            return _PhoneLockAlt!!
        }
        _PhoneLockAlt = ImageVector.Builder(
            name = "PhoneLockAlt",
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
                moveTo(5.141f, 12.772f)
                curveTo(3.761f, 10.27f, 3f, 7.298f, 3f, 4f)
                lineTo(4.967f, 3.508f)
                curveTo(5.688f, 3.328f, 6.048f, 3.238f, 6.37f, 3.299f)
                curveTo(6.654f, 3.352f, 6.917f, 3.486f, 7.126f, 3.685f)
                curveTo(7.364f, 3.911f, 7.502f, 4.256f, 7.778f, 4.945f)
                lineTo(8.488f, 6.722f)
                curveTo(8.675f, 7.188f, 8.768f, 7.421f, 8.784f, 7.656f)
                curveTo(8.798f, 7.865f, 8.769f, 8.074f, 8.697f, 8.271f)
                curveTo(8.617f, 8.493f, 8.463f, 8.691f, 8.155f, 9.087f)
                lineTo(5.141f, 12.772f)
                close()
                moveTo(5.141f, 12.772f)
                curveTo(7.943f, 17.856f, 13.298f, 21f, 20f, 21f)
                lineTo(20.492f, 19.032f)
                curveTo(20.672f, 18.312f, 20.762f, 17.952f, 20.701f, 17.63f)
                curveTo(20.648f, 17.346f, 20.514f, 17.083f, 20.315f, 16.873f)
                curveTo(20.089f, 16.635f, 19.744f, 16.498f, 19.055f, 16.222f)
                lineTo(17.469f, 15.588f)
                curveTo(16.938f, 15.375f, 16.672f, 15.269f, 16.407f, 15.261f)
                curveTo(16.173f, 15.254f, 15.94f, 15.301f, 15.728f, 15.4f)
                curveTo(15.488f, 15.512f, 15.285f, 15.714f, 14.881f, 16.119f)
                lineTo(11.791f, 19.155f)
                moveTo(16f, 6f)
                verticalLineTo(5f)
                curveTo(16f, 3.895f, 16.895f, 3f, 18f, 3f)
                curveTo(19.104f, 3f, 20f, 3.895f, 20f, 5f)
                verticalLineTo(6f)
                moveTo(16.5f, 9f)
                horizontalLineTo(19.5f)
                curveTo(19.966f, 9f, 20.199f, 9f, 20.382f, 8.924f)
                curveTo(20.627f, 8.822f, 20.822f, 8.628f, 20.924f, 8.383f)
                curveTo(21f, 8.199f, 21f, 7.966f, 21f, 7.5f)
                curveTo(21f, 7.034f, 21f, 6.801f, 20.924f, 6.617f)
                curveTo(20.822f, 6.372f, 20.627f, 6.178f, 20.382f, 6.076f)
                curveTo(20.199f, 6f, 19.966f, 6f, 19.5f, 6f)
                horizontalLineTo(16.5f)
                curveTo(16.034f, 6f, 15.801f, 6f, 15.617f, 6.076f)
                curveTo(15.372f, 6.178f, 15.177f, 6.372f, 15.076f, 6.617f)
                curveTo(15f, 6.801f, 15f, 7.034f, 15f, 7.5f)
                curveTo(15f, 7.966f, 15f, 8.199f, 15.076f, 8.383f)
                curveTo(15.177f, 8.628f, 15.372f, 8.822f, 15.617f, 8.924f)
                curveTo(15.801f, 9f, 16.034f, 9f, 16.5f, 9f)
                close()
            }
        }.build()

        return _PhoneLockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneLockAlt: ImageVector? = null
