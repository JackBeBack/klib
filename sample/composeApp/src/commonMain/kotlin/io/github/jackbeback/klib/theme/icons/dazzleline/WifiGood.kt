package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WifiGood: ImageVector
    get() {
        if (_WifiGood != null) {
            return _WifiGood!!
        }
        _WifiGood = ImageVector.Builder(
            name = "WifiGood",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19f)
                curveTo(11.448f, 19f, 11f, 19.448f, 11f, 20f)
                curveTo(11f, 20.552f, 11.448f, 21f, 12f, 21f)
                verticalLineTo(19f)
                close()
                moveTo(12.01f, 21f)
                curveTo(12.563f, 21f, 13.01f, 20.552f, 13.01f, 20f)
                curveTo(13.01f, 19.448f, 12.563f, 19f, 12.01f, 19f)
                verticalLineTo(21f)
                close()
                moveTo(14.691f, 17.04f)
                curveTo(15.099f, 17.412f, 15.732f, 17.382f, 16.103f, 16.973f)
                curveTo(16.475f, 16.565f, 16.445f, 15.932f, 16.037f, 15.561f)
                lineTo(14.691f, 17.04f)
                close()
                moveTo(18.054f, 13.34f)
                curveTo(18.463f, 13.712f, 19.095f, 13.682f, 19.467f, 13.273f)
                curveTo(19.838f, 12.865f, 19.808f, 12.232f, 19.4f, 11.861f)
                lineTo(18.054f, 13.34f)
                close()
                moveTo(7.964f, 15.561f)
                curveTo(7.555f, 15.932f, 7.525f, 16.565f, 7.897f, 16.973f)
                curveTo(8.269f, 17.382f, 8.901f, 17.412f, 9.31f, 17.04f)
                lineTo(7.964f, 15.561f)
                close()
                moveTo(4.601f, 11.861f)
                curveTo(4.192f, 12.232f, 4.162f, 12.865f, 4.534f, 13.273f)
                curveTo(4.905f, 13.682f, 5.538f, 13.712f, 5.946f, 13.34f)
                lineTo(4.601f, 11.861f)
                close()
                moveTo(12f, 21f)
                horizontalLineTo(12.01f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                close()
                moveTo(12f, 16f)
                curveTo(13.037f, 16f, 13.979f, 16.393f, 14.691f, 17.04f)
                lineTo(16.037f, 15.561f)
                curveTo(14.972f, 14.592f, 13.554f, 14f, 12f, 14f)
                verticalLineTo(16f)
                close()
                moveTo(12f, 11f)
                curveTo(14.332f, 11f, 16.455f, 11.885f, 18.054f, 13.34f)
                lineTo(19.4f, 11.861f)
                curveTo(17.447f, 10.084f, 14.849f, 9f, 12f, 9f)
                verticalLineTo(11f)
                close()
                moveTo(9.31f, 17.04f)
                curveTo(10.021f, 16.393f, 10.964f, 16f, 12f, 16f)
                verticalLineTo(14f)
                curveTo(10.447f, 14f, 9.029f, 14.592f, 7.964f, 15.561f)
                lineTo(9.31f, 17.04f)
                close()
                moveTo(5.946f, 13.34f)
                curveTo(7.546f, 11.885f, 9.668f, 11f, 12f, 11f)
                verticalLineTo(9f)
                curveTo(9.151f, 9f, 6.554f, 10.084f, 4.601f, 11.861f)
                lineTo(5.946f, 13.34f)
                close()
            }
        }.build()

        return _WifiGood!!
    }

@Suppress("ObjectPropertyName")
private var _WifiGood: ImageVector? = null
