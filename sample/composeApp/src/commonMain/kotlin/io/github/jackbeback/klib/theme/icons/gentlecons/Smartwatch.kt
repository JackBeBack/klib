package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Smartwatch: ImageVector
    get() {
        if (_Smartwatch != null) {
            return _Smartwatch!!
        }
        _Smartwatch = ImageVector.Builder(
            name = "Smartwatch",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3f)
                verticalLineTo(4f)
                curveTo(5.343f, 4f, 4f, 5.343f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 18.657f, 5.343f, 20f, 7f, 20f)
                lineTo(7f, 21f)
                curveTo(7f, 22.657f, 8.343f, 24f, 10f, 24f)
                horizontalLineTo(14f)
                curveTo(15.657f, 24f, 17f, 22.657f, 17f, 21f)
                verticalLineTo(20f)
                curveTo(18.657f, 20f, 20f, 18.657f, 20f, 17f)
                verticalLineTo(13f)
                curveTo(20.552f, 13f, 21f, 12.552f, 21f, 12f)
                curveTo(21f, 11.448f, 20.552f, 11f, 20f, 11f)
                verticalLineTo(7f)
                curveTo(20f, 5.343f, 18.657f, 4f, 17f, 4f)
                verticalLineTo(3f)
                curveTo(17f, 1.343f, 15.657f, 0f, 14f, 0f)
                horizontalLineTo(10f)
                curveTo(8.343f, 0f, 7f, 1.343f, 7f, 3f)
                close()
                moveTo(10f, 2f)
                curveTo(9.448f, 2f, 9f, 2.448f, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 14.552f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                close()
                moveTo(7f, 18f)
                curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
                verticalLineTo(7f)
                curveTo(6f, 6.448f, 6.448f, 6f, 7f, 6f)
                horizontalLineTo(17f)
                curveTo(17.552f, 6f, 18f, 6.448f, 18f, 7f)
                verticalLineTo(17f)
                curveTo(18f, 17.552f, 17.552f, 18f, 17f, 18f)
                horizontalLineTo(7f)
                close()
                moveTo(9f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 21.552f, 14.552f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.448f, 22f, 9f, 21.552f, 9f, 21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Smartwatch!!
    }

@Suppress("ObjectPropertyName")
private var _Smartwatch: ImageVector? = null
