package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Dna: ImageVector
    get() {
        if (_Dna != null) {
            return _Dna!!
        }
        _Dna = ImageVector.Builder(
            name = "Dna",
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
                moveTo(19f, 21f)
                curveTo(19f, 20.663f, 18.982f, 20.329f, 18.946f, 20f)
                moveTo(5f, 3f)
                curveTo(5f, 3.337f, 5.018f, 3.671f, 5.054f, 4f)
                moveTo(5f, 21f)
                curveTo(5f, 16.857f, 7.747f, 13.215f, 11.731f, 12.077f)
                lineTo(12.269f, 11.923f)
                curveTo(16.253f, 10.785f, 19f, 7.143f, 19f, 3f)
                moveTo(15f, 4f)
                horizontalLineTo(5.054f)
                moveTo(12.5f, 8f)
                horizontalLineTo(6.462f)
                moveTo(9f, 20f)
                horizontalLineTo(18.946f)
                moveTo(11.5f, 16f)
                horizontalLineTo(17.538f)
                moveTo(18.946f, 20f)
                curveTo(18.79f, 18.551f, 18.297f, 17.187f, 17.538f, 16f)
                moveTo(17.538f, 16f)
                curveTo(16.348f, 14.141f, 14.503f, 12.715f, 12.269f, 12.077f)
                lineTo(11.731f, 11.923f)
                curveTo(9.497f, 11.285f, 7.652f, 9.859f, 6.462f, 8f)
                moveTo(5.054f, 4f)
                curveTo(5.21f, 5.449f, 5.703f, 6.813f, 6.462f, 8f)
            }
        }.build()

        return _Dna!!
    }

@Suppress("ObjectPropertyName")
private var _Dna: ImageVector? = null
