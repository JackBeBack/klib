package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HeartHalf: ImageVector
    get() {
        if (_HeartHalf != null) {
            return _HeartHalf!!
        }
        _HeartHalf = ImageVector.Builder(
            name = "HeartHalf",
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
                moveTo(12f, 6f)
                verticalLineTo(20f)
                curveTo(11.954f, 20.001f, 11.909f, 19.994f, 11.865f, 19.981f)
                curveTo(11.77f, 19.953f, 11.688f, 19.881f, 11.525f, 19.737f)
                curveTo(10.065f, 18.448f, 5.61f, 14.465f, 4.138f, 12.577f)
                curveTo(2.367f, 10.306f, 2.685f, 7.095f, 4.939f, 5.175f)
                curveTo(7.194f, 3.255f, 10.201f, 3.903f, 12f, 6f)
                close()
            }
        }.build()

        return _HeartHalf!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalf: ImageVector? = null
