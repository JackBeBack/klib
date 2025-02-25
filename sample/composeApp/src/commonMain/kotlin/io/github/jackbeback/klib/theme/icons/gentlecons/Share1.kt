package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Share1: ImageVector
    get() {
        if (_Share1 != null) {
            return _Share1!!
        }
        _Share1 = ImageVector.Builder(
            name = "Share1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.649f, 0.8f)
                curveTo(18.483f, -0.73f, 16.009f, 0.081f, 16.009f, 1.993f)
                verticalLineTo(3.913f)
                curveTo(12.237f, 3.868f, 9.657f, 5.165f, 7.938f, 6.976f)
                curveTo(6.1f, 8.911f, 5.345f, 11.331f, 5.028f, 12.986f)
                curveTo(4.87f, 13.814f, 5.412f, 14.414f, 5.983f, 14.621f)
                curveTo(6.527f, 14.819f, 7.255f, 14.734f, 7.741f, 14.179f)
                curveTo(9.12f, 12.603f, 11.8f, 10.403f, 16.009f, 10.546f)
                verticalLineTo(13.007f)
                curveTo(16.009f, 14.919f, 18.483f, 15.73f, 19.649f, 14.2f)
                lineTo(23.393f, 9.29f)
                curveTo(24.202f, 8.229f, 24.202f, 6.771f, 23.393f, 5.71f)
                lineTo(19.649f, 0.8f)
                close()
                moveTo(7.482f, 11.609f)
                curveTo(9.287f, 10.034f, 11.878f, 8.556f, 16.009f, 8.556f)
                horizontalLineTo(17.021f)
                curveTo(17.579f, 8.556f, 18.032f, 9.001f, 18.032f, 9.55f)
                lineTo(18.032f, 13.007f)
                lineTo(21.775f, 8.097f)
                curveTo(22.045f, 7.743f, 22.045f, 7.257f, 21.775f, 6.903f)
                lineTo(18.032f, 1.993f)
                verticalLineTo(4.907f)
                curveTo(18.032f, 5.457f, 17.579f, 5.902f, 17.021f, 5.902f)
                horizontalLineTo(16.009f)
                curveTo(11.459f, 5.902f, 9.416f, 8.333f, 9.416f, 8.333f)
                curveTo(8.475f, 9.324f, 7.87f, 10.502f, 7.482f, 11.609f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 1.004f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1.004f, 1f, 2.347f, 1f, 4.004f)
                verticalLineTo(20.004f)
                curveTo(1f, 21.661f, 2.343f, 23.004f, 4f, 23.004f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23.004f, 23f, 21.661f, 23f, 20.004f)
                verticalLineTo(17.004f)
                curveTo(23f, 16.452f, 22.552f, 16.004f, 22f, 16.004f)
                curveTo(21.448f, 16.004f, 21f, 16.452f, 21f, 17.004f)
                verticalLineTo(20.004f)
                curveTo(21f, 20.556f, 20.552f, 21.004f, 20f, 21.004f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21.004f, 3f, 20.556f, 3f, 20.004f)
                verticalLineTo(4.004f)
                curveTo(3f, 3.452f, 3.448f, 3.004f, 4f, 3.004f)
                horizontalLineTo(7f)
                curveTo(7.552f, 3.004f, 8f, 2.556f, 8f, 2.004f)
                curveTo(8f, 1.452f, 7.552f, 1.004f, 7f, 1.004f)
                close()
            }
        }.build()

        return _Share1!!
    }

@Suppress("ObjectPropertyName")
private var _Share1: ImageVector? = null
