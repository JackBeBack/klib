package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SnowAlt: ImageVector
    get() {
        if (_SnowAlt != null) {
            return _SnowAlt!!
        }
        _SnowAlt = ImageVector.Builder(
            name = "SnowAlt",
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
                verticalLineTo(21f)
                moveTo(10f, 4f)
                lineTo(12f, 6f)
                lineTo(14f, 4f)
                moveTo(10f, 20f)
                lineTo(12f, 18f)
                lineTo(14f, 20f)
                moveTo(4.232f, 7.5f)
                lineTo(19.821f, 16.5f)
                moveTo(4.111f, 9.509f)
                lineTo(6.57f, 8.85f)
                lineTo(5.911f, 6.391f)
                moveTo(18.141f, 17.609f)
                lineTo(17.482f, 15.15f)
                lineTo(19.941f, 14.491f)
                moveTo(19.82f, 7.5f)
                lineTo(4.232f, 16.5f)
                moveTo(18.141f, 6.391f)
                lineTo(17.483f, 8.85f)
                lineTo(19.941f, 9.509f)
                moveTo(4.112f, 14.491f)
                lineTo(6.571f, 15.15f)
                lineTo(5.912f, 17.609f)
            }
        }.build()

        return _SnowAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SnowAlt: ImageVector? = null
