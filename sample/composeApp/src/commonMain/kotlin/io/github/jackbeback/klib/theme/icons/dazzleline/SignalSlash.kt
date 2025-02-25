package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SignalSlash: ImageVector
    get() {
        if (_SignalSlash != null) {
            return _SignalSlash!!
        }
        _SignalSlash = ImageVector.Builder(
            name = "SignalSlash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(20f, 4f)
                verticalLineTo(14.394f)
                moveTo(16f, 16f)
                verticalLineTo(20f)
                moveTo(16f, 8f)
                verticalLineTo(10.399f)
                moveTo(12f, 12f)
                verticalLineTo(20f)
                moveTo(8f, 16f)
                verticalLineTo(20f)
                moveTo(4f, 19f)
                verticalLineTo(20f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _SignalSlash!!
    }

@Suppress("ObjectPropertyName")
private var _SignalSlash: ImageVector? = null
