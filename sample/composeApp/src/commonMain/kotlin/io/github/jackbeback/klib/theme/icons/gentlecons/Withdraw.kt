package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Withdraw: ImageVector
    get() {
        if (_Withdraw != null) {
            return _Withdraw!!
        }
        _Withdraw = ImageVector.Builder(
            name = "Withdraw",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(14f)
                curveTo(1f, 15.657f, 2.343f, 17f, 4f, 17f)
                horizontalLineTo(5f)
                curveTo(5.552f, 17f, 6f, 16.552f, 6f, 16f)
                curveTo(6f, 15.448f, 5.552f, 15f, 5f, 15f)
                horizontalLineTo(4f)
                curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
                lineTo(3f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
                horizontalLineTo(19f)
                curveTo(18.448f, 15f, 18f, 15.448f, 18f, 16f)
                curveTo(18f, 16.552f, 18.448f, 17f, 19f, 17f)
                horizontalLineTo(20f)
                curveTo(21.657f, 17f, 23f, 15.657f, 23f, 14f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 6f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                lineTo(11f, 16.407f)
                lineTo(9.707f, 17.7f)
                curveTo(9.317f, 18.09f, 8.683f, 18.09f, 8.293f, 17.7f)
                curveTo(7.902f, 17.309f, 7.902f, 16.676f, 8.293f, 16.286f)
                lineTo(11.292f, 13.292f)
                curveTo(11.683f, 12.902f, 12.316f, 12.903f, 12.706f, 13.293f)
                lineTo(15.705f, 16.292f)
                curveTo(16.096f, 16.683f, 16.096f, 17.316f, 15.705f, 17.706f)
                curveTo(15.314f, 18.097f, 14.681f, 18.097f, 14.291f, 17.706f)
                lineTo(13f, 16.416f)
                lineTo(13f, 22f)
                close()
            }
        }.build()

        return _Withdraw!!
    }

@Suppress("ObjectPropertyName")
private var _Withdraw: ImageVector? = null
