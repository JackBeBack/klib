package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DazzlingStar: ImageVector
    get() {
        if (_DazzlingStar != null) {
            return _DazzlingStar!!
        }
        _DazzlingStar = ImageVector.Builder(
            name = "DazzlingStar",
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
                moveTo(12f, 3f)
                verticalLineTo(5f)
                moveTo(12f, 19f)
                verticalLineTo(21f)
                moveTo(3f, 12f)
                horizontalLineTo(5f)
                moveTo(19f, 12f)
                horizontalLineTo(21f)
                moveTo(5.637f, 5.636f)
                lineTo(7.052f, 7.05f)
                moveTo(16.951f, 16.95f)
                lineTo(18.365f, 18.364f)
                moveTo(5.637f, 18.364f)
                lineTo(7.052f, 16.95f)
                moveTo(16.951f, 7.05f)
                lineTo(18.365f, 5.636f)
                moveTo(12f, 8f)
                lineTo(13.236f, 10.633f)
                lineTo(16f, 11.058f)
                lineTo(14f, 13.106f)
                lineTo(14.472f, 16f)
                lineTo(12f, 14.633f)
                lineTo(9.528f, 16f)
                lineTo(10f, 13.106f)
                lineTo(8f, 11.058f)
                lineTo(10.764f, 10.633f)
                lineTo(12f, 8f)
                close()
            }
        }.build()

        return _DazzlingStar!!
    }

@Suppress("ObjectPropertyName")
private var _DazzlingStar: ImageVector? = null
