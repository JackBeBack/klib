package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerUpRight: ImageVector
    get() {
        if (_CornerUpRight != null) {
            return _CornerUpRight!!
        }
        _CornerUpRight = ImageVector.Builder(
            name = "CornerUpRight",
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
                verticalLineTo(17.6f)
                curveTo(4f, 14.24f, 4f, 12.559f, 4.654f, 11.276f)
                curveTo(5.229f, 10.147f, 6.147f, 9.229f, 7.276f, 8.654f)
                curveTo(8.56f, 8f, 10.24f, 8f, 13.6f, 8f)
                horizontalLineTo(20f)
                moveTo(20f, 8f)
                lineTo(16f, 12f)
                moveTo(20f, 8f)
                lineTo(16f, 4f)
            }
        }.build()

        return _CornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpRight: ImageVector? = null
