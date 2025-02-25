package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Withdraw1: ImageVector
    get() {
        if (_Withdraw1 != null) {
            return _Withdraw1!!
        }
        _Withdraw1 = ImageVector.Builder(
            name = "Withdraw1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 9f)
                curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
                verticalLineTo(15.586f)
                lineTo(9.707f, 14.293f)
                curveTo(9.317f, 13.902f, 8.683f, 13.902f, 8.293f, 14.293f)
                curveTo(7.902f, 14.683f, 7.902f, 15.316f, 8.293f, 15.707f)
                lineTo(11.292f, 18.706f)
                curveTo(11.682f, 19.097f, 12.315f, 19.097f, 12.705f, 18.707f)
                lineTo(15.705f, 15.714f)
                curveTo(16.096f, 15.323f, 16.096f, 14.69f, 15.705f, 14.3f)
                curveTo(15.314f, 13.909f, 14.681f, 13.909f, 14.291f, 14.3f)
                lineTo(13f, 15.59f)
                verticalLineTo(10f)
                curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 1f)
                curveTo(22.657f, 1f, 24f, 2.343f, 24f, 4f)
                verticalLineTo(8f)
                curveTo(24f, 9.657f, 22.657f, 11f, 21f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                curveTo(19f, 21.657f, 17.657f, 23f, 16f, 23f)
                horizontalLineTo(8f)
                curveTo(6.343f, 23f, 5f, 21.657f, 5f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                curveTo(1.343f, 11f, 0f, 9.657f, 0f, 8f)
                verticalLineTo(4f)
                curveTo(0f, 2.343f, 1.343f, 1f, 3f, 1f)
                horizontalLineTo(21f)
                close()
                moveTo(22f, 8f)
                curveTo(22f, 8.552f, 21.552f, 9f, 21f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
                horizontalLineTo(4f)
                curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
                curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
                verticalLineTo(4f)
                curveTo(2f, 3.448f, 2.448f, 3f, 3f, 3f)
                horizontalLineTo(21f)
                curveTo(21.552f, 3f, 22f, 3.448f, 22f, 4f)
                verticalLineTo(8f)
                close()
                moveTo(7f, 7f)
                verticalLineTo(20f)
                curveTo(7f, 20.552f, 7.448f, 21f, 8f, 21f)
                horizontalLineTo(16f)
                curveTo(16.552f, 21f, 17f, 20.552f, 17f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Withdraw1!!
    }

@Suppress("ObjectPropertyName")
private var _Withdraw1: ImageVector? = null
