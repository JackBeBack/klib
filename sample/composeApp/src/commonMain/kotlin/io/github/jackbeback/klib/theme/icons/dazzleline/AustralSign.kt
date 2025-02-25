package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AustralSign: ImageVector
    get() {
        if (_AustralSign != null) {
            return _AustralSign!!
        }
        _AustralSign = ImageVector.Builder(
            name = "AustralSign",
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
                moveTo(5f, 21f)
                lineTo(12f, 3f)
                lineTo(19f, 21f)
                moveTo(19f, 15f)
                horizontalLineTo(5f)
                moveTo(19f, 11f)
                horizontalLineTo(5f)
            }
        }.build()

        return _AustralSign!!
    }

@Suppress("ObjectPropertyName")
private var _AustralSign: ImageVector? = null
