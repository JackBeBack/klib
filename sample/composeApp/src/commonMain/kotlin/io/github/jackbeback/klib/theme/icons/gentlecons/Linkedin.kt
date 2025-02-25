package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Linkedin: ImageVector
    get() {
        if (_Linkedin != null) {
            return _Linkedin!!
        }
        _Linkedin = ImageVector.Builder(
            name = "Linkedin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.5f, 8f)
                curveTo(7.328f, 8f, 8f, 7.328f, 8f, 6.5f)
                curveTo(8f, 5.672f, 7.328f, 5f, 6.5f, 5f)
                curveTo(5.672f, 5f, 5f, 5.672f, 5f, 6.5f)
                curveTo(5f, 7.328f, 5.672f, 8f, 6.5f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 10f)
                curveTo(5f, 9.448f, 5.448f, 9f, 6f, 9f)
                horizontalLineTo(7f)
                curveTo(7.552f, 9f, 8f, 9.448f, 8f, 10f)
                verticalLineTo(18f)
                curveTo(8f, 18.552f, 7.552f, 19f, 7f, 19f)
                horizontalLineTo(6f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                verticalLineTo(10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 19f)
                horizontalLineTo(12f)
                curveTo(12.552f, 19f, 13f, 18.552f, 13f, 18f)
                verticalLineTo(13.5f)
                curveTo(13f, 12f, 16f, 11f, 16f, 13f)
                verticalLineTo(18f)
                curveTo(16f, 18.553f, 16.448f, 19f, 17f, 19f)
                horizontalLineTo(18f)
                curveTo(18.552f, 19f, 19f, 18.552f, 19f, 18f)
                verticalLineTo(12f)
                curveTo(19f, 10f, 17.5f, 9f, 15.5f, 9f)
                curveTo(13.5f, 9f, 13f, 10.5f, 13f, 10.5f)
                verticalLineTo(10f)
                curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
                horizontalLineTo(11f)
                curveTo(10.448f, 9f, 10f, 9.448f, 10f, 10f)
                verticalLineTo(18f)
                curveTo(10f, 18.552f, 10.448f, 19f, 11f, 19f)
                close()
            }
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
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Linkedin!!
    }

@Suppress("ObjectPropertyName")
private var _Linkedin: ImageVector? = null
