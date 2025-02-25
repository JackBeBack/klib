package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Book: ImageVector
    get() {
        if (_Book != null) {
            return _Book!!
        }
        _Book = ImageVector.Builder(
            name = "Book",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 19f)
                verticalLineTo(6.2f)
                curveTo(4f, 5.08f, 4f, 4.52f, 4.218f, 4.092f)
                curveTo(4.41f, 3.716f, 4.716f, 3.41f, 5.092f, 3.218f)
                curveTo(5.52f, 3f, 6.08f, 3f, 7.2f, 3f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 3f, 18.48f, 3f, 18.908f, 3.218f)
                curveTo(19.284f, 3.41f, 19.59f, 3.716f, 19.782f, 4.092f)
                curveTo(20f, 4.52f, 20f, 5.08f, 20f, 6.2f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                curveTo(4.895f, 17f, 4f, 17.895f, 4f, 19f)
                close()
                moveTo(4f, 19f)
                curveTo(4f, 20.105f, 4.895f, 21f, 6f, 21f)
                horizontalLineTo(20f)
                moveTo(9f, 7f)
                horizontalLineTo(15f)
                moveTo(9f, 11f)
                horizontalLineTo(15f)
                moveTo(19f, 17f)
                verticalLineTo(21f)
            }
        }.build()

        return _Book!!
    }

@Suppress("ObjectPropertyName")
private var _Book: ImageVector? = null
