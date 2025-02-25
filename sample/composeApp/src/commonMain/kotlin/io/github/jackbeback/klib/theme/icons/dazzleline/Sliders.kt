package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Sliders: ImageVector
    get() {
        if (_Sliders != null) {
            return _Sliders!!
        }
        _Sliders = ImageVector.Builder(
            name = "Sliders",
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
                moveTo(12f, 5.5f)
                curveTo(12f, 6.881f, 10.881f, 8f, 9.5f, 8f)
                curveTo(8.119f, 8f, 7f, 6.881f, 7f, 5.5f)
                moveTo(12f, 5.5f)
                curveTo(12f, 4.119f, 10.881f, 3f, 9.5f, 3f)
                curveTo(8.119f, 3f, 7f, 4.119f, 7f, 5.5f)
                moveTo(12f, 5.5f)
                horizontalLineTo(21f)
                moveTo(7f, 5.5f)
                horizontalLineTo(3f)
                moveTo(19f, 12f)
                curveTo(19f, 13.381f, 17.881f, 14.5f, 16.5f, 14.5f)
                curveTo(15.119f, 14.5f, 14f, 13.381f, 14f, 12f)
                moveTo(19f, 12f)
                curveTo(19f, 10.619f, 17.881f, 9.5f, 16.5f, 9.5f)
                curveTo(15.119f, 9.5f, 14f, 10.619f, 14f, 12f)
                moveTo(19f, 12f)
                horizontalLineTo(21f)
                moveTo(14f, 12f)
                horizontalLineTo(3f)
                moveTo(10f, 18.5f)
                curveTo(10f, 19.881f, 8.881f, 21f, 7.5f, 21f)
                curveTo(6.119f, 21f, 5f, 19.881f, 5f, 18.5f)
                moveTo(10f, 18.5f)
                curveTo(10f, 17.119f, 8.881f, 16f, 7.5f, 16f)
                curveTo(6.119f, 16f, 5f, 17.119f, 5f, 18.5f)
                moveTo(10f, 18.5f)
                horizontalLineTo(21f)
                moveTo(5f, 18.5f)
                horizontalLineTo(3f)
            }
        }.build()

        return _Sliders!!
    }

@Suppress("ObjectPropertyName")
private var _Sliders: ImageVector? = null
