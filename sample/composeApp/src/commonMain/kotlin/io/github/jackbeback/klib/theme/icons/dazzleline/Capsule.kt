package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Capsule: ImageVector
    get() {
        if (_Capsule != null) {
            return _Capsule!!
        }
        _Capsule = ImageVector.Builder(
            name = "Capsule",
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
                moveTo(15.5f, 8.5f)
                lineTo(8.501f, 15.5f)
                moveTo(11.5f, 4.5f)
                lineTo(19.5f, 12.5f)
                curveTo(21.434f, 14.433f, 21.434f, 17.567f, 19.5f, 19.5f)
                curveTo(17.567f, 21.433f, 14.434f, 21.433f, 12.5f, 19.5f)
                lineTo(4.501f, 11.5f)
                curveTo(2.568f, 9.567f, 2.568f, 6.433f, 4.501f, 4.5f)
                curveTo(6.434f, 2.567f, 9.568f, 2.567f, 11.5f, 4.5f)
                close()
            }
        }.build()

        return _Capsule!!
    }

@Suppress("ObjectPropertyName")
private var _Capsule: ImageVector? = null
