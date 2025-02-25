package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerDownLeft: ImageVector
    get() {
        if (_CornerDownLeft != null) {
            return _CornerDownLeft!!
        }
        _CornerDownLeft = ImageVector.Builder(
            name = "CornerDownLeft",
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
                moveTo(20f, 4f)
                verticalLineTo(6.4f)
                curveTo(20f, 9.76f, 20f, 11.441f, 19.346f, 12.724f)
                curveTo(18.771f, 13.853f, 17.853f, 14.771f, 16.724f, 15.346f)
                curveTo(15.441f, 16f, 13.76f, 16f, 10.4f, 16f)
                horizontalLineTo(4f)
                moveTo(4f, 16f)
                lineTo(8f, 12f)
                moveTo(4f, 16f)
                lineTo(8f, 20f)
            }
        }.build()

        return _CornerDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownLeft: ImageVector? = null
