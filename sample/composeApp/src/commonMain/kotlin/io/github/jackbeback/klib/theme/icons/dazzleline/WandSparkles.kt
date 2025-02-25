package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WandSparkles: ImageVector
    get() {
        if (_WandSparkles != null) {
            return _WandSparkles!!
        }
        _WandSparkles = ImageVector.Builder(
            name = "WandSparkles",
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
                moveTo(18f, 16f)
                verticalLineTo(20f)
                moveTo(6f, 4f)
                verticalLineTo(8f)
                moveTo(16f, 18f)
                horizontalLineTo(20f)
                moveTo(4f, 6f)
                horizontalLineTo(8f)
                moveTo(7f, 14.515f)
                verticalLineTo(12f)
                horizontalLineTo(9.839f)
                moveTo(15.686f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(7.388f)
                moveTo(3.703f, 19.702f)
                lineTo(4.299f, 20.298f)
                curveTo(4.717f, 20.716f, 4.926f, 20.925f, 5.165f, 20.998f)
                curveTo(5.375f, 21.062f, 5.6f, 21.055f, 5.805f, 20.979f)
                curveTo(6.039f, 20.892f, 6.236f, 20.67f, 6.628f, 20.227f)
                lineTo(20.532f, 4.529f)
                curveTo(20.679f, 4.363f, 20.752f, 4.28f, 20.785f, 4.19f)
                curveTo(20.828f, 4.071f, 20.824f, 3.94f, 20.774f, 3.823f)
                curveTo(20.736f, 3.735f, 20.657f, 3.657f, 20.501f, 3.5f)
                curveTo(20.344f, 3.343f, 20.265f, 3.265f, 20.177f, 3.227f)
                curveTo(20.061f, 3.177f, 19.93f, 3.173f, 19.811f, 3.216f)
                curveTo(19.72f, 3.248f, 19.637f, 3.322f, 19.471f, 3.469f)
                lineTo(3.773f, 17.373f)
                curveTo(3.33f, 17.765f, 3.109f, 17.961f, 3.022f, 18.195f)
                curveTo(2.945f, 18.401f, 2.938f, 18.626f, 3.002f, 18.836f)
                curveTo(3.075f, 19.075f, 3.284f, 19.284f, 3.703f, 19.702f)
                close()
            }
        }.build()

        return _WandSparkles!!
    }

@Suppress("ObjectPropertyName")
private var _WandSparkles: ImageVector? = null
