package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Shapes: ImageVector
    get() {
        if (_Shapes != null) {
            return _Shapes!!
        }
        _Shapes = ImageVector.Builder(
            name = "Shapes",
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
                moveTo(8f, 10f)
                lineTo(12f, 3f)
                lineTo(16f, 10f)
                horizontalLineTo(8f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17.5f)
                curveTo(10f, 19.433f, 8.433f, 21f, 6.5f, 21f)
                curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
                curveTo(3f, 15.567f, 4.567f, 14f, 6.5f, 14f)
                curveTo(8.433f, 14f, 10f, 15.567f, 10f, 17.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Shapes!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes: ImageVector? = null
