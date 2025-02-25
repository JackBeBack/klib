package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Bitcoin: ImageVector
    get() {
        if (_Bitcoin != null) {
            return _Bitcoin!!
        }
        _Bitcoin = ImageVector.Builder(
            name = "Bitcoin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2f)
                curveTo(9f, 1.448f, 9.448f, 1f, 10f, 1f)
                curveTo(10.552f, 1f, 11f, 1.448f, 11f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                curveTo(13f, 1.448f, 13.448f, 1f, 14f, 1f)
                curveTo(14.552f, 1f, 15f, 1.448f, 15f, 2f)
                verticalLineTo(4f)
                curveTo(18.592f, 4f, 20.875f, 6.009f, 20.875f, 8.5f)
                curveTo(20.875f, 9.911f, 20.142f, 11.168f, 18.854f, 11.992f)
                curveTo(20.166f, 12.815f, 20.913f, 14.077f, 20.913f, 15.5f)
                curveTo(20.913f, 17.998f, 18.61f, 20f, 15f, 20f)
                verticalLineTo(22f)
                curveTo(15f, 22.552f, 14.552f, 23f, 14f, 23f)
                curveTo(13.448f, 23f, 13f, 22.552f, 13f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                curveTo(11f, 22.552f, 10.552f, 23f, 10f, 23f)
                curveTo(9.448f, 23f, 9f, 22.552f, 9f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(3.448f, 20f, 3f, 19.552f, 3f, 19f)
                curveTo(3f, 18.448f, 3.448f, 18f, 4f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(3.448f, 6f, 3f, 5.552f, 3f, 5f)
                curveTo(3f, 4.448f, 3.448f, 4f, 4f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                close()
                moveTo(15f, 11f)
                curveTo(17.908f, 11f, 18.875f, 9.509f, 18.875f, 8.5f)
                curveTo(18.875f, 7.491f, 17.908f, 6f, 15f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                close()
                moveTo(8f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                curveTo(17.941f, 18f, 18.913f, 16.502f, 18.913f, 15.5f)
                curveTo(18.913f, 14.498f, 17.941f, 13f, 15f, 13f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Bitcoin!!
    }

@Suppress("ObjectPropertyName")
private var _Bitcoin: ImageVector? = null
