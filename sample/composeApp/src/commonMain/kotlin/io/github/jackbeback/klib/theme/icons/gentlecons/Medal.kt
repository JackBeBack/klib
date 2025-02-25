package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Medal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.196f, 6.438f)
                curveTo(2.644f, 5.481f, 2.972f, 4.258f, 3.928f, 3.706f)
                lineTo(7.392f, 1.706f)
                curveTo(8.349f, 1.153f, 9.572f, 1.481f, 10.124f, 2.438f)
                lineTo(12.044f, 5.762f)
                lineTo(13.963f, 2.438f)
                curveTo(14.515f, 1.481f, 15.738f, 1.153f, 16.695f, 1.706f)
                lineTo(20.159f, 3.706f)
                curveTo(21.115f, 4.258f, 21.443f, 5.481f, 20.891f, 6.438f)
                lineTo(18.015f, 11.418f)
                curveTo(18.641f, 12.466f, 19f, 13.691f, 19f, 15f)
                curveTo(19f, 18.866f, 15.866f, 22f, 12f, 22f)
                curveTo(8.134f, 22f, 5f, 18.866f, 5f, 15f)
                curveTo(5f, 13.66f, 5.376f, 12.408f, 6.029f, 11.344f)
                lineTo(3.196f, 6.438f)
                close()
                moveTo(16.656f, 9.773f)
                lineTo(19.159f, 5.438f)
                lineTo(15.695f, 3.438f)
                lineTo(13.198f, 7.762f)
                lineTo(13.419f, 8.144f)
                curveTo(14.646f, 8.396f, 15.755f, 8.97f, 16.656f, 9.773f)
                close()
                moveTo(8.392f, 3.438f)
                lineTo(11.062f, 8.062f)
                curveTo(9.671f, 8.249f, 8.41f, 8.843f, 7.402f, 9.722f)
                lineTo(4.928f, 5.438f)
                lineTo(8.392f, 3.438f)
                close()
                moveTo(12f, 20f)
                curveTo(14.761f, 20f, 17f, 17.761f, 17f, 15f)
                curveTo(17f, 12.239f, 14.761f, 10f, 12f, 10f)
                curveTo(9.239f, 10f, 7f, 12.239f, 7f, 15f)
                curveTo(7f, 17.761f, 9.239f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
