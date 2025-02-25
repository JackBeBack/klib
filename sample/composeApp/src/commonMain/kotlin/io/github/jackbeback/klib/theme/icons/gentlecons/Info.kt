package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Info: ImageVector
    get() {
        if (_Info != null) {
            return _Info!!
        }
        _Info = ImageVector.Builder(
            name = "Info",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 10f)
                curveTo(10f, 10.552f, 10.448f, 11f, 11f, 11f)
                verticalLineTo(17f)
                curveTo(10.448f, 17f, 10f, 17.448f, 10f, 18f)
                curveTo(10f, 18.552f, 10.448f, 19f, 11f, 19f)
                horizontalLineTo(13f)
                curveTo(13.552f, 19f, 14f, 18.552f, 14f, 18f)
                curveTo(14f, 17.448f, 13.552f, 17f, 13f, 17f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                curveTo(10.448f, 9f, 10f, 9.448f, 10f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 8f)
                curveTo(12.828f, 8f, 13.5f, 7.328f, 13.5f, 6.5f)
                curveTo(13.5f, 5.672f, 12.828f, 5f, 12f, 5f)
                curveTo(11.172f, 5f, 10.5f, 5.672f, 10.5f, 6.5f)
                curveTo(10.5f, 7.328f, 11.172f, 8f, 12f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Info!!
    }

@Suppress("ObjectPropertyName")
private var _Info: ImageVector? = null
