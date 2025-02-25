package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Transactions: ImageVector
    get() {
        if (_Transactions != null) {
            return _Transactions!!
        }
        _Transactions = ImageVector.Builder(
            name = "Transactions",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.293f, 3.293f)
                curveTo(15.683f, 2.902f, 16.317f, 2.902f, 16.707f, 3.293f)
                lineTo(22.366f, 8.951f)
                curveTo(23.122f, 9.707f, 22.586f, 11f, 21.517f, 11f)
                horizontalLineTo(2f)
                curveTo(1.448f, 11f, 1f, 10.552f, 1f, 10f)
                curveTo(1f, 9.448f, 1.448f, 9f, 2f, 9f)
                horizontalLineTo(19.586f)
                lineTo(15.293f, 4.707f)
                curveTo(14.902f, 4.317f, 14.902f, 3.683f, 15.293f, 3.293f)
                close()
                moveTo(4.414f, 15f)
                horizontalLineTo(22f)
                curveTo(22.552f, 15f, 23f, 14.552f, 23f, 14f)
                curveTo(23f, 13.448f, 22.552f, 13f, 22f, 13f)
                horizontalLineTo(2.483f)
                curveTo(1.414f, 13f, 0.878f, 14.293f, 1.634f, 15.049f)
                lineTo(7.293f, 20.707f)
                curveTo(7.683f, 21.098f, 8.317f, 21.098f, 8.707f, 20.707f)
                curveTo(9.098f, 20.317f, 9.098f, 19.683f, 8.707f, 19.293f)
                lineTo(4.414f, 15f)
                close()
            }
        }.build()

        return _Transactions!!
    }

@Suppress("ObjectPropertyName")
private var _Transactions: ImageVector? = null
