package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerDownRight: ImageVector
    get() {
        if (_CornerDownRight != null) {
            return _CornerDownRight!!
        }
        _CornerDownRight = ImageVector.Builder(
            name = "CornerDownRight",
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
                moveTo(4f, 4f)
                verticalLineTo(6.4f)
                curveTo(4f, 9.76f, 4f, 11.441f, 4.654f, 12.724f)
                curveTo(5.229f, 13.853f, 6.147f, 14.771f, 7.276f, 15.346f)
                curveTo(8.56f, 16f, 10.24f, 16f, 13.6f, 16f)
                horizontalLineTo(20f)
                moveTo(20f, 16f)
                lineTo(16f, 12f)
                moveTo(20f, 16f)
                lineTo(16f, 20f)
            }
        }.build()

        return _CornerDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerDownRight: ImageVector? = null
