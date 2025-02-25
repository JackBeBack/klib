package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LassoSparkles: ImageVector
    get() {
        if (_LassoSparkles != null) {
            return _LassoSparkles!!
        }
        _LassoSparkles = ImageVector.Builder(
            name = "LassoSparkles",
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
                moveTo(12f, 13f)
                curveTo(16.971f, 13f, 21f, 10.761f, 21f, 8f)
                curveTo(21f, 7.231f, 20.688f, 6.503f, 20.13f, 5.853f)
                moveTo(12f, 13f)
                curveTo(7.029f, 13f, 3f, 10.761f, 3f, 8f)
                curveTo(3f, 5.62f, 5.992f, 3.629f, 10f, 3.124f)
                moveTo(12f, 13f)
                curveTo(15.2f, 16.2f, 14f, 21f, 9f, 21f)
                horizontalLineTo(3f)
                moveTo(15f, 3f)
                verticalLineTo(7f)
                moveTo(19f, 17f)
                verticalLineTo(21f)
                moveTo(13f, 5f)
                horizontalLineTo(17f)
                moveTo(17f, 19f)
                horizontalLineTo(21f)
            }
        }.build()

        return _LassoSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _LassoSparkles: ImageVector? = null
