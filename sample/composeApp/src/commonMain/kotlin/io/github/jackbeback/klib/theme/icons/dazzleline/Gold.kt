package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Gold: ImageVector
    get() {
        if (_Gold != null) {
            return _Gold!!
        }
        _Gold = ImageVector.Builder(
            name = "Gold",
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
                moveTo(3.875f, 14f)
                horizontalLineTo(9.125f)
                lineTo(10f, 19f)
                horizontalLineTo(3f)
                lineTo(3.875f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.375f, 5f)
                horizontalLineTo(14.625f)
                lineTo(15.5f, 10f)
                horizontalLineTo(8.5f)
                lineTo(9.375f, 5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.875f, 14f)
                horizontalLineTo(20.125f)
                lineTo(21f, 19f)
                horizontalLineTo(14f)
                lineTo(14.875f, 14f)
                close()
            }
        }.build()

        return _Gold!!
    }

@Suppress("ObjectPropertyName")
private var _Gold: ImageVector? = null
