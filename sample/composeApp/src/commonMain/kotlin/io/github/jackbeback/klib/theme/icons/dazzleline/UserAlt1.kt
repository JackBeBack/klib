package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserAlt1: ImageVector
    get() {
        if (_UserAlt1 != null) {
            return _UserAlt1!!
        }
        _UserAlt1 = ImageVector.Builder(
            name = "UserAlt1",
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
                moveTo(5f, 21f)
                curveTo(5f, 17.134f, 8.134f, 14f, 12f, 14f)
                curveTo(15.866f, 14f, 19f, 17.134f, 19f, 21f)
                moveTo(16f, 7f)
                curveTo(16f, 9.209f, 14.209f, 11f, 12f, 11f)
                curveTo(9.791f, 11f, 8f, 9.209f, 8f, 7f)
                curveTo(8f, 4.791f, 9.791f, 3f, 12f, 3f)
                curveTo(14.209f, 3f, 16f, 4.791f, 16f, 7f)
                close()
            }
        }.build()

        return _UserAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _UserAlt1: ImageVector? = null
