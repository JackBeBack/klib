package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignalGood: ImageVector
    get() {
        if (_SignalGood != null) {
            return _SignalGood!!
        }
        _SignalGood = ImageVector.Builder(
            name = "SignalGood",
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
                moveTo(12f, 20f)
                verticalLineTo(12f)
            }
        }.build()

        return _SignalGood!!
    }

@Suppress("ObjectPropertyName")
private var _SignalGood: ImageVector? = null
