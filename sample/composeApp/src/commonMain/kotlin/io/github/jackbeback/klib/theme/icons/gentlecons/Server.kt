package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Server: ImageVector
    get() {
        if (_Server != null) {
            return _Server!!
        }
        _Server = ImageVector.Builder(
            name = "Server",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 7f)
                curveTo(7.552f, 7f, 8f, 6.552f, 8f, 6f)
                curveTo(8f, 5.448f, 7.552f, 5f, 7f, 5f)
                curveTo(6.448f, 5f, 6f, 5.448f, 6f, 6f)
                curveTo(6f, 6.552f, 6.448f, 7f, 7f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8f, 14f)
                curveTo(8f, 14.552f, 7.552f, 15f, 7f, 15f)
                curveTo(6.448f, 15f, 6f, 14.552f, 6f, 14f)
                curveTo(6f, 13.448f, 6.448f, 13f, 7f, 13f)
                curveTo(7.552f, 13f, 8f, 13.448f, 8f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 1f)
                curveTo(20.657f, 1f, 22f, 2.343f, 22f, 4f)
                verticalLineTo(8f)
                curveTo(22f, 8.768f, 21.711f, 9.469f, 21.236f, 10f)
                curveTo(21.711f, 10.531f, 22f, 11.232f, 22f, 12f)
                verticalLineTo(16f)
                curveTo(22f, 17.657f, 20.657f, 19f, 19f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(22f)
                curveTo(22.552f, 21f, 23f, 21.448f, 23f, 22f)
                curveTo(23f, 22.552f, 22.552f, 23f, 22f, 23f)
                horizontalLineTo(2f)
                curveTo(1.448f, 23f, 1f, 22.552f, 1f, 22f)
                curveTo(1f, 21.448f, 1.448f, 21f, 2f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                curveTo(3.343f, 19f, 2f, 17.657f, 2f, 16f)
                verticalLineTo(12f)
                curveTo(2f, 11.232f, 2.289f, 10.531f, 2.764f, 10f)
                curveTo(2.289f, 9.469f, 2f, 8.768f, 2f, 8f)
                verticalLineTo(4f)
                curveTo(2f, 2.343f, 3.343f, 1f, 5f, 1f)
                horizontalLineTo(19f)
                close()
                moveTo(5f, 9f)
                horizontalLineTo(19f)
                curveTo(19.552f, 9f, 20f, 8.552f, 20f, 8f)
                verticalLineTo(4f)
                curveTo(20f, 3.448f, 19.552f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(4.448f, 3f, 4f, 3.448f, 4f, 4f)
                verticalLineTo(8f)
                curveTo(4f, 8.552f, 4.448f, 9f, 5f, 9f)
                close()
                moveTo(5f, 11f)
                curveTo(4.448f, 11f, 4f, 11.448f, 4f, 12f)
                verticalLineTo(16f)
                curveTo(4f, 16.552f, 4.448f, 17f, 5f, 17f)
                horizontalLineTo(19f)
                curveTo(19.552f, 17f, 20f, 16.552f, 20f, 16f)
                verticalLineTo(12f)
                curveTo(20f, 11.448f, 19.552f, 11f, 19f, 11f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Server!!
    }

@Suppress("ObjectPropertyName")
private var _Server: ImageVector? = null
