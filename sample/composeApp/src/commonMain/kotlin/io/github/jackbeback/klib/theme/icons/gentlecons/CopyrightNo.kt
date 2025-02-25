package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CopyrightNo: ImageVector
    get() {
        if (_CopyrightNo != null) {
            return _CopyrightNo!!
        }
        _CopyrightNo = ImageVector.Builder(
            name = "CopyrightNo",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(14.123f, 20.993f, 16.074f, 20.257f, 17.613f, 19.027f)
                lineTo(15.537f, 16.951f)
                curveTo(15.443f, 17.056f, 15.327f, 17.169f, 15.187f, 17.281f)
                curveTo(14.71f, 17.663f, 13.993f, 18f, 13f, 18f)
                lineTo(11f, 18f)
                curveTo(9.343f, 18f, 8f, 16.657f, 8f, 15f)
                verticalLineTo(9.414f)
                lineTo(4.973f, 6.387f)
                curveTo(3.743f, 7.926f, 3.007f, 9.877f, 3.007f, 12f)
                close()
                moveTo(6.387f, 4.973f)
                curveTo(7.926f, 3.743f, 9.877f, 3.007f, 12f, 3.007f)
                curveTo(16.967f, 3.007f, 20.993f, 7.033f, 20.993f, 12f)
                curveTo(20.993f, 14.123f, 20.257f, 16.074f, 19.027f, 17.613f)
                lineTo(10.063f, 8.649f)
                curveTo(10.205f, 8.27f, 10.571f, 8f, 11f, 8f)
                horizontalLineTo(13f)
                curveTo(13.507f, 8f, 13.79f, 8.162f, 13.938f, 8.281f)
                curveTo(14.049f, 8.37f, 14.108f, 8.455f, 14.119f, 8.473f)
                curveTo(14.374f, 8.948f, 14.962f, 9.137f, 15.447f, 8.894f)
                curveTo(15.931f, 8.653f, 16.136f, 8.034f, 15.893f, 7.551f)
                curveTo(15.839f, 7.442f, 15.771f, 7.341f, 15.698f, 7.244f)
                curveTo(15.586f, 7.094f, 15.419f, 6.905f, 15.187f, 6.719f)
                curveTo(14.71f, 6.338f, 13.993f, 6f, 13f, 6f)
                horizontalLineTo(11f)
                curveTo(10.022f, 6f, 9.154f, 6.468f, 8.606f, 7.192f)
                lineTo(6.387f, 4.973f)
                close()
                moveTo(10f, 11.414f)
                verticalLineTo(15f)
                curveTo(10f, 15.552f, 10.448f, 16f, 11f, 16f)
                lineTo(13f, 16f)
                curveTo(13.507f, 16f, 13.79f, 15.837f, 13.938f, 15.719f)
                curveTo(14.042f, 15.636f, 14.101f, 15.555f, 14.116f, 15.531f)
                lineTo(10f, 11.414f)
                close()
            }
        }.build()

        return _CopyrightNo!!
    }

@Suppress("ObjectPropertyName")
private var _CopyrightNo: ImageVector? = null
