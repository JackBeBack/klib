package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Facebook: ImageVector
    get() {
        if (_Facebook != null) {
            return _Facebook!!
        }
        _Facebook = ImageVector.Builder(
            name = "Facebook",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 3f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(17.076f)
                curveTo(17.507f, 14f, 17.889f, 13.724f, 18.025f, 13.316f)
                lineTo(18.468f, 11.987f)
                curveTo(18.63f, 11.501f, 18.268f, 11f, 17.756f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                curveTo(15f, 8.5f, 15.5f, 8f, 16f, 8f)
                horizontalLineTo(18f)
                curveTo(18.552f, 8f, 19f, 7.552f, 19f, 7f)
                verticalLineTo(6.314f)
                curveTo(19f, 5.991f, 18.794f, 5.701f, 18.481f, 5.619f)
                curveTo(17.17f, 5.273f, 16f, 5.273f, 16f, 5.273f)
                curveTo(13.5f, 5.273f, 12f, 7f, 12f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                curveTo(9.448f, 11f, 9f, 11.448f, 9f, 12f)
                verticalLineTo(13f)
                curveTo(9f, 13.552f, 9.448f, 14f, 10f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Facebook!!
    }

@Suppress("ObjectPropertyName")
private var _Facebook: ImageVector? = null
