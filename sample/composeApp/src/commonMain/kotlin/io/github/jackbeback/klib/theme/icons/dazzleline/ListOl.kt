package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListOl: ImageVector
    get() {
        if (_ListOl != null) {
            return _ListOl!!
        }
        _ListOl = ImageVector.Builder(
            name = "ListOl",
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
                moveTo(10f, 6f)
                lineTo(21f, 6.001f)
                moveTo(10f, 12f)
                lineTo(21f, 12.001f)
                moveTo(10f, 18f)
                lineTo(21f, 18.001f)
                moveTo(3f, 5f)
                lineTo(5f, 4f)
                verticalLineTo(10f)
                moveTo(5f, 10f)
                horizontalLineTo(3f)
                moveTo(5f, 10f)
                horizontalLineTo(7f)
                moveTo(7f, 20f)
                horizontalLineTo(3f)
                lineTo(6.413f, 17.014f)
                curveTo(6.786f, 16.687f, 7f, 16.216f, 7f, 15.72f)
                curveTo(7f, 14.77f, 6.23f, 14f, 5.28f, 14f)
                horizontalLineTo(5f)
                curveTo(4.068f, 14f, 3.285f, 14.637f, 3.063f, 15.5f)
            }
        }.build()

        return _ListOl!!
    }

@Suppress("ObjectPropertyName")
private var _ListOl: ImageVector? = null
