package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Fence: ImageVector
    get() {
        if (_Fence != null) {
            return _Fence!!
        }
        _Fence = ImageVector.Builder(
            name = "Fence",
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
                moveTo(6f, 10f)
                horizontalLineTo(10f)
                moveTo(14f, 16f)
                horizontalLineTo(18f)
                moveTo(14f, 10f)
                horizontalLineTo(18f)
                moveTo(6f, 16f)
                horizontalLineTo(10f)
                moveTo(10f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                lineTo(12f, 4f)
                lineTo(10f, 7f)
                verticalLineTo(20f)
                close()
                moveTo(2f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                lineTo(4f, 4f)
                lineTo(2f, 7f)
                verticalLineTo(20f)
                close()
                moveTo(18f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                lineTo(20f, 4f)
                lineTo(18f, 7f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Fence!!
    }

@Suppress("ObjectPropertyName")
private var _Fence: ImageVector? = null
