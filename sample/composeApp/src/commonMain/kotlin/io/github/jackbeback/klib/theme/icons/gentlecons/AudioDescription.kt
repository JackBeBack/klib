package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.AudioDescription: ImageVector
    get() {
        if (_AudioDescription != null) {
            return _AudioDescription!!
        }
        _AudioDescription = ImageVector.Builder(
            name = "AudioDescription",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 9.5f)
                curveTo(13f, 8.672f, 13.672f, 8f, 14.5f, 8f)
                horizontalLineTo(15.764f)
                curveTo(16.9f, 8f, 17.939f, 8.642f, 18.447f, 9.659f)
                lineTo(18.472f, 9.708f)
                curveTo(18.819f, 10.403f, 19f, 11.168f, 19f, 11.944f)
                verticalLineTo(12.056f)
                curveTo(19f, 12.832f, 18.819f, 13.598f, 18.472f, 14.292f)
                lineTo(18.447f, 14.342f)
                curveTo(17.939f, 15.358f, 16.9f, 16f, 15.764f, 16f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 16f, 13f, 15.329f, 13f, 14.5f)
                verticalLineTo(9.5f)
                close()
                moveTo(15.764f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(15.764f)
                curveTo(16.143f, 14f, 16.489f, 13.786f, 16.658f, 13.448f)
                lineTo(16.683f, 13.398f)
                curveTo(16.892f, 12.981f, 17f, 12.522f, 17f, 12.056f)
                verticalLineTo(11.944f)
                curveTo(17f, 11.479f, 16.892f, 11.019f, 16.683f, 10.603f)
                lineTo(16.658f, 10.553f)
                curveTo(16.489f, 10.214f, 16.143f, 10f, 15.764f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8f)
                curveTo(6.343f, 8f, 5f, 9.343f, 5f, 11f)
                verticalLineTo(15f)
                curveTo(5f, 15.552f, 5.448f, 16f, 6f, 16f)
                curveTo(6.552f, 16f, 7f, 15.552f, 7f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                curveTo(9f, 15.552f, 9.448f, 16f, 10f, 16f)
                curveTo(10.552f, 16f, 11f, 15.552f, 11f, 15f)
                verticalLineTo(11f)
                curveTo(11f, 9.343f, 9.657f, 8f, 8f, 8f)
                close()
                moveTo(9f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                curveTo(7f, 10.448f, 7.448f, 10f, 8f, 10f)
                curveTo(8.552f, 10f, 9f, 10.448f, 9f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 6f)
                curveTo(23f, 4.343f, 21.657f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(2.343f, 3f, 1f, 4.343f, 1f, 6f)
                verticalLineTo(18f)
                curveTo(1f, 19.657f, 2.343f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.657f, 21f, 23f, 19.657f, 23f, 18f)
                verticalLineTo(6f)
                close()
                moveTo(21f, 6f)
                curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
                horizontalLineTo(4f)
                curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _AudioDescription!!
    }

@Suppress("ObjectPropertyName")
private var _AudioDescription: ImageVector? = null
