package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ForkKnife: ImageVector
    get() {
        if (_ForkKnife != null) {
            return _ForkKnife!!
        }
        _ForkKnife = ImageVector.Builder(
            name = "ForkKnife",
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
                moveTo(15f, 21f)
                verticalLineTo(3f)
                curveTo(17.209f, 3f, 19f, 4.791f, 19f, 7f)
                verticalLineTo(9f)
                curveTo(19f, 11.209f, 17.209f, 13f, 15f, 13f)
                moveTo(11f, 3f)
                verticalLineTo(8f)
                curveTo(11f, 9.657f, 9.657f, 11f, 8f, 11f)
                curveTo(6.343f, 11f, 5f, 9.657f, 5f, 8f)
                verticalLineTo(3f)
            }
        }.build()

        return _ForkKnife!!
    }

@Suppress("ObjectPropertyName")
private var _ForkKnife: ImageVector? = null
