package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Stocking: ImageVector
    get() {
        if (_Stocking != null) {
            return _Stocking!!
        }
        _Stocking = ImageVector.Builder(
            name = "Stocking",
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
                moveTo(17.999f, 7f)
                verticalLineTo(13.908f)
                curveTo(17.999f, 15.816f, 16.965f, 17.575f, 15.297f, 18.501f)
                lineTo(11.201f, 20.777f)
                curveTo(9.874f, 21.514f, 8.231f, 21.359f, 7.064f, 20.388f)
                curveTo(5.096f, 18.747f, 5.369f, 15.646f, 7.594f, 14.375f)
                lineTo(9.999f, 13f)
                lineTo(9.999f, 7f)
                moveTo(8.999f, 3f)
                horizontalLineTo(18.999f)
                verticalLineTo(7f)
                horizontalLineTo(8.999f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Stocking!!
    }

@Suppress("ObjectPropertyName")
private var _Stocking: ImageVector? = null
