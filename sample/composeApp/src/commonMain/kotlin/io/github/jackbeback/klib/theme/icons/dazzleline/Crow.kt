package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Crow: ImageVector
    get() {
        if (_Crow != null) {
            return _Crow!!
        }
        _Crow = ImageVector.Builder(
            name = "Crow",
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
                moveTo(15.462f, 11.308f)
                curveTo(15.462f, 15.981f, 7.385f, 18.923f, 3.923f, 18.923f)
                moveTo(3f, 21f)
                curveTo(4.68f, 15.419f, 8.905f, 10.948f, 13.748f, 9.082f)
                curveTo(14.795f, 8.679f, 15.6f, 7.721f, 15.6f, 6.6f)
                moveTo(15.6f, 6.6f)
                horizontalLineTo(12f)
                curveTo(12f, 5.482f, 13.785f, 4.35f, 15.6f, 4.35f)
                horizontalLineTo(15.961f)
                moveTo(15.6f, 6.6f)
                verticalLineTo(5.7f)
                curveTo(15.6f, 5.208f, 15.731f, 4.747f, 15.961f, 4.35f)
                moveTo(3.9f, 19.2f)
                horizontalLineTo(10.2f)
                curveTo(16.165f, 19.2f, 21f, 14.365f, 21f, 8.4f)
                verticalLineTo(5.7f)
                curveTo(21f, 4.209f, 19.791f, 3f, 18.3f, 3f)
                curveTo(17.301f, 3f, 16.428f, 3.543f, 15.961f, 4.35f)
                moveTo(10.65f, 21f)
                verticalLineTo(19.2f)
                moveTo(13.8f, 21f)
                verticalLineTo(19.2f)
                moveTo(18.3f, 5.7f)
                lineTo(18.306f, 5.706f)
            }
        }.build()

        return _Crow!!
    }

@Suppress("ObjectPropertyName")
private var _Crow: ImageVector? = null
