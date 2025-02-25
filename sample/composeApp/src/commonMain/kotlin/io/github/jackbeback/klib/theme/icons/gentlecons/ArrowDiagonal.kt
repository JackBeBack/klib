package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ArrowDiagonal: ImageVector
    get() {
        if (_ArrowDiagonal != null) {
            return _ArrowDiagonal!!
        }
        _ArrowDiagonal = ImageVector.Builder(
            name = "ArrowDiagonal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21f, 7f)
                curveTo(21f, 7.552f, 21.448f, 8f, 22f, 8f)
                curveTo(22.552f, 8f, 23f, 7.552f, 23f, 7f)
                verticalLineTo(3f)
                curveTo(23f, 1.895f, 22.105f, 1f, 21f, 1f)
                horizontalLineTo(17f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                curveTo(16f, 2.552f, 16.448f, 3f, 17f, 3f)
                horizontalLineTo(19.586f)
                lineTo(3f, 19.586f)
                verticalLineTo(17f)
                curveTo(3f, 16.448f, 2.552f, 16f, 2f, 16f)
                curveTo(1.448f, 16f, 1f, 16.448f, 1f, 17f)
                verticalLineTo(21f)
                curveTo(1f, 22.105f, 1.895f, 23f, 3f, 23f)
                horizontalLineTo(7f)
                curveTo(7.552f, 23f, 8f, 22.552f, 8f, 22f)
                curveTo(8f, 21.448f, 7.552f, 21f, 7f, 21f)
                horizontalLineTo(4.414f)
                lineTo(21f, 4.414f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ArrowDiagonal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDiagonal: ImageVector? = null
