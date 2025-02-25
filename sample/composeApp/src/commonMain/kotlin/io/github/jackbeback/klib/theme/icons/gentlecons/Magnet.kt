package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Magnet: ImageVector
    get() {
        if (_Magnet != null) {
            return _Magnet!!
        }
        _Magnet = ImageVector.Builder(
            name = "Magnet",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 4f)
                curveTo(2f, 2.895f, 2.895f, 2f, 4f, 2f)
                horizontalLineTo(6f)
                curveTo(7.105f, 2f, 8f, 2.895f, 8f, 4f)
                lineTo(8f, 13.003f)
                curveTo(8.022f, 13.515f, 8.204f, 14.039f, 8.473f, 14.47f)
                curveTo(8.902f, 15.157f, 9.82f, 16f, 12f, 16f)
                curveTo(14.18f, 16f, 15.098f, 15.157f, 15.527f, 14.47f)
                curveTo(15.796f, 14.039f, 15.978f, 13.515f, 16f, 13.003f)
                lineTo(16f, 4f)
                curveTo(16f, 2.895f, 16.896f, 2f, 18f, 2f)
                horizontalLineTo(20f)
                curveTo(21.105f, 2f, 22f, 2.895f, 22f, 4f)
                lineTo(22f, 15.002f)
                curveTo(21.997f, 16.278f, 21.427f, 17.598f, 20.675f, 18.6f)
                curveTo(19.322f, 20.403f, 16.744f, 22f, 12f, 22f)
                curveTo(7.256f, 22f, 4.678f, 20.403f, 3.325f, 18.6f)
                curveTo(2.57f, 17.594f, 2.006f, 16.283f, 2f, 15.003f)
                curveTo(1.992f, 11.335f, 2f, 7.668f, 2f, 4f)
                close()
                moveTo(4f, 14.994f)
                curveTo(4.022f, 15.848f, 4.422f, 16.729f, 4.925f, 17.4f)
                curveTo(5.822f, 18.597f, 7.744f, 20f, 12f, 20f)
                curveTo(16.256f, 20f, 18.178f, 18.597f, 19.075f, 17.4f)
                curveTo(19.578f, 16.729f, 19.978f, 15.848f, 20f, 14.994f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                lineTo(18f, 13.006f)
                curveTo(17.993f, 13.885f, 17.684f, 14.792f, 17.223f, 15.53f)
                curveTo(16.402f, 16.843f, 14.82f, 18f, 12f, 18f)
                curveTo(9.18f, 18f, 7.598f, 16.843f, 6.777f, 15.53f)
                curveTo(6.316f, 14.793f, 6.003f, 13.88f, 6f, 13.001f)
                lineTo(6f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(14.994f)
                close()
                moveTo(18f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
                moveTo(6f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Magnet!!
    }

@Suppress("ObjectPropertyName")
private var _Magnet: ImageVector? = null
