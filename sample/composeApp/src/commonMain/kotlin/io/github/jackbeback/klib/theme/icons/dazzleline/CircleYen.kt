package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleYen: ImageVector
    get() {
        if (_CircleYen != null) {
            return _CircleYen!!
        }
        _CircleYen = ImageVector.Builder(
            name = "CircleYen",
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
                moveTo(12f, 18f)
                verticalLineTo(12f)
                moveTo(12f, 12f)
                lineTo(9f, 7f)
                moveTo(12f, 12f)
                lineTo(15f, 7f)
                moveTo(9f, 13f)
                horizontalLineTo(15f)
                moveTo(9f, 16f)
                horizontalLineTo(15f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleYen!!
    }

@Suppress("ObjectPropertyName")
private var _CircleYen: ImageVector? = null
