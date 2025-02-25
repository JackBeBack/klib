package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Image: ImageVector
    get() {
        if (_Image != null) {
            return _Image!!
        }
        _Image = ImageVector.Builder(
            name = "Image",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.807f, 17.521f)
                lineTo(9.122f, 9.609f)
                curveTo(9.501f, 8.915f, 10.499f, 8.915f, 10.878f, 9.609f)
                lineTo(14.047f, 15.419f)
                lineTo(15.132f, 13.519f)
                curveTo(15.516f, 12.848f, 16.484f, 12.848f, 16.868f, 13.519f)
                lineTo(19.145f, 17.504f)
                curveTo(19.526f, 18.17f, 19.045f, 19f, 18.277f, 19f)
                horizontalLineTo(5.685f)
                curveTo(4.925f, 19f, 4.443f, 18.188f, 4.807f, 17.521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18f, 8f)
                curveTo(18f, 9.105f, 17.105f, 10f, 16f, 10f)
                curveTo(14.895f, 10f, 14f, 9.105f, 14f, 8f)
                curveTo(14f, 6.895f, 14.895f, 6f, 16f, 6f)
                curveTo(17.105f, 6f, 18f, 6.895f, 18f, 8f)
                close()
            }
        }.build()

        return _Image!!
    }

@Suppress("ObjectPropertyName")
private var _Image: ImageVector? = null
