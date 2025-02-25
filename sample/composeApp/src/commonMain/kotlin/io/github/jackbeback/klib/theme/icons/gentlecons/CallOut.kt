package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CallOut: ImageVector
    get() {
        if (_CallOut != null) {
            return _CallOut!!
        }
        _CallOut = ImageVector.Builder(
            name = "CallOut",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.354f, 22.232f)
                curveTo(15.334f, 21.726f, 11.199f, 20.299f, 7.45f, 16.55f)
                curveTo(3.701f, 12.801f, 2.274f, 8.666f, 1.768f, 6.646f)
                curveTo(1.477f, 5.485f, 2.001f, 4.364f, 2.889f, 3.73f)
                lineTo(5.217f, 2.067f)
                curveTo(6.579f, 1.094f, 8.474f, 1.424f, 9.427f, 2.801f)
                lineTo(10.893f, 4.918f)
                curveTo(11.515f, 5.817f, 11.301f, 7.048f, 10.411f, 7.684f)
                lineTo(9.242f, 8.519f)
                curveTo(9.419f, 9.195f, 9.969f, 10.585f, 11.692f, 12.308f)
                curveTo(13.415f, 14.031f, 14.805f, 14.581f, 15.481f, 14.758f)
                lineTo(16.316f, 13.589f)
                curveTo(16.952f, 12.699f, 18.184f, 12.485f, 19.082f, 13.107f)
                lineTo(21.199f, 14.573f)
                curveTo(22.576f, 15.526f, 22.906f, 17.421f, 21.933f, 18.783f)
                lineTo(20.27f, 21.111f)
                curveTo(19.636f, 22f, 18.515f, 22.523f, 17.354f, 22.232f)
                close()
                moveTo(8.864f, 15.136f)
                curveTo(12.273f, 18.545f, 16.036f, 19.84f, 17.841f, 20.292f)
                curveTo(18.104f, 20.358f, 18.423f, 20.256f, 18.643f, 19.949f)
                lineTo(20.306f, 17.621f)
                curveTo(20.63f, 17.167f, 20.52f, 16.535f, 20.061f, 16.217f)
                lineTo(17.944f, 14.751f)
                lineTo(17.048f, 16.006f)
                curveTo(16.682f, 16.518f, 16.005f, 16.92f, 15.216f, 16.75f)
                curveTo(14.232f, 16.538f, 12.413f, 15.857f, 10.278f, 13.722f)
                curveTo(8.143f, 11.587f, 7.462f, 9.768f, 7.25f, 8.784f)
                curveTo(7.08f, 7.995f, 7.482f, 7.318f, 7.994f, 6.952f)
                lineTo(9.249f, 6.056f)
                lineTo(7.783f, 3.939f)
                curveTo(7.465f, 3.48f, 6.834f, 3.37f, 6.379f, 3.694f)
                lineTo(4.051f, 5.358f)
                curveTo(3.744f, 5.577f, 3.642f, 5.896f, 3.708f, 6.159f)
                curveTo(4.16f, 7.964f, 5.455f, 11.727f, 8.864f, 15.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 7f)
                curveTo(23f, 7.552f, 22.552f, 8f, 22f, 8f)
                curveTo(21.448f, 8f, 21f, 7.552f, 21f, 7f)
                verticalLineTo(4.414f)
                lineTo(16.722f, 8.693f)
                curveTo(16.331f, 9.083f, 15.698f, 9.083f, 15.307f, 8.693f)
                curveTo(14.917f, 8.302f, 14.917f, 7.669f, 15.307f, 7.278f)
                lineTo(19.586f, 3f)
                lineTo(17f, 3f)
                curveTo(16.448f, 3f, 16f, 2.552f, 16f, 2f)
                curveTo(16f, 1.448f, 16.448f, 1f, 17f, 1f)
                lineTo(21f, 1f)
                curveTo(22.105f, 1f, 23f, 1.895f, 23f, 3f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _CallOut!!
    }

@Suppress("ObjectPropertyName")
private var _CallOut: ImageVector? = null
