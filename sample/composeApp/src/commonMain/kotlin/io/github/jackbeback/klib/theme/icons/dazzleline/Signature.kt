package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Signature: ImageVector
    get() {
        if (_Signature != null) {
            return _Signature!!
        }
        _Signature = ImageVector.Builder(
            name = "Signature",
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
                moveTo(7f, 7.648f)
                curveTo(8f, 5.407f, 10.5f, 4.222f, 12f, 7.648f)
                curveTo(12.357f, 8.464f, 12.555f, 9.28f, 12.616f, 10.079f)
                moveTo(12.616f, 10.079f)
                curveTo(12.897f, 13.758f, 10.286f, 17.093f, 7f, 18.5f)
                verticalLineTo(14.423f)
                curveTo(7f, 13.628f, 7f, 13.23f, 7.13f, 12.888f)
                curveTo(7.244f, 12.585f, 7.43f, 12.315f, 7.672f, 12.1f)
                curveTo(7.946f, 11.857f, 8.318f, 11.716f, 9.061f, 11.433f)
                lineTo(12.616f, 10.079f)
                close()
                moveTo(12.616f, 10.079f)
                lineTo(16f, 8.791f)
                lineTo(15.5f, 12.218f)
                horizontalLineTo(18f)
                moveTo(21f, 16f)
                horizontalLineTo(15f)
                moveTo(4f, 16f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Signature!!
    }

@Suppress("ObjectPropertyName")
private var _Signature: ImageVector? = null
