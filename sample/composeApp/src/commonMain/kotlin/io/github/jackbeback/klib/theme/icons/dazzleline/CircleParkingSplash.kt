package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleParkingSplash: ImageVector
    get() {
        if (_CircleParkingSplash != null) {
            return _CircleParkingSplash!!
        }
        _CircleParkingSplash = ImageVector.Builder(
            name = "CircleParkingSplash",
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
                moveTo(9.087f, 3.482f)
                curveTo(10.001f, 3.169f, 10.981f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 13.02f, 20.83f, 14f, 20.518f, 14.913f)
                moveTo(18.364f, 18.364f)
                curveTo(16.735f, 19.993f, 14.485f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 9.518f, 4.005f, 7.271f, 5.63f, 5.642f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(13.697f, 8.098f)
                curveTo(14.512f, 8.334f, 15.155f, 8.974f, 15.397f, 9.786f)
                moveTo(9.5f, 9.5f)
                verticalLineTo(16f)
            }
        }.build()

        return _CircleParkingSplash!!
    }

@Suppress("ObjectPropertyName")
private var _CircleParkingSplash: ImageVector? = null
