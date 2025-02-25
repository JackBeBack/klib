package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerLeftUp: ImageVector
    get() {
        if (_CornerLeftUp != null) {
            return _CornerLeftUp!!
        }
        _CornerLeftUp = ImageVector.Builder(
            name = "CornerLeftUp",
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
                horizontalLineTo(17.6f)
                curveTo(14.24f, 20f, 12.559f, 20f, 11.276f, 19.346f)
                curveTo(10.147f, 18.771f, 9.229f, 17.853f, 8.654f, 16.724f)
                curveTo(8f, 15.441f, 8f, 13.76f, 8f, 10.4f)
                verticalLineTo(4f)
                moveTo(8f, 4f)
                lineTo(4f, 8f)
                moveTo(8f, 4f)
                lineTo(12f, 8f)
            }
        }.build()

        return _CornerLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftUp: ImageVector? = null
