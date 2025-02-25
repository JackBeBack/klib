package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) {
            return _CreditCard!!
        }
        _CreditCard = ImageVector.Builder(
            name = "CreditCard",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 4f)
                curveTo(21.657f, 4f, 23f, 5.343f, 23f, 7f)
                verticalLineTo(17f)
                curveTo(23f, 18.657f, 21.657f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.343f, 20f, 1f, 18.657f, 1f, 17f)
                verticalLineTo(7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 6f)
                curveTo(20.552f, 6f, 21f, 6.448f, 21f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                curveTo(3f, 6.448f, 3.448f, 6f, 4f, 6f)
                horizontalLineTo(20f)
                close()
                moveTo(3f, 11f)
                verticalLineTo(17f)
                curveTo(3f, 17.552f, 3.448f, 18f, 4f, 18f)
                horizontalLineTo(20f)
                curveTo(20.552f, 18f, 21f, 17.552f, 21f, 17f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _CreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCard: ImageVector? = null
