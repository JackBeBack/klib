package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Duplicate: ImageVector
    get() {
        if (_Duplicate != null) {
            return _Duplicate!!
        }
        _Duplicate = ImageVector.Builder(
            name = "Duplicate",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(18f)
                curveTo(3f, 18.552f, 2.552f, 19f, 2f, 19f)
                curveTo(1.448f, 19f, 1f, 18.552f, 1f, 18f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(18f)
                curveTo(18.552f, 1f, 19f, 1.448f, 19f, 2f)
                curveTo(19f, 2.552f, 18.552f, 3f, 18f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13f, 11f)
                curveTo(13f, 10.448f, 13.448f, 10f, 14f, 10f)
                curveTo(14.552f, 10f, 15f, 10.448f, 15f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                curveTo(17.552f, 13f, 18f, 13.448f, 18f, 14f)
                curveTo(18f, 14.552f, 17.552f, 15f, 17f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                curveTo(15f, 17.552f, 14.552f, 18f, 14f, 18f)
                curveTo(13.448f, 18f, 13f, 17.552f, 13f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                curveTo(10.448f, 15f, 10f, 14.552f, 10f, 14f)
                curveTo(10f, 13.448f, 10.448f, 13f, 11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 5f)
                curveTo(21.657f, 5f, 23f, 6.343f, 23f, 8f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(8f)
                curveTo(6.343f, 23f, 5f, 21.657f, 5f, 20f)
                verticalLineTo(8f)
                curveTo(5f, 6.343f, 6.343f, 5f, 8f, 5f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 7f)
                curveTo(20.552f, 7f, 21f, 7.448f, 21f, 8f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(8f)
                curveTo(7.448f, 21f, 7f, 20.552f, 7f, 20f)
                verticalLineTo(8f)
                curveTo(7f, 7.448f, 7.448f, 7f, 8f, 7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Duplicate!!
    }

@Suppress("ObjectPropertyName")
private var _Duplicate: ImageVector? = null
