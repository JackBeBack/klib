package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FlipForwardEnergy: ImageVector
    get() {
        if (_FlipForwardEnergy != null) {
            return _FlipForwardEnergy!!
        }
        _FlipForwardEnergy = ImageVector.Builder(
            name = "FlipForwardEnergy",
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
                moveTo(3.938f, 7.996f)
                curveTo(5.411f, 5.035f, 8.468f, 3f, 12f, 3f)
                curveTo(16.629f, 3f, 20.442f, 6.495f, 20.944f, 10.99f)
                moveTo(3.055f, 13f)
                curveTo(3.552f, 17.5f, 7.367f, 21f, 12f, 21f)
                curveTo(15.533f, 21f, 18.59f, 18.965f, 20.063f, 16.002f)
                moveTo(3f, 4f)
                verticalLineTo(8.5f)
                horizontalLineTo(7.5f)
                moveTo(21f, 20.5f)
                verticalLineTo(16f)
                horizontalLineTo(16.5f)
                moveTo(11.5f, 9f)
                lineTo(10f, 12f)
                horizontalLineTo(14f)
                lineTo(12.5f, 15f)
            }
        }.build()

        return _FlipForwardEnergy!!
    }

@Suppress("ObjectPropertyName")
private var _FlipForwardEnergy: ImageVector? = null
