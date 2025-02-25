package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MapPin: ImageVector
    get() {
        if (_MapPin != null) {
            return _MapPin!!
        }
        _MapPin = ImageVector.Builder(
            name = "MapPin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 16f)
                curveTo(11f, 16.552f, 11.448f, 17f, 12f, 17f)
                curveTo(12.552f, 17f, 13f, 16.552f, 13f, 16f)
                horizontalLineTo(11f)
                close()
                moveTo(8.216f, 14.392f)
                curveTo(8.755f, 14.273f, 9.096f, 13.739f, 8.976f, 13.2f)
                curveTo(8.857f, 12.661f, 8.324f, 12.32f, 7.784f, 12.439f)
                lineTo(8.216f, 14.392f)
                close()
                moveTo(16.216f, 12.439f)
                curveTo(15.676f, 12.32f, 15.143f, 12.661f, 15.024f, 13.2f)
                curveTo(14.904f, 13.739f, 15.245f, 14.273f, 15.784f, 14.392f)
                lineTo(16.216f, 12.439f)
                close()
                moveTo(15f, 7f)
                curveTo(15f, 8.657f, 13.657f, 10f, 12f, 10f)
                verticalLineTo(12f)
                curveTo(14.761f, 12f, 17f, 9.761f, 17f, 7f)
                horizontalLineTo(15f)
                close()
                moveTo(12f, 10f)
                curveTo(10.343f, 10f, 9f, 8.657f, 9f, 7f)
                horizontalLineTo(7f)
                curveTo(7f, 9.761f, 9.239f, 12f, 12f, 12f)
                verticalLineTo(10f)
                close()
                moveTo(9f, 7f)
                curveTo(9f, 5.343f, 10.343f, 4f, 12f, 4f)
                verticalLineTo(2f)
                curveTo(9.239f, 2f, 7f, 4.239f, 7f, 7f)
                horizontalLineTo(9f)
                close()
                moveTo(12f, 4f)
                curveTo(13.657f, 4f, 15f, 5.343f, 15f, 7f)
                horizontalLineTo(17f)
                curveTo(17f, 4.239f, 14.761f, 2f, 12f, 2f)
                verticalLineTo(4f)
                close()
                moveTo(11f, 11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                close()
                moveTo(20f, 17f)
                curveTo(20f, 17.227f, 19.901f, 17.518f, 19.568f, 17.868f)
                curveTo(19.231f, 18.222f, 18.696f, 18.587f, 17.958f, 18.915f)
                curveTo(16.484f, 19.569f, 14.379f, 20f, 12f, 20f)
                verticalLineTo(22f)
                curveTo(14.592f, 22f, 16.986f, 21.535f, 18.77f, 20.742f)
                curveTo(19.661f, 20.346f, 20.444f, 19.849f, 21.017f, 19.246f)
                curveTo(21.596f, 18.639f, 22f, 17.878f, 22f, 17f)
                horizontalLineTo(20f)
                close()
                moveTo(12f, 20f)
                curveTo(9.621f, 20f, 7.516f, 19.569f, 6.042f, 18.915f)
                curveTo(5.304f, 18.587f, 4.769f, 18.222f, 4.432f, 17.868f)
                curveTo(4.099f, 17.518f, 4f, 17.227f, 4f, 17f)
                horizontalLineTo(2f)
                curveTo(2f, 17.878f, 2.404f, 18.639f, 2.983f, 19.246f)
                curveTo(3.556f, 19.849f, 4.339f, 20.346f, 5.23f, 20.742f)
                curveTo(7.014f, 21.535f, 9.408f, 22f, 12f, 22f)
                verticalLineTo(20f)
                close()
                moveTo(4f, 17f)
                curveTo(4f, 16.682f, 4.208f, 16.213f, 4.964f, 15.683f)
                curveTo(5.701f, 15.164f, 6.815f, 14.701f, 8.216f, 14.392f)
                lineTo(7.784f, 12.439f)
                curveTo(6.221f, 12.785f, 4.835f, 13.328f, 3.814f, 14.046f)
                curveTo(2.81f, 14.751f, 2f, 15.747f, 2f, 17f)
                horizontalLineTo(4f)
                close()
                moveTo(15.784f, 14.392f)
                curveTo(17.185f, 14.701f, 18.299f, 15.164f, 19.036f, 15.683f)
                curveTo(19.792f, 16.213f, 20f, 16.682f, 20f, 17f)
                horizontalLineTo(22f)
                curveTo(22f, 15.747f, 21.19f, 14.751f, 20.186f, 14.046f)
                curveTo(19.165f, 13.328f, 17.779f, 12.785f, 16.216f, 12.439f)
                lineTo(15.784f, 14.392f)
                close()
            }
        }.build()

        return _MapPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPin: ImageVector? = null
