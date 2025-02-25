package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PlusMinus: ImageVector
    get() {
        if (_PlusMinus != null) {
            return _PlusMinus!!
        }
        _PlusMinus = ImageVector.Builder(
            name = "PlusMinus",
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
                moveTo(12f, 4f)
                verticalLineTo(14f)
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                moveTo(7f, 20f)
                horizontalLineTo(17f)
            }
        }.build()

        return _PlusMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PlusMinus: ImageVector? = null
