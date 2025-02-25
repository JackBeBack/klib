package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Lasso: ImageVector
    get() {
        if (_Lasso != null) {
            return _Lasso!!
        }
        _Lasso = ImageVector.Builder(
            name = "Lasso",
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
                moveTo(12f, 13f)
                curveTo(16.971f, 13f, 21f, 10.761f, 21f, 8f)
                curveTo(21f, 5.239f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 5.239f, 3f, 8f)
                curveTo(3f, 10.761f, 7.029f, 13f, 12f, 13f)
                close()
                moveTo(12f, 13f)
                curveTo(15.2f, 16.2f, 14f, 21f, 9f, 21f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Lasso!!
    }

@Suppress("ObjectPropertyName")
private var _Lasso: ImageVector? = null
