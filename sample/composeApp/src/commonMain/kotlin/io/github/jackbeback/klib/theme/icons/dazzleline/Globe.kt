package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Globe: ImageVector
    get() {
        if (_Globe != null) {
            return _Globe!!
        }
        _Globe = ImageVector.Builder(
            name = "Globe",
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
                moveTo(3f, 12f)
                horizontalLineTo(21f)
                moveTo(3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                moveTo(21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                moveTo(12f, 21f)
                curveTo(4.756f, 13.08f, 8.982f, 5.7f, 12f, 3f)
                moveTo(12f, 21f)
                curveTo(19.244f, 13.08f, 15.019f, 5.7f, 12f, 3f)
            }
        }.build()

        return _Globe!!
    }

@Suppress("ObjectPropertyName")
private var _Globe: ImageVector? = null
