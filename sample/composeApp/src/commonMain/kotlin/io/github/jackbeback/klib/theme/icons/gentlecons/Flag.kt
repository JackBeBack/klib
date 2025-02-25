package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Flag",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 1f)
                curveTo(4.448f, 1f, 4f, 1.448f, 4f, 2f)
                verticalLineTo(22f)
                curveTo(4f, 22.552f, 4.448f, 23f, 5f, 23f)
                curveTo(5.552f, 23f, 6f, 22.552f, 6f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                curveTo(19.36f, 14f, 19.693f, 13.806f, 19.87f, 13.493f)
                curveTo(20.048f, 13.179f, 20.043f, 12.794f, 19.858f, 12.486f)
                lineTo(17.166f, 8f)
                lineTo(19.858f, 3.514f)
                curveTo(20.043f, 3.206f, 20.048f, 2.821f, 19.87f, 2.507f)
                curveTo(19.693f, 2.194f, 19.36f, 2f, 19f, 2f)
                lineTo(6f, 2f)
                curveTo(6f, 1.448f, 5.552f, 1f, 5f, 1f)
                close()
                moveTo(6f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(17.234f)
                lineTo(15.142f, 8.514f)
                curveTo(14.953f, 8.198f, 14.953f, 7.802f, 15.142f, 7.485f)
                lineTo(17.234f, 4f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
