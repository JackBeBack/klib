package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Frame: ImageVector
    get() {
        if (_Frame != null) {
            return _Frame!!
        }
        _Frame = ImageVector.Builder(
            name = "Frame",
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
                verticalLineTo(6f)
                horizontalLineTo(2f)
                curveTo(1.448f, 6f, 1f, 6.448f, 1f, 7f)
                curveTo(1f, 7.552f, 1.448f, 8f, 2f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                curveTo(1.448f, 16f, 1f, 16.448f, 1f, 17f)
                curveTo(1f, 17.552f, 1.448f, 18f, 2f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                curveTo(6f, 22.552f, 6.448f, 23f, 7f, 23f)
                curveTo(7.552f, 23f, 8f, 22.552f, 8f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                curveTo(16f, 22.552f, 16.448f, 23f, 17f, 23f)
                curveTo(17.552f, 23f, 18f, 22.552f, 18f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                curveTo(22.552f, 18f, 23f, 17.552f, 23f, 17f)
                curveTo(23f, 16.448f, 22.552f, 16f, 22f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                curveTo(22.552f, 8f, 23f, 7.552f, 23f, 7f)
                curveTo(23f, 6.448f, 22.552f, 6f, 22f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                curveTo(18f, 1.448f, 17.552f, 1f, 17f, 1f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveTo(8f, 1.448f, 7.552f, 1f, 7f, 1f)
                close()
                moveTo(8f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Frame!!
    }

@Suppress("ObjectPropertyName")
private var _Frame: ImageVector? = null
