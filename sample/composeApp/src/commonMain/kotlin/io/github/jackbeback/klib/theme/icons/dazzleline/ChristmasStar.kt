package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChristmasStar: ImageVector
    get() {
        if (_ChristmasStar != null) {
            return _ChristmasStar!!
        }
        _ChristmasStar = ImageVector.Builder(
            name = "ChristmasStar",
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
                moveTo(12.861f, 6.805f)
                lineTo(14.546f, 10.336f)
                lineTo(20f, 11.094f)
                lineTo(16f, 15.289f)
                lineTo(17.092f, 21f)
                lineTo(12f, 18.711f)
                lineTo(6.908f, 21f)
                lineTo(8f, 15.289f)
                lineTo(4f, 11.094f)
                lineTo(9.454f, 10.336f)
                lineTo(11.139f, 6.805f)
                moveTo(12.861f, 6.805f)
                curveTo(13.535f, 6.484f, 14f, 5.796f, 14f, 5f)
                curveTo(14f, 3.895f, 13.105f, 3f, 12f, 3f)
                curveTo(10.895f, 3f, 10f, 3.895f, 10f, 5f)
                curveTo(10f, 5.796f, 10.465f, 6.484f, 11.139f, 6.805f)
                moveTo(12.861f, 6.805f)
                curveTo(12.601f, 6.93f, 12.309f, 7f, 12f, 7f)
                curveTo(11.691f, 7f, 11.399f, 6.93f, 11.139f, 6.805f)
            }
        }.build()

        return _ChristmasStar!!
    }

@Suppress("ObjectPropertyName")
private var _ChristmasStar: ImageVector? = null
