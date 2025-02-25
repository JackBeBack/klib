package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hotel: ImageVector
    get() {
        if (_Hotel != null) {
            return _Hotel!!
        }
        _Hotel = ImageVector.Builder(
            name = "Hotel",
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
                moveTo(3f, 21f)
                horizontalLineTo(5f)
                moveTo(5f, 21f)
                horizontalLineTo(10f)
                moveTo(5f, 21f)
                verticalLineTo(3f)
                moveTo(10f, 21f)
                horizontalLineTo(14f)
                moveTo(10f, 21f)
                verticalLineTo(16f)
                lineTo(8f, 16f)
                curveTo(10f, 13.333f, 14f, 13.333f, 16f, 16f)
                lineTo(14f, 16f)
                verticalLineTo(21f)
                moveTo(14f, 21f)
                horizontalLineTo(19f)
                moveTo(19f, 21f)
                horizontalLineTo(21f)
                moveTo(19f, 21f)
                verticalLineTo(3f)
                moveTo(3f, 3f)
                horizontalLineTo(5f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(21f)
                moveTo(9f, 6.5f)
                horizontalLineTo(10f)
                moveTo(14f, 6.5f)
                horizontalLineTo(15f)
                moveTo(9f, 10.5f)
                horizontalLineTo(10f)
                moveTo(14f, 10.5f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Hotel!!
    }

@Suppress("ObjectPropertyName")
private var _Hotel: ImageVector? = null
