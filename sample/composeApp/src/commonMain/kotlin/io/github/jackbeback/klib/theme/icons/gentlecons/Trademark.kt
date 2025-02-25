package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Trademark: ImageVector
    get() {
        if (_Trademark != null) {
            return _Trademark!!
        }
        _Trademark = ImageVector.Builder(
            name = "Trademark",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 9f)
                curveTo(5f, 8.448f, 5.448f, 8f, 6f, 8f)
                horizontalLineTo(10f)
                curveTo(10.552f, 8f, 11f, 8.448f, 11f, 9f)
                curveTo(11f, 9.552f, 10.552f, 10f, 10f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                curveTo(9f, 15.552f, 8.552f, 16f, 8f, 16f)
                curveTo(7.448f, 16f, 7f, 15.552f, 7f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(5.448f, 10f, 5f, 9.552f, 5f, 9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.768f, 8.36f)
                curveTo(13.499f, 8.036f, 13.055f, 7.916f, 12.66f, 8.06f)
                curveTo(12.264f, 8.203f, 12f, 8.579f, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 15.552f, 12.448f, 16f, 13f, 16f)
                curveTo(13.552f, 16f, 14f, 15.552f, 14f, 15f)
                verticalLineTo(11.762f)
                lineTo(14.732f, 12.64f)
                curveTo(14.922f, 12.868f, 15.203f, 13f, 15.5f, 13f)
                curveTo(15.797f, 13f, 16.078f, 12.868f, 16.268f, 12.64f)
                lineTo(17f, 11.762f)
                verticalLineTo(15f)
                curveTo(17f, 15.552f, 17.448f, 16f, 18f, 16f)
                curveTo(18.552f, 16f, 19f, 15.552f, 19f, 15f)
                verticalLineTo(9f)
                curveTo(19f, 8.579f, 18.736f, 8.203f, 18.34f, 8.06f)
                curveTo(17.945f, 7.916f, 17.501f, 8.036f, 17.232f, 8.36f)
                lineTo(15.5f, 10.438f)
                lineTo(13.768f, 8.36f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 12f)
                curveTo(23f, 18.075f, 18.075f, 23f, 12f, 23f)
                curveTo(5.925f, 23f, 1f, 18.075f, 1f, 12f)
                curveTo(1f, 5.925f, 5.925f, 1f, 12f, 1f)
                curveTo(18.075f, 1f, 23f, 5.925f, 23f, 12f)
                close()
                moveTo(3.007f, 12f)
                curveTo(3.007f, 16.967f, 7.033f, 20.993f, 12f, 20.993f)
                curveTo(16.967f, 20.993f, 20.993f, 16.967f, 20.993f, 12f)
                curveTo(20.993f, 7.033f, 16.967f, 3.007f, 12f, 3.007f)
                curveTo(7.033f, 3.007f, 3.007f, 7.033f, 3.007f, 12f)
                close()
            }
        }.build()

        return _Trademark!!
    }

@Suppress("ObjectPropertyName")
private var _Trademark: ImageVector? = null
