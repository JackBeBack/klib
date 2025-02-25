package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneSlashAlt: ImageVector
    get() {
        if (_PhoneSlashAlt != null) {
            return _PhoneSlashAlt!!
        }
        _PhoneSlashAlt = ImageVector.Builder(
            name = "PhoneSlashAlt",
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
                moveTo(10.927f, 18.689f)
                curveTo(13.49f, 20.176f, 16.569f, 21f, 20f, 21f)
                lineTo(20.492f, 19.032f)
                curveTo(20.672f, 18.312f, 20.762f, 17.952f, 20.701f, 17.63f)
                curveTo(20.648f, 17.346f, 20.514f, 17.083f, 20.315f, 16.873f)
                curveTo(20.089f, 16.635f, 19.744f, 16.498f, 19.055f, 16.222f)
                lineTo(17.469f, 15.588f)
                curveTo(16.938f, 15.375f, 16.672f, 15.269f, 16.407f, 15.261f)
                curveTo(16.173f, 15.254f, 15.941f, 15.301f, 15.728f, 15.4f)
                curveTo(15.488f, 15.512f, 15.286f, 15.714f, 14.881f, 16.119f)
                lineTo(11.799f, 19.159f)
                moveTo(7.747f, 16.247f)
                curveTo(4.749f, 13.247f, 3f, 8.998f, 3f, 4f)
                lineTo(4.968f, 3.508f)
                curveTo(5.688f, 3.328f, 6.048f, 3.238f, 6.37f, 3.299f)
                curveTo(6.654f, 3.352f, 6.917f, 3.486f, 7.127f, 3.685f)
                curveTo(7.364f, 3.911f, 7.502f, 4.256f, 7.778f, 4.945f)
                lineTo(8.489f, 6.722f)
                curveTo(8.675f, 7.188f, 8.768f, 7.421f, 8.784f, 7.656f)
                curveTo(8.798f, 7.865f, 8.769f, 8.074f, 8.698f, 8.271f)
                curveTo(8.617f, 8.493f, 8.463f, 8.691f, 8.155f, 9.087f)
                lineTo(5.177f, 12.838f)
                moveTo(21f, 3f)
                lineTo(3f, 21f)
            }
        }.build()

        return _PhoneSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSlashAlt: ImageVector? = null
