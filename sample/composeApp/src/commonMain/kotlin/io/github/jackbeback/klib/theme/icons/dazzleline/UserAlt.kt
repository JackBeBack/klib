package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.UserAlt: ImageVector
    get() {
        if (_UserAlt != null) {
            return _UserAlt!!
        }
        _UserAlt = ImageVector.Builder(
            name = "UserAlt",
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
                moveTo(16f, 7f)
                curveTo(16f, 9.209f, 14.209f, 11f, 12f, 11f)
                curveTo(9.791f, 11f, 8f, 9.209f, 8f, 7f)
                curveTo(8f, 4.791f, 9.791f, 3f, 12f, 3f)
                curveTo(14.209f, 3f, 16f, 4.791f, 16f, 7f)
                close()
            }
        }.build()

        return _UserAlt!!
    }

@Suppress("ObjectPropertyName")
private var _UserAlt: ImageVector? = null
