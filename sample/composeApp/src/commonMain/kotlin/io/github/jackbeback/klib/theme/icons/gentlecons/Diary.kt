package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Diary: ImageVector
    get() {
        if (_Diary != null) {
            return _Diary!!
        }
        _Diary = ImageVector.Builder(
            name = "Diary",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 8f)
                curveTo(7f, 6.895f, 7.895f, 6f, 9f, 6f)
                horizontalLineTo(15f)
                curveTo(16.105f, 6f, 17f, 6.895f, 17f, 8f)
                verticalLineTo(10f)
                curveTo(17f, 11.105f, 16.105f, 12f, 15f, 12f)
                horizontalLineTo(9f)
                curveTo(7.895f, 12f, 7f, 11.105f, 7f, 10f)
                verticalLineTo(8f)
                close()
                moveTo(9f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 1f)
                curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
                verticalLineTo(21f)
                curveTo(3f, 22.105f, 3.895f, 23f, 5f, 23f)
                horizontalLineTo(17f)
                curveTo(19.209f, 23f, 21f, 21.209f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 2.791f, 19.209f, 1f, 17f, 1f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                horizontalLineTo(17f)
                curveTo(18.105f, 3f, 19f, 3.895f, 19f, 5f)
                verticalLineTo(19f)
                curveTo(19f, 20.105f, 18.105f, 21f, 17f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Diary!!
    }

@Suppress("ObjectPropertyName")
private var _Diary: ImageVector? = null
