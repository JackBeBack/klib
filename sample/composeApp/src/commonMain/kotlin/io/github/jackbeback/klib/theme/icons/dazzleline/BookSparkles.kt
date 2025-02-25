package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BookSparkles: ImageVector
    get() {
        if (_BookSparkles != null) {
            return _BookSparkles!!
        }
        _BookSparkles = ImageVector.Builder(
            name = "BookSparkles",
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
                moveTo(5f, 19f)
                verticalLineTo(6.2f)
                curveTo(5f, 5.08f, 5f, 4.52f, 5.218f, 4.092f)
                curveTo(5.41f, 3.716f, 5.716f, 3.41f, 6.092f, 3.218f)
                curveTo(6.52f, 3f, 7.08f, 3f, 8.2f, 3f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 3f, 17.48f, 3f, 17.908f, 3.218f)
                curveTo(18.284f, 3.41f, 18.59f, 3.716f, 18.782f, 4.092f)
                curveTo(19f, 4.52f, 19f, 5.08f, 19f, 6.2f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.895f, 17f, 5f, 17.895f, 5f, 19f)
                close()
                moveTo(5f, 19f)
                curveTo(5f, 20.105f, 5.895f, 21f, 7f, 21f)
                horizontalLineTo(19f)
                moveTo(18f, 17f)
                verticalLineTo(21f)
                moveTo(10f, 6f)
                verticalLineTo(10f)
                moveTo(14f, 10f)
                verticalLineTo(14f)
                moveTo(8f, 8f)
                horizontalLineTo(12f)
                moveTo(12f, 12f)
                horizontalLineTo(16f)
            }
        }.build()

        return _BookSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _BookSparkles: ImageVector? = null
