package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PgMovieRating: ImageVector
    get() {
        if (_PgMovieRating != null) {
            return _PgMovieRating!!
        }
        _PgMovieRating = ImageVector.Builder(
            name = "PgMovieRating",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 9f)
                curveTo(15.448f, 9f, 15f, 9.448f, 15f, 10f)
                verticalLineTo(14f)
                curveTo(15f, 14.552f, 15.448f, 15f, 16f, 15f)
                lineTo(16.5f, 15f)
                curveTo(17.077f, 15f, 17f, 14.392f, 17f, 14f)
                curveTo(16.448f, 14f, 16f, 13.552f, 16f, 13f)
                curveTo(16f, 12.448f, 16.448f, 12f, 17f, 12f)
                horizontalLineTo(18f)
                curveTo(18.552f, 12f, 19f, 12.448f, 19f, 13f)
                verticalLineTo(15f)
                curveTo(19f, 15.46f, 18.642f, 15.897f, 18.332f, 16.207f)
                curveTo(17.973f, 16.566f, 17.359f, 17f, 16.5f, 17f)
                lineTo(16f, 17f)
                curveTo(14.343f, 17f, 13f, 15.657f, 13f, 14f)
                verticalLineTo(10f)
                curveTo(13f, 8.343f, 14.343f, 7f, 16f, 7f)
                horizontalLineTo(16.5f)
                curveTo(17.359f, 7f, 17.973f, 7.434f, 18.332f, 7.793f)
                curveTo(18.552f, 8.013f, 18.749f, 8.268f, 18.891f, 8.546f)
                curveTo(19.134f, 9.027f, 18.93f, 9.653f, 18.447f, 9.894f)
                curveTo(17.957f, 10.14f, 17.361f, 9.944f, 17.111f, 9.458f)
                curveTo(16.989f, 9.242f, 16.766f, 9f, 16.5f, 9f)
                horizontalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 9f)
                curveTo(5f, 7.895f, 5.895f, 7f, 7f, 7f)
                lineTo(8.005f, 7f)
                curveTo(8.177f, 7.001f, 8.349f, 7.025f, 8.516f, 7.06f)
                curveTo(8.787f, 7.116f, 9.155f, 7.23f, 9.53f, 7.464f)
                curveTo(10.343f, 7.973f, 11f, 8.93f, 11f, 10.5f)
                curveTo(11f, 12.07f, 10.343f, 13.027f, 9.53f, 13.535f)
                curveTo(9.155f, 13.77f, 8.787f, 13.884f, 8.516f, 13.94f)
                curveTo(8.348f, 13.975f, 8.175f, 13.999f, 8.003f, 14f)
                lineTo(7f, 14f)
                verticalLineTo(16f)
                curveTo(7f, 16.552f, 6.552f, 17f, 6f, 17f)
                curveTo(5.448f, 17f, 5f, 16.552f, 5f, 16f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 12f)
                curveTo(7.328f, 12f, 7.67f, 12.028f, 7.997f, 11.999f)
                curveTo(8.76f, 11.931f, 9f, 11.171f, 9f, 10.5f)
                curveTo(9f, 9.829f, 8.76f, 9.069f, 7.997f, 9.001f)
                curveTo(7.67f, 8.972f, 7.328f, 9f, 7f, 9f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PgMovieRating!!
    }

@Suppress("ObjectPropertyName")
private var _PgMovieRating: ImageVector? = null
