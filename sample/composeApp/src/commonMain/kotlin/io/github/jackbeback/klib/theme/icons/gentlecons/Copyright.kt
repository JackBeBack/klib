package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Copyright: ImageVector
    get() {
        if (_Copyright != null) {
            return _Copyright!!
        }
        _Copyright = ImageVector.Builder(
            name = "Copyright",
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
                curveTo(15.771f, 16.659f, 15.839f, 16.557f, 15.894f, 16.448f)
                curveTo(16.138f, 15.96f, 15.935f, 15.35f, 15.447f, 15.106f)
                curveTo(14.962f, 14.863f, 14.374f, 15.052f, 14.119f, 15.527f)
                curveTo(14.108f, 15.545f, 14.049f, 15.63f, 13.938f, 15.719f)
                curveTo(13.79f, 15.837f, 13.507f, 16f, 13f, 16f)
                lineTo(11f, 16f)
                curveTo(10.448f, 16f, 10f, 15.552f, 10f, 15f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.033f, 7.033f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 16.967f, 16.967f, 20.993f, 12f, 20.993f)
                close()
            }
        }.build()

        return _Copyright!!
    }

@Suppress("ObjectPropertyName")
private var _Copyright: ImageVector? = null
