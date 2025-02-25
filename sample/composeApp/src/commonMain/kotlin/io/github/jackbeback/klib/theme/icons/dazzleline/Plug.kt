package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Plug: ImageVector
    get() {
        if (_Plug != null) {
            return _Plug!!
        }
        _Plug = ImageVector.Builder(
            name = "Plug",
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
                moveTo(17f, 9f)
                verticalLineTo(12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                moveTo(7f, 9f)
                verticalLineTo(12f)
                curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
                moveTo(12f, 17f)
                verticalLineTo(21f)
                moveTo(8f, 3f)
                verticalLineTo(6f)
                moveTo(16f, 3f)
                verticalLineTo(6f)
                moveTo(5f, 9f)
                horizontalLineTo(19f)
            }
        }.build()

        return _Plug!!
    }

@Suppress("ObjectPropertyName")
private var _Plug: ImageVector? = null
