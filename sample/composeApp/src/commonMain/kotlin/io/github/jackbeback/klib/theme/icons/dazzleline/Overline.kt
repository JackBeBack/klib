package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Overline: ImageVector
    get() {
        if (_Overline != null) {
            return _Overline!!
        }
        _Overline = ImageVector.Builder(
            name = "Overline",
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
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                moveTo(12f, 21f)
                curveTo(9.239f, 21f, 7f, 18.761f, 7f, 16f)
                verticalLineTo(12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                verticalLineTo(16f)
                curveTo(17f, 18.761f, 14.761f, 21f, 12f, 21f)
                close()
            }
        }.build()

        return _Overline!!
    }

@Suppress("ObjectPropertyName")
private var _Overline: ImageVector? = null
