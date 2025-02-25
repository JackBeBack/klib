package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Billiards: ImageVector
    get() {
        if (_Billiards != null) {
            return _Billiards!!
        }
        _Billiards = ImageVector.Builder(
            name = "Billiards",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.236f, 12f)
                curveTo(14.711f, 11.469f, 15f, 10.768f, 15f, 10f)
                curveTo(15f, 8.343f, 13.657f, 7f, 12f, 7f)
                curveTo(10.343f, 7f, 9f, 8.343f, 9f, 10f)
                curveTo(9f, 10.768f, 9.289f, 11.469f, 9.764f, 12f)
                curveTo(9.289f, 12.531f, 9f, 13.232f, 9f, 14f)
                curveTo(9f, 15.657f, 10.343f, 17f, 12f, 17f)
                curveTo(13.657f, 17f, 15f, 15.657f, 15f, 14f)
                curveTo(15f, 13.232f, 14.711f, 12.531f, 14.236f, 12f)
                close()
                moveTo(12.152f, 12.996f)
                curveTo(12.051f, 13.001f, 11.949f, 13.001f, 11.848f, 12.996f)
                curveTo(11.359f, 13.069f, 10.985f, 13.491f, 10.985f, 14f)
                curveTo(10.985f, 14.561f, 11.439f, 15.015f, 12f, 15.015f)
                curveTo(12.561f, 15.015f, 13.015f, 14.561f, 13.015f, 14f)
                curveTo(13.015f, 13.491f, 12.641f, 13.069f, 12.152f, 12.996f)
                close()
                moveTo(11.848f, 11.004f)
                curveTo(11.949f, 10.999f, 12.051f, 10.999f, 12.152f, 11.004f)
                curveTo(12.641f, 10.931f, 13.015f, 10.509f, 13.015f, 10f)
                curveTo(13.015f, 9.439f, 12.561f, 8.985f, 12f, 8.985f)
                curveTo(11.439f, 8.985f, 10.985f, 9.439f, 10.985f, 10f)
                curveTo(10.985f, 10.509f, 11.359f, 10.931f, 11.848f, 11.004f)
                close()
            }
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
                curveTo(3.007f, 16.966f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.966f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _Billiards!!
    }

@Suppress("ObjectPropertyName")
private var _Billiards: ImageVector? = null
