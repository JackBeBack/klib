package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Trademark: ImageVector
    get() {
        if (_Trademark != null) {
            return _Trademark!!
        }
        _Trademark = ImageVector.Builder(
            name = "Trademark",
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
                moveTo(3f, 7f)
                horizontalLineTo(9f)
                moveTo(6f, 17f)
                verticalLineTo(7f)
                moveTo(13f, 17f)
                verticalLineTo(7f)
                lineTo(17f, 14f)
                lineTo(21f, 7f)
                verticalLineTo(17f)
            }
        }.build()

        return _Trademark!!
    }

@Suppress("ObjectPropertyName")
private var _Trademark: ImageVector? = null
