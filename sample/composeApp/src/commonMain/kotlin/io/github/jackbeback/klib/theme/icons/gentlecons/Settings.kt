package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Settings: ImageVector
    get() {
        if (_Settings != null) {
            return _Settings!!
        }
        _Settings = ImageVector.Builder(
            name = "Settings",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.599f, 6.224f)
                curveTo(3.362f, 4.82f, 4.68f, 3.646f, 6.073f, 4.021f)
                lineTo(7.128f, 4.304f)
                curveTo(7.965f, 4.529f, 8.853f, 4.191f, 9.319f, 3.469f)
                lineTo(10.33f, 1.904f)
                curveTo(11.108f, 0.699f, 12.892f, 0.699f, 13.67f, 1.904f)
                lineTo(14.681f, 3.469f)
                curveTo(15.147f, 4.191f, 16.035f, 4.529f, 16.872f, 4.304f)
                lineTo(17.927f, 4.021f)
                curveTo(19.32f, 3.646f, 20.638f, 4.82f, 20.401f, 6.224f)
                lineTo(20.14f, 7.763f)
                curveTo(20.007f, 8.553f, 20.377f, 9.344f, 21.075f, 9.757f)
                lineTo(22.039f, 10.327f)
                curveTo(23.32f, 11.085f, 23.32f, 12.915f, 22.039f, 13.673f)
                lineTo(21.075f, 14.243f)
                curveTo(20.377f, 14.656f, 20.007f, 15.447f, 20.14f, 16.237f)
                lineTo(20.401f, 17.776f)
                curveTo(20.638f, 19.18f, 19.32f, 20.354f, 17.927f, 19.979f)
                lineTo(16.872f, 19.696f)
                curveTo(16.035f, 19.471f, 15.147f, 19.809f, 14.681f, 20.531f)
                lineTo(13.67f, 22.096f)
                curveTo(12.892f, 23.301f, 11.108f, 23.301f, 10.33f, 22.096f)
                lineTo(9.319f, 20.531f)
                curveTo(8.853f, 19.809f, 7.965f, 19.471f, 7.128f, 19.696f)
                lineTo(6.073f, 19.979f)
                curveTo(4.68f, 20.354f, 3.362f, 19.18f, 3.599f, 17.776f)
                lineTo(3.86f, 16.237f)
                curveTo(3.993f, 15.447f, 3.623f, 14.656f, 2.925f, 14.243f)
                lineTo(1.961f, 13.673f)
                curveTo(0.68f, 12.915f, 0.68f, 11.085f, 1.961f, 10.327f)
                lineTo(2.925f, 9.757f)
                curveTo(3.623f, 9.344f, 3.993f, 8.553f, 3.86f, 7.763f)
                lineTo(3.599f, 6.224f)
                close()
                moveTo(9.03f, 6.146f)
                horizontalLineTo(6.061f)
                verticalLineTo(9.073f)
                lineTo(3.091f, 12f)
                lineTo(6.061f, 14.927f)
                verticalLineTo(17.854f)
                horizontalLineTo(9.03f)
                lineTo(12f, 20.781f)
                lineTo(14.97f, 17.854f)
                horizontalLineTo(17.939f)
                verticalLineTo(14.927f)
                lineTo(20.909f, 12f)
                lineTo(17.939f, 9.073f)
                verticalLineTo(6.146f)
                horizontalLineTo(14.97f)
                lineTo(12f, 3.219f)
                lineTo(9.03f, 6.146f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16.451f, 12f)
                curveTo(16.451f, 14.425f, 14.457f, 16.39f, 11.997f, 16.39f)
                curveTo(9.537f, 16.39f, 7.543f, 14.425f, 7.543f, 12f)
                curveTo(7.543f, 9.575f, 9.537f, 7.61f, 11.997f, 7.61f)
                curveTo(14.457f, 7.61f, 16.451f, 9.575f, 16.451f, 12f)
                close()
                moveTo(9.52f, 12f)
                curveTo(9.52f, 13.349f, 10.629f, 14.442f, 11.997f, 14.442f)
                curveTo(13.365f, 14.442f, 14.475f, 13.349f, 14.475f, 12f)
                curveTo(14.475f, 10.651f, 13.365f, 9.558f, 11.997f, 9.558f)
                curveTo(10.629f, 9.558f, 9.52f, 10.651f, 9.52f, 12f)
                close()
            }
        }.build()

        return _Settings!!
    }

@Suppress("ObjectPropertyName")
private var _Settings: ImageVector? = null
