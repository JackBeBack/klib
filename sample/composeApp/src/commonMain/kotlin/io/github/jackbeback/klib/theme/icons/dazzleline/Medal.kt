package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Medal",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.92f, 12.896f)
                lineTo(19.258f, 8.89f)
                curveTo(19.533f, 8.56f, 19.67f, 8.396f, 19.768f, 8.211f)
                curveTo(19.855f, 8.047f, 19.918f, 7.871f, 19.957f, 7.69f)
                curveTo(20f, 7.485f, 20f, 7.271f, 20f, 6.841f)
                verticalLineTo(6.2f)
                curveTo(20f, 5.08f, 20f, 4.52f, 19.782f, 4.092f)
                curveTo(19.59f, 3.716f, 19.284f, 3.41f, 18.908f, 3.218f)
                curveTo(18.48f, 3f, 17.92f, 3f, 16.8f, 3f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 3f, 5.52f, 3f, 5.092f, 3.218f)
                curveTo(4.716f, 3.41f, 4.41f, 3.716f, 4.218f, 4.092f)
                curveTo(4f, 4.52f, 4f, 5.08f, 4f, 6.2f)
                verticalLineTo(6.841f)
                curveTo(4f, 7.271f, 4f, 7.485f, 4.043f, 7.69f)
                curveTo(4.082f, 7.871f, 4.145f, 8.047f, 4.232f, 8.211f)
                curveTo(4.33f, 8.396f, 4.467f, 8.56f, 4.742f, 8.89f)
                lineTo(8.08f, 12.896f)
                moveTo(13.401f, 11.199f)
                lineTo(19.367f, 3.54f)
                moveTo(10.599f, 11.199f)
                lineTo(4.639f, 3.534f)
                moveTo(6.557f, 6f)
                horizontalLineTo(17.451f)
                moveTo(17f, 16f)
                curveTo(17f, 18.761f, 14.761f, 21f, 12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                curveTo(7f, 13.239f, 9.239f, 11f, 12f, 11f)
                curveTo(14.761f, 11f, 17f, 13.239f, 17f, 16f)
                close()
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
