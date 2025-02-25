package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AlarmExclamation: ImageVector
    get() {
        if (_AlarmExclamation != null) {
            return _AlarmExclamation!!
        }
        _AlarmExclamation = ImageVector.Builder(
            name = "AlarmExclamation",
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
                moveTo(12f, 12.582f)
                verticalLineTo(9.581f)
                moveTo(12f, 15.582f)
                horizontalLineTo(12.01f)
                moveTo(19f, 20.581f)
                lineTo(16.409f, 18.018f)
                moveTo(5f, 20.581f)
                lineTo(7.59f, 18.018f)
                moveTo(6.742f, 3.997f)
                curveTo(6.367f, 3.622f, 5.859f, 3.412f, 5.328f, 3.412f)
                curveTo(4.798f, 3.412f, 4.289f, 3.622f, 3.914f, 3.997f)
                curveTo(3.539f, 4.372f, 3.328f, 4.881f, 3.328f, 5.412f)
                curveTo(3.328f, 5.942f, 3.539f, 6.451f, 3.914f, 6.826f)
                moveTo(20.086f, 6.824f)
                curveTo(20.461f, 6.449f, 20.672f, 5.94f, 20.672f, 5.41f)
                curveTo(20.672f, 4.879f, 20.461f, 4.371f, 20.086f, 3.996f)
                curveTo(19.711f, 3.621f, 19.202f, 3.41f, 18.672f, 3.41f)
                curveTo(18.141f, 3.41f, 17.632f, 3.621f, 17.257f, 3.996f)
                moveTo(19f, 12.582f)
                curveTo(19f, 16.448f, 15.866f, 19.581f, 12f, 19.581f)
                curveTo(8.134f, 19.581f, 5f, 16.448f, 5f, 12.582f)
                curveTo(5f, 8.715f, 8.134f, 5.581f, 12f, 5.581f)
                curveTo(15.866f, 5.581f, 19f, 8.715f, 19f, 12.582f)
                close()
            }
        }.build()

        return _AlarmExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmExclamation: ImageVector? = null
