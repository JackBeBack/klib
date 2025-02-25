package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Maximize: ImageVector
    get() {
        if (_Maximize != null) {
            return _Maximize!!
        }
        _Maximize = ImageVector.Builder(
            name = "Maximize",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                horizontalLineTo(5f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
                verticalLineTo(5f)
                close()
                moveTo(20f, 5f)
                curveTo(20f, 4.448f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(5f)
                curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
                verticalLineTo(19f)
                curveTo(4f, 19.552f, 4.448f, 20f, 5f, 20f)
                horizontalLineTo(19f)
                curveTo(19.552f, 20f, 20f, 19.552f, 20f, 19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Maximize!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize: ImageVector? = null
