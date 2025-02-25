package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerUpLeft: ImageVector
    get() {
        if (_CornerUpLeft != null) {
            return _CornerUpLeft!!
        }
        _CornerUpLeft = ImageVector.Builder(
            name = "CornerUpLeft",
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
                moveTo(20f, 20f)
                verticalLineTo(17.6f)
                curveTo(20f, 14.24f, 20f, 12.559f, 19.346f, 11.276f)
                curveTo(18.771f, 10.147f, 17.853f, 9.229f, 16.724f, 8.654f)
                curveTo(15.441f, 8f, 13.76f, 8f, 10.4f, 8f)
                horizontalLineTo(4f)
                moveTo(4f, 8f)
                lineTo(8f, 12f)
                moveTo(4f, 8f)
                lineTo(8f, 4f)
            }
        }.build()

        return _CornerUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpLeft: ImageVector? = null
