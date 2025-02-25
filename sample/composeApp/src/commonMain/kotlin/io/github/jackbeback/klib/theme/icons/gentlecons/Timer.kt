package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Timer: ImageVector
    get() {
        if (_Timer != null) {
            return _Timer!!
        }
        _Timer = ImageVector.Builder(
            name = "Timer",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 2f)
                curveTo(11f, 1.448f, 11.448f, 1f, 12f, 1f)
                curveTo(12.016f, 1f, 12.032f, 1f, 12.048f, 1.001f)
                curveTo(12.063f, 1.001f, 12.078f, 1f, 12.094f, 1f)
                curveTo(14.12f, 1.018f, 16.109f, 1.595f, 17.837f, 2.677f)
                curveTo(19.849f, 3.936f, 21.4f, 5.813f, 22.257f, 8.026f)
                curveTo(23.115f, 10.239f, 23.233f, 12.671f, 22.595f, 14.957f)
                curveTo(21.957f, 17.243f, 20.597f, 19.262f, 18.717f, 20.711f)
                curveTo(16.837f, 22.16f, 14.539f, 22.963f, 12.166f, 22.999f)
                curveTo(9.793f, 23.035f, 7.471f, 22.302f, 5.549f, 20.91f)
                curveTo(3.626f, 19.518f, 2.206f, 17.541f, 1.499f, 15.275f)
                curveTo(0.892f, 13.328f, 0.84f, 11.258f, 1.338f, 9.294f)
                curveTo(1.474f, 8.759f, 2.053f, 8.488f, 2.574f, 8.671f)
                curveTo(3.095f, 8.855f, 3.365f, 9.427f, 3.24f, 9.965f)
                curveTo(2.879f, 11.518f, 2.937f, 13.145f, 3.415f, 14.678f)
                curveTo(3.992f, 16.53f, 5.154f, 18.146f, 6.726f, 19.284f)
                curveTo(8.298f, 20.422f, 10.195f, 21.021f, 12.136f, 20.992f)
                curveTo(14.076f, 20.963f, 15.955f, 20.307f, 17.492f, 19.122f)
                curveTo(19.028f, 17.937f, 20.14f, 16.287f, 20.662f, 14.417f)
                curveTo(21.184f, 12.548f, 21.087f, 10.561f, 20.386f, 8.751f)
                curveTo(19.685f, 6.942f, 18.417f, 5.407f, 16.772f, 4.378f)
                curveTo(15.623f, 3.658f, 14.333f, 3.212f, 13f, 3.063f)
                verticalLineTo(5f)
                curveTo(13f, 5.552f, 12.552f, 6f, 12f, 6f)
                curveTo(11.448f, 6f, 11f, 5.552f, 11f, 5f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.312f, 3.925f)
                curveTo(4.915f, 3.661f, 4.387f, 3.713f, 4.05f, 4.05f)
                curveTo(3.713f, 4.387f, 3.661f, 4.916f, 3.925f, 5.312f)
                lineTo(9.308f, 13.385f)
                curveTo(9.506f, 13.683f, 9.809f, 14.101f, 10.283f, 14.393f)
                curveTo(10.628f, 14.605f, 11.176f, 14.863f, 11.847f, 14.871f)
                curveTo(12.558f, 14.88f, 13.292f, 14.608f, 13.95f, 13.95f)
                curveTo(14.608f, 13.292f, 14.88f, 12.558f, 14.871f, 11.847f)
                curveTo(14.863f, 11.176f, 14.605f, 10.628f, 14.393f, 10.283f)
                curveTo(14.101f, 9.809f, 13.683f, 9.506f, 13.385f, 9.308f)
                lineTo(5.312f, 3.925f)
                close()
                moveTo(10.972f, 12.276f)
                lineTo(8.363f, 8.363f)
                lineTo(12.276f, 10.972f)
                curveTo(12.527f, 11.139f, 12.636f, 11.245f, 12.69f, 11.332f)
                curveTo(12.796f, 11.505f, 12.869f, 11.695f, 12.871f, 11.872f)
                curveTo(12.873f, 12.011f, 12.836f, 12.235f, 12.535f, 12.536f)
                curveTo(12.235f, 12.836f, 12.011f, 12.873f, 11.872f, 12.871f)
                curveTo(11.695f, 12.869f, 11.505f, 12.796f, 11.332f, 12.69f)
                curveTo(11.245f, 12.636f, 11.139f, 12.527f, 10.972f, 12.276f)
                close()
            }
        }.build()

        return _Timer!!
    }

@Suppress("ObjectPropertyName")
private var _Timer: ImageVector? = null
