package io.github.jackbeback.klib.theme.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moon: ImageVector
    get() {
        if (_MoonStarsSvgrepoCom != null) {
            return _MoonStarsSvgrepoCom!!
        }
        _MoonStarsSvgrepoCom = ImageVector.Builder(
            name = "MoonStarsSvgreoCom",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF1C274C))) {
                moveTo(19.9f, 2.307f)
                curveTo(19.739f, 1.898f, 19.162f, 1.898f, 19.001f, 2.307f)
                lineTo(18.57f, 3.402f)
                curveTo(18.521f, 3.528f, 18.423f, 3.627f, 18.298f, 3.676f)
                lineTo(17.207f, 4.108f)
                curveTo(16.799f, 4.269f, 16.799f, 4.849f, 17.207f, 5.011f)
                lineTo(18.298f, 5.443f)
                curveTo(18.423f, 5.492f, 18.521f, 5.591f, 18.57f, 5.716f)
                lineTo(19.001f, 6.811f)
                curveTo(19.162f, 7.221f, 19.739f, 7.221f, 19.9f, 6.811f)
                lineTo(20.33f, 5.716f)
                curveTo(20.38f, 5.591f, 20.478f, 5.492f, 20.603f, 5.443f)
                lineTo(21.694f, 5.011f)
                curveTo(22.102f, 4.849f, 22.102f, 4.269f, 21.694f, 4.108f)
                lineTo(20.603f, 3.676f)
                curveTo(20.478f, 3.627f, 20.38f, 3.528f, 20.33f, 3.402f)
                lineTo(19.9f, 2.307f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C))) {
                moveTo(16.033f, 8.13f)
                curveTo(15.872f, 7.72f, 15.294f, 7.72f, 15.133f, 8.13f)
                lineTo(14.976f, 8.529f)
                curveTo(14.927f, 8.654f, 14.829f, 8.753f, 14.704f, 8.802f)
                lineTo(14.306f, 8.96f)
                curveTo(13.898f, 9.121f, 13.898f, 9.701f, 14.306f, 9.863f)
                lineTo(14.704f, 10.02f)
                curveTo(14.829f, 10.069f, 14.927f, 10.168f, 14.976f, 10.293f)
                lineTo(15.133f, 10.693f)
                curveTo(15.294f, 11.102f, 15.872f, 11.102f, 16.033f, 10.693f)
                lineTo(16.19f, 10.293f)
                curveTo(16.239f, 10.168f, 16.337f, 10.069f, 16.462f, 10.02f)
                lineTo(16.86f, 9.863f)
                curveTo(17.268f, 9.701f, 17.268f, 9.121f, 16.86f, 8.96f)
                lineTo(16.462f, 8.802f)
                curveTo(16.337f, 8.753f, 16.239f, 8.654f, 16.19f, 8.529f)
                lineTo(16.033f, 8.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1C274C))) {
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 11.537f, 21.306f, 11.461f, 21.067f, 11.857f)
                curveTo(19.929f, 13.741f, 17.861f, 15f, 15.5f, 15f)
                curveTo(11.91f, 15f, 9f, 12.09f, 9f, 8.5f)
                curveTo(9f, 6.138f, 10.259f, 4.071f, 12.143f, 2.933f)
                curveTo(12.539f, 2.693f, 12.463f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
            }
        }.build()

        return _MoonStarsSvgrepoCom!!
    }

@Suppress("ObjectPropertyName")
private var _MoonStarsSvgrepoCom: ImageVector? = null
