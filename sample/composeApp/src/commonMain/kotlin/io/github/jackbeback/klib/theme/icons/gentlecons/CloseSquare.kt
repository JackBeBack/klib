package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.CloseSquare: ImageVector
    get() {
        if (_CloseSquare != null) {
            return _CloseSquare!!
        }
        _CloseSquare = ImageVector.Builder(
            name = "CloseSquare",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(8.002f, 9.416f)
                curveTo(7.611f, 9.026f, 7.611f, 8.393f, 8.002f, 8.002f)
                curveTo(8.392f, 7.611f, 9.026f, 7.611f, 9.416f, 8.002f)
                lineTo(12.006f, 10.592f)
                lineTo(14.59f, 8.008f)
                curveTo(14.98f, 7.617f, 15.613f, 7.617f, 16.004f, 8.008f)
                curveTo(16.394f, 8.398f, 16.394f, 9.031f, 16.004f, 9.422f)
                lineTo(13.42f, 12.006f)
                lineTo(16.004f, 14.59f)
                curveTo(16.394f, 14.98f, 16.394f, 15.613f, 16.004f, 16.004f)
                curveTo(15.613f, 16.395f, 14.98f, 16.395f, 14.59f, 16.004f)
                lineTo(12.006f, 13.42f)
                lineTo(9.422f, 16.004f)
                curveTo(9.031f, 16.394f, 8.398f, 16.394f, 8.008f, 16.004f)
                curveTo(7.617f, 15.613f, 7.617f, 14.98f, 8.008f, 14.59f)
                lineTo(10.592f, 12.006f)
                lineTo(8.002f, 9.416f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.657f, 2.343f, 23f, 4f, 23f)
                horizontalLineTo(20f)
                curveTo(21.657f, 23f, 23f, 21.657f, 23f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 20.552f, 3.448f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.552f, 21f, 21f, 20.552f, 21f, 20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _CloseSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CloseSquare: ImageVector? = null
