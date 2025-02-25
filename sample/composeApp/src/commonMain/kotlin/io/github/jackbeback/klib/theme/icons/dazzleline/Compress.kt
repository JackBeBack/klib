package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Compress: ImageVector
    get() {
        if (_Compress != null) {
            return _Compress!!
        }
        _Compress = ImageVector.Builder(
            name = "Compress",
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
                moveTo(9f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(15f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                moveTo(4f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                moveTo(15f, 20f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
            }
        }.build()

        return _Compress!!
    }

@Suppress("ObjectPropertyName")
private var _Compress: ImageVector? = null
