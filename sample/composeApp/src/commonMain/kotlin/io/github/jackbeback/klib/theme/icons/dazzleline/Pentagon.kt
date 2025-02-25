package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Pentagon: ImageVector
    get() {
        if (_Pentagon != null) {
            return _Pentagon!!
        }
        _Pentagon = ImageVector.Builder(
            name = "Pentagon",
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
                moveTo(10.119f, 4.094f)
                curveTo(10.795f, 3.603f, 11.133f, 3.358f, 11.503f, 3.263f)
                curveTo(11.829f, 3.179f, 12.171f, 3.179f, 12.498f, 3.263f)
                curveTo(12.867f, 3.358f, 13.205f, 3.603f, 13.881f, 4.094f)
                lineTo(19.63f, 8.271f)
                curveTo(20.306f, 8.762f, 20.644f, 9.008f, 20.848f, 9.33f)
                curveTo(21.029f, 9.614f, 21.134f, 9.94f, 21.156f, 10.276f)
                curveTo(21.18f, 10.657f, 21.05f, 11.054f, 20.792f, 11.849f)
                lineTo(18.596f, 18.607f)
                curveTo(18.338f, 19.402f, 18.209f, 19.799f, 17.966f, 20.093f)
                curveTo(17.751f, 20.352f, 17.474f, 20.553f, 17.161f, 20.677f)
                curveTo(16.806f, 20.818f, 16.389f, 20.818f, 15.553f, 20.818f)
                horizontalLineTo(8.447f)
                curveTo(7.612f, 20.818f, 7.194f, 20.818f, 6.839f, 20.677f)
                curveTo(6.526f, 20.553f, 6.249f, 20.352f, 6.034f, 20.093f)
                curveTo(5.791f, 19.799f, 5.662f, 19.402f, 5.404f, 18.607f)
                lineTo(3.208f, 11.849f)
                curveTo(2.95f, 11.054f, 2.821f, 10.657f, 2.845f, 10.276f)
                curveTo(2.866f, 9.94f, 2.972f, 9.614f, 3.152f, 9.33f)
                curveTo(3.356f, 9.008f, 3.694f, 8.762f, 4.37f, 8.271f)
                lineTo(10.119f, 4.094f)
                close()
            }
        }.build()

        return _Pentagon!!
    }

@Suppress("ObjectPropertyName")
private var _Pentagon: ImageVector? = null
