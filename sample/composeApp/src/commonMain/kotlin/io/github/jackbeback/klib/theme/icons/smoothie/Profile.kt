package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Profile: ImageVector
    get() {
        if (_Profile != null) {
            return _Profile!!
        }
        _Profile = ImageVector.Builder(
            name = "Profile",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFFFFFFFF))) {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(14.337f, 12.347f)
                    lineTo(14.076f, 11.92f)
                    curveTo(13.908f, 12.022f, 13.816f, 12.214f, 13.84f, 12.409f)
                    curveTo(13.865f, 12.605f, 14.002f, 12.767f, 14.191f, 12.825f)
                    lineTo(14.337f, 12.347f)
                    close()
                    moveTo(9.663f, 12.347f)
                    lineTo(9.809f, 12.825f)
                    curveTo(9.998f, 12.767f, 10.135f, 12.605f, 10.16f, 12.409f)
                    curveTo(10.184f, 12.214f, 10.092f, 12.022f, 9.923f, 11.92f)
                    lineTo(9.663f, 12.347f)
                    close()
                    moveTo(4.062f, 19.002f)
                    lineTo(3.565f, 18.94f)
                    lineTo(4.062f, 19.002f)
                    close()
                    moveTo(19.938f, 19.002f)
                    lineTo(20.434f, 18.94f)
                    lineTo(19.938f, 19.002f)
                    close()
                    moveTo(16f, 8.5f)
                    curveTo(16f, 9.948f, 15.231f, 11.217f, 14.076f, 11.92f)
                    lineTo(14.597f, 12.774f)
                    curveTo(16.037f, 11.897f, 17f, 10.311f, 17f, 8.5f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(12f, 4.5f)
                    curveTo(14.209f, 4.5f, 16f, 6.291f, 16f, 8.5f)
                    horizontalLineTo(17f)
                    curveTo(17f, 5.739f, 14.761f, 3.5f, 12f, 3.5f)
                    verticalLineTo(4.5f)
                    close()
                    moveTo(8f, 8.5f)
                    curveTo(8f, 6.291f, 9.791f, 4.5f, 12f, 4.5f)
                    verticalLineTo(3.5f)
                    curveTo(9.239f, 3.5f, 7f, 5.739f, 7f, 8.5f)
                    horizontalLineTo(8f)
                    close()
                    moveTo(9.923f, 11.92f)
                    curveTo(8.769f, 11.217f, 8f, 9.948f, 8f, 8.5f)
                    horizontalLineTo(7f)
                    curveTo(7f, 10.311f, 7.963f, 11.897f, 9.403f, 12.774f)
                    lineTo(9.923f, 11.92f)
                    close()
                    moveTo(9.518f, 11.868f)
                    curveTo(6.361f, 12.831f, 3.984f, 15.58f, 3.565f, 18.94f)
                    lineTo(4.558f, 19.064f)
                    curveTo(4.926f, 16.102f, 7.024f, 13.674f, 9.809f, 12.825f)
                    lineTo(9.518f, 11.868f)
                    close()
                    moveTo(3.565f, 18.94f)
                    curveTo(3.455f, 19.828f, 4.191f, 20.5f, 5f, 20.5f)
                    verticalLineTo(19.5f)
                    curveTo(4.705f, 19.5f, 4.532f, 19.272f, 4.558f, 19.064f)
                    lineTo(3.565f, 18.94f)
                    close()
                    moveTo(5f, 20.5f)
                    horizontalLineTo(19f)
                    verticalLineTo(19.5f)
                    horizontalLineTo(5f)
                    verticalLineTo(20.5f)
                    close()
                    moveTo(19f, 20.5f)
                    curveTo(19.809f, 20.5f, 20.545f, 19.828f, 20.434f, 18.94f)
                    lineTo(19.442f, 19.064f)
                    curveTo(19.468f, 19.272f, 19.295f, 19.5f, 19f, 19.5f)
                    verticalLineTo(20.5f)
                    close()
                    moveTo(20.434f, 18.94f)
                    curveTo(20.016f, 15.58f, 17.639f, 12.831f, 14.482f, 11.868f)
                    lineTo(14.191f, 12.825f)
                    curveTo(16.976f, 13.674f, 19.073f, 16.102f, 19.442f, 19.064f)
                    lineTo(20.434f, 18.94f)
                    close()
                }
            }
        }.build()

        return _Profile!!
    }

@Suppress("ObjectPropertyName")
private var _Profile: ImageVector? = null
