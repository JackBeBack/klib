package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Laptop: ImageVector
    get() {
        if (_Laptop != null) {
            return _Laptop!!
        }
        _Laptop = ImageVector.Builder(
            name = "Laptop",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 3f)
                curveTo(19.657f, 3f, 21f, 4.343f, 21f, 6f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                curveTo(22.552f, 15f, 23f, 15.448f, 23f, 16f)
                verticalLineTo(18f)
                curveTo(23f, 19.657f, 21.657f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(2.343f, 21f, 1f, 19.657f, 1f, 18f)
                verticalLineTo(16f)
                curveTo(1f, 15.448f, 1.448f, 15f, 2f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
                horizontalLineTo(18f)
                close()
                moveTo(5f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                curveTo(19f, 5.448f, 18.552f, 5f, 18f, 5f)
                horizontalLineTo(6f)
                curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
                verticalLineTo(15f)
                close()
                moveTo(21f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                horizontalLineTo(20f)
                curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Laptop!!
    }

@Suppress("ObjectPropertyName")
private var _Laptop: ImageVector? = null
