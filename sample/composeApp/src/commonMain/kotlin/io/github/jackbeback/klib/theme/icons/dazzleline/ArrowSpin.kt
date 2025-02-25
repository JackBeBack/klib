package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowSpin: ImageVector
    get() {
        if (_ArrowSpin != null) {
            return _ArrowSpin!!
        }
        _ArrowSpin = ImageVector.Builder(
            name = "ArrowSpin",
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
                moveTo(12f, 20f)
                curveTo(9.474f, 20f, 7.221f, 18.829f, 5.755f, 17f)
                moveTo(12f, 4f)
                curveTo(14.961f, 4f, 17.546f, 5.609f, 18.93f, 8f)
                moveTo(4f, 12f)
                curveTo(4f, 9.474f, 5.171f, 7.221f, 7f, 5.755f)
                moveTo(20f, 12f)
                curveTo(20f, 14.834f, 18.527f, 17.324f, 16.304f, 18.745f)
                moveTo(19.3f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(16.3f)
                moveTo(8f, 16.3f)
                horizontalLineTo(5f)
                verticalLineTo(19.3f)
                moveTo(16.3f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(19.3f)
                moveTo(4.7f, 5f)
                horizontalLineTo(7.7f)
                verticalLineTo(8f)
            }
        }.build()

        return _ArrowSpin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSpin: ImageVector? = null
