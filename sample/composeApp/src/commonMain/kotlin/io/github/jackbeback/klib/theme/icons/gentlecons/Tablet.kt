package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Tablet: ImageVector
    get() {
        if (_Tablet != null) {
            return _Tablet!!
        }
        _Tablet = ImageVector.Builder(
            name = "Tablet",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 18f)
                curveTo(11.448f, 18f, 11f, 18.448f, 11f, 19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 19.552f, 13f, 19f)
                curveTo(13f, 18.448f, 12.552f, 18f, 12f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21f, 4f)
                curveTo(21f, 2.343f, 19.657f, 1f, 18f, 1f)
                horizontalLineTo(6f)
                curveTo(4.343f, 1f, 3f, 2.343f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(19f, 4f)
                curveTo(19f, 3.448f, 18.552f, 3f, 18f, 3f)
                horizontalLineTo(6f)
                curveTo(5.448f, 3f, 5f, 3.448f, 5f, 4f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                close()
                moveTo(5f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                close()
            }
        }.build()

        return _Tablet!!
    }

@Suppress("ObjectPropertyName")
private var _Tablet: ImageVector? = null
