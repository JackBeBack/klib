package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bed: ImageVector
    get() {
        if (_Bed != null) {
            return _Bed!!
        }
        _Bed = ImageVector.Builder(
            name = "Bed",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 6f)
                curveTo(2f, 5.448f, 1.552f, 5f, 1f, 5f)
                curveTo(0.448f, 5f, 0f, 5.448f, 0f, 6f)
                verticalLineTo(18f)
                curveTo(0f, 18.552f, 0.448f, 19f, 1f, 19f)
                curveTo(1.552f, 19f, 2f, 18.552f, 2f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                curveTo(22f, 18.552f, 22.448f, 19f, 23f, 19f)
                curveTo(23.552f, 19f, 24f, 18.552f, 24f, 18f)
                verticalLineTo(10f)
                curveTo(24f, 7.791f, 22.209f, 6f, 20f, 6f)
                horizontalLineTo(13f)
                curveTo(11.895f, 6f, 11f, 6.895f, 11f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                close()
                moveTo(22f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                curveTo(21.105f, 8f, 22f, 8.895f, 22f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 13f)
                curveTo(8.433f, 13f, 10f, 11.433f, 10f, 9.5f)
                curveTo(10f, 7.567f, 8.433f, 6f, 6.5f, 6f)
                curveTo(4.567f, 6f, 3f, 7.567f, 3f, 9.5f)
                curveTo(3f, 11.433f, 4.567f, 13f, 6.5f, 13f)
                close()
                moveTo(6.5f, 11.08f)
                curveTo(5.627f, 11.08f, 4.92f, 10.373f, 4.92f, 9.5f)
                curveTo(4.92f, 8.627f, 5.627f, 7.92f, 6.5f, 7.92f)
                curveTo(7.373f, 7.92f, 8.08f, 8.627f, 8.08f, 9.5f)
                curveTo(8.08f, 10.373f, 7.373f, 11.08f, 6.5f, 11.08f)
                close()
            }
        }.build()

        return _Bed!!
    }

@Suppress("ObjectPropertyName")
private var _Bed: ImageVector? = null
