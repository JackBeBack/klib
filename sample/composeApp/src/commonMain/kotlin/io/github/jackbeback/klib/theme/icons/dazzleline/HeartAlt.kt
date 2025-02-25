package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeartAlt: ImageVector
    get() {
        if (_HeartAlt != null) {
            return _HeartAlt!!
        }
        _HeartAlt = ImageVector.Builder(
            name = "HeartAlt",
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
                moveTo(15.7f, 4f)
                curveTo(18.87f, 4f, 21f, 6.98f, 21f, 9.76f)
                curveTo(21f, 15.39f, 12.16f, 20f, 12f, 20f)
                curveTo(11.84f, 20f, 3f, 15.39f, 3f, 9.76f)
                curveTo(3f, 6.98f, 5.13f, 4f, 8.3f, 4f)
                curveTo(10.12f, 4f, 11.31f, 4.91f, 12f, 5.71f)
                curveTo(12.69f, 4.91f, 13.88f, 4f, 15.7f, 4f)
                close()
            }
        }.build()

        return _HeartAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HeartAlt: ImageVector? = null
