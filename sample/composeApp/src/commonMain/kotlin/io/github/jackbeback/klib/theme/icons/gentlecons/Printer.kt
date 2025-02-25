package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Printer: ImageVector
    get() {
        if (_Printer != null) {
            return _Printer!!
        }
        _Printer = ImageVector.Builder(
            name = "Printer",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 10f)
                curveTo(5.448f, 10f, 5f, 10.448f, 5f, 11f)
                curveTo(5f, 11.552f, 5.448f, 12f, 6f, 12f)
                curveTo(6.552f, 12f, 7f, 11.552f, 7f, 11f)
                curveTo(7f, 10.448f, 6.552f, 10f, 6f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                curveTo(5.895f, 1f, 5f, 1.895f, 5f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(2.343f, 7f, 1f, 8.343f, 1f, 10f)
                verticalLineTo(17f)
                curveTo(1f, 18.657f, 2.343f, 20f, 4f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(5f, 22.105f, 5.895f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(18.105f, 23f, 19f, 22.105f, 19f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(21.657f, 20f, 23f, 18.657f, 23f, 17f)
                verticalLineTo(10f)
                curveTo(23f, 8.343f, 21.657f, 7f, 20f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                curveTo(19f, 1.895f, 18.105f, 1f, 17f, 1f)
                horizontalLineTo(7f)
                close()
                moveTo(17f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                curveTo(7f, 3.448f, 7.448f, 3f, 8f, 3f)
                horizontalLineTo(16f)
                curveTo(16.552f, 3f, 17f, 3.448f, 17f, 4f)
                verticalLineTo(7f)
                close()
                moveTo(7f, 14f)
                curveTo(5.895f, 14f, 5f, 14.895f, 5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                curveTo(3.448f, 18f, 3f, 17.552f, 3f, 17f)
                verticalLineTo(10f)
                curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(20f)
                curveTo(20.552f, 9f, 21f, 9.448f, 21f, 10f)
                verticalLineTo(17f)
                curveTo(21f, 17.552f, 20.552f, 18f, 20f, 18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                curveTo(19f, 14.895f, 18.105f, 14f, 17f, 14f)
                horizontalLineTo(7f)
                close()
                moveTo(16f, 16f)
                curveTo(16.552f, 16f, 17f, 16.448f, 17f, 17f)
                verticalLineTo(20f)
                curveTo(17f, 20.552f, 16.552f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
                verticalLineTo(17f)
                curveTo(7f, 16.448f, 7.448f, 16f, 8f, 16f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Printer!!
    }

@Suppress("ObjectPropertyName")
private var _Printer: ImageVector? = null
