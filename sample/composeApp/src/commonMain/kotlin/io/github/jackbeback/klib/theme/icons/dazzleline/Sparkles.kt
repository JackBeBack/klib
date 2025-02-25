package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) {
            return _Sparkles!!
        }
        _Sparkles = ImageVector.Builder(
            name = "Sparkles",
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
                moveTo(19f, 3f)
                verticalLineTo(7f)
                moveTo(17f, 5f)
                horizontalLineTo(21f)
                moveTo(19f, 17f)
                verticalLineTo(21f)
                moveTo(17f, 19f)
                horizontalLineTo(21f)
                moveTo(10f, 5f)
                lineTo(8.53f, 8.727f)
                curveTo(8.342f, 9.204f, 8.248f, 9.442f, 8.104f, 9.643f)
                curveTo(7.977f, 9.821f, 7.821f, 9.977f, 7.643f, 10.104f)
                curveTo(7.442f, 10.248f, 7.204f, 10.342f, 6.727f, 10.53f)
                lineTo(3f, 12f)
                lineTo(6.727f, 13.47f)
                curveTo(7.204f, 13.658f, 7.442f, 13.752f, 7.643f, 13.896f)
                curveTo(7.821f, 14.023f, 7.977f, 14.179f, 8.104f, 14.357f)
                curveTo(8.248f, 14.558f, 8.342f, 14.796f, 8.53f, 15.273f)
                lineTo(10f, 19f)
                lineTo(11.47f, 15.273f)
                curveTo(11.658f, 14.796f, 11.752f, 14.558f, 11.896f, 14.357f)
                curveTo(12.023f, 14.179f, 12.179f, 14.023f, 12.357f, 13.896f)
                curveTo(12.558f, 13.752f, 12.796f, 13.658f, 13.273f, 13.47f)
                lineTo(17f, 12f)
                lineTo(13.273f, 10.53f)
                curveTo(12.796f, 10.342f, 12.558f, 10.248f, 12.357f, 10.104f)
                curveTo(12.179f, 9.977f, 12.023f, 9.821f, 11.896f, 9.643f)
                curveTo(11.752f, 9.442f, 11.658f, 9.204f, 11.47f, 8.727f)
                lineTo(10f, 5f)
                close()
            }
        }.build()

        return _Sparkles!!
    }

@Suppress("ObjectPropertyName")
private var _Sparkles: ImageVector? = null
