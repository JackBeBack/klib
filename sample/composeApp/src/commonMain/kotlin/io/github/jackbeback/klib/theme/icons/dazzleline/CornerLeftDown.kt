package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CornerLeftDown: ImageVector
    get() {
        if (_CornerLeftDown != null) {
            return _CornerLeftDown!!
        }
        _CornerLeftDown = ImageVector.Builder(
            name = "CornerLeftDown",
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
                horizontalLineTo(17.6f)
                curveTo(14.24f, 4f, 12.559f, 4f, 11.276f, 4.654f)
                curveTo(10.147f, 5.229f, 9.229f, 6.147f, 8.654f, 7.276f)
                curveTo(8f, 8.56f, 8f, 10.24f, 8f, 13.6f)
                verticalLineTo(20f)
                moveTo(8f, 20f)
                lineTo(12f, 16f)
                moveTo(8f, 20f)
                lineTo(4f, 16f)
            }
        }.build()

        return _CornerLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _CornerLeftDown: ImageVector? = null
