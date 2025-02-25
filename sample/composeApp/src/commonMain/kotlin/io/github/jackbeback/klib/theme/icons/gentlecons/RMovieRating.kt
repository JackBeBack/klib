package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.RMovieRating: ImageVector
    get() {
        if (_RMovieRating != null) {
            return _RMovieRating!!
        }
        _RMovieRating = ImageVector.Builder(
            name = "RMovieRating",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(8f, 7.343f, 9.343f, 6f, 11f, 6f)
                horizontalLineTo(12f)
                curveTo(12.212f, 6f, 12.425f, 6.026f, 12.633f, 6.06f)
                curveTo(12.98f, 6.118f, 13.458f, 6.236f, 13.947f, 6.481f)
                curveTo(14.441f, 6.727f, 14.965f, 7.113f, 15.363f, 7.711f)
                curveTo(15.766f, 8.315f, 16f, 9.075f, 16f, 10f)
                curveTo(16f, 10.925f, 15.766f, 11.685f, 15.363f, 12.289f)
                curveTo(14.965f, 12.887f, 14.441f, 13.273f, 13.947f, 13.519f)
                curveTo(13.871f, 13.558f, 13.794f, 13.593f, 13.719f, 13.625f)
                lineTo(15.8f, 16.4f)
                curveTo(16.131f, 16.842f, 16.042f, 17.469f, 15.6f, 17.8f)
                curveTo(15.158f, 18.131f, 14.531f, 18.042f, 14.2f, 17.6f)
                lineTo(11.5f, 14f)
                lineTo(10f, 14f)
                verticalLineTo(17f)
                curveTo(10f, 17.552f, 9.552f, 18f, 9f, 18f)
                curveTo(8.448f, 18f, 8f, 17.552f, 8f, 17f)
                verticalLineTo(9f)
                close()
                moveTo(10f, 9f)
                verticalLineTo(12f)
                lineTo(12f, 12f)
                curveTo(12.36f, 11.988f, 12.732f, 11.891f, 13.053f, 11.731f)
                curveTo(13.309f, 11.602f, 13.535f, 11.426f, 13.699f, 11.18f)
                curveTo(13.859f, 10.94f, 14f, 10.575f, 14f, 10f)
                curveTo(14f, 9.425f, 13.859f, 9.06f, 13.699f, 8.82f)
                curveTo(13.535f, 8.574f, 13.309f, 8.398f, 13.053f, 8.269f)
                curveTo(12.732f, 8.109f, 12.36f, 8.012f, 12f, 8f)
                lineTo(11f, 8f)
                curveTo(10.448f, 8f, 10f, 8.448f, 10f, 9f)
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

        return _RMovieRating!!
    }

@Suppress("ObjectPropertyName")
private var _RMovieRating: ImageVector? = null
