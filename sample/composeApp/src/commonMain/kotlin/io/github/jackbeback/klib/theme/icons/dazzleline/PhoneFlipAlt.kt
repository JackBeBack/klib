package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneFlipAlt: ImageVector
    get() {
        if (_PhoneFlipAlt != null) {
            return _PhoneFlipAlt!!
        }
        _PhoneFlipAlt = ImageVector.Builder(
            name = "PhoneFlipAlt",
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
                moveTo(18.604f, 12.727f)
                lineTo(15.565f, 9.087f)
                curveTo(15.257f, 8.691f, 15.103f, 8.493f, 15.023f, 8.271f)
                curveTo(14.951f, 8.074f, 14.922f, 7.865f, 14.936f, 7.656f)
                curveTo(14.952f, 7.421f, 15.045f, 7.188f, 15.231f, 6.722f)
                lineTo(15.942f, 4.945f)
                curveTo(16.218f, 4.256f, 16.356f, 3.911f, 16.593f, 3.685f)
                curveTo(16.803f, 3.486f, 17.066f, 3.352f, 17.35f, 3.299f)
                curveTo(17.672f, 3.238f, 18.032f, 3.328f, 18.752f, 3.508f)
                lineTo(20.72f, 4f)
                curveTo(20.72f, 14f, 13.72f, 21f, 3.72f, 21f)
                lineTo(3.228f, 19.032f)
                curveTo(3.048f, 18.312f, 2.958f, 17.952f, 3.019f, 17.63f)
                curveTo(3.072f, 17.346f, 3.206f, 17.083f, 3.405f, 16.873f)
                curveTo(3.631f, 16.636f, 3.976f, 16.498f, 4.665f, 16.222f)
                lineTo(6.251f, 15.588f)
                curveTo(6.782f, 15.375f, 7.048f, 15.269f, 7.313f, 15.261f)
                curveTo(7.547f, 15.254f, 7.779f, 15.301f, 7.992f, 15.4f)
                curveTo(8.232f, 15.512f, 8.434f, 15.714f, 8.839f, 16.119f)
                lineTo(11.925f, 19.157f)
            }
        }.build()

        return _PhoneFlipAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneFlipAlt: ImageVector? = null
