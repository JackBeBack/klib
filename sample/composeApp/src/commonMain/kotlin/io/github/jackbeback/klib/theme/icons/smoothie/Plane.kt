package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Plane: ImageVector
    get() {
        if (_Plane != null) {
            return _Plane!!
        }
        _Plane = ImageVector.Builder(
            name = "Plane",
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
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(19.307f, 7.636f)
                    curveTo(19.307f, 7.636f, 20.425f, 5.925f, 19.364f, 4.864f)
                    curveTo(18.303f, 3.803f, 16.592f, 4.921f, 16.592f, 4.921f)
                    lineTo(13.057f, 8.456f)
                    lineTo(5.458f, 6.042f)
                    lineTo(3.572f, 7.928f)
                    lineTo(9.757f, 11.756f)
                    lineTo(7.871f, 13.642f)
                    lineTo(4.402f, 13.943f)
                    lineTo(3.694f, 14.65f)
                    lineTo(7.343f, 16.885f)
                    lineTo(9.606f, 20.562f)
                    lineTo(10.313f, 19.855f)
                    lineTo(10.586f, 16.357f)
                    lineTo(12.472f, 14.471f)
                    lineTo(16.3f, 20.656f)
                    lineTo(18.185f, 18.77f)
                    lineTo(15.772f, 11.171f)
                    lineTo(19.307f, 7.636f)
                    close()
                }
            }
        }.build()

        return _Plane!!
    }

@Suppress("ObjectPropertyName")
private var _Plane: ImageVector? = null
