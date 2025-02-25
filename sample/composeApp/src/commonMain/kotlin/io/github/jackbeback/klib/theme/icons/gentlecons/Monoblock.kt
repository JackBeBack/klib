package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Monoblock: ImageVector
    get() {
        if (_Monoblock != null) {
            return _Monoblock!!
        }
        _Monoblock = ImageVector.Builder(
            name = "Monoblock",
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
                verticalLineTo(15f)
                curveTo(1f, 16.657f, 2.343f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 21.448f, 5f, 22f)
                curveTo(5f, 22.552f, 5.448f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(18.552f, 23f, 19f, 22.552f, 19f, 22f)
                curveTo(19f, 21.448f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                curveTo(21.657f, 18f, 23f, 16.657f, 23f, 15f)
                verticalLineTo(4f)
                close()
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 14f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                curveTo(3f, 15.552f, 3.448f, 16f, 4f, 16f)
                horizontalLineTo(20f)
                curveTo(20.552f, 16f, 21f, 15.552f, 21f, 15f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Monoblock!!
    }

@Suppress("ObjectPropertyName")
private var _Monoblock: ImageVector? = null
