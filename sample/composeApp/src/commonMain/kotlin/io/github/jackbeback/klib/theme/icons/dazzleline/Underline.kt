package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Underline: ImageVector
    get() {
        if (_Underline != null) {
            return _Underline!!
        }
        _Underline = ImageVector.Builder(
            name = "Underline",
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
                moveTo(4f, 21f)
                horizontalLineTo(20f)
                moveTo(18f, 4f)
                verticalLineTo(11f)
                curveTo(18f, 14.314f, 15.314f, 17f, 12f, 17f)
                curveTo(8.686f, 17f, 6f, 14.314f, 6f, 11f)
                verticalLineTo(4f)
                moveTo(4f, 3f)
                horizontalLineTo(8f)
                moveTo(16f, 3f)
                horizontalLineTo(20f)
            }
        }.build()

        return _Underline!!
    }

@Suppress("ObjectPropertyName")
private var _Underline: ImageVector? = null
