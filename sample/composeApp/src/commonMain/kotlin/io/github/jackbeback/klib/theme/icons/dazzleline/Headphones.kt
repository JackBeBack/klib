package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Headphones",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.457f, 14.838f)
                curveTo(3.753f, 14.372f, 4.182f, 13.983f, 4.719f, 13.732f)
                curveTo(5.72f, 13.265f, 6.91f, 13.698f, 7.377f, 14.7f)
                lineTo(9.067f, 18.325f)
                curveTo(9.534f, 19.326f, 9.101f, 20.516f, 8.1f, 20.983f)
                curveTo(6.598f, 21.683f, 4.814f, 21.033f, 4.113f, 19.532f)
                lineTo(3.268f, 17.719f)
                curveTo(2.819f, 16.755f, 2.925f, 15.674f, 3.457f, 14.838f)
                close()
                moveTo(3.457f, 14.838f)
                curveTo(3.161f, 13.946f, 3f, 12.992f, 3f, 12f)
                curveTo(3f, 7.029f, 7.03f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 13.026f, 20.829f, 14.012f, 20.512f, 14.931f)
                moveTo(20.512f, 14.931f)
                curveTo(20.215f, 14.424f, 19.766f, 13.999f, 19.194f, 13.732f)
                curveTo(18.193f, 13.265f, 17.003f, 13.698f, 16.536f, 14.7f)
                lineTo(14.845f, 18.325f)
                curveTo(14.379f, 19.326f, 14.812f, 20.516f, 15.813f, 20.983f)
                curveTo(17.314f, 21.683f, 19.099f, 21.033f, 19.799f, 19.532f)
                lineTo(20.645f, 17.719f)
                curveTo(21.078f, 16.79f, 20.994f, 15.752f, 20.512f, 14.931f)
                close()
                moveTo(17.563f, 4.924f)
                lineTo(16.001f, 6.999f)
                curveTo(14.971f, 6.387f, 13.277f, 6f, 12.002f, 6f)
                curveTo(10.702f, 6f, 9.045f, 6.365f, 8.002f, 7f)
                lineTo(6.436f, 4.926f)
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null
