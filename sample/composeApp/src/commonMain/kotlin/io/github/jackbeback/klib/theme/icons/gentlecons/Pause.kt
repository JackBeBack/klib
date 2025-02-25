package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Pause: ImageVector
    get() {
        if (_Pause != null) {
            return _Pause!!
        }
        _Pause = ImageVector.Builder(
            name = "Pause",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 5f)
                curveTo(10f, 3.343f, 8.657f, 2f, 7f, 2f)
                horizontalLineTo(5f)
                curveTo(3.343f, 2f, 2f, 3.343f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
                horizontalLineTo(7f)
                curveTo(8.657f, 22f, 10f, 20.657f, 10f, 19f)
                verticalLineTo(5f)
                close()
                moveTo(8f, 5f)
                curveTo(8f, 4.448f, 7.552f, 4f, 7f, 4f)
                horizontalLineTo(5f)
                curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
                verticalLineTo(19f)
                curveTo(4f, 19.552f, 4.448f, 20f, 5f, 20f)
                horizontalLineTo(7f)
                curveTo(7.552f, 20f, 8f, 19.552f, 8f, 19f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 5f)
                curveTo(22f, 3.343f, 20.657f, 2f, 19f, 2f)
                horizontalLineTo(17f)
                curveTo(15.343f, 2f, 14f, 3.343f, 14f, 5f)
                verticalLineTo(19f)
                curveTo(14f, 20.657f, 15.343f, 22f, 17f, 22f)
                horizontalLineTo(19f)
                curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
                verticalLineTo(5f)
                close()
                moveTo(20f, 5f)
                curveTo(20f, 4.448f, 19.552f, 4f, 19f, 4f)
                horizontalLineTo(17f)
                curveTo(16.448f, 4f, 16f, 4.448f, 16f, 5f)
                verticalLineTo(19f)
                curveTo(16f, 19.552f, 16.448f, 20f, 17f, 20f)
                horizontalLineTo(19f)
                curveTo(19.552f, 20f, 20f, 19.552f, 20f, 19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Pause!!
    }

@Suppress("ObjectPropertyName")
private var _Pause: ImageVector? = null
