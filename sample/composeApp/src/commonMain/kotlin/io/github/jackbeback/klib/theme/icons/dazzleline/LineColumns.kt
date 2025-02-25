package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LineColumns: ImageVector
    get() {
        if (_LineColumns != null) {
            return _LineColumns!!
        }
        _LineColumns = ImageVector.Builder(
            name = "LineColumns",
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
                moveTo(3f, 6f)
                horizontalLineTo(10f)
                moveTo(3f, 10f)
                horizontalLineTo(10f)
                moveTo(3f, 14f)
                horizontalLineTo(10f)
                moveTo(3f, 18f)
                horizontalLineTo(10f)
                moveTo(14f, 6f)
                lineTo(21f, 6.001f)
                moveTo(14f, 10f)
                lineTo(21f, 10.001f)
                moveTo(14f, 14f)
                lineTo(21f, 14.001f)
                moveTo(14f, 18f)
                lineTo(21f, 18.001f)
            }
        }.build()

        return _LineColumns!!
    }

@Suppress("ObjectPropertyName")
private var _LineColumns: ImageVector? = null
