package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Smartphone: ImageVector
    get() {
        if (_Smartphone != null) {
            return _Smartphone!!
        }
        _Smartphone = ImageVector.Builder(
            name = "Smartphone",
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
                moveTo(19f, 4f)
                curveTo(19f, 2.343f, 17.657f, 1f, 16f, 1f)
                horizontalLineTo(8f)
                curveTo(6.343f, 1f, 5f, 2.343f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 21.657f, 6.343f, 23f, 8f, 23f)
                horizontalLineTo(16f)
                curveTo(17.657f, 23f, 19f, 21.657f, 19f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(17f, 4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                close()
                moveTo(7f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                curveTo(17f, 20.552f, 16.552f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
                close()
            }
        }.build()

        return _Smartphone!!
    }

@Suppress("ObjectPropertyName")
private var _Smartphone: ImageVector? = null
