package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Club: ImageVector
    get() {
        if (_Club != null) {
            return _Club!!
        }
        _Club = ImageVector.Builder(
            name = "Club",
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
                moveTo(12f, 16f)
                lineTo(12f, 21f)
                moveTo(12f, 16f)
                curveTo(11.164f, 16.628f, 10.126f, 17f, 9f, 17f)
                curveTo(6.239f, 17f, 4f, 14.761f, 4f, 12f)
                curveTo(4f, 9.936f, 5.251f, 8.164f, 7.036f, 7.401f)
                curveTo(7.332f, 4.922f, 9.441f, 3f, 12f, 3f)
                curveTo(14.559f, 3f, 16.668f, 4.922f, 16.965f, 7.401f)
                curveTo(18.749f, 8.164f, 20f, 9.936f, 20f, 12f)
                curveTo(20f, 14.761f, 17.761f, 17f, 15f, 17f)
                curveTo(13.874f, 17f, 12.836f, 16.628f, 12f, 16f)
                close()
                moveTo(9f, 21f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Club!!
    }

@Suppress("ObjectPropertyName")
private var _Club: ImageVector? = null
