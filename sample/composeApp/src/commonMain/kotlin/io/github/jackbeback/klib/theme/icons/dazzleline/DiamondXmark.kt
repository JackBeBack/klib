package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiamondXmark: ImageVector
    get() {
        if (_DiamondXmark != null) {
            return _DiamondXmark!!
        }
        _DiamondXmark = ImageVector.Builder(
            name = "DiamondXmark",
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
                moveTo(17f, 7f)
                lineTo(14.262f, 4.263f)
                curveTo(13.47f, 3.471f, 13.075f, 3.075f, 12.618f, 2.926f)
                curveTo(12.216f, 2.796f, 11.783f, 2.796f, 11.382f, 2.926f)
                curveTo(10.925f, 3.075f, 10.529f, 3.471f, 9.737f, 4.263f)
                lineTo(7f, 7f)
                moveTo(17f, 7f)
                lineTo(19.737f, 9.737f)
                curveTo(20.529f, 10.529f, 20.925f, 10.925f, 21.073f, 11.382f)
                curveTo(21.204f, 11.784f, 21.204f, 12.216f, 21.073f, 12.618f)
                curveTo(20.925f, 13.075f, 20.529f, 13.471f, 19.737f, 14.263f)
                lineTo(17f, 17f)
                moveTo(17f, 7f)
                lineTo(7f, 17f)
                moveTo(7f, 17f)
                lineTo(9.737f, 19.737f)
                curveTo(10.529f, 20.529f, 10.925f, 20.925f, 11.382f, 21.074f)
                curveTo(11.783f, 21.204f, 12.216f, 21.204f, 12.618f, 21.074f)
                curveTo(13.075f, 20.925f, 13.47f, 20.529f, 14.262f, 19.737f)
                lineTo(17f, 17f)
                moveTo(7f, 17f)
                lineTo(4.262f, 14.263f)
                curveTo(3.47f, 13.471f, 3.074f, 13.075f, 2.926f, 12.618f)
                curveTo(2.796f, 12.216f, 2.796f, 11.784f, 2.926f, 11.382f)
                curveTo(3.074f, 10.925f, 3.47f, 10.529f, 4.262f, 9.737f)
                lineTo(7f, 7f)
                moveTo(17f, 17f)
                lineTo(7f, 7f)
            }
        }.build()

        return _DiamondXmark!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondXmark: ImageVector? = null
