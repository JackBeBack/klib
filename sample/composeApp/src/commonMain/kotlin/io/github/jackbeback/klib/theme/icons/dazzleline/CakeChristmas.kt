package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CakeChristmas: ImageVector
    get() {
        if (_CakeChristmas != null) {
            return _CakeChristmas!!
        }
        _CakeChristmas = ImageVector.Builder(
            name = "CakeChristmas",
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
                moveTo(12f, 5f)
                verticalLineTo(3f)
                moveTo(3f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                close()
                moveTo(5f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
                moveTo(9f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CakeChristmas!!
    }

@Suppress("ObjectPropertyName")
private var _CakeChristmas: ImageVector? = null
