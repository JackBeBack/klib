package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Thumbtack: ImageVector
    get() {
        if (_Thumbtack != null) {
            return _Thumbtack!!
        }
        _Thumbtack = ImageVector.Builder(
            name = "Thumbtack",
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
                moveTo(7.999f, 3f)
                verticalLineTo(8.5f)
                curveTo(6.178f, 9.868f, 5f, 12.047f, 5f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(14.5f)
                curveTo(19f, 12.047f, 17.822f, 9.868f, 16.001f, 8.5f)
                verticalLineTo(3f)
                moveTo(6f, 3f)
                horizontalLineTo(18f)
                moveTo(12f, 10f)
                verticalLineTo(21f)
            }
        }.build()

        return _Thumbtack!!
    }

@Suppress("ObjectPropertyName")
private var _Thumbtack: ImageVector? = null
