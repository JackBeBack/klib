package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) {
            return _Hourglass!!
        }
        _Hourglass = ImageVector.Builder(
            name = "Hourglass",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9.418f, 18.541f)
                curveTo(10.191f, 17.398f, 11.284f, 16f, 12f, 16f)
                curveTo(12.716f, 16f, 13.809f, 17.398f, 14.582f, 18.541f)
                curveTo(15.013f, 19.177f, 14.544f, 20f, 13.776f, 20f)
                horizontalLineTo(10.224f)
                curveTo(9.456f, 20f, 8.987f, 19.177f, 9.418f, 18.541f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 9f)
                curveTo(12.351f, 9f, 12.986f, 8.234f, 13.527f, 7.477f)
                curveTo(13.98f, 6.844f, 13.509f, 6f, 12.731f, 6f)
                lineTo(11.269f, 6f)
                curveTo(10.491f, 6f, 10.02f, 6.844f, 10.473f, 7.477f)
                curveTo(11.014f, 8.234f, 11.649f, 9f, 12f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 2f)
                curveTo(4f, 1.448f, 4.448f, 1f, 5f, 1f)
                horizontalLineTo(19f)
                curveTo(19.552f, 1f, 20f, 1.448f, 20f, 2f)
                curveTo(20f, 2.552f, 19.552f, 3f, 19f, 3f)
                horizontalLineTo(17.973f)
                curveTo(17.837f, 5.411f, 17.21f, 7.239f, 16.29f, 8.741f)
                curveTo(15.488f, 10.051f, 14.48f, 11.081f, 13.487f, 12f)
                curveTo(14.48f, 12.919f, 15.488f, 13.949f, 16.29f, 15.259f)
                curveTo(17.21f, 16.761f, 17.837f, 18.589f, 17.973f, 21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 21.448f, 20f, 22f)
                curveTo(20f, 22.552f, 19.552f, 23f, 19f, 23f)
                horizontalLineTo(5f)
                curveTo(4.448f, 23f, 4f, 22.552f, 4f, 22f)
                curveTo(4f, 21.448f, 4.448f, 21f, 5f, 21f)
                horizontalLineTo(6.027f)
                curveTo(6.163f, 18.589f, 6.79f, 16.761f, 7.71f, 15.259f)
                curveTo(8.512f, 13.949f, 9.52f, 12.919f, 10.513f, 12f)
                curveTo(9.52f, 11.081f, 8.512f, 10.051f, 7.71f, 8.741f)
                curveTo(6.79f, 7.239f, 6.163f, 5.411f, 6.027f, 3f)
                horizontalLineTo(5f)
                curveTo(4.448f, 3f, 4f, 2.552f, 4f, 2f)
                close()
                moveTo(15.969f, 21f)
                curveTo(15.838f, 18.951f, 15.305f, 17.48f, 14.585f, 16.303f)
                curveTo(13.887f, 15.165f, 12.995f, 14.264f, 12f, 13.35f)
                curveTo(11.005f, 14.264f, 10.113f, 15.165f, 9.415f, 16.303f)
                curveTo(8.695f, 17.48f, 8.162f, 18.951f, 8.031f, 21f)
                horizontalLineTo(15.969f)
                close()
                moveTo(8.031f, 3f)
                horizontalLineTo(15.969f)
                curveTo(15.838f, 5.049f, 15.305f, 6.52f, 14.585f, 7.697f)
                curveTo(13.887f, 8.835f, 12.995f, 9.736f, 12f, 10.65f)
                curveTo(11.005f, 9.736f, 10.113f, 8.835f, 9.415f, 7.697f)
                curveTo(8.695f, 6.52f, 8.162f, 5.049f, 8.031f, 3f)
                close()
            }
        }.build()

        return _Hourglass!!
    }

@Suppress("ObjectPropertyName")
private var _Hourglass: ImageVector? = null
