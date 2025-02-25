package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleRadiation: ImageVector
    get() {
        if (_CircleRadiation != null) {
            return _CircleRadiation!!
        }
        _CircleRadiation = ImageVector.Builder(
            name = "CircleRadiation",
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
                moveTo(14f, 12f)
                horizontalLineTo(18f)
                curveTo(18f, 9.877f, 16.798f, 8.02f, 15f, 7f)
                lineTo(12.869f, 10.198f)
                moveTo(14f, 12f)
                curveTo(14f, 13.105f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 13.105f, 10f, 12f)
                moveTo(14f, 12f)
                curveTo(14f, 10.895f, 13.105f, 10f, 12f, 10f)
                curveTo(10.895f, 10f, 10f, 10.895f, 10f, 12f)
                moveTo(10f, 12f)
                horizontalLineTo(6f)
                curveTo(6f, 9.877f, 7.202f, 8.02f, 9f, 7f)
                lineTo(11.131f, 10.198f)
                moveTo(11.131f, 13.802f)
                lineTo(9f, 17f)
                curveTo(9.876f, 17.635f, 10.903f, 18f, 12f, 18f)
                curveTo(13.097f, 18f, 14.123f, 17.635f, 15f, 17f)
                lineTo(12.869f, 13.802f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleRadiation!!
    }

@Suppress("ObjectPropertyName")
private var _CircleRadiation: ImageVector? = null
