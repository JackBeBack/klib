package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Shop: ImageVector
    get() {
        if (_Shop != null) {
            return _Shop!!
        }
        _Shop = ImageVector.Builder(
            name = "Shop",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.132f, 1f)
                curveTo(4.079f, 1f, 3.102f, 1.553f, 2.56f, 2.457f)
                lineTo(0.616f, 5.697f)
                curveTo(0.178f, 6.426f, 0.012f, 7.425f, 0.509f, 8.32f)
                curveTo(0.79f, 8.826f, 1.275f, 9.552f, 2f, 10.12f)
                verticalLineTo(20f)
                curveTo(2f, 21.657f, 3.343f, 23f, 5f, 23f)
                horizontalLineTo(8f)
                curveTo(9.105f, 23f, 10f, 22.105f, 10f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                curveTo(14f, 22.105f, 14.895f, 23f, 16f, 23f)
                horizontalLineTo(19f)
                curveTo(20.657f, 23f, 22f, 21.657f, 22f, 20f)
                verticalLineTo(10.12f)
                curveTo(22.725f, 9.552f, 23.21f, 8.826f, 23.491f, 8.32f)
                curveTo(23.988f, 7.425f, 23.822f, 6.426f, 23.384f, 5.697f)
                lineTo(21.44f, 2.457f)
                curveTo(20.898f, 1.553f, 19.921f, 1f, 18.868f, 1f)
                horizontalLineTo(5.132f)
                close()
                moveTo(20f, 10.97f)
                curveTo(19.839f, 10.99f, 19.673f, 11f, 19.5f, 11f)
                curveTo(18.126f, 11f, 17.113f, 10.322f, 16.436f, 9.605f)
                curveTo(16.263f, 9.421f, 16.108f, 9.231f, 15.97f, 9.043f)
                curveTo(15.217f, 9.988f, 13.954f, 11f, 12f, 11f)
                curveTo(10.046f, 11f, 8.783f, 9.988f, 8.03f, 9.043f)
                curveTo(7.892f, 9.231f, 7.737f, 9.421f, 7.564f, 9.605f)
                curveTo(6.887f, 10.322f, 5.874f, 11f, 4.5f, 11f)
                curveTo(4.328f, 11f, 4.161f, 10.99f, 4f, 10.97f)
                verticalLineTo(20f)
                curveTo(4f, 20.552f, 4.448f, 21f, 5f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                curveTo(8f, 13.895f, 8.895f, 13f, 10f, 13f)
                horizontalLineTo(14f)
                curveTo(15.105f, 13f, 16f, 13.895f, 16f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(10.97f)
                close()
                moveTo(4.275f, 3.486f)
                curveTo(4.456f, 3.184f, 4.781f, 3f, 5.132f, 3f)
                horizontalLineTo(18.868f)
                curveTo(19.219f, 3f, 19.544f, 3.184f, 19.725f, 3.486f)
                lineTo(21.669f, 6.726f)
                curveTo(21.832f, 6.998f, 21.813f, 7.223f, 21.743f, 7.349f)
                curveTo(21.285f, 8.173f, 20.549f, 9f, 19.5f, 9f)
                curveTo(18.845f, 9f, 18.323f, 8.69f, 17.891f, 8.232f)
                curveTo(17.451f, 7.765f, 17.166f, 7.204f, 17.028f, 6.884f)
                curveTo(16.811f, 6.38f, 16.333f, 6.214f, 16.003f, 6.212f)
                curveTo(15.674f, 6.211f, 15.198f, 6.372f, 14.975f, 6.868f)
                curveTo(14.67f, 7.548f, 13.798f, 9f, 12f, 9f)
                curveTo(10.202f, 9f, 9.33f, 7.548f, 9.025f, 6.868f)
                curveTo(8.802f, 6.372f, 8.326f, 6.211f, 7.997f, 6.212f)
                curveTo(7.667f, 6.214f, 7.189f, 6.38f, 6.972f, 6.884f)
                curveTo(6.834f, 7.204f, 6.549f, 7.765f, 6.109f, 8.232f)
                curveTo(5.677f, 8.69f, 5.155f, 9f, 4.5f, 9f)
                curveTo(3.451f, 9f, 2.715f, 8.173f, 2.257f, 7.349f)
                curveTo(2.187f, 7.223f, 2.168f, 6.998f, 2.331f, 6.726f)
                lineTo(4.275f, 3.486f)
                close()
            }
        }.build()

        return _Shop!!
    }

@Suppress("ObjectPropertyName")
private var _Shop: ImageVector? = null
