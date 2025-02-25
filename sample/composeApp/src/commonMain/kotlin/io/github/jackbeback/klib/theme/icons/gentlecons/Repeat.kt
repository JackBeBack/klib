package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Repeat: ImageVector
    get() {
        if (_Repeat != null) {
            return _Repeat!!
        }
        _Repeat = ImageVector.Builder(
            name = "Repeat",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 4f)
                curveTo(3.343f, 4f, 2f, 5.343f, 2f, 7f)
                lineTo(2f, 17f)
                curveTo(2f, 18.657f, 3.343f, 20f, 5f, 20f)
                horizontalLineTo(8f)
                curveTo(8.552f, 20f, 9f, 19.552f, 9f, 19f)
                curveTo(9f, 18.448f, 8.552f, 18f, 8f, 18f)
                horizontalLineTo(5f)
                curveTo(4.448f, 18f, 4f, 17.552f, 4f, 17f)
                verticalLineTo(7f)
                curveTo(4f, 6.448f, 4.448f, 6f, 5f, 6f)
                lineTo(19f, 6f)
                curveTo(19.552f, 6f, 20f, 6.448f, 20f, 7f)
                lineTo(20f, 17f)
                curveTo(20f, 17.552f, 19.552f, 18f, 19f, 18f)
                horizontalLineTo(14.003f)
                lineTo(15.282f, 16.716f)
                curveTo(15.673f, 16.323f, 15.673f, 15.687f, 15.282f, 15.294f)
                curveTo(14.891f, 14.902f, 14.257f, 14.902f, 13.865f, 15.294f)
                lineTo(11.594f, 17.574f)
                lineTo(11.58f, 17.587f)
                curveTo(10.804f, 18.372f, 10.806f, 19.641f, 11.586f, 20.423f)
                lineTo(13.86f, 22.706f)
                curveTo(14.251f, 23.098f, 14.885f, 23.098f, 15.276f, 22.706f)
                curveTo(15.667f, 22.313f, 15.667f, 21.677f, 15.276f, 21.285f)
                lineTo(13.996f, 20f)
                horizontalLineTo(19f)
                curveTo(20.657f, 20f, 22f, 18.657f, 22f, 17f)
                lineTo(22f, 7f)
                curveTo(22f, 5.343f, 20.657f, 4f, 19f, 4f)
                lineTo(5f, 4f)
                close()
            }
        }.build()

        return _Repeat!!
    }

@Suppress("ObjectPropertyName")
private var _Repeat: ImageVector? = null
