package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.PaintRoller: ImageVector
    get() {
        if (_PaintRoller != null) {
            return _PaintRoller!!
        }
        _PaintRoller = ImageVector.Builder(
            name = "PaintRoller",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 4f)
                curveTo(5f, 2.343f, 6.343f, 1f, 8f, 1f)
                horizontalLineTo(20f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(6f)
                curveTo(23f, 7.657f, 21.657f, 9f, 20f, 9f)
                horizontalLineTo(8f)
                curveTo(6.343f, 9f, 5f, 7.657f, 5f, 6f)
                horizontalLineTo(4f)
                curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
                verticalLineTo(9f)
                curveTo(3f, 9.552f, 3.448f, 10f, 4f, 10f)
                horizontalLineTo(12f)
                curveTo(13.657f, 10f, 15f, 11.343f, 15f, 13f)
                verticalLineTo(14f)
                curveTo(16.105f, 14f, 17f, 14.895f, 17f, 16f)
                lineTo(17f, 21f)
                curveTo(17f, 22.105f, 16.105f, 23f, 15f, 23f)
                horizontalLineTo(13f)
                curveTo(11.895f, 23f, 11f, 22.105f, 11f, 21f)
                verticalLineTo(16f)
                curveTo(11f, 14.895f, 11.895f, 14f, 13f, 14f)
                verticalLineTo(13f)
                curveTo(13f, 12.448f, 12.552f, 12f, 12f, 12f)
                horizontalLineTo(4f)
                curveTo(2.343f, 12f, 1f, 10.657f, 1f, 9f)
                verticalLineTo(7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                close()
                moveTo(8f, 3f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(6f)
                curveTo(7f, 6.552f, 7.448f, 7f, 8f, 7f)
                horizontalLineTo(20f)
                curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(8f)
                close()
                moveTo(15f, 21f)
                lineTo(15f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _PaintRoller!!
    }

@Suppress("ObjectPropertyName")
private var _PaintRoller: ImageVector? = null
