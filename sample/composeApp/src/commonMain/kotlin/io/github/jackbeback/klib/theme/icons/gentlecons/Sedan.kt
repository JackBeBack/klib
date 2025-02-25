package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Sedan: ImageVector
    get() {
        if (_Sedan != null) {
            return _Sedan!!
        }
        _Sedan = ImageVector.Builder(
            name = "Sedan",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.236f, 5f)
                curveTo(7.1f, 5f, 6.061f, 5.642f, 5.553f, 6.658f)
                lineTo(4.658f, 8.447f)
                curveTo(4.489f, 8.786f, 4.143f, 9f, 3.764f, 9f)
                horizontalLineTo(3f)
                curveTo(1.343f, 9f, 0f, 10.343f, 0f, 12f)
                verticalLineTo(14f)
                curveTo(0f, 15.312f, 0.842f, 16.427f, 2.016f, 16.835f)
                curveTo(2.184f, 18.611f, 3.68f, 20f, 5.5f, 20f)
                curveTo(7.263f, 20f, 8.722f, 18.696f, 8.965f, 17f)
                horizontalLineTo(15.035f)
                curveTo(15.278f, 18.696f, 16.737f, 20f, 18.5f, 20f)
                curveTo(20.32f, 20f, 21.816f, 18.611f, 21.984f, 16.835f)
                curveTo(23.158f, 16.427f, 24f, 15.312f, 24f, 14f)
                verticalLineTo(12.694f)
                curveTo(24f, 11.228f, 22.94f, 9.976f, 21.493f, 9.735f)
                lineTo(17.609f, 9.088f)
                lineTo(15.936f, 6.41f)
                curveTo(15.387f, 5.533f, 14.426f, 5f, 13.392f, 5f)
                horizontalLineTo(8.236f)
                close()
                moveTo(4f, 16.436f)
                verticalLineTo(16.564f)
                curveTo(4.033f, 17.363f, 4.692f, 18.001f, 5.5f, 18.001f)
                curveTo(6.308f, 18.001f, 6.967f, 17.363f, 7f, 16.564f)
                verticalLineTo(16.436f)
                curveTo(6.967f, 15.637f, 6.308f, 14.999f, 5.5f, 14.999f)
                curveTo(4.692f, 14.999f, 4.033f, 15.637f, 4f, 16.436f)
                close()
                moveTo(5.5f, 13f)
                curveTo(6.896f, 13f, 8.101f, 13.818f, 8.663f, 15f)
                horizontalLineTo(15.337f)
                curveTo(15.899f, 13.818f, 17.104f, 13f, 18.5f, 13f)
                curveTo(19.824f, 13f, 20.977f, 13.736f, 21.572f, 14.821f)
                curveTo(21.831f, 14.64f, 22f, 14.34f, 22f, 14f)
                verticalLineTo(12.694f)
                curveTo(22f, 12.205f, 21.647f, 11.788f, 21.164f, 11.708f)
                lineTo(16.917f, 11f)
                horizontalLineTo(12f)
                curveTo(10.895f, 11f, 10f, 10.105f, 10f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(8.236f)
                curveTo(7.857f, 7f, 7.511f, 7.214f, 7.342f, 7.553f)
                lineTo(6.447f, 9.342f)
                curveTo(5.939f, 10.358f, 4.9f, 11f, 3.764f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 11.448f, 2f, 12f)
                verticalLineTo(14f)
                curveTo(2f, 14.34f, 2.169f, 14.64f, 2.428f, 14.821f)
                curveTo(3.023f, 13.736f, 4.176f, 13f, 5.5f, 13f)
                close()
                moveTo(12f, 7f)
                verticalLineTo(8f)
                curveTo(12f, 8.552f, 12.448f, 9f, 13f, 9f)
                horizontalLineTo(15.196f)
                lineTo(14.24f, 7.47f)
                curveTo(14.057f, 7.178f, 13.736f, 7f, 13.392f, 7f)
                horizontalLineTo(12f)
                close()
                moveTo(17f, 16.436f)
                verticalLineTo(16.564f)
                curveTo(17.034f, 17.363f, 17.692f, 18.001f, 18.5f, 18.001f)
                curveTo(19.308f, 18.001f, 19.966f, 17.363f, 20f, 16.564f)
                verticalLineTo(16.436f)
                curveTo(19.966f, 15.637f, 19.308f, 14.999f, 18.5f, 14.999f)
                curveTo(17.692f, 14.999f, 17.034f, 15.637f, 17f, 16.436f)
                close()
            }
        }.build()

        return _Sedan!!
    }

@Suppress("ObjectPropertyName")
private var _Sedan: ImageVector? = null
