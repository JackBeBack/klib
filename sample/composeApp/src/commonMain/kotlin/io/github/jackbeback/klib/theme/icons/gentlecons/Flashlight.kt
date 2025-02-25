package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Flashlight: ImageVector
    get() {
        if (_Flashlight != null) {
            return _Flashlight!!
        }
        _Flashlight = ImageVector.Builder(
            name = "Flashlight",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 11f)
                curveTo(11.448f, 11f, 11f, 11.448f, 11f, 12f)
                curveTo(11f, 12.552f, 11.448f, 13f, 12f, 13f)
                curveTo(12.552f, 13f, 13f, 12.552f, 13f, 12f)
                curveTo(13f, 11.448f, 12.552f, 11f, 12f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 4f)
                curveTo(5f, 2.343f, 6.343f, 1f, 8f, 1f)
                horizontalLineTo(16f)
                curveTo(17.657f, 1f, 19f, 2.343f, 19f, 4f)
                verticalLineTo(5.333f)
                curveTo(19f, 5.982f, 18.789f, 6.614f, 18.4f, 7.133f)
                lineTo(16f, 10.333f)
                verticalLineTo(20f)
                curveTo(16f, 21.657f, 14.657f, 23f, 13f, 23f)
                horizontalLineTo(11f)
                curveTo(9.343f, 23f, 8f, 21.657f, 8f, 20f)
                verticalLineTo(10.333f)
                lineTo(5.6f, 7.133f)
                curveTo(5.211f, 6.614f, 5f, 5.982f, 5f, 5.333f)
                verticalLineTo(4f)
                close()
                moveTo(8f, 3f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                horizontalLineTo(17f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                close()
                moveTo(9.6f, 9.133f)
                lineTo(7.25f, 6f)
                horizontalLineTo(16.75f)
                lineTo(14.4f, 9.133f)
                curveTo(14.14f, 9.48f, 14f, 9.901f, 14f, 10.333f)
                verticalLineTo(20f)
                curveTo(14f, 20.552f, 13.552f, 21f, 13f, 21f)
                horizontalLineTo(11f)
                curveTo(10.448f, 21f, 10f, 20.552f, 10f, 20f)
                verticalLineTo(10.333f)
                curveTo(10f, 9.901f, 9.86f, 9.48f, 9.6f, 9.133f)
                close()
            }
        }.build()

        return _Flashlight!!
    }

@Suppress("ObjectPropertyName")
private var _Flashlight: ImageVector? = null
