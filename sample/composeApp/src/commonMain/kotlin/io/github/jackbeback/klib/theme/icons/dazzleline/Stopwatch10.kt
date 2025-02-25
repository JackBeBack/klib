package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Stopwatch10: ImageVector
    get() {
        if (_Stopwatch10 != null) {
            return _Stopwatch10!!
        }
        _Stopwatch10 = ImageVector.Builder(
            name = "Stopwatch10",
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
                moveTo(20.5f, 6.5f)
                lineTo(18.5f, 4.5f)
                moveTo(9.5f, 2.5f)
                horizontalLineTo(13.5f)
                moveTo(7.2f, 12.214f)
                lineTo(9.2f, 10.5f)
                verticalLineTo(16.5f)
                moveTo(19.5f, 13.5f)
                curveTo(19.5f, 17.918f, 15.918f, 21.5f, 11.5f, 21.5f)
                curveTo(7.082f, 21.5f, 3.5f, 17.918f, 3.5f, 13.5f)
                curveTo(3.5f, 9.082f, 7.082f, 5.5f, 11.5f, 5.5f)
                curveTo(15.918f, 5.5f, 19.5f, 9.082f, 19.5f, 13.5f)
                close()
                moveTo(13.7f, 16.5f)
                curveTo(12.872f, 16.5f, 12.2f, 15.828f, 12.2f, 15f)
                verticalLineTo(12f)
                curveTo(12.2f, 11.172f, 12.872f, 10.5f, 13.7f, 10.5f)
                curveTo(14.528f, 10.5f, 15.2f, 11.172f, 15.2f, 12f)
                verticalLineTo(15f)
                curveTo(15.2f, 15.828f, 14.528f, 16.5f, 13.7f, 16.5f)
                close()
            }
        }.build()

        return _Stopwatch10!!
    }

@Suppress("ObjectPropertyName")
private var _Stopwatch10: ImageVector? = null
