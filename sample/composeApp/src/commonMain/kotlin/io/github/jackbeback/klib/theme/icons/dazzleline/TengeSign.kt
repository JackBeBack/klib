package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TengeSign: ImageVector
    get() {
        if (_TengeSign != null) {
            return _TengeSign!!
        }
        _TengeSign = ImageVector.Builder(
            name = "TengeSign",
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
                moveTo(12f, 19f)
                verticalLineTo(9f)
                moveTo(6f, 9f)
                horizontalLineTo(18f)
                moveTo(6f, 5f)
                horizontalLineTo(18f)
            }
        }.build()

        return _TengeSign!!
    }

@Suppress("ObjectPropertyName")
private var _TengeSign: ImageVector? = null
