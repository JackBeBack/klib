package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TowerObservation: ImageVector
    get() {
        if (_TowerObservation != null) {
            return _TowerObservation!!
        }
        _TowerObservation = ImageVector.Builder(
            name = "TowerObservation",
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
                moveTo(5f, 21f)
                horizontalLineTo(19f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                moveTo(7.15f, 20.5f)
                lineTo(14.915f, 14.048f)
                moveTo(16.8f, 20.342f)
                lineTo(9.07f, 14.099f)
                moveTo(10f, 11f)
                lineTo(7f, 21f)
                moveTo(14f, 11f)
                lineTo(17f, 21f)
                moveTo(6f, 6f)
                lineTo(11.285f, 3.358f)
                curveTo(11.547f, 3.226f, 11.678f, 3.161f, 11.816f, 3.135f)
                curveTo(11.938f, 3.112f, 12.063f, 3.112f, 12.184f, 3.135f)
                curveTo(12.322f, 3.161f, 12.453f, 3.226f, 12.715f, 3.358f)
                lineTo(18f, 6f)
                moveTo(8f, 5f)
                verticalLineTo(9.4f)
                curveTo(8f, 9.96f, 8f, 10.24f, 8.109f, 10.454f)
                curveTo(8.205f, 10.642f, 8.358f, 10.795f, 8.546f, 10.891f)
                curveTo(8.76f, 11f, 9.04f, 11f, 9.6f, 11f)
                horizontalLineTo(14.4f)
                curveTo(14.96f, 11f, 15.24f, 11f, 15.454f, 10.891f)
                curveTo(15.642f, 10.795f, 15.795f, 10.642f, 15.891f, 10.454f)
                curveTo(16f, 10.24f, 16f, 9.96f, 16f, 9.4f)
                verticalLineTo(5f)
            }
        }.build()

        return _TowerObservation!!
    }

@Suppress("ObjectPropertyName")
private var _TowerObservation: ImageVector? = null
