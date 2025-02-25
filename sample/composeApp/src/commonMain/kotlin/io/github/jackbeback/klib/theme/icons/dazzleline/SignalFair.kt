package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignalFair: ImageVector
    get() {
        if (_SignalFair != null) {
            return _SignalFair!!
        }
        _SignalFair = ImageVector.Builder(
            name = "SignalFair",
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
                moveTo(4f, 20f)
                verticalLineTo(19f)
                moveTo(8f, 20f)
                verticalLineTo(16f)
            }
        }.build()

        return _SignalFair!!
    }

@Suppress("ObjectPropertyName")
private var _SignalFair: ImageVector? = null
