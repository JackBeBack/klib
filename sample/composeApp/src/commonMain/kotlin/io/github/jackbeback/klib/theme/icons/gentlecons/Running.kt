package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Running: ImageVector
    get() {
        if (_Running != null) {
            return _Running!!
        }
        _Running = ImageVector.Builder(
            name = "Running",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.5f, 6f)
                curveTo(19.881f, 6f, 21f, 4.881f, 21f, 3.5f)
                curveTo(21f, 2.119f, 19.881f, 1f, 18.5f, 1f)
                curveTo(17.119f, 1f, 16f, 2.119f, 16f, 3.5f)
                curveTo(16f, 4.881f, 17.119f, 6f, 18.5f, 6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9.5f, 3.938f)
                lineTo(7.47f, 5.206f)
                curveTo(7.113f, 5.43f, 7f, 5.799f, 7f, 6.196f)
                curveTo(7f, 6.981f, 7.864f, 7.46f, 8.53f, 7.044f)
                lineTo(10.418f, 5.863f)
                curveTo(10.769f, 5.644f, 11.218f, 5.663f, 11.549f, 5.911f)
                lineTo(13f, 7f)
                lineTo(9.293f, 10.707f)
                curveTo(9.098f, 10.902f, 8.92f, 11.113f, 8.759f, 11.337f)
                lineTo(6.946f, 13.875f)
                curveTo(6.683f, 14.244f, 6.205f, 14.389f, 5.781f, 14.231f)
                lineTo(3.21f, 13.266f)
                curveTo(2.794f, 13.11f, 2.326f, 13.261f, 2.079f, 13.631f)
                curveTo(1.768f, 14.098f, 1.924f, 14.731f, 2.417f, 15f)
                lineTo(4.889f, 16.349f)
                curveTo(6.123f, 17.021f, 7.658f, 16.748f, 8.583f, 15.69f)
                lineTo(10.5f, 13.5f)
                lineTo(12.3f, 16.02f)
                curveTo(12.731f, 16.623f, 12.793f, 17.414f, 12.462f, 18.077f)
                lineTo(10.724f, 21.553f)
                curveTo(10.391f, 22.218f, 10.875f, 23f, 11.618f, 23f)
                curveTo(12.089f, 23f, 12.542f, 22.917f, 12.776f, 22.447f)
                lineTo(14.748f, 18.505f)
                curveTo(15.215f, 17.57f, 15.162f, 16.459f, 14.608f, 15.573f)
                lineTo(13f, 13f)
                lineTo(16f, 10f)
                lineTo(17.372f, 10.915f)
                curveTo(18.607f, 11.738f, 19.973f, 11.676f, 21.316f, 11.228f)
                curveTo(21.781f, 11.073f, 22f, 10.645f, 22f, 10.181f)
                curveTo(22f, 9.563f, 21.445f, 9.092f, 20.836f, 9.194f)
                curveTo(20.145f, 9.309f, 19.146f, 9.695f, 18.635f, 9.014f)
                curveTo(16.965f, 6.787f, 14.995f, 5.219f, 12.547f, 3.859f)
                curveTo(11.592f, 3.329f, 10.425f, 3.359f, 9.5f, 3.938f)
                close()
            }
        }.build()

        return _Running!!
    }

@Suppress("ObjectPropertyName")
private var _Running: ImageVector? = null
