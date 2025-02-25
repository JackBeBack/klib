package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HatWitch: ImageVector
    get() {
        if (_HatWitch != null) {
            return _HatWitch!!
        }
        _HatWitch = ImageVector.Builder(
            name = "HatWitch",
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
                moveTo(21f, 20f)
                lineTo(20f, 21f)
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                moveTo(20f, 21f)
                lineTo(16.687f, 12.717f)
                curveTo(16.43f, 12.075f, 16.302f, 11.755f, 16.212f, 11.424f)
                curveTo(16.131f, 11.13f, 16.074f, 10.83f, 16.039f, 10.528f)
                curveTo(16f, 10.187f, 16f, 9.842f, 16f, 9.151f)
                verticalLineTo(8f)
                lineTo(18f, 7f)
                lineTo(21f, 10f)
                verticalLineTo(5f)
                lineTo(16.5f, 2.5f)
                lineTo(11.272f, 6.334f)
                curveTo(10.427f, 6.954f, 10.005f, 7.263f, 9.647f, 7.634f)
                curveTo(9.33f, 7.964f, 9.051f, 8.328f, 8.817f, 8.72f)
                curveTo(8.553f, 9.163f, 8.365f, 9.652f, 7.989f, 10.629f)
                lineTo(4f, 21f)
                moveTo(4f, 21f)
                lineTo(3f, 20f)
                moveTo(5.731f, 16.5f)
                horizontalLineTo(10.5f)
                moveTo(13.5f, 16.5f)
                horizontalLineTo(18.2f)
                moveTo(10.5f, 15f)
                horizontalLineTo(13.5f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _HatWitch!!
    }

@Suppress("ObjectPropertyName")
private var _HatWitch: ImageVector? = null
