package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WeightScale: ImageVector
    get() {
        if (_WeightScale != null) {
            return _WeightScale!!
        }
        _WeightScale = ImageVector.Builder(
            name = "WeightScale",
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
                moveTo(12f, 8f)
                lineTo(13f, 6f)
                moveTo(7.1f, 7.001f)
                curveTo(7.034f, 7.324f, 7f, 7.658f, 7f, 8f)
                curveTo(7f, 10.761f, 9.239f, 13f, 12f, 13f)
                curveTo(14.761f, 13f, 17f, 10.761f, 17f, 8f)
                curveTo(17f, 7.658f, 16.966f, 7.324f, 16.9f, 7.001f)
                moveTo(7.1f, 7.001f)
                curveTo(7.563f, 4.718f, 9.581f, 3f, 12f, 3f)
                curveTo(14.419f, 3f, 16.437f, 4.718f, 16.9f, 7.001f)
                moveTo(7.1f, 7.001f)
                curveTo(5.873f, 7.007f, 5.184f, 7.049f, 4.638f, 7.327f)
                curveTo(4.074f, 7.615f, 3.615f, 8.074f, 3.327f, 8.638f)
                curveTo(3f, 9.28f, 3f, 10.12f, 3f, 11.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 17.88f, 3f, 18.72f, 3.327f, 19.362f)
                curveTo(3.615f, 19.927f, 4.074f, 20.385f, 4.638f, 20.673f)
                curveTo(5.28f, 21f, 6.12f, 21f, 7.8f, 21f)
                horizontalLineTo(16.2f)
                curveTo(17.88f, 21f, 18.72f, 21f, 19.362f, 20.673f)
                curveTo(19.927f, 20.385f, 20.385f, 19.927f, 20.673f, 19.362f)
                curveTo(21f, 18.72f, 21f, 17.88f, 21f, 16.2f)
                verticalLineTo(11.8f)
                curveTo(21f, 10.12f, 21f, 9.28f, 20.673f, 8.638f)
                curveTo(20.385f, 8.074f, 19.927f, 7.615f, 19.362f, 7.327f)
                curveTo(18.816f, 7.049f, 18.127f, 7.007f, 16.9f, 7.001f)
            }
        }.build()

        return _WeightScale!!
    }

@Suppress("ObjectPropertyName")
private var _WeightScale: ImageVector? = null
