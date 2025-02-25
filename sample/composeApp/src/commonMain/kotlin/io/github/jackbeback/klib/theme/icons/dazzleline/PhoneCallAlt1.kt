package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneCallAlt1: ImageVector
    get() {
        if (_PhoneCallAlt1 != null) {
            return _PhoneCallAlt1!!
        }
        _PhoneCallAlt1 = ImageVector.Builder(
            name = "PhoneCallAlt1",
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
                moveTo(5.136f, 12.764f)
                lineTo(8.155f, 9.087f)
                curveTo(8.463f, 8.691f, 8.617f, 8.493f, 8.697f, 8.271f)
                curveTo(8.769f, 8.074f, 8.798f, 7.865f, 8.784f, 7.656f)
                curveTo(8.768f, 7.421f, 8.675f, 7.188f, 8.488f, 6.722f)
                lineTo(7.778f, 4.945f)
                curveTo(7.502f, 4.256f, 7.364f, 3.911f, 7.126f, 3.685f)
                curveTo(6.917f, 3.486f, 6.654f, 3.352f, 6.37f, 3.299f)
                curveTo(6.048f, 3.238f, 5.688f, 3.328f, 4.967f, 3.508f)
                lineTo(3f, 4f)
                curveTo(3f, 14f, 10f, 21f, 20f, 21f)
                lineTo(20.492f, 19.032f)
                curveTo(20.672f, 18.312f, 20.762f, 17.952f, 20.701f, 17.63f)
                curveTo(20.648f, 17.346f, 20.514f, 17.083f, 20.315f, 16.873f)
                curveTo(20.089f, 16.635f, 19.744f, 16.498f, 19.055f, 16.222f)
                lineTo(17.469f, 15.588f)
                curveTo(16.938f, 15.375f, 16.672f, 15.269f, 16.407f, 15.261f)
                curveTo(16.173f, 15.254f, 15.94f, 15.301f, 15.728f, 15.4f)
                curveTo(15.488f, 15.512f, 15.285f, 15.714f, 14.881f, 16.119f)
                lineTo(11.827f, 19.173f)
                moveTo(13f, 7f)
                curveTo(13.976f, 7.191f, 14.874f, 7.668f, 15.578f, 8.372f)
                curveTo(16.281f, 9.076f, 16.759f, 9.973f, 16.95f, 10.95f)
                moveTo(13f, 3f)
                curveTo(15.029f, 3.225f, 16.921f, 4.134f, 18.366f, 5.577f)
                curveTo(19.811f, 7.02f, 20.722f, 8.911f, 20.95f, 10.94f)
            }
        }.build()

        return _PhoneCallAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneCallAlt1: ImageVector? = null
