package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HexagonCheck: ImageVector
    get() {
        if (_HexagonCheck != null) {
            return _HexagonCheck!!
        }
        _HexagonCheck = ImageVector.Builder(
            name = "HexagonCheck",
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
                moveTo(8f, 12.333f)
                lineTo(10.462f, 15f)
                lineTo(16f, 9f)
                moveTo(2f, 12f)
                lineTo(7f, 3.34f)
                horizontalLineTo(17f)
                lineTo(22f, 12f)
                lineTo(17f, 20.66f)
                horizontalLineTo(7f)
                lineTo(2f, 12f)
                close()
            }
        }.build()

        return _HexagonCheck!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonCheck: ImageVector? = null
