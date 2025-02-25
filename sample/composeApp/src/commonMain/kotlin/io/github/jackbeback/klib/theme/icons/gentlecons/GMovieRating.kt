package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.GMovieRating: ImageVector
    get() {
        if (_GMovieRating != null) {
            return _GMovieRating!!
        }
        _GMovieRating = ImageVector.Builder(
            name = "GMovieRating",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 9f)
                curveTo(10f, 8.448f, 10.448f, 8f, 11f, 8f)
                horizontalLineTo(13f)
                curveTo(13.507f, 8f, 13.79f, 8.162f, 13.938f, 8.281f)
                curveTo(14.049f, 8.37f, 14.108f, 8.455f, 14.119f, 8.473f)
                curveTo(14.374f, 8.948f, 14.962f, 9.137f, 15.447f, 8.894f)
                curveTo(15.931f, 8.653f, 16.136f, 8.034f, 15.893f, 7.551f)
                curveTo(15.839f, 7.442f, 15.771f, 7.341f, 15.698f, 7.244f)
                curveTo(15.586f, 7.094f, 15.419f, 6.905f, 15.187f, 6.719f)
                curveTo(14.71f, 6.338f, 13.993f, 6f, 13f, 6f)
                horizontalLineTo(11f)
                curveTo(9.343f, 6f, 8f, 7.343f, 8f, 9f)
                verticalLineTo(15f)
                curveTo(8f, 16.657f, 9.343f, 18f, 11f, 18f)
                lineTo(13f, 18f)
                curveTo(13.993f, 18f, 14.71f, 17.663f, 15.187f, 17.281f)
                curveTo(15.419f, 17.095f, 15.586f, 16.906f, 15.698f, 16.756f)
                curveTo(15.864f, 16.535f, 16f, 16.277f, 16f, 16f)
                verticalLineTo(13f)
                curveTo(16f, 12.448f, 15.552f, 12f, 15f, 12f)
                horizontalLineTo(13f)
                curveTo(12.448f, 12f, 12f, 12.448f, 12f, 13f)
                curveTo(12f, 13.552f, 12.448f, 14f, 13f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(15.665f)
                curveTo(13.734f, 15.916f, 13.356f, 16f, 13f, 16f)
                lineTo(11f, 16f)
                curveTo(10.448f, 16f, 10f, 15.552f, 10f, 15f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 3f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _GMovieRating!!
    }

@Suppress("ObjectPropertyName")
private var _GMovieRating: ImageVector? = null
