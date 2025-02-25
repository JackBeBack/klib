package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GripLines: ImageVector
    get() {
        if (_GripLines != null) {
            return _GripLines!!
        }
        _GripLines = ImageVector.Builder(
            name = "GripLines",
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
                moveTo(4f, 10f)
                horizontalLineTo(20f)
                moveTo(4f, 14f)
                horizontalLineTo(20f)
            }
        }.build()

        return _GripLines!!
    }

@Suppress("ObjectPropertyName")
private var _GripLines: ImageVector? = null
