package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Football: ImageVector
    get() {
        if (_Football != null) {
            return _Football!!
        }
        _Football = ImageVector.Builder(
            name = "Football",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(3.027f, 12.605f)
                curveTo(3.087f, 13.506f, 3.279f, 14.372f, 3.586f, 15.181f)
                lineTo(7.663f, 15.922f)
                lineTo(8.783f, 14.802f)
                lineTo(7.255f, 11.745f)
                lineTo(6f, 11.118f)
                lineTo(3.027f, 12.605f)
                close()
                moveTo(4.84f, 17.442f)
                curveTo(5.748f, 18.635f, 6.949f, 19.595f, 8.334f, 20.214f)
                lineTo(7.301f, 17.889f)
                lineTo(4.84f, 17.442f)
                close()
                moveTo(10.836f, 20.918f)
                curveTo(11.217f, 20.968f, 11.605f, 20.993f, 12f, 20.993f)
                curveTo(12.394f, 20.993f, 12.783f, 20.968f, 13.164f, 20.918f)
                lineTo(14.807f, 17.222f)
                lineTo(13.586f, 16f)
                horizontalLineTo(10.414f)
                lineTo(9.193f, 17.222f)
                lineTo(10.836f, 20.918f)
                close()
                moveTo(15.666f, 20.214f)
                curveTo(17.051f, 19.595f, 18.252f, 18.635f, 19.16f, 17.442f)
                lineTo(16.699f, 17.889f)
                lineTo(15.666f, 20.214f)
                close()
                moveTo(3.167f, 10.298f)
                lineTo(4.87f, 9.447f)
                lineTo(4.414f, 7.168f)
                curveTo(3.814f, 8.107f, 3.385f, 9.165f, 3.167f, 10.298f)
                close()
                moveTo(6.068f, 5.24f)
                lineTo(6.885f, 9.324f)
                lineTo(7.894f, 9.829f)
                lineTo(11f, 7.5f)
                verticalLineTo(6.118f)
                lineTo(7.357f, 4.296f)
                curveTo(6.899f, 4.573f, 6.468f, 4.889f, 6.068f, 5.24f)
                close()
                moveTo(9.794f, 3.279f)
                lineTo(12f, 4.382f)
                lineTo(14.206f, 3.279f)
                curveTo(13.5f, 3.101f, 12.761f, 3.007f, 12f, 3.007f)
                curveTo(11.239f, 3.007f, 10.5f, 3.101f, 9.794f, 3.279f)
                close()
                moveTo(16.643f, 4.296f)
                lineTo(13f, 6.118f)
                verticalLineTo(7.5f)
                lineTo(16.106f, 9.829f)
                lineTo(17.115f, 9.324f)
                lineTo(17.932f, 5.24f)
                curveTo(17.532f, 4.889f, 17.101f, 4.573f, 16.643f, 4.296f)
                close()
                moveTo(19.586f, 7.168f)
                lineTo(19.13f, 9.447f)
                lineTo(20.832f, 10.298f)
                curveTo(20.615f, 9.165f, 20.185f, 8.107f, 19.586f, 7.168f)
                close()
                moveTo(20.973f, 12.605f)
                lineTo(18f, 11.118f)
                lineTo(16.745f, 11.745f)
                lineTo(15.217f, 14.802f)
                lineTo(16.337f, 15.922f)
                lineTo(20.414f, 15.181f)
                curveTo(20.72f, 14.372f, 20.913f, 13.506f, 20.973f, 12.605f)
                close()
                moveTo(9.268f, 11.299f)
                lineTo(12f, 9.25f)
                lineTo(14.732f, 11.299f)
                lineTo(13.382f, 14f)
                horizontalLineTo(10.618f)
                lineTo(9.268f, 11.299f)
                close()
            }
        }.build()

        return _Football!!
    }

@Suppress("ObjectPropertyName")
private var _Football: ImageVector? = null
