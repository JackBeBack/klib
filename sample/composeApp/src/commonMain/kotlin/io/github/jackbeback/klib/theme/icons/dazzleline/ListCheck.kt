package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListCheck: ImageVector
    get() {
        if (_ListCheck != null) {
            return _ListCheck!!
        }
        _ListCheck = ImageVector.Builder(
            name = "ListCheck",
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
                moveTo(11f, 6f)
                lineTo(21f, 6.001f)
                moveTo(11f, 12f)
                lineTo(21f, 12.001f)
                moveTo(11f, 18f)
                lineTo(21f, 18.001f)
                moveTo(3f, 11.944f)
                lineTo(4.538f, 13.5f)
                lineTo(8f, 10f)
                moveTo(3f, 5.944f)
                lineTo(4.538f, 7.5f)
                lineTo(8f, 4f)
                moveTo(4.5f, 18f)
                horizontalLineTo(4.51f)
                moveTo(5f, 18f)
                curveTo(5f, 18.276f, 4.776f, 18.5f, 4.5f, 18.5f)
                curveTo(4.224f, 18.5f, 4f, 18.276f, 4f, 18f)
                curveTo(4f, 17.724f, 4.224f, 17.5f, 4.5f, 17.5f)
                curveTo(4.776f, 17.5f, 5f, 17.724f, 5f, 18f)
                close()
            }
        }.build()

        return _ListCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ListCheck: ImageVector? = null
