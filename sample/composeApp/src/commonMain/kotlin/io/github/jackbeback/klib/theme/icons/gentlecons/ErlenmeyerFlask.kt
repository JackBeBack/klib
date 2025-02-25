package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ErlenmeyerFlask: ImageVector
    get() {
        if (_ErlenmeyerFlask != null) {
            return _ErlenmeyerFlask!!
        }
        _ErlenmeyerFlask = ImageVector.Builder(
            name = "ErlenmeyerFlask",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 16f)
                curveTo(11f, 16.552f, 10.552f, 17f, 10f, 17f)
                curveTo(9.448f, 17f, 9f, 16.552f, 9f, 16f)
                curveTo(9f, 15.448f, 9.448f, 15f, 10f, 15f)
                curveTo(10.552f, 15f, 11f, 15.448f, 11f, 16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 19f)
                curveTo(14.552f, 19f, 15f, 18.552f, 15f, 18f)
                curveTo(15f, 17.448f, 14.552f, 17f, 14f, 17f)
                curveTo(13.448f, 17f, 13f, 17.448f, 13f, 18f)
                curveTo(13f, 18.552f, 13.448f, 19f, 14f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 2f)
                curveTo(7f, 1.448f, 7.448f, 1f, 8f, 1f)
                horizontalLineTo(16f)
                curveTo(16.552f, 1f, 17f, 1.448f, 17f, 2f)
                curveTo(17f, 2.552f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(8.748f)
                lineTo(20.69f, 19.315f)
                curveTo(21.587f, 20.98f, 20.38f, 23f, 18.489f, 23f)
                horizontalLineTo(5.511f)
                curveTo(3.62f, 23f, 2.413f, 20.98f, 3.31f, 19.315f)
                lineTo(9f, 8.748f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                curveTo(7.448f, 3f, 7f, 2.552f, 7f, 2f)
                close()
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9.252f)
                lineTo(13.941f, 11f)
                horizontalLineTo(10.059f)
                lineTo(11f, 9.252f)
                verticalLineTo(3f)
                close()
                moveTo(8.982f, 13f)
                lineTo(5.071f, 20.263f)
                curveTo(4.892f, 20.596f, 5.133f, 21f, 5.511f, 21f)
                horizontalLineTo(18.489f)
                curveTo(18.867f, 21f, 19.108f, 20.596f, 18.929f, 20.263f)
                lineTo(15.018f, 13f)
                horizontalLineTo(8.982f)
                close()
            }
        }.build()

        return _ErlenmeyerFlask!!
    }

@Suppress("ObjectPropertyName")
private var _ErlenmeyerFlask: ImageVector? = null
