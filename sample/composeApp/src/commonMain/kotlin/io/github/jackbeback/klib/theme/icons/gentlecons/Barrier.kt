package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Barrier: ImageVector
    get() {
        if (_Barrier != null) {
            return _Barrier!!
        }
        _Barrier = ImageVector.Builder(
            name = "Barrier",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                curveTo(6.552f, 1f, 7f, 1.448f, 7f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                curveTo(17f, 1.448f, 17.448f, 1f, 18f, 1f)
                curveTo(18.552f, 1f, 19f, 1.448f, 19f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                curveTo(21.657f, 4f, 23f, 5.343f, 23f, 7f)
                verticalLineTo(11f)
                curveTo(23f, 12.657f, 21.657f, 14f, 20f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                curveTo(19f, 22.552f, 18.552f, 23f, 18f, 23f)
                curveTo(17.448f, 23f, 17f, 22.552f, 17f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                lineTo(7f, 22f)
                curveTo(7f, 22.552f, 6.552f, 23f, 6f, 23f)
                curveTo(5.448f, 23f, 5f, 22.552f, 5f, 22f)
                lineTo(5f, 14f)
                horizontalLineTo(4f)
                curveTo(2.343f, 14f, 1f, 12.657f, 1f, 11f)
                verticalLineTo(7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                curveTo(5f, 1.448f, 5.448f, 1f, 6f, 1f)
                close()
                moveTo(3f, 7f)
                curveTo(3f, 6.448f, 3.448f, 6f, 4f, 6f)
                horizontalLineTo(6.382f)
                lineTo(3.461f, 11.842f)
                curveTo(3.184f, 11.665f, 3f, 11.354f, 3f, 11f)
                verticalLineTo(7f)
                close()
                moveTo(5.618f, 12f)
                horizontalLineTo(7.382f)
                lineTo(10.382f, 6f)
                horizontalLineTo(8.618f)
                lineTo(5.618f, 12f)
                close()
                moveTo(12.618f, 6f)
                lineTo(9.618f, 12f)
                horizontalLineTo(11.382f)
                lineTo(14.382f, 6f)
                horizontalLineTo(12.618f)
                close()
                moveTo(16.618f, 6f)
                lineTo(13.618f, 12f)
                horizontalLineTo(15.382f)
                lineTo(18.382f, 6f)
                horizontalLineTo(16.618f)
                close()
                moveTo(20.539f, 6.158f)
                lineTo(17.618f, 12f)
                horizontalLineTo(20f)
                curveTo(20.552f, 12f, 21f, 11.552f, 21f, 11f)
                verticalLineTo(7f)
                curveTo(21f, 6.646f, 20.816f, 6.335f, 20.539f, 6.158f)
                close()
            }
        }.build()

        return _Barrier!!
    }

@Suppress("ObjectPropertyName")
private var _Barrier: ImageVector? = null
