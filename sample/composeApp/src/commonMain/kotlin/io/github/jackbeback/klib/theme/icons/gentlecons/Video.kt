package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Video: ImageVector
    get() {
        if (_Video != null) {
            return _Video!!
        }
        _Video = ImageVector.Builder(
            name = "Video",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 6f)
                curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 17.552f, 3.448f, 18f, 4f, 18f)
                horizontalLineTo(14f)
                curveTo(14.552f, 18f, 15f, 17.552f, 15f, 17f)
                verticalLineTo(15.934f)
                curveTo(15f, 14.736f, 16.335f, 14.022f, 17.332f, 14.686f)
                lineTo(21f, 17.132f)
                verticalLineTo(6.869f)
                lineTo(17.332f, 9.314f)
                curveTo(16.335f, 9.978f, 15f, 9.264f, 15f, 8.066f)
                verticalLineTo(7f)
                curveTo(15f, 6.448f, 14.552f, 6f, 14f, 6f)
                horizontalLineTo(4f)
                close()
                moveTo(1f, 7f)
                curveTo(1f, 5.343f, 2.343f, 4f, 4f, 4f)
                horizontalLineTo(14f)
                curveTo(15.657f, 4f, 17f, 5.343f, 17f, 7f)
                verticalLineTo(7.131f)
                lineTo(19.891f, 5.204f)
                curveTo(21.22f, 4.318f, 23f, 5.271f, 23f, 6.869f)
                verticalLineTo(17.132f)
                curveTo(23f, 18.729f, 21.22f, 19.682f, 19.891f, 18.796f)
                lineTo(17f, 16.868f)
                verticalLineTo(17f)
                curveTo(17f, 18.657f, 15.657f, 20f, 14f, 20f)
                horizontalLineTo(4f)
                curveTo(2.343f, 20f, 1f, 18.657f, 1f, 17f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _Video!!
    }

@Suppress("ObjectPropertyName")
private var _Video: ImageVector? = null
