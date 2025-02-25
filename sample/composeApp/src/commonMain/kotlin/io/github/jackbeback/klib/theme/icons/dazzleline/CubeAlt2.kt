package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CubeAlt2: ImageVector
    get() {
        if (_CubeAlt2 != null) {
            return _CubeAlt2!!
        }
        _CubeAlt2 = ImageVector.Builder(
            name = "CubeAlt2",
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
                moveTo(4f, 7.5f)
                lineTo(11.608f, 3.221f)
                curveTo(11.751f, 3.14f, 11.822f, 3.1f, 11.898f, 3.084f)
                curveTo(11.965f, 3.07f, 12.035f, 3.07f, 12.102f, 3.084f)
                curveTo(12.178f, 3.1f, 12.249f, 3.14f, 12.392f, 3.221f)
                lineTo(20f, 7.5f)
                moveTo(4f, 7.5f)
                verticalLineTo(16.032f)
                curveTo(4f, 16.202f, 4f, 16.288f, 4.025f, 16.364f)
                curveTo(4.047f, 16.431f, 4.083f, 16.493f, 4.131f, 16.545f)
                curveTo(4.185f, 16.604f, 4.259f, 16.646f, 4.408f, 16.729f)
                lineTo(12f, 21f)
                moveTo(4f, 7.5f)
                lineTo(12f, 11.5f)
                moveTo(12f, 21f)
                lineTo(19.592f, 16.729f)
                curveTo(19.741f, 16.646f, 19.815f, 16.604f, 19.869f, 16.545f)
                curveTo(19.917f, 16.493f, 19.953f, 16.431f, 19.975f, 16.364f)
                curveTo(20f, 16.288f, 20f, 16.202f, 20f, 16.032f)
                verticalLineTo(7.5f)
                moveTo(12f, 21f)
                verticalLineTo(11.5f)
                moveTo(20f, 7.5f)
                lineTo(12f, 11.5f)
            }
        }.build()

        return _CubeAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _CubeAlt2: ImageVector? = null
