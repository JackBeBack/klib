package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CoffinOpen: ImageVector
    get() {
        if (_CoffinOpen != null) {
            return _CoffinOpen!!
        }
        _CoffinOpen = ImageVector.Builder(
            name = "CoffinOpen",
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
                moveTo(15f, 6f)
                verticalLineTo(16f)
                moveTo(12f, 9f)
                horizontalLineTo(18f)
                moveTo(10.615f, 16.5f)
                lineTo(9.508f, 20f)
                horizontalLineTo(5.2f)
                lineTo(2f, 8.444f)
                lineTo(5.2f, 4f)
                horizontalLineTo(9.5f)
                lineTo(10.288f, 5f)
                moveTo(18f, 21f)
                horizontalLineTo(12f)
                lineTo(8f, 8f)
                lineTo(12f, 3f)
                horizontalLineTo(18f)
                lineTo(22f, 8f)
                lineTo(18f, 21f)
                close()
            }
        }.build()

        return _CoffinOpen!!
    }

@Suppress("ObjectPropertyName")
private var _CoffinOpen: ImageVector? = null
