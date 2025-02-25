package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerRightUp: ImageVector
    get() {
        if (_CornerRightUp != null) {
            return _CornerRightUp!!
        }
        _CornerRightUp = ImageVector.Builder(
            name = "CornerRightUp",
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
                moveTo(4f, 20f)
                horizontalLineTo(6.4f)
                curveTo(9.76f, 20f, 11.441f, 20f, 12.724f, 19.346f)
                curveTo(13.853f, 18.771f, 14.771f, 17.853f, 15.346f, 16.724f)
                curveTo(16f, 15.441f, 16f, 13.76f, 16f, 10.4f)
                verticalLineTo(4f)
                moveTo(16f, 4f)
                lineTo(12f, 8f)
                moveTo(16f, 4f)
                lineTo(20f, 8f)
            }
        }.build()

        return _CornerRightUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightUp: ImageVector? = null
