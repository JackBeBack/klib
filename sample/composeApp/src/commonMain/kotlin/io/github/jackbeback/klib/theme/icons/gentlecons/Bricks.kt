package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bricks: ImageVector
    get() {
        if (_Bricks != null) {
            return _Bricks!!
        }
        _Bricks = ImageVector.Builder(
            name = "Bricks",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(17f)
                curveTo(18.105f, 1f, 19f, 1.895f, 19f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                curveTo(22.105f, 6f, 23f, 6.895f, 23f, 8f)
                verticalLineTo(11f)
                curveTo(23f, 12.105f, 22.105f, 13f, 21f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                curveTo(22.105f, 16f, 23f, 16.895f, 23f, 18f)
                verticalLineTo(21f)
                curveTo(23f, 22.105f, 22.105f, 23f, 21f, 23f)
                horizontalLineTo(7f)
                curveTo(5.895f, 23f, 5f, 22.105f, 5f, 21f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.895f, 18f, 1f, 17.105f, 1f, 16f)
                verticalLineTo(13f)
                curveTo(1f, 11.895f, 1.895f, 11f, 3f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                curveTo(1.895f, 8f, 1f, 7.105f, 1f, 6f)
                verticalLineTo(3f)
                close()
                moveTo(7f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                close()
                moveTo(15f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                close()
                moveTo(7f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                close()
                moveTo(15f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
                moveTo(17f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                lineTo(11f, 16f)
                horizontalLineTo(17f)
                close()
                moveTo(9f, 16f)
                lineTo(9f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                close()
                moveTo(17f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                close()
                moveTo(9f, 6f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _Bricks!!
    }

@Suppress("ObjectPropertyName")
private var _Bricks: ImageVector? = null
