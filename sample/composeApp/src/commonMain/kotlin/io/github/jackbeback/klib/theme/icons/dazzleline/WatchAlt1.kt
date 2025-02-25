package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WatchAlt1: ImageVector
    get() {
        if (_WatchAlt1 != null) {
            return _WatchAlt1!!
        }
        _WatchAlt1 = ImageVector.Builder(
            name = "WatchAlt1",
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
                moveTo(6f, 8f)
                curveTo(6f, 7f, 6f, 3f, 9f, 3f)
                horizontalLineTo(15f)
                curveTo(12f, 3f, 12f, 7f, 12f, 8f)
                moveTo(15f, 3.003f)
                curveTo(15f, 3.003f, 20f, 2.554f, 20f, 12f)
                curveTo(20f, 21.446f, 15f, 20.997f, 15f, 20.997f)
                moveTo(9f, 10f)
                verticalLineTo(12f)
                lineTo(10.5f, 13.5f)
                moveTo(6f, 16f)
                curveTo(6f, 17f, 6f, 21f, 9f, 21f)
                horizontalLineTo(15f)
                curveTo(12f, 21f, 12f, 17f, 12f, 16f)
                moveTo(9f, 17f)
                curveTo(6.239f, 17f, 4f, 14.761f, 4f, 12f)
                curveTo(4f, 9.239f, 6.239f, 7f, 9f, 7f)
                curveTo(11.761f, 7f, 14f, 9.239f, 14f, 12f)
                curveTo(14f, 14.761f, 11.761f, 17f, 9f, 17f)
                close()
            }
        }.build()

        return _WatchAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _WatchAlt1: ImageVector? = null
