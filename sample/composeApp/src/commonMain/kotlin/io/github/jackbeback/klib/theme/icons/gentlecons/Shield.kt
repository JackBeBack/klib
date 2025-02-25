package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Shield: ImageVector
    get() {
        if (_Shield != null) {
            return _Shield!!
        }
        _Shield = ImageVector.Builder(
            name = "Shield",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.155f, 3.741f)
                curveTo(9.133f, 4.243f, 7.703f, 4.759f, 5.07f, 4.937f)
                curveTo(4.433f, 4.98f, 4.017f, 5.472f, 4.035f, 5.965f)
                curveTo(4.135f, 8.701f, 4.451f, 11.422f, 5.055f, 13.654f)
                curveTo(5.673f, 15.938f, 6.535f, 17.488f, 7.555f, 18.168f)
                curveTo(9.161f, 19.239f, 10.484f, 20.168f, 11.37f, 20.804f)
                curveTo(11.745f, 21.072f, 12.255f, 21.072f, 12.629f, 20.804f)
                curveTo(13.516f, 20.168f, 14.839f, 19.239f, 16.445f, 18.168f)
                curveTo(17.465f, 17.488f, 18.326f, 15.938f, 18.945f, 13.654f)
                curveTo(19.549f, 11.422f, 19.865f, 8.701f, 19.965f, 5.965f)
                curveTo(19.983f, 5.472f, 19.567f, 4.98f, 18.93f, 4.937f)
                curveTo(16.297f, 4.759f, 14.867f, 4.243f, 13.845f, 3.741f)
                curveTo(13.553f, 3.597f, 13.328f, 3.477f, 13.142f, 3.379f)
                curveTo(12.635f, 3.11f, 12.431f, 3.002f, 12f, 3.002f)
                curveTo(11.569f, 3.002f, 11.365f, 3.11f, 10.858f, 3.379f)
                curveTo(10.672f, 3.477f, 10.447f, 3.597f, 10.155f, 3.741f)
                close()
                moveTo(9.686f, 1.728f)
                curveTo(10.302f, 1.395f, 11.027f, 1.002f, 12f, 1.002f)
                curveTo(12.973f, 1.002f, 13.698f, 1.395f, 14.314f, 1.728f)
                curveTo(14.457f, 1.806f, 14.595f, 1.88f, 14.728f, 1.946f)
                curveTo(15.503f, 2.327f, 16.677f, 2.78f, 19.065f, 2.941f)
                curveTo(20.632f, 3.047f, 22.026f, 4.323f, 21.963f, 6.038f)
                curveTo(21.861f, 8.859f, 21.533f, 11.745f, 20.875f, 14.176f)
                curveTo(20.231f, 16.556f, 19.212f, 18.727f, 17.555f, 19.832f)
                curveTo(15.97f, 20.889f, 14.667f, 21.804f, 13.795f, 22.429f)
                curveTo(12.724f, 23.197f, 11.276f, 23.197f, 10.205f, 22.429f)
                curveTo(9.333f, 21.804f, 8.03f, 20.889f, 6.445f, 19.832f)
                curveTo(4.788f, 18.727f, 3.769f, 16.556f, 3.125f, 14.176f)
                curveTo(2.467f, 11.744f, 2.139f, 8.859f, 2.037f, 6.038f)
                curveTo(1.974f, 4.323f, 3.368f, 3.047f, 4.935f, 2.941f)
                curveTo(7.323f, 2.78f, 8.497f, 2.327f, 9.272f, 1.946f)
                curveTo(9.405f, 1.88f, 9.543f, 1.806f, 9.686f, 1.728f)
                close()
            }
        }.build()

        return _Shield!!
    }

@Suppress("ObjectPropertyName")
private var _Shield: ImageVector? = null
