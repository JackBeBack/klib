package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Calendar: ImageVector
    get() {
        if (_Calendar != null) {
            return _Calendar!!
        }
        _Calendar = ImageVector.Builder(
            name = "Calendar",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 2f)
                curveTo(6f, 1.448f, 6.448f, 1f, 7f, 1f)
                curveTo(7.552f, 1f, 8f, 1.448f, 8f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                curveTo(16f, 1.448f, 16.448f, 1f, 17f, 1f)
                curveTo(17.552f, 1f, 18f, 1.448f, 18f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
                verticalLineTo(20f)
                curveTo(22f, 21.657f, 20.657f, 23f, 19f, 23f)
                horizontalLineTo(5f)
                curveTo(3.343f, 23f, 2f, 21.657f, 2f, 20f)
                verticalLineTo(6f)
                curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                close()
                moveTo(16f, 5f)
                verticalLineTo(6f)
                curveTo(16f, 6.552f, 16.448f, 7f, 17f, 7f)
                curveTo(17.552f, 7f, 18f, 6.552f, 18f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                curveTo(19.552f, 5f, 20f, 5.448f, 20f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                curveTo(4f, 5.448f, 4.448f, 5f, 5f, 5f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                curveTo(6f, 6.552f, 6.448f, 7f, 7f, 7f)
                curveTo(7.552f, 7f, 8f, 6.552f, 8f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                close()
                moveTo(4f, 11f)
                verticalLineTo(20f)
                curveTo(4f, 20.552f, 4.448f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Calendar!!
    }

@Suppress("ObjectPropertyName")
private var _Calendar: ImageVector? = null
