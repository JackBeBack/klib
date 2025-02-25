package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Dribbble: ImageVector
    get() {
        if (_Dribbble != null) {
            return _Dribbble!!
        }
        _Dribbble = ImageVector.Builder(
            name = "Dribbble",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(5.144f, 17.82f)
                curveTo(3.811f, 16.251f, 3.007f, 14.22f, 3.007f, 12f)
                lineTo(3.007f, 11.998f)
                curveTo(6.613f, 11.962f, 9.576f, 11.484f, 12.242f, 10.578f)
                curveTo(12.467f, 11.061f, 12.685f, 11.553f, 12.896f, 12.056f)
                curveTo(12.556f, 12.169f, 12.221f, 12.295f, 11.892f, 12.434f)
                curveTo(9.242f, 13.549f, 7.005f, 15.461f, 5.144f, 17.82f)
                close()
                moveTo(6.606f, 19.197f)
                curveTo(8.109f, 20.325f, 9.976f, 20.993f, 12f, 20.993f)
                curveTo(13.219f, 20.993f, 14.381f, 20.751f, 15.441f, 20.311f)
                curveTo(14.967f, 18.037f, 14.352f, 15.907f, 13.627f, 13.922f)
                curveTo(13.3f, 14.026f, 12.981f, 14.145f, 12.668f, 14.277f)
                curveTo(10.356f, 15.25f, 8.338f, 16.965f, 6.606f, 19.197f)
                close()
                moveTo(15.592f, 13.476f)
                curveTo(16.248f, 15.302f, 16.813f, 17.24f, 17.267f, 19.29f)
                curveTo(19.048f, 18.001f, 20.338f, 16.076f, 20.803f, 13.847f)
                curveTo(18.914f, 13.359f, 17.182f, 13.26f, 15.592f, 13.476f)
                close()
                moveTo(14.858f, 11.566f)
                curveTo(16.754f, 11.241f, 18.8f, 11.307f, 20.992f, 11.833f)
                curveTo(20.958f, 9.974f, 20.36f, 8.253f, 19.362f, 6.833f)
                curveTo(17.636f, 8.053f, 15.928f, 9.062f, 14.111f, 9.854f)
                curveTo(14.369f, 10.412f, 14.618f, 10.983f, 14.858f, 11.566f)
                close()
                moveTo(11.346f, 8.768f)
                curveTo(8.997f, 9.534f, 6.39f, 9.945f, 3.231f, 9.995f)
                curveTo(3.857f, 7.246f, 5.743f, 4.976f, 8.249f, 3.824f)
                curveTo(9.349f, 5.313f, 10.393f, 6.961f, 11.346f, 8.768f)
                close()
                moveTo(13.23f, 8.056f)
                curveTo(14.888f, 7.342f, 16.447f, 6.431f, 18.028f, 5.326f)
                curveTo(16.433f, 3.885f, 14.319f, 3.007f, 12f, 3.007f)
                curveTo(11.401f, 3.007f, 10.816f, 3.065f, 10.251f, 3.177f)
                curveTo(11.31f, 4.663f, 12.313f, 6.29f, 13.23f, 8.056f)
                close()
            }
        }.build()

        return _Dribbble!!
    }

@Suppress("ObjectPropertyName")
private var _Dribbble: ImageVector? = null
