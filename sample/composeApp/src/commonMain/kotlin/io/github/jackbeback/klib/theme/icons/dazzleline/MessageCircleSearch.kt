package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleSearch: ImageVector
    get() {
        if (_MessageCircleSearch != null) {
            return _MessageCircleSearch!!
        }
        _MessageCircleSearch = ImageVector.Builder(
            name = "MessageCircleSearch",
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
                moveTo(15.5f, 15.5f)
                lineTo(13.621f, 13.621f)
                moveTo(13.621f, 13.621f)
                curveTo(14.164f, 13.078f, 14.5f, 12.328f, 14.5f, 11.5f)
                curveTo(14.5f, 9.843f, 13.157f, 8.5f, 11.5f, 8.5f)
                curveTo(9.843f, 8.5f, 8.5f, 9.843f, 8.5f, 11.5f)
                curveTo(8.5f, 13.157f, 9.843f, 14.5f, 11.5f, 14.5f)
                curveTo(12.328f, 14.5f, 13.078f, 14.164f, 13.621f, 13.621f)
                close()
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(9.964f, 21f, 3.001f, 21f, 3.001f, 21f)
                curveTo(3.001f, 21f, 4.56f, 17.256f, 3.936f, 16.001f)
                curveTo(3.337f, 14.796f, 3f, 13.437f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _MessageCircleSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleSearch: ImageVector? = null
