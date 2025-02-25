package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.DoubleBed: ImageVector
    get() {
        if (_DoubleBed != null) {
            return _DoubleBed!!
        }
        _DoubleBed = ImageVector.Builder(
            name = "DoubleBed",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 10.171f)
                verticalLineTo(6f)
                curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.657f, 3f, 22f, 4.343f, 22f, 6f)
                verticalLineTo(10.171f)
                curveTo(23.165f, 10.583f, 24f, 11.694f, 24f, 13f)
                verticalLineTo(20f)
                curveTo(24f, 20.552f, 23.552f, 21f, 23f, 21f)
                curveTo(22.448f, 21f, 22f, 20.552f, 22f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 20.552f, 1.552f, 21f, 1f, 21f)
                curveTo(0.448f, 21f, 0f, 20.552f, 0f, 20f)
                verticalLineTo(13f)
                curveTo(0f, 11.694f, 0.835f, 10.583f, 2f, 10.171f)
                close()
                moveTo(4f, 6f)
                curveTo(4f, 5.448f, 4.448f, 5f, 5f, 5f)
                horizontalLineTo(19f)
                curveTo(19.552f, 5f, 20f, 5.448f, 20f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                curveTo(19f, 7.343f, 17.657f, 6f, 16f, 6f)
                horizontalLineTo(14f)
                curveTo(13.232f, 6f, 12.531f, 6.289f, 12f, 6.764f)
                curveTo(11.469f, 6.289f, 10.768f, 6f, 10f, 6f)
                horizontalLineTo(8f)
                curveTo(6.343f, 6f, 5f, 7.343f, 5f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveTo(17f, 10f)
                verticalLineTo(9f)
                curveTo(17f, 8.448f, 16.552f, 8f, 16f, 8f)
                horizontalLineTo(14f)
                curveTo(13.448f, 8f, 13f, 8.448f, 13f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                close()
                moveTo(11f, 10f)
                verticalLineTo(9f)
                curveTo(11f, 8.448f, 10.552f, 8f, 10f, 8f)
                horizontalLineTo(8f)
                curveTo(7.448f, 8f, 7f, 8.448f, 7f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                close()
                moveTo(21f, 12f)
                curveTo(21.552f, 12f, 22f, 12.448f, 22f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                curveTo(2f, 12.448f, 2.448f, 12f, 3f, 12f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _DoubleBed!!
    }

@Suppress("ObjectPropertyName")
private var _DoubleBed: ImageVector? = null
