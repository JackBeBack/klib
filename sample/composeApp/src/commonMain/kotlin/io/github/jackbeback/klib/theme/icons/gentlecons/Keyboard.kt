package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Keyboard: ImageVector
    get() {
        if (_Keyboard != null) {
            return _Keyboard!!
        }
        _Keyboard = ImageVector.Builder(
            name = "Keyboard",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 13f)
                curveTo(9.448f, 13f, 9f, 13.448f, 9f, 14f)
                curveTo(9f, 14.552f, 9.448f, 15f, 10f, 15f)
                horizontalLineTo(14f)
                curveTo(14.552f, 15f, 15f, 14.552f, 15f, 14f)
                curveTo(15f, 13.448f, 14.552f, 13f, 14f, 13f)
                horizontalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17f, 14f)
                curveTo(17f, 13.448f, 17.448f, 13f, 18f, 13f)
                curveTo(18.552f, 13f, 19f, 13.448f, 19f, 14f)
                curveTo(19f, 14.552f, 18.552f, 15f, 18f, 15f)
                curveTo(17.448f, 15f, 17f, 14.552f, 17f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 13f)
                curveTo(5.448f, 13f, 5f, 13.448f, 5f, 14f)
                curveTo(5f, 14.552f, 5.448f, 15f, 6f, 15f)
                curveTo(6.552f, 15f, 7f, 14.552f, 7f, 14f)
                curveTo(7f, 13.448f, 6.552f, 13f, 6f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 10f)
                curveTo(5f, 9.448f, 5.448f, 9f, 6f, 9f)
                curveTo(6.552f, 9f, 7f, 9.448f, 7f, 10f)
                curveTo(7f, 10.552f, 6.552f, 11f, 6f, 11f)
                curveTo(5.448f, 11f, 5f, 10.552f, 5f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 9f)
                curveTo(9.448f, 9f, 9f, 9.448f, 9f, 10f)
                curveTo(9f, 10.552f, 9.448f, 11f, 10f, 11f)
                curveTo(10.552f, 11f, 11f, 10.552f, 11f, 10f)
                curveTo(11f, 9.448f, 10.552f, 9f, 10f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 10f)
                curveTo(13f, 9.448f, 13.448f, 9f, 14f, 9f)
                curveTo(14.552f, 9f, 15f, 9.448f, 15f, 10f)
                curveTo(15f, 10.552f, 14.552f, 11f, 14f, 11f)
                curveTo(13.448f, 11f, 13f, 10.552f, 13f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 9f)
                curveTo(17.448f, 9f, 17f, 9.448f, 17f, 10f)
                curveTo(17f, 10.552f, 17.448f, 11f, 18f, 11f)
                curveTo(18.552f, 11f, 19f, 10.552f, 19f, 10f)
                curveTo(19f, 9.448f, 18.552f, 9f, 18f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 5f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(16f)
                curveTo(23f, 17.657f, 21.657f, 19f, 20f, 19f)
                horizontalLineTo(4f)
                curveTo(2.343f, 19f, 1f, 17.657f, 1f, 16f)
                verticalLineTo(8f)
                curveTo(1f, 6.343f, 2.343f, 5f, 4f, 5f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 7f)
                curveTo(20.552f, 7f, 21f, 7.448f, 21f, 8f)
                verticalLineTo(16f)
                curveTo(21f, 16.552f, 20.552f, 17f, 20f, 17f)
                horizontalLineTo(4f)
                curveTo(3.448f, 17f, 3f, 16.552f, 3f, 16f)
                verticalLineTo(8f)
                curveTo(3f, 7.448f, 3.448f, 7f, 4f, 7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Keyboard!!
    }

@Suppress("ObjectPropertyName")
private var _Keyboard: ImageVector? = null
