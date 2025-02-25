package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Save: ImageVector
    get() {
        if (_Save != null) {
            return _Save!!
        }
        _Save = ImageVector.Builder(
            name = "Save",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.172f, 1f)
                curveTo(18.702f, 1f, 19.211f, 1.211f, 19.586f, 1.586f)
                lineTo(22.414f, 4.414f)
                curveTo(22.789f, 4.789f, 23f, 5.298f, 23f, 5.828f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(18.172f)
                close()
                moveTo(4f, 3f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 15f)
                curveTo(5f, 13.343f, 6.343f, 12f, 8f, 12f)
                lineTo(16f, 12f)
                curveTo(17.657f, 12f, 19f, 13.343f, 19f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(6.828f)
                curveTo(21f, 6.298f, 20.789f, 5.789f, 20.414f, 5.414f)
                lineTo(18.586f, 3.586f)
                curveTo(18.211f, 3.211f, 17.702f, 3f, 17.172f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                curveTo(17f, 6.657f, 15.657f, 8f, 14f, 8f)
                horizontalLineTo(10f)
                curveTo(8.343f, 8f, 7f, 6.657f, 7f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                close()
                moveTo(17f, 21f)
                verticalLineTo(15f)
                curveTo(17f, 14.448f, 16.552f, 14f, 16f, 14f)
                lineTo(8f, 14f)
                curveTo(7.448f, 14f, 7f, 14.448f, 7f, 15f)
                lineTo(7f, 21f)
                lineTo(17f, 21f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                curveTo(15f, 5.552f, 14.552f, 6f, 14f, 6f)
                horizontalLineTo(10f)
                curveTo(9.448f, 6f, 9f, 5.552f, 9f, 5f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Save!!
    }

@Suppress("ObjectPropertyName")
private var _Save: ImageVector? = null
