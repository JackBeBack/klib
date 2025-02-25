package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Robot: ImageVector
    get() {
        if (_Robot != null) {
            return _Robot!!
        }
        _Robot = ImageVector.Builder(
            name = "Robot",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 15f)
                curveTo(8.448f, 15f, 8f, 15.448f, 8f, 16f)
                curveTo(8f, 16.552f, 8.448f, 17f, 9f, 17f)
                curveTo(9.552f, 17f, 10f, 16.552f, 10f, 16f)
                curveTo(10f, 15.448f, 9.552f, 15f, 9f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 16f)
                curveTo(14f, 15.448f, 14.448f, 15f, 15f, 15f)
                curveTo(15.552f, 15f, 16f, 15.448f, 16f, 16f)
                curveTo(16f, 16.552f, 15.552f, 17f, 15f, 17f)
                curveTo(14.448f, 17f, 14f, 16.552f, 14f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                curveTo(10.895f, 1f, 10f, 1.895f, 10f, 3f)
                curveTo(10f, 3.74f, 10.402f, 4.387f, 11f, 4.732f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(4.343f, 7f, 3f, 8.343f, 3f, 10f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(10f)
                curveTo(21f, 8.343f, 19.657f, 7f, 18f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(4.732f)
                curveTo(13.598f, 4.387f, 14f, 3.74f, 14f, 3f)
                curveTo(14f, 1.895f, 13.105f, 1f, 12f, 1f)
                close()
                moveTo(5f, 10f)
                curveTo(5f, 9.448f, 5.448f, 9f, 6f, 9f)
                horizontalLineTo(7.382f)
                lineTo(8.829f, 11.894f)
                curveTo(9.168f, 12.572f, 9.86f, 13f, 10.618f, 13f)
                horizontalLineTo(13.382f)
                curveTo(14.139f, 13f, 14.832f, 12.572f, 15.171f, 11.894f)
                lineTo(16.618f, 9f)
                horizontalLineTo(18f)
                curveTo(18.552f, 9f, 19f, 9.448f, 19f, 10f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(10f)
                close()
                moveTo(13.382f, 11f)
                lineTo(14.382f, 9f)
                horizontalLineTo(9.618f)
                lineTo(10.618f, 11f)
                horizontalLineTo(13.382f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 14f)
                curveTo(0.448f, 14f, 0f, 14.448f, 0f, 15f)
                verticalLineTo(17f)
                curveTo(0f, 17.552f, 0.448f, 18f, 1f, 18f)
                curveTo(1.552f, 18f, 2f, 17.552f, 2f, 17f)
                verticalLineTo(15f)
                curveTo(2f, 14.448f, 1.552f, 14f, 1f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(22f, 15f)
                curveTo(22f, 14.448f, 22.448f, 14f, 23f, 14f)
                curveTo(23.552f, 14f, 24f, 14.448f, 24f, 15f)
                verticalLineTo(17f)
                curveTo(24f, 17.552f, 23.552f, 18f, 23f, 18f)
                curveTo(22.448f, 18f, 22f, 17.552f, 22f, 17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Robot!!
    }

@Suppress("ObjectPropertyName")
private var _Robot: ImageVector? = null
