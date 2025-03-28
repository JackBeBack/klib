package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SearchAlt: ImageVector
    get() {
        if (_SearchAlt != null) {
            return _SearchAlt!!
        }
        _SearchAlt = ImageVector.Builder(
            name = "SearchAlt",
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
                moveTo(16.673f, 16.641f)
                lineTo(21f, 21f)
                moveTo(19f, 11f)
                curveTo(19f, 15.418f, 15.418f, 19f, 11f, 19f)
                curveTo(6.582f, 19f, 3f, 15.418f, 3f, 11f)
                curveTo(3f, 6.582f, 6.582f, 3f, 11f, 3f)
                curveTo(15.418f, 3f, 19f, 6.582f, 19f, 11f)
                close()
            }
        }.build()

        return _SearchAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SearchAlt: ImageVector? = null
