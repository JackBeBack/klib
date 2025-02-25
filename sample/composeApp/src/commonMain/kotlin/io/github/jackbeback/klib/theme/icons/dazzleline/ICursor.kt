package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ICursor: ImageVector
    get() {
        if (_ICursor != null) {
            return _ICursor!!
        }
        _ICursor = ImageVector.Builder(
            name = "ICursor",
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
                moveTo(12f, 7f)
                verticalLineTo(17f)
                moveTo(12f, 7f)
                curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
                horizontalLineTo(7f)
                moveTo(12f, 7f)
                curveTo(12f, 4.791f, 13.791f, 3f, 16f, 3f)
                horizontalLineTo(17f)
                moveTo(12f, 17f)
                curveTo(12f, 19.209f, 10.209f, 21f, 8f, 21f)
                horizontalLineTo(7f)
                moveTo(12f, 17f)
                curveTo(12f, 19.209f, 13.791f, 21f, 16f, 21f)
                horizontalLineTo(17f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
            }
        }.build()

        return _ICursor!!
    }

@Suppress("ObjectPropertyName")
private var _ICursor: ImageVector? = null
