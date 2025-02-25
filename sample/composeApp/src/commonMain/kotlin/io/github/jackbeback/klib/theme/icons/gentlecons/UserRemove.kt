package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.UserRemove: ImageVector
    get() {
        if (_UserRemove != null) {
            return _UserRemove!!
        }
        _UserRemove = ImageVector.Builder(
            name = "UserRemove",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17f, 6.5f)
                curveTo(17f, 9.538f, 14.761f, 12f, 12f, 12f)
                curveTo(9.239f, 12f, 7f, 9.538f, 7f, 6.5f)
                curveTo(7f, 3.462f, 9.239f, 1f, 12f, 1f)
                curveTo(14.761f, 1f, 17f, 3.462f, 17f, 6.5f)
                close()
                moveTo(9f, 6.5f)
                curveTo(9f, 8.323f, 10.343f, 9.8f, 12f, 9.8f)
                curveTo(13.657f, 9.8f, 15f, 8.323f, 15f, 6.5f)
                curveTo(15f, 4.677f, 13.657f, 3.2f, 12f, 3.2f)
                curveTo(10.343f, 3.2f, 9f, 4.677f, 9f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.676f, 14.995f)
                curveTo(10.787f, 14.968f, 10.194f, 14.828f, 9.726f, 14.645f)
                curveTo(9.264f, 14.464f, 8.898f, 14.237f, 8.417f, 13.938f)
                curveTo(8.323f, 13.88f, 8.224f, 13.818f, 8.12f, 13.754f)
                curveTo(7.076f, 13.113f, 5.735f, 13.262f, 4.864f, 14.142f)
                curveTo(4.484f, 14.526f, 4.04f, 15.022f, 3.685f, 15.563f)
                curveTo(3.346f, 16.078f, 3f, 16.764f, 3f, 17.5f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(13.101f)
                curveTo(12.515f, 22.426f, 12.03f, 21.75f, 11.674f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(17.5f)
                curveTo(5f, 17.355f, 5.085f, 17.073f, 5.356f, 16.661f)
                curveTo(5.61f, 16.275f, 5.954f, 15.884f, 6.286f, 15.549f)
                curveTo(6.494f, 15.338f, 6.811f, 15.297f, 7.074f, 15.459f)
                curveTo(7.157f, 15.509f, 7.241f, 15.562f, 7.327f, 15.616f)
                curveTo(7.809f, 15.917f, 8.349f, 16.254f, 8.998f, 16.508f)
                curveTo(9.588f, 16.738f, 10.252f, 16.897f, 11.076f, 16.965f)
                curveTo(11.179f, 16.27f, 11.384f, 15.608f, 11.676f, 14.995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 17f)
                curveTo(15.448f, 17f, 15f, 17.448f, 15f, 18f)
                curveTo(15f, 18.552f, 15.448f, 19f, 16f, 19f)
                horizontalLineTo(20f)
                curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
                curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
                horizontalLineTo(16f)
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

        return _UserRemove!!
    }

@Suppress("ObjectPropertyName")
private var _UserRemove: ImageVector? = null
