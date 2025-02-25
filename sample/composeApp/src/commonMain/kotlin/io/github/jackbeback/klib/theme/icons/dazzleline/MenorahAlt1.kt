package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MenorahAlt1: ImageVector
    get() {
        if (_MenorahAlt1 != null) {
            return _MenorahAlt1!!
        }
        _MenorahAlt1 = ImageVector.Builder(
            name = "MenorahAlt1",
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
                moveTo(12f, 21f)
                verticalLineTo(7f)
                moveTo(21f, 6f)
                verticalLineTo(5f)
                moveTo(3f, 6f)
                verticalLineTo(5f)
                moveTo(12f, 4f)
                verticalLineTo(3f)
                moveTo(17f, 6f)
                verticalLineTo(5f)
                moveTo(7f, 6f)
                verticalLineTo(5f)
                moveTo(21f, 9f)
                curveTo(21f, 13.971f, 16.971f, 18f, 12f, 18f)
                curveTo(7.029f, 18f, 3f, 13.971f, 3f, 9f)
                moveTo(17f, 9f)
                curveTo(17f, 11.761f, 14.761f, 14f, 12f, 14f)
                curveTo(9.239f, 14f, 7f, 11.761f, 7f, 9f)
                moveTo(8f, 21f)
                horizontalLineTo(16f)
            }
        }.build()

        return _MenorahAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _MenorahAlt1: ImageVector? = null
