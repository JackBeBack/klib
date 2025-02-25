package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.H1: ImageVector
    get() {
        if (_H1 != null) {
            return _H1!!
        }
        _H1 = ImageVector.Builder(
            name = "H1",
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
                moveTo(15f, 9f)
                lineTo(16.634f, 7.366f)
                curveTo(17.063f, 6.937f, 17.277f, 6.723f, 17.461f, 6.709f)
                curveTo(17.62f, 6.696f, 17.776f, 6.761f, 17.88f, 6.882f)
                curveTo(18f, 7.023f, 18f, 7.326f, 18f, 7.931f)
                verticalLineTo(18f)
                moveTo(15f, 18f)
                horizontalLineTo(21f)
                moveTo(3f, 6f)
                verticalLineTo(18f)
                moveTo(10f, 12f)
                horizontalLineTo(3f)
                moveTo(10f, 6f)
                verticalLineTo(18f)
            }
        }.build()

        return _H1!!
    }

@Suppress("ObjectPropertyName")
private var _H1: ImageVector? = null
