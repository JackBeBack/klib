package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.TimeSuccess: ImageVector
    get() {
        if (_TimeSuccess != null) {
            return _TimeSuccess!!
        }
        _TimeSuccess = ImageVector.Builder(
            name = "TimeSuccess",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 12f)
                curveTo(23f, 12.354f, 22.983f, 12.705f, 22.95f, 13.051f)
                curveTo(22.384f, 12.484f, 21.72f, 12.014f, 20.987f, 11.667f)
                curveTo(20.812f, 6.855f, 16.855f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                curveTo(3.007f, 16.855f, 6.855f, 20.812f, 11.667f, 20.987f)
                curveTo(12.014f, 21.72f, 12.484f, 22.384f, 13.051f, 22.95f)
                curveTo(12.705f, 22.983f, 12.354f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 11.881f)
                lineTo(13.843f, 12.368f)
                curveTo(13.285f, 12.78f, 12.79f, 13.274f, 12.377f, 13.831f)
                lineTo(11.517f, 13.335f)
                curveTo(11.344f, 13.234f, 11.212f, 13.09f, 11.127f, 12.924f)
                curveTo(11f, 12.727f, 11f, 12.467f, 11f, 12.467f)
                verticalLineTo(6f)
                curveTo(11f, 5.448f, 11.448f, 5f, 12f, 5f)
                curveTo(12.552f, 5f, 13f, 5.448f, 13f, 6f)
                verticalLineTo(11.881f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15.293f, 17.707f)
                curveTo(15.683f, 17.317f, 16.317f, 17.317f, 16.707f, 17.707f)
                lineTo(17.348f, 18.348f)
                lineTo(19.247f, 16.449f)
                curveTo(19.638f, 16.059f, 20.271f, 16.059f, 20.662f, 16.449f)
                curveTo(21.052f, 16.84f, 21.052f, 17.473f, 20.662f, 17.863f)
                lineTo(18.121f, 20.404f)
                curveTo(18.035f, 20.49f, 17.937f, 20.557f, 17.832f, 20.605f)
                curveTo(17.449f, 20.829f, 16.949f, 20.777f, 16.62f, 20.449f)
                lineTo(15.293f, 19.121f)
                curveTo(14.902f, 18.731f, 14.902f, 18.098f, 15.293f, 17.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 24f)
                curveTo(21.314f, 24f, 24f, 21.314f, 24f, 18f)
                curveTo(24f, 14.686f, 21.314f, 12f, 18f, 12f)
                curveTo(14.686f, 12f, 12f, 14.686f, 12f, 18f)
                curveTo(12f, 21.314f, 14.686f, 24f, 18f, 24f)
                close()
                moveTo(18f, 22.018f)
                curveTo(15.781f, 22.018f, 13.982f, 20.219f, 13.982f, 18f)
                curveTo(13.982f, 15.781f, 15.781f, 13.982f, 18f, 13.982f)
                curveTo(20.219f, 13.982f, 22.018f, 15.781f, 22.018f, 18f)
                curveTo(22.018f, 20.219f, 20.219f, 22.018f, 18f, 22.018f)
                close()
            }
        }.build()

        return _TimeSuccess!!
    }

@Suppress("ObjectPropertyName")
private var _TimeSuccess: ImageVector? = null
