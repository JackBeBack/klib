package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.TriangleRuler: ImageVector
    get() {
        if (_TriangleRuler != null) {
            return _TriangleRuler!!
        }
        _TriangleRuler = ImageVector.Builder(
            name = "TriangleRuler",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 9f)
                horizontalLineTo(21f)
                curveTo(22.105f, 9f, 23f, 8.105f, 23f, 7f)
                verticalLineTo(3f)
                curveTo(23f, 1.895f, 22.105f, 1f, 21f, 1f)
                horizontalLineTo(3f)
                curveTo(1.895f, 1f, 1f, 1.895f, 1f, 3f)
                verticalLineTo(21f)
                curveTo(1f, 22.105f, 1.895f, 23f, 3f, 23f)
                horizontalLineTo(7f)
                curveTo(8.105f, 23f, 9f, 22.105f, 9f, 21f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                curveTo(5.448f, 14f, 5f, 13.552f, 5f, 13f)
                curveTo(5f, 12.448f, 5.448f, 12f, 6f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                curveTo(5.448f, 9f, 5f, 8.552f, 5f, 8f)
                curveTo(5f, 7.448f, 5.448f, 7f, 6f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                curveTo(7f, 5.448f, 7.448f, 5f, 8f, 5f)
                curveTo(8.552f, 5f, 9f, 5.448f, 9f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                curveTo(12f, 5.448f, 12.448f, 5f, 13f, 5f)
                curveTo(13.552f, 5f, 14f, 5.448f, 14f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                curveTo(17f, 5.448f, 17.448f, 5f, 18f, 5f)
                curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(6f)
                curveTo(6.552f, 21f, 7f, 20.552f, 7f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                curveTo(5f, 17.448f, 5.448f, 17f, 6f, 17f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _TriangleRuler!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleRuler: ImageVector? = null
