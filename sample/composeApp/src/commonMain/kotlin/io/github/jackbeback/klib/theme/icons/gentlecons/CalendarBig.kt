package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CalendarBig: ImageVector
    get() {
        if (_CalendarBig != null) {
            return _CalendarBig!!
        }
        _CalendarBig = ImageVector.Builder(
            name = "CalendarBig",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                curveTo(6.448f, 1f, 6f, 1.448f, 6f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                curveTo(3.343f, 3f, 2f, 4.343f, 2f, 6f)
                verticalLineTo(20f)
                curveTo(2f, 21.657f, 3.343f, 23f, 5f, 23f)
                horizontalLineTo(19f)
                curveTo(20.657f, 23f, 22f, 21.657f, 22f, 20f)
                verticalLineTo(6f)
                curveTo(22f, 4.343f, 20.657f, 3f, 19f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                curveTo(18f, 1.448f, 17.552f, 1f, 17f, 1f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveTo(8f, 1.448f, 7.552f, 1f, 7f, 1f)
                close()
                moveTo(16f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                curveTo(8f, 6.552f, 7.552f, 7f, 7f, 7f)
                curveTo(6.448f, 7f, 6f, 6.552f, 6f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                curveTo(18f, 6.552f, 17.552f, 7f, 17f, 7f)
                curveTo(16.448f, 7f, 16f, 6.552f, 16f, 6f)
                close()
                moveTo(4f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                close()
                moveTo(4f, 17f)
                verticalLineTo(20f)
                curveTo(4f, 20.552f, 4.448f, 21f, 5f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                close()
                moveTo(10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                close()
                moveTo(16f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                curveTo(19.552f, 21f, 20f, 20.552f, 20f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                close()
                moveTo(20f, 15f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
                moveTo(14f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _CalendarBig!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarBig: ImageVector? = null
