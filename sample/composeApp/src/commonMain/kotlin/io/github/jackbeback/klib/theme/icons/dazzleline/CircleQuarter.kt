package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleQuarter: ImageVector
    get() {
        if (_CircleQuarter != null) {
            return _CircleQuarter!!
        }
        _CircleQuarter = ImageVector.Builder(
            name = "CircleQuarter",
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
                moveTo(3f, 10f)
                curveTo(3f, 6.134f, 6.134f, 3f, 10f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 21f)
                curveTo(9.358f, 21f, 6f, 17.642f, 6f, 13.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(6f)
                curveTo(17.642f, 6f, 21f, 9.358f, 21f, 13.5f)
                curveTo(21f, 17.642f, 17.642f, 21f, 13.5f, 21f)
                close()
            }
        }.build()

        return _CircleQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _CircleQuarter: ImageVector? = null
