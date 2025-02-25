package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.EyeShow: ImageVector
    get() {
        if (_EyeShow != null) {
            return _EyeShow!!
        }
        _EyeShow = ImageVector.Builder(
            name = "EyeShow",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.994f, 15.5f)
                curveTo(13.927f, 15.5f, 15.494f, 13.933f, 15.494f, 12f)
                curveTo(15.494f, 10.067f, 13.927f, 8.5f, 11.994f, 8.5f)
                curveTo(10.061f, 8.5f, 8.494f, 10.067f, 8.494f, 12f)
                curveTo(8.494f, 13.933f, 10.061f, 15.5f, 11.994f, 15.5f)
                close()
                moveTo(11.994f, 13.494f)
                curveTo(11.169f, 13.494f, 10.5f, 12.825f, 10.5f, 12f)
                curveTo(10.5f, 11.175f, 11.169f, 10.506f, 11.994f, 10.506f)
                curveTo(12.82f, 10.506f, 13.489f, 11.175f, 13.489f, 12f)
                curveTo(13.489f, 12.825f, 12.82f, 13.494f, 11.994f, 13.494f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 5f)
                curveTo(7.189f, 5f, 3.917f, 7.609f, 2.189f, 9.48f)
                curveTo(0.857f, 10.922f, 0.857f, 13.078f, 2.189f, 14.52f)
                curveTo(3.917f, 16.391f, 7.189f, 19f, 12f, 19f)
                curveTo(16.811f, 19f, 20.083f, 16.391f, 21.811f, 14.52f)
                curveTo(23.143f, 13.078f, 23.143f, 10.922f, 21.811f, 9.48f)
                curveTo(20.083f, 7.609f, 16.811f, 5f, 12f, 5f)
                close()
                moveTo(3.659f, 10.837f)
                curveTo(5.188f, 9.18f, 7.967f, 7f, 12f, 7f)
                curveTo(16.033f, 7f, 18.812f, 9.18f, 20.341f, 10.837f)
                curveTo(20.966f, 11.513f, 20.966f, 12.487f, 20.341f, 13.163f)
                curveTo(18.812f, 14.82f, 16.033f, 17f, 12f, 17f)
                curveTo(7.967f, 17f, 5.188f, 14.82f, 3.659f, 13.163f)
                curveTo(3.034f, 12.487f, 3.034f, 11.513f, 3.659f, 10.837f)
                close()
            }
        }.build()

        return _EyeShow!!
    }

@Suppress("ObjectPropertyName")
private var _EyeShow: ImageVector? = null
