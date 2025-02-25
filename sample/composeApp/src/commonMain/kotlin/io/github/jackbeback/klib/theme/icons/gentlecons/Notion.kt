package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Notion: ImageVector
    get() {
        if (_Notion != null) {
            return _Notion!!
        }
        _Notion = ImageVector.Builder(
            name = "Notion",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(10f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(9.5f)
                lineTo(14.218f, 17.327f)
                curveTo(14.687f, 18.031f, 15.547f, 18.363f, 16.367f, 18.158f)
                lineTo(16.621f, 18.095f)
                curveTo(16.844f, 18.039f, 17f, 17.839f, 17f, 17.61f)
                verticalLineTo(7f)
                curveTo(17f, 7f, 18f, 7f, 18f, 6f)
                horizontalLineTo(15f)
                curveTo(14f, 6f, 14f, 7f, 14f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                lineTo(10.15f, 6.209f)
                curveTo(10.056f, 6.078f, 9.904f, 6f, 9.743f, 6f)
                horizontalLineTo(7f)
                curveTo(6f, 6f, 6f, 7f, 6f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 17f, 6f, 17f, 6f, 18f)
                horizontalLineTo(9f)
                curveTo(10f, 18f, 10f, 17f, 10f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                close()
            }
        }.build()

        return _Notion!!
    }

@Suppress("ObjectPropertyName")
private var _Notion: ImageVector? = null
