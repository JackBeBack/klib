package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Suitcase: ImageVector
    get() {
        if (_Suitcase != null) {
            return _Suitcase!!
        }
        _Suitcase = ImageVector.Builder(
            name = "Suitcase",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 5f)
                verticalLineTo(4f)
                curveTo(6f, 2.343f, 7.343f, 1f, 9f, 1f)
                horizontalLineTo(15f)
                curveTo(16.657f, 1f, 18f, 2.343f, 18f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(8f)
                curveTo(1f, 6.343f, 2.343f, 5f, 4f, 5f)
                horizontalLineTo(6f)
                close()
                moveTo(8f, 4f)
                curveTo(8f, 3.448f, 8.448f, 3f, 9f, 3f)
                horizontalLineTo(15f)
                curveTo(15.552f, 3f, 16f, 3.448f, 16f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
                moveTo(19.882f, 7f)
                horizontalLineTo(4.118f)
                lineTo(6.342f, 11.447f)
                curveTo(6.511f, 11.786f, 6.857f, 12f, 7.236f, 12f)
                horizontalLineTo(11f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                horizontalLineTo(16.764f)
                curveTo(17.143f, 12f, 17.489f, 11.786f, 17.658f, 11.447f)
                lineTo(19.882f, 7f)
                close()
                moveTo(11f, 14f)
                horizontalLineTo(7.236f)
                curveTo(6.1f, 14f, 5.061f, 13.358f, 4.553f, 12.342f)
                lineTo(3f, 9.236f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(9.236f)
                lineTo(19.447f, 12.342f)
                curveTo(18.939f, 13.358f, 17.9f, 14f, 16.764f, 14f)
                horizontalLineTo(13f)
                curveTo(13f, 14.552f, 12.552f, 15f, 12f, 15f)
                curveTo(11.448f, 15f, 11f, 14.552f, 11f, 14f)
                close()
            }
        }.build()

        return _Suitcase!!
    }

@Suppress("ObjectPropertyName")
private var _Suitcase: ImageVector? = null
