package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Coins: ImageVector
    get() {
        if (_Coins != null) {
            return _Coins!!
        }
        _Coins = ImageVector.Builder(
            name = "Coins",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(11.866f, 1f, 15f, 2.567f, 15f, 4.5f)
                verticalLineTo(6f)
                curveTo(15f, 6.552f, 14.552f, 7f, 14f, 7f)
                horizontalLineTo(13f)
                curveTo(11.729f, 7.648f, 9.959f, 8f, 8f, 8f)
                curveTo(6.041f, 8f, 4.271f, 7.648f, 3f, 7f)
                verticalLineTo(8.5f)
                curveTo(3f, 9.226f, 4.718f, 9.831f, 7.001f, 9.97f)
                curveTo(7.552f, 10.004f, 8f, 10.448f, 8f, 11f)
                curveTo(8f, 11.552f, 7.552f, 12.004f, 7.001f, 11.969f)
                curveTo(5.443f, 11.869f, 4.05f, 11.536f, 3f, 11f)
                verticalLineTo(12.5f)
                curveTo(3f, 13.226f, 4.718f, 13.831f, 7.001f, 13.97f)
                curveTo(7.552f, 14.004f, 8f, 14.448f, 8f, 15f)
                curveTo(8f, 15.552f, 7.551f, 16.004f, 7f, 15.965f)
                curveTo(3.608f, 15.722f, 1f, 14.263f, 1f, 12.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 2.567f, 4.134f, 1f, 8f, 1f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 3.672f, 5.239f, 3f, 8f, 3f)
                curveTo(10.761f, 3f, 13f, 3.672f, 13f, 4.5f)
                curveTo(13f, 5.328f, 10.761f, 6f, 8f, 6f)
                curveTo(5.239f, 6f, 3f, 5.328f, 3f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 11.5f)
                curveTo(23f, 9.567f, 19.866f, 8f, 16f, 8f)
                curveTo(12.134f, 8f, 9f, 9.567f, 9f, 11.5f)
                verticalLineTo(19.5f)
                curveTo(9f, 21.433f, 12.134f, 23f, 16f, 23f)
                curveTo(19.866f, 23f, 23f, 21.433f, 23f, 19.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(11f, 19.5f)
                curveTo(11f, 20.328f, 13.239f, 21f, 16f, 21f)
                curveTo(18.761f, 21f, 21f, 20.328f, 21f, 19.5f)
                verticalLineTo(18f)
                curveTo(19.729f, 18.648f, 17.959f, 19f, 16f, 19f)
                curveTo(14.041f, 19f, 12.271f, 18.648f, 11f, 18f)
                verticalLineTo(19.5f)
                close()
                moveTo(16f, 17f)
                curveTo(13.239f, 17f, 11f, 16.328f, 11f, 15.5f)
                verticalLineTo(14f)
                curveTo(12.271f, 14.648f, 14.041f, 15f, 16f, 15f)
                curveTo(17.959f, 15f, 19.729f, 14.648f, 21f, 14f)
                verticalLineTo(15.5f)
                curveTo(21f, 16.328f, 18.761f, 17f, 16f, 17f)
                close()
                moveTo(16f, 10f)
                curveTo(13.239f, 10f, 11f, 10.672f, 11f, 11.5f)
                curveTo(11f, 12.328f, 13.239f, 13f, 16f, 13f)
                curveTo(18.761f, 13f, 21f, 12.328f, 21f, 11.5f)
                curveTo(21f, 10.672f, 18.761f, 10f, 16f, 10f)
                close()
            }
        }.build()

        return _Coins!!
    }

@Suppress("ObjectPropertyName")
private var _Coins: ImageVector? = null
