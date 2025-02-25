package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Document",
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
                curveTo(4.343f, 1f, 3f, 2.343f, 3f, 4f)
                verticalLineTo(20f)
                curveTo(3f, 21.657f, 4.343f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(19.657f, 23f, 21f, 21.657f, 21f, 20f)
                verticalLineTo(8.828f)
                curveTo(21f, 8.033f, 20.684f, 7.27f, 20.121f, 6.707f)
                lineTo(15.293f, 1.879f)
                curveTo(14.73f, 1.316f, 13.967f, 1f, 13.172f, 1f)
                horizontalLineTo(6f)
                close()
                moveTo(5f, 4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                curveTo(19f, 20.552f, 18.552f, 21f, 18f, 21f)
                horizontalLineTo(6f)
                curveTo(5.448f, 21f, 5f, 20.552f, 5f, 20f)
                verticalLineTo(4f)
                close()
                moveTo(18.586f, 8f)
                lineTo(14f, 3.414f)
                verticalLineTo(8f)
                horizontalLineTo(18.586f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null
