package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDecrease: ImageVector
    get() {
        if (_ArrowDecrease != null) {
            return _ArrowDecrease!!
        }
        _ArrowDecrease = ImageVector.Builder(
            name = "ArrowDecrease",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 4f)
                curveTo(9.448f, 4f, 9f, 4.448f, 9f, 5f)
                verticalLineTo(7.586f)
                lineTo(2.707f, 1.293f)
                curveTo(2.317f, 0.902f, 1.683f, 0.902f, 1.293f, 1.293f)
                curveTo(0.902f, 1.683f, 0.902f, 2.317f, 1.293f, 2.707f)
                lineTo(7.586f, 9f)
                horizontalLineTo(5f)
                curveTo(4.448f, 9f, 4f, 9.448f, 4f, 10f)
                curveTo(4f, 10.552f, 4.448f, 11f, 5f, 11f)
                horizontalLineTo(9f)
                curveTo(10.105f, 11f, 11f, 10.105f, 11f, 9f)
                verticalLineTo(5f)
                curveTo(11f, 4.448f, 10.552f, 4f, 10f, 4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 20f)
                curveTo(9.448f, 20f, 9f, 19.552f, 9f, 19f)
                verticalLineTo(16.414f)
                lineTo(2.707f, 22.707f)
                curveTo(2.317f, 23.098f, 1.683f, 23.098f, 1.293f, 22.707f)
                curveTo(0.902f, 22.317f, 0.902f, 21.683f, 1.293f, 21.293f)
                lineTo(7.586f, 15f)
                horizontalLineTo(5f)
                curveTo(4.448f, 15f, 4f, 14.552f, 4f, 14f)
                curveTo(4f, 13.448f, 4.448f, 13f, 5f, 13f)
                horizontalLineTo(9f)
                curveTo(10.105f, 13f, 11f, 13.895f, 11f, 15f)
                verticalLineTo(19f)
                curveTo(11f, 19.552f, 10.552f, 20f, 10f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(15f, 5f)
                curveTo(15f, 4.448f, 14.552f, 4f, 14f, 4f)
                curveTo(13.448f, 4f, 13f, 4.448f, 13f, 5f)
                verticalLineTo(9f)
                curveTo(13f, 10.105f, 13.895f, 11f, 15f, 11f)
                horizontalLineTo(19f)
                curveTo(19.552f, 11f, 20f, 10.552f, 20f, 10f)
                curveTo(20f, 9.448f, 19.552f, 9f, 19f, 9f)
                horizontalLineTo(16.414f)
                lineTo(22.707f, 2.707f)
                curveTo(23.098f, 2.317f, 23.098f, 1.683f, 22.707f, 1.293f)
                curveTo(22.317f, 0.902f, 21.683f, 0.902f, 21.293f, 1.293f)
                lineTo(15f, 7.586f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 20f)
                curveTo(14.552f, 20f, 15f, 19.552f, 15f, 19f)
                verticalLineTo(16.414f)
                lineTo(21.293f, 22.707f)
                curveTo(21.683f, 23.098f, 22.317f, 23.098f, 22.707f, 22.707f)
                curveTo(23.098f, 22.317f, 23.098f, 21.683f, 22.707f, 21.293f)
                lineTo(16.414f, 15f)
                horizontalLineTo(19f)
                curveTo(19.552f, 15f, 20f, 14.552f, 20f, 14f)
                curveTo(20f, 13.448f, 19.552f, 13f, 19f, 13f)
                horizontalLineTo(15f)
                curveTo(13.895f, 13f, 13f, 13.895f, 13f, 15f)
                verticalLineTo(19f)
                curveTo(13f, 19.552f, 13.448f, 20f, 14f, 20f)
                close()
            }
        }.build()

        return _ArrowDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDecrease: ImageVector? = null
