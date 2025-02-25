package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Traffic: ImageVector
    get() {
        if (_Traffic != null) {
            return _Traffic!!
        }
        _Traffic = ImageVector.Builder(
            name = "Traffic",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 18f)
                curveTo(14.761f, 18f, 17f, 15.761f, 17f, 13f)
                curveTo(17f, 10.239f, 14.761f, 8f, 12f, 8f)
                curveTo(9.239f, 8f, 7f, 10.239f, 7f, 13f)
                curveTo(7f, 15.761f, 9.239f, 18f, 12f, 18f)
                close()
                moveTo(12f, 16f)
                curveTo(13.657f, 16f, 15f, 14.657f, 15f, 13f)
                curveTo(15f, 11.343f, 13.657f, 10f, 12f, 10f)
                curveTo(10.343f, 10f, 9f, 11.343f, 9f, 13f)
                curveTo(9f, 14.657f, 10.343f, 16f, 12f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 3f)
                curveTo(6.91f, 3f, 5.823f, 4.025f, 6.014f, 5.166f)
                curveTo(5.155f, 5.465f, 4.474f, 6.143f, 4.171f, 7f)
                horizontalLineTo(1f)
                curveTo(0.305f, 7f, -0.187f, 7.726f, 0.072f, 8.371f)
                lineTo(4.007f, 18.211f)
                curveTo(4.115f, 19.769f, 5.414f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.586f, 21f, 19.885f, 19.769f, 19.993f, 18.211f)
                lineTo(23.928f, 8.371f)
                curveTo(24.187f, 7.726f, 23.695f, 7f, 23f, 7f)
                horizontalLineTo(19.829f)
                curveTo(19.526f, 6.143f, 18.845f, 5.465f, 17.986f, 5.166f)
                curveTo(18.177f, 4.025f, 17.09f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                close()
                moveTo(17f, 7f)
                horizontalLineTo(7f)
                curveTo(6.448f, 7f, 6f, 7.448f, 6f, 8f)
                verticalLineTo(18f)
                curveTo(6f, 18.552f, 6.448f, 19f, 7f, 19f)
                horizontalLineTo(17f)
                curveTo(17.552f, 19f, 18f, 18.552f, 18f, 18f)
                verticalLineTo(8f)
                curveTo(18f, 7.448f, 17.552f, 7f, 17f, 7f)
                close()
                moveTo(2.477f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(12.807f)
                lineTo(2.477f, 9f)
                close()
                moveTo(20f, 9f)
                verticalLineTo(12.807f)
                lineTo(21.523f, 9f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Traffic!!
    }

@Suppress("ObjectPropertyName")
private var _Traffic: ImageVector? = null
