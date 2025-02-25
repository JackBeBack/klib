package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Link",
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
                moveTo(14f, 7f)
                horizontalLineTo(16f)
                curveTo(18.761f, 7f, 21f, 9.239f, 21f, 12f)
                curveTo(21f, 14.761f, 18.761f, 17f, 16f, 17f)
                horizontalLineTo(14f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                curveTo(5.239f, 7f, 3f, 9.239f, 3f, 12f)
                curveTo(3f, 14.761f, 5.239f, 17f, 8f, 17f)
                horizontalLineTo(10f)
                moveTo(8f, 12f)
                horizontalLineTo(16f)
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
