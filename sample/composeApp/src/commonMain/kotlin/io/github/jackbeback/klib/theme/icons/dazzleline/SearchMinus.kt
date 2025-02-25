package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SearchMinus: ImageVector
    get() {
        if (_SearchMinus != null) {
            return _SearchMinus!!
        }
        _SearchMinus = ImageVector.Builder(
            name = "SearchMinus",
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
                moveTo(21f, 21f)
                lineTo(15.803f, 15.803f)
                moveTo(7.5f, 10.5f)
                horizontalLineTo(13.5f)
                moveTo(15.803f, 15.803f)
                curveTo(17.16f, 14.446f, 18f, 12.571f, 18f, 10.5f)
                curveTo(18f, 6.358f, 14.642f, 3f, 10.5f, 3f)
                curveTo(6.358f, 3f, 3f, 6.358f, 3f, 10.5f)
                curveTo(3f, 14.642f, 6.358f, 18f, 10.5f, 18f)
                curveTo(12.571f, 18f, 14.446f, 17.16f, 15.803f, 15.803f)
                close()
            }
        }.build()

        return _SearchMinus!!
    }

@Suppress("ObjectPropertyName")
private var _SearchMinus: ImageVector? = null
