package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CubeAlt: ImageVector
    get() {
        if (_CubeAlt != null) {
            return _CubeAlt!!
        }
        _CubeAlt = ImageVector.Builder(
            name = "CubeAlt",
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
                moveTo(20f, 4f)
                horizontalLineTo(8.444f)
                lineTo(4f, 8f)
                moveTo(20f, 4f)
                verticalLineTo(15.556f)
                lineTo(16f, 20f)
                moveTo(20f, 4f)
                lineTo(16f, 8f)
                moveTo(4f, 8f)
                horizontalLineTo(16f)
                moveTo(4f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(16f, 20f)
                verticalLineTo(8f)
            }
        }.build()

        return _CubeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CubeAlt: ImageVector? = null
