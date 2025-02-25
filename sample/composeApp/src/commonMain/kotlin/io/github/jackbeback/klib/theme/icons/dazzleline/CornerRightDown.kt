package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerRightDown: ImageVector
    get() {
        if (_CornerRightDown != null) {
            return _CornerRightDown!!
        }
        _CornerRightDown = ImageVector.Builder(
            name = "CornerRightDown",
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
                horizontalLineTo(6.4f)
                curveTo(9.76f, 4f, 11.441f, 4f, 12.724f, 4.654f)
                curveTo(13.853f, 5.229f, 14.771f, 6.147f, 15.346f, 7.276f)
                curveTo(16f, 8.56f, 16f, 10.24f, 16f, 13.6f)
                lineTo(16f, 20f)
                moveTo(16f, 20f)
                lineTo(12f, 16f)
                moveTo(16f, 20f)
                lineTo(20f, 16f)
            }
        }.build()

        return _CornerRightDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightDown: ImageVector? = null
