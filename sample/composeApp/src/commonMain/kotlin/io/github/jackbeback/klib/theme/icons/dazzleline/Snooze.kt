package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Snooze: ImageVector
    get() {
        if (_Snooze != null) {
            return _Snooze!!
        }
        _Snooze = ImageVector.Builder(
            name = "Snooze",
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
                moveTo(3f, 12f)
                horizontalLineTo(10f)
                lineTo(3f, 21f)
                horizontalLineTo(10f)
                moveTo(10f, 3f)
                horizontalLineTo(14f)
                lineTo(10f, 8f)
                horizontalLineTo(14f)
                moveTo(17f, 12f)
                horizontalLineTo(21f)
                lineTo(17f, 17f)
                horizontalLineTo(21f)
            }
        }.build()

        return _Snooze!!
    }

@Suppress("ObjectPropertyName")
private var _Snooze: ImageVector? = null
