package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Maximize: ImageVector
    get() {
        if (_Maximize != null) {
            return _Maximize!!
        }
        _Maximize = ImageVector.Builder(
            name = "Maximize",
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
                moveTo(14f, 10f)
                lineTo(20f, 4f)
                moveTo(20f, 4f)
                horizontalLineTo(15.5f)
                moveTo(20f, 4f)
                verticalLineTo(8.5f)
                moveTo(4f, 4f)
                lineTo(10f, 10f)
                moveTo(4f, 4f)
                verticalLineTo(8.5f)
                moveTo(4f, 4f)
                horizontalLineTo(8.5f)
                moveTo(14f, 14f)
                lineTo(20f, 20f)
                moveTo(20f, 20f)
                verticalLineTo(15.5f)
                moveTo(20f, 20f)
                horizontalLineTo(15.5f)
                moveTo(10f, 14f)
                lineTo(4f, 20f)
                moveTo(4f, 20f)
                horizontalLineTo(8.5f)
                moveTo(4f, 20f)
                lineTo(4f, 15.5f)
            }
        }.build()

        return _Maximize!!
    }

@Suppress("ObjectPropertyName")
private var _Maximize: ImageVector? = null
