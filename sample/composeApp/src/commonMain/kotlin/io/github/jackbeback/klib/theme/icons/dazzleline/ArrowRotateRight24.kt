package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowRotateRight24: ImageVector
    get() {
        if (_ArrowRotateRight24 != null) {
            return _ArrowRotateRight24!!
        }
        _ArrowRotateRight24 = ImageVector.Builder(
            name = "ArrowRotateRight24",
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
                moveTo(20f, 8f)
                curveTo(18.537f, 5.009f, 15.554f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                curveTo(16.634f, 21f, 20.504f, 17.498f, 21f, 12.997f)
                moveTo(20.5f, 5.5f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                moveTo(16.5f, 10.5f)
                verticalLineTo(12.5f)
                moveTo(16.5f, 12.5f)
                verticalLineTo(14.5f)
                moveTo(16.5f, 12.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.5f)
                moveTo(7.5f, 11.5f)
                verticalLineTo(11f)
                curveTo(7.5f, 10.172f, 8.172f, 9.5f, 9f, 9.5f)
                curveTo(9.828f, 9.5f, 10.5f, 10.172f, 10.5f, 11f)
                verticalLineTo(11.5f)
                curveTo(10.5f, 12.404f, 7.969f, 14.179f, 7.5f, 14.5f)
                horizontalLineTo(10.5f)
            }
        }.build()

        return _ArrowRotateRight24!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRotateRight24: ImageVector? = null
