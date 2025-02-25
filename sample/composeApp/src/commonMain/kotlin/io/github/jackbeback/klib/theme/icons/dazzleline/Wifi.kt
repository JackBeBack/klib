package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Wifi: ImageVector
    get() {
        if (_Wifi != null) {
            return _Wifi!!
        }
        _Wifi = ImageVector.Builder(
            name = "Wifi",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(1.333f, 8.074f)
                curveTo(0.922f, 8.443f, 0.887f, 9.075f, 1.255f, 9.486f)
                curveTo(1.623f, 9.898f, 2.255f, 9.933f, 2.667f, 9.565f)
                lineTo(1.333f, 8.074f)
                close()
                moveTo(21.333f, 9.565f)
                curveTo(21.745f, 9.933f, 22.377f, 9.898f, 22.745f, 9.486f)
                curveTo(23.114f, 9.075f, 23.078f, 8.443f, 22.667f, 8.074f)
                lineTo(21.333f, 9.565f)
                close()
                moveTo(12f, 19f)
                curveTo(11.448f, 19f, 11f, 19.448f, 11f, 20f)
                curveTo(11f, 20.552f, 11.448f, 21f, 12f, 21f)
                verticalLineTo(19f)
                close()
                moveTo(12.01f, 21f)
                curveTo(12.562f, 21f, 13.01f, 20.552f, 13.01f, 20f)
                curveTo(13.01f, 19.448f, 12.562f, 19f, 12.01f, 19f)
                verticalLineTo(21f)
                close()
                moveTo(14.691f, 17.04f)
                curveTo(15.099f, 17.412f, 15.731f, 17.382f, 16.103f, 16.973f)
                curveTo(16.475f, 16.565f, 16.445f, 15.932f, 16.036f, 15.561f)
                lineTo(14.691f, 17.04f)
                close()
                moveTo(18.054f, 13.34f)
                curveTo(18.462f, 13.712f, 19.095f, 13.682f, 19.466f, 13.273f)
                curveTo(19.838f, 12.865f, 19.808f, 12.232f, 19.4f, 11.861f)
                lineTo(18.054f, 13.34f)
                close()
                moveTo(7.964f, 15.561f)
                curveTo(7.555f, 15.932f, 7.525f, 16.565f, 7.897f, 16.973f)
                curveTo(8.269f, 17.382f, 8.901f, 17.412f, 9.309f, 17.04f)
                lineTo(7.964f, 15.561f)
                close()
                moveTo(4.6f, 11.861f)
                curveTo(4.192f, 12.232f, 4.162f, 12.865f, 4.533f, 13.273f)
                curveTo(4.905f, 13.682f, 5.538f, 13.712f, 5.946f, 13.34f)
                lineTo(4.6f, 11.861f)
                close()
                moveTo(2.667f, 9.565f)
                curveTo(5.144f, 7.347f, 8.414f, 6f, 12f, 6f)
                verticalLineTo(4f)
                curveTo(7.903f, 4f, 4.163f, 5.541f, 1.333f, 8.074f)
                lineTo(2.667f, 9.565f)
                close()
                moveTo(12f, 6f)
                curveTo(15.586f, 6f, 18.856f, 7.347f, 21.333f, 9.565f)
                lineTo(22.667f, 8.074f)
                curveTo(19.837f, 5.541f, 16.097f, 4f, 12f, 4f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 21f)
                horizontalLineTo(12.01f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                close()
                moveTo(12f, 16f)
                curveTo(13.037f, 16f, 13.979f, 16.393f, 14.691f, 17.04f)
                lineTo(16.036f, 15.561f)
                curveTo(14.971f, 14.592f, 13.554f, 14f, 12f, 14f)
                verticalLineTo(16f)
                close()
                moveTo(12f, 11f)
                curveTo(14.332f, 11f, 16.455f, 11.885f, 18.054f, 13.34f)
                lineTo(19.4f, 11.861f)
                curveTo(17.447f, 10.084f, 14.849f, 9f, 12f, 9f)
                verticalLineTo(11f)
                close()
                moveTo(9.309f, 17.04f)
                curveTo(10.021f, 16.393f, 10.963f, 16f, 12f, 16f)
                verticalLineTo(14f)
                curveTo(10.446f, 14f, 9.029f, 14.592f, 7.964f, 15.561f)
                lineTo(9.309f, 17.04f)
                close()
                moveTo(5.946f, 13.34f)
                curveTo(7.545f, 11.885f, 9.668f, 11f, 12f, 11f)
                verticalLineTo(9f)
                curveTo(9.151f, 9f, 6.553f, 10.084f, 4.6f, 11.861f)
                lineTo(5.946f, 13.34f)
                close()
            }
        }.build()

        return _Wifi!!
    }

@Suppress("ObjectPropertyName")
private var _Wifi: ImageVector? = null
