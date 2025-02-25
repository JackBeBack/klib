package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Truck",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                curveTo(1.343f, 3f, 0f, 4.343f, 0f, 6f)
                verticalLineTo(15f)
                curveTo(0f, 16.312f, 0.842f, 17.427f, 2.016f, 17.835f)
                curveTo(2.184f, 19.611f, 3.68f, 21f, 5.5f, 21f)
                curveTo(7.263f, 21f, 8.722f, 19.696f, 8.965f, 18f)
                horizontalLineTo(15.035f)
                curveTo(15.278f, 19.696f, 16.737f, 21f, 18.5f, 21f)
                curveTo(20.32f, 21f, 21.816f, 19.611f, 21.984f, 17.835f)
                curveTo(23.158f, 17.427f, 24f, 16.312f, 24f, 15f)
                verticalLineTo(10.752f)
                curveTo(24f, 10.025f, 23.736f, 9.323f, 23.258f, 8.776f)
                lineTo(20.85f, 6.024f)
                curveTo(20.281f, 5.373f, 19.458f, 5f, 18.593f, 5f)
                horizontalLineTo(16.829f)
                curveTo(16.417f, 3.835f, 15.306f, 3f, 14f, 3f)
                horizontalLineTo(3f)
                close()
                moveTo(4f, 17.436f)
                verticalLineTo(17.564f)
                curveTo(4.033f, 18.363f, 4.692f, 19.001f, 5.5f, 19.001f)
                curveTo(6.308f, 19.001f, 6.967f, 18.363f, 7f, 17.564f)
                verticalLineTo(17.436f)
                curveTo(6.967f, 16.637f, 6.308f, 15.999f, 5.5f, 15.999f)
                curveTo(4.692f, 15.999f, 4.033f, 16.637f, 4f, 17.436f)
                close()
                moveTo(5.5f, 14f)
                curveTo(6.896f, 14f, 8.101f, 14.818f, 8.663f, 16f)
                horizontalLineTo(15.337f)
                curveTo(15.899f, 14.818f, 17.104f, 14f, 18.5f, 14f)
                curveTo(19.824f, 14f, 20.977f, 14.736f, 21.572f, 15.821f)
                curveTo(21.831f, 15.64f, 22f, 15.34f, 22f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                curveTo(15.895f, 11f, 15f, 10.105f, 15f, 9f)
                verticalLineTo(6f)
                curveTo(15f, 5.448f, 14.552f, 5f, 14f, 5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 5f, 2f, 5.448f, 2f, 6f)
                verticalLineTo(15f)
                curveTo(2f, 15.34f, 2.169f, 15.64f, 2.428f, 15.821f)
                curveTo(3.023f, 14.736f, 4.176f, 14f, 5.5f, 14f)
                close()
                moveTo(17f, 7f)
                verticalLineTo(8f)
                curveTo(17f, 8.552f, 17.448f, 9f, 18f, 9f)
                horizontalLineTo(20.796f)
                lineTo(19.345f, 7.341f)
                curveTo(19.155f, 7.124f, 18.881f, 7f, 18.593f, 7f)
                horizontalLineTo(17f)
                close()
                moveTo(17f, 17.436f)
                verticalLineTo(17.564f)
                curveTo(17.034f, 18.363f, 17.692f, 19.001f, 18.5f, 19.001f)
                curveTo(19.308f, 19.001f, 19.966f, 18.363f, 20f, 17.564f)
                verticalLineTo(17.436f)
                curveTo(19.966f, 16.637f, 19.308f, 15.999f, 18.5f, 15.999f)
                curveTo(17.692f, 15.999f, 17.034f, 16.637f, 17f, 17.436f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
