package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RotateExclamation: ImageVector
    get() {
        if (_RotateExclamation != null) {
            return _RotateExclamation!!
        }
        _RotateExclamation = ImageVector.Builder(
            name = "RotateExclamation",
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
                moveTo(20.5f, 9f)
                curveTo(19f, 5f, 15.533f, 3.001f, 11.999f, 3.001f)
                curveTo(7.367f, 3.001f, 3.553f, 6.501f, 3.055f, 11f)
                moveTo(20.943f, 13.005f)
                curveTo(20.443f, 17.503f, 16.63f, 21f, 11.999f, 21f)
                curveTo(8.467f, 21f, 5f, 19f, 3.5f, 15f)
                moveTo(21f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(3f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(12f, 8f)
                verticalLineTo(13f)
                moveTo(12f, 16f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _RotateExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _RotateExclamation: ImageVector? = null
