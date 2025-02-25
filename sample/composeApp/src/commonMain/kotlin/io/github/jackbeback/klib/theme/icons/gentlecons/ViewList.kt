package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ViewList: ImageVector
    get() {
        if (_ViewList != null) {
            return _ViewList!!
        }
        _ViewList = ImageVector.Builder(
            name = "ViewList",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 6f)
                curveTo(9f, 4.343f, 7.657f, 3f, 6f, 3f)
                horizontalLineTo(4f)
                curveTo(2.343f, 3f, 1f, 4.343f, 1f, 6f)
                verticalLineTo(8f)
                curveTo(1f, 9.657f, 2.343f, 11f, 4f, 11f)
                horizontalLineTo(6f)
                curveTo(7.657f, 11f, 9f, 9.657f, 9f, 8f)
                verticalLineTo(6f)
                close()
                moveTo(7f, 6f)
                curveTo(7f, 5.448f, 6.552f, 5f, 6f, 5f)
                horizontalLineTo(4f)
                curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
                verticalLineTo(8f)
                curveTo(3f, 8.552f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(6f)
                curveTo(6.552f, 9f, 7f, 8.552f, 7f, 8f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 16f)
                curveTo(9f, 14.343f, 7.657f, 13f, 6f, 13f)
                horizontalLineTo(4f)
                curveTo(2.343f, 13f, 1f, 14.343f, 1f, 16f)
                verticalLineTo(18f)
                curveTo(1f, 19.657f, 2.343f, 21f, 4f, 21f)
                horizontalLineTo(6f)
                curveTo(7.657f, 21f, 9f, 19.657f, 9f, 18f)
                verticalLineTo(16f)
                close()
                moveTo(7f, 16f)
                curveTo(7f, 15.448f, 6.552f, 15f, 6f, 15f)
                horizontalLineTo(4f)
                curveTo(3.448f, 15f, 3f, 15.448f, 3f, 16f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
                horizontalLineTo(6f)
                curveTo(6.552f, 19f, 7f, 18.552f, 7f, 18f)
                verticalLineTo(16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 7f)
                curveTo(11f, 6.448f, 11.448f, 6f, 12f, 6f)
                horizontalLineTo(22f)
                curveTo(22.552f, 6f, 23f, 6.448f, 23f, 7f)
                curveTo(23f, 7.552f, 22.552f, 8f, 22f, 8f)
                horizontalLineTo(12f)
                curveTo(11.448f, 8f, 11f, 7.552f, 11f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 17f)
                curveTo(11f, 16.448f, 11.448f, 16f, 12f, 16f)
                horizontalLineTo(22f)
                curveTo(22.552f, 16f, 23f, 16.448f, 23f, 17f)
                curveTo(23f, 17.552f, 22.552f, 18f, 22f, 18f)
                horizontalLineTo(12f)
                curveTo(11.448f, 18f, 11f, 17.552f, 11f, 17f)
                close()
            }
        }.build()

        return _ViewList!!
    }

@Suppress("ObjectPropertyName")
private var _ViewList: ImageVector? = null
