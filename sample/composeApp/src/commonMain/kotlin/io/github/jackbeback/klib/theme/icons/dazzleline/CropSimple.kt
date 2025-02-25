package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CropSimple: ImageVector
    get() {
        if (_CropSimple != null) {
            return _CropSimple!!
        }
        _CropSimple = ImageVector.Builder(
            name = "CropSimple",
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
                moveTo(6f, 3f)
                verticalLineTo(14.8f)
                curveTo(6f, 15.92f, 6f, 16.48f, 6.218f, 16.908f)
                curveTo(6.41f, 17.284f, 6.716f, 17.59f, 7.092f, 17.782f)
                curveTo(7.52f, 18f, 8.08f, 18f, 9.2f, 18f)
                horizontalLineTo(15f)
                moveTo(21f, 18f)
                horizontalLineTo(18f)
                moveTo(18f, 21f)
                verticalLineTo(9.2f)
                curveTo(18f, 8.08f, 18f, 7.52f, 17.782f, 7.092f)
                curveTo(17.59f, 6.716f, 17.284f, 6.41f, 16.908f, 6.218f)
                curveTo(16.48f, 6f, 15.92f, 6f, 14.8f, 6f)
                horizontalLineTo(9f)
                moveTo(3f, 6f)
                horizontalLineTo(6f)
            }
        }.build()

        return _CropSimple!!
    }

@Suppress("ObjectPropertyName")
private var _CropSimple: ImageVector? = null
