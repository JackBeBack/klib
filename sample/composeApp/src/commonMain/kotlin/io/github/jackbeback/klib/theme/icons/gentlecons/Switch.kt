package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Switch: ImageVector
    get() {
        if (_Switch != null) {
            return _Switch!!
        }
        _Switch = ImageVector.Builder(
            name = "Switch",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.715f, 1.716f)
                curveTo(18.324f, 1.324f, 18.324f, 0.687f, 18.715f, 0.294f)
                curveTo(19.107f, -0.098f, 19.741f, -0.098f, 20.132f, 0.294f)
                lineTo(22.404f, 2.574f)
                lineTo(22.417f, 2.587f)
                curveTo(23.194f, 3.372f, 23.192f, 4.641f, 22.412f, 5.423f)
                lineTo(20.137f, 7.706f)
                curveTo(19.746f, 8.098f, 19.112f, 8.098f, 18.721f, 7.706f)
                curveTo(18.33f, 7.313f, 18.33f, 6.677f, 18.721f, 6.285f)
                lineTo(20.002f, 5f)
                lineTo(5f, 5f)
                curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(13f)
                curveTo(4f, 13.552f, 3.552f, 14f, 3f, 14f)
                curveTo(2.448f, 14f, 2f, 13.552f, 2f, 13f)
                verticalLineTo(6f)
                curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
                horizontalLineTo(19.995f)
                lineTo(18.715f, 1.716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 11f)
                curveTo(22f, 10.448f, 21.552f, 10f, 21f, 10f)
                curveTo(20.448f, 10f, 20f, 10.448f, 20f, 11f)
                verticalLineTo(18f)
                curveTo(20f, 18.552f, 19.552f, 19f, 19f, 19f)
                lineTo(4.003f, 19f)
                lineTo(5.282f, 17.716f)
                curveTo(5.673f, 17.323f, 5.673f, 16.687f, 5.282f, 16.294f)
                curveTo(4.891f, 15.902f, 4.257f, 15.902f, 3.865f, 16.294f)
                lineTo(1.594f, 18.574f)
                lineTo(1.581f, 18.587f)
                curveTo(0.804f, 19.372f, 0.806f, 20.641f, 1.586f, 21.423f)
                lineTo(3.86f, 23.706f)
                curveTo(4.251f, 24.098f, 4.885f, 24.098f, 5.276f, 23.706f)
                curveTo(5.667f, 23.313f, 5.667f, 22.677f, 5.276f, 22.285f)
                lineTo(3.996f, 21f)
                lineTo(19f, 21f)
                curveTo(20.657f, 21f, 22f, 19.657f, 22f, 18f)
                lineTo(22f, 11f)
                close()
            }
        }.build()

        return _Switch!!
    }

@Suppress("ObjectPropertyName")
private var _Switch: ImageVector? = null
