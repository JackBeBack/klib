package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleWaveformLines: ImageVector
    get() {
        if (_CircleWaveformLines != null) {
            return _CircleWaveformLines!!
        }
        _CircleWaveformLines = ImageVector.Builder(
            name = "CircleWaveformLines",
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
                moveTo(7.5f, 11f)
                verticalLineTo(13f)
                moveTo(13.5f, 8f)
                verticalLineTo(16f)
                moveTo(10.5f, 10f)
                verticalLineTo(14f)
                moveTo(16.5f, 10.5f)
                verticalLineTo(13.5f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleWaveformLines!!
    }

@Suppress("ObjectPropertyName")
private var _CircleWaveformLines: ImageVector? = null
