package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Direction: ImageVector
    get() {
        if (_Direction != null) {
            return _Direction!!
        }
        _Direction = ImageVector.Builder(
            name = "Direction",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 2f)
                curveTo(11f, 1.448f, 11.448f, 1f, 12f, 1f)
                curveTo(12.552f, 1f, 13f, 1.448f, 13f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(17.948f)
                curveTo(18.629f, 3f, 19.29f, 3.232f, 19.822f, 3.657f)
                lineTo(22.048f, 5.438f)
                curveTo(23.049f, 6.239f, 23.049f, 7.761f, 22.048f, 8.562f)
                lineTo(19.822f, 10.343f)
                curveTo(19.29f, 10.768f, 18.629f, 11f, 17.948f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(3.343f, 11f, 2f, 9.657f, 2f, 8f)
                verticalLineTo(6f)
                curveTo(2f, 4.343f, 3.343f, 3f, 5f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                close()
                moveTo(5f, 5f)
                horizontalLineTo(17.948f)
                curveTo(18.175f, 5f, 18.395f, 5.077f, 18.572f, 5.219f)
                lineTo(20.31f, 6.61f)
                curveTo(20.561f, 6.81f, 20.561f, 7.19f, 20.31f, 7.39f)
                lineTo(18.572f, 8.781f)
                curveTo(18.395f, 8.923f, 18.175f, 9f, 17.948f, 9f)
                horizontalLineTo(5f)
                curveTo(4.448f, 9f, 4f, 8.552f, 4f, 8f)
                verticalLineTo(6f)
                curveTo(4f, 5.448f, 4.448f, 5f, 5f, 5f)
                close()
            }
        }.build()

        return _Direction!!
    }

@Suppress("ObjectPropertyName")
private var _Direction: ImageVector? = null
