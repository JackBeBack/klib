package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cookie: ImageVector
    get() {
        if (_Cookie != null) {
            return _Cookie!!
        }
        _Cookie = ImageVector.Builder(
            name = "Cookie",
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
                moveTo(9f, 16f)
                horizontalLineTo(9.01f)
                moveTo(12f, 11f)
                horizontalLineTo(12.01f)
                moveTo(7f, 10f)
                horizontalLineTo(7.01f)
                moveTo(15f, 16f)
                horizontalLineTo(15.01f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(12f, 5.761f, 13.791f, 8f, 16f, 8f)
                curveTo(16f, 10.209f, 18.239f, 12f, 21f, 12f)
                close()
            }
        }.build()

        return _Cookie!!
    }

@Suppress("ObjectPropertyName")
private var _Cookie: ImageVector? = null
