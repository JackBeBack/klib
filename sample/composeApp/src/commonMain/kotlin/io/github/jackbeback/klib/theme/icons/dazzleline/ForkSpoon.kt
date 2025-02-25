package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ForkSpoon: ImageVector
    get() {
        if (_ForkSpoon != null) {
            return _ForkSpoon!!
        }
        _ForkSpoon = ImageVector.Builder(
            name = "ForkSpoon",
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
                moveTo(8f, 21f)
                verticalLineTo(3f)
                moveTo(11f, 3f)
                verticalLineTo(8f)
                curveTo(11f, 9.657f, 9.657f, 11f, 8f, 11f)
                curveTo(6.343f, 11f, 5f, 9.657f, 5f, 8f)
                verticalLineTo(3f)
                moveTo(15.5f, 13f)
                verticalLineTo(3f)
                moveTo(15.5f, 13f)
                curveTo(13.567f, 13f, 12f, 14.791f, 12f, 17f)
                curveTo(12f, 19.209f, 13.567f, 21f, 15.5f, 21f)
                curveTo(17.433f, 21f, 19f, 19.209f, 19f, 17f)
                curveTo(19f, 14.791f, 17.433f, 13f, 15.5f, 13f)
                close()
            }
        }.build()

        return _ForkSpoon!!
    }

@Suppress("ObjectPropertyName")
private var _ForkSpoon: ImageVector? = null
