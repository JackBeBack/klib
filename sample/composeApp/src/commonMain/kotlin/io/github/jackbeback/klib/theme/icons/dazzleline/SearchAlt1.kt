package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SearchAlt1: ImageVector
    get() {
        if (_SearchAlt1 != null) {
            return _SearchAlt1!!
        }
        _SearchAlt1 = ImageVector.Builder(
            name = "SearchAlt1",
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
                moveTo(14.954f, 14.946f)
                lineTo(21f, 21f)
                moveTo(17f, 10f)
                curveTo(17f, 13.866f, 13.866f, 17f, 10f, 17f)
                curveTo(6.134f, 17f, 3f, 13.866f, 3f, 10f)
                curveTo(3f, 6.134f, 6.134f, 3f, 10f, 3f)
                curveTo(13.866f, 3f, 17f, 6.134f, 17f, 10f)
                close()
            }
        }.build()

        return _SearchAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SearchAlt1: ImageVector? = null
