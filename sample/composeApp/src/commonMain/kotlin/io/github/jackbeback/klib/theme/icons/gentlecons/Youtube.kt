package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Youtube: ImageVector
    get() {
        if (_Youtube != null) {
            return _Youtube!!
        }
        _Youtube = ImageVector.Builder(
            name = "Youtube",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.496f, 7.132f)
                curveTo(9.187f, 6.955f, 8.806f, 6.956f, 8.498f, 7.135f)
                curveTo(8.19f, 7.314f, 8f, 7.644f, 8f, 8f)
                verticalLineTo(16f)
                curveTo(8f, 16.357f, 8.19f, 16.686f, 8.498f, 16.865f)
                curveTo(8.806f, 17.044f, 9.187f, 17.045f, 9.496f, 16.868f)
                lineTo(16.496f, 12.868f)
                curveTo(16.808f, 12.69f, 17f, 12.359f, 17f, 12f)
                curveTo(17f, 11.641f, 16.808f, 11.31f, 16.496f, 11.132f)
                lineTo(9.496f, 7.132f)
                close()
                moveTo(13.984f, 12f)
                lineTo(10f, 14.277f)
                verticalLineTo(9.723f)
                lineTo(13.984f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                curveTo(0f, 8.25f, 0f, 6.375f, 0.955f, 5.061f)
                curveTo(1.263f, 4.637f, 1.637f, 4.263f, 2.061f, 3.955f)
                curveTo(3.375f, 3f, 5.25f, 3f, 9f, 3f)
                horizontalLineTo(15f)
                curveTo(18.75f, 3f, 20.625f, 3f, 21.939f, 3.955f)
                curveTo(22.363f, 4.263f, 22.737f, 4.637f, 23.045f, 5.061f)
                curveTo(24f, 6.375f, 24f, 8.25f, 24f, 12f)
                curveTo(24f, 15.75f, 24f, 17.625f, 23.045f, 18.939f)
                curveTo(22.737f, 19.363f, 22.363f, 19.737f, 21.939f, 20.045f)
                curveTo(20.625f, 21f, 18.75f, 21f, 15f, 21f)
                horizontalLineTo(9f)
                curveTo(5.25f, 21f, 3.375f, 21f, 2.061f, 20.045f)
                curveTo(1.637f, 19.737f, 1.263f, 19.363f, 0.955f, 18.939f)
                curveTo(0f, 17.625f, 0f, 15.75f, 0f, 12f)
                close()
                moveTo(9f, 5f)
                horizontalLineTo(15f)
                curveTo(16.919f, 5f, 18.198f, 5.003f, 19.167f, 5.108f)
                curveTo(20.099f, 5.209f, 20.504f, 5.384f, 20.763f, 5.573f)
                curveTo(21.018f, 5.758f, 21.242f, 5.982f, 21.427f, 6.237f)
                curveTo(21.615f, 6.496f, 21.791f, 6.901f, 21.892f, 7.833f)
                curveTo(21.997f, 8.802f, 22f, 10.081f, 22f, 12f)
                curveTo(22f, 13.919f, 21.997f, 15.198f, 21.892f, 16.167f)
                curveTo(21.791f, 17.099f, 21.615f, 17.504f, 21.427f, 17.763f)
                curveTo(21.242f, 18.018f, 21.018f, 18.242f, 20.763f, 18.427f)
                curveTo(20.504f, 18.615f, 20.099f, 18.791f, 19.167f, 18.892f)
                curveTo(18.198f, 18.997f, 16.919f, 19f, 15f, 19f)
                horizontalLineTo(9f)
                curveTo(7.081f, 19f, 5.802f, 18.997f, 4.833f, 18.892f)
                curveTo(3.901f, 18.791f, 3.496f, 18.615f, 3.237f, 18.427f)
                curveTo(2.982f, 18.242f, 2.758f, 18.018f, 2.573f, 17.763f)
                curveTo(2.384f, 17.504f, 2.209f, 17.099f, 2.108f, 16.167f)
                curveTo(2.003f, 15.198f, 2f, 13.919f, 2f, 12f)
                curveTo(2f, 10.081f, 2.003f, 8.802f, 2.108f, 7.833f)
                curveTo(2.209f, 6.901f, 2.384f, 6.496f, 2.573f, 6.237f)
                curveTo(2.758f, 5.982f, 2.982f, 5.758f, 3.237f, 5.573f)
                curveTo(3.496f, 5.384f, 3.901f, 5.209f, 4.833f, 5.108f)
                curveTo(5.802f, 5.003f, 7.081f, 5f, 9f, 5f)
                close()
            }
        }.build()

        return _Youtube!!
    }

@Suppress("ObjectPropertyName")
private var _Youtube: ImageVector? = null
