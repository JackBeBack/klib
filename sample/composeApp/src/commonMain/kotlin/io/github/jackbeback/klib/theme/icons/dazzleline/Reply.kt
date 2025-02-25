package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Reply: ImageVector
    get() {
        if (_Reply != null) {
            return _Reply!!
        }
        _Reply = ImageVector.Builder(
            name = "Reply",
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
                moveTo(20f, 17f)
                verticalLineTo(15.8f)
                curveTo(20f, 14.12f, 20f, 13.28f, 19.673f, 12.638f)
                curveTo(19.385f, 12.073f, 18.927f, 11.615f, 18.362f, 11.327f)
                curveTo(17.72f, 11f, 16.88f, 11f, 15.2f, 11f)
                horizontalLineTo(4f)
                moveTo(4f, 11f)
                lineTo(8f, 7f)
                moveTo(4f, 11f)
                lineTo(8f, 15f)
            }
        }.build()

        return _Reply!!
    }

@Suppress("ObjectPropertyName")
private var _Reply: ImageVector? = null
