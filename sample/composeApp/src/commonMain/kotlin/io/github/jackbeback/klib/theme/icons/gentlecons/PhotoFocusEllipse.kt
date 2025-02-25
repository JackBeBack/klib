package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PhotoFocusEllipse: ImageVector
    get() {
        if (_PhotoFocusEllipse != null) {
            return _PhotoFocusEllipse!!
        }
        _PhotoFocusEllipse = ImageVector.Builder(
            name = "PhotoFocusEllipse",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(8f)
                curveTo(23f, 8.552f, 22.552f, 9f, 22f, 9f)
                curveTo(21.448f, 9f, 21f, 8.552f, 21f, 8f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(16f)
                curveTo(15.448f, 3f, 15f, 2.552f, 15f, 2f)
                curveTo(15f, 1.448f, 15.448f, 1f, 16f, 1f)
                horizontalLineTo(20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 15f)
                curveTo(22.552f, 15f, 23f, 15.448f, 23f, 16f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(16f)
                curveTo(15.448f, 23f, 15f, 22.552f, 15f, 22f)
                curveTo(15f, 21.448f, 15.448f, 21f, 16f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(16f)
                curveTo(21f, 15.448f, 21.448f, 15f, 22f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4f, 21f)
                horizontalLineTo(8f)
                curveTo(8.552f, 21f, 9f, 21.448f, 9f, 22f)
                curveTo(9f, 22.552f, 8.552f, 23f, 8f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(16f)
                curveTo(1f, 15.448f, 1.448f, 15f, 2f, 15f)
                curveTo(2.552f, 15f, 3f, 15.448f, 3f, 16f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 9f)
                curveTo(1.448f, 9f, 1f, 8.552f, 1f, 8f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(8f)
                curveTo(8.552f, 1f, 9f, 1.448f, 9f, 2f)
                curveTo(9f, 2.552f, 8.552f, 3f, 8f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(8f)
                curveTo(3f, 8.552f, 2.552f, 9f, 2f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 16f)
                curveTo(14.209f, 16f, 16f, 14.209f, 16f, 12f)
                curveTo(16f, 9.791f, 14.209f, 8f, 12f, 8f)
                curveTo(9.791f, 8f, 8f, 9.791f, 8f, 12f)
                curveTo(8f, 14.209f, 9.791f, 16f, 12f, 16f)
                close()
                moveTo(12f, 14.014f)
                curveTo(10.888f, 14.014f, 9.986f, 13.112f, 9.986f, 12f)
                curveTo(9.986f, 10.888f, 10.888f, 9.986f, 12f, 9.986f)
                curveTo(13.112f, 9.986f, 14.014f, 10.888f, 14.014f, 12f)
                curveTo(14.014f, 13.112f, 13.112f, 14.014f, 12f, 14.014f)
                close()
            }
        }.build()

        return _PhotoFocusEllipse!!
    }

@Suppress("ObjectPropertyName")
private var _PhotoFocusEllipse: ImageVector? = null
