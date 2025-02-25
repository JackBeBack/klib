package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MoonCloud: ImageVector
    get() {
        if (_MoonCloud != null) {
            return _MoonCloud!!
        }
        _MoonCloud = ImageVector.Builder(
            name = "MoonCloud",
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
                moveTo(11.654f, 5.618f)
                curveTo(13.281f, 4f, 15.524f, 3f, 18f, 3f)
                curveTo(18.983f, 3f, 19.929f, 3.156f, 20.815f, 3.448f)
                curveTo(17.928f, 5.202f, 16f, 8.376f, 16f, 12f)
                curveTo(16f, 15.623f, 17.928f, 18.798f, 20.813f, 20.552f)
                curveTo(19.928f, 20.843f, 18.983f, 21f, 18f, 21f)
                curveTo(16.15f, 21f, 14.43f, 20.442f, 13f, 19.484f)
                moveTo(5.7f, 16f)
                curveTo(4.209f, 16f, 3f, 14.802f, 3f, 13.325f)
                curveTo(3f, 12.1f, 3.9f, 10.969f, 5.25f, 10.75f)
                curveTo(5.673f, 9.743f, 6.676f, 9f, 7.845f, 9f)
                curveTo(9.342f, 9f, 10.566f, 10.161f, 10.65f, 11.625f)
                curveTo(11.445f, 11.972f, 12f, 12.825f, 12f, 13.748f)
                curveTo(12f, 14.992f, 10.993f, 16f, 9.75f, 16f)
                lineTo(5.7f, 16f)
                close()
            }
        }.build()

        return _MoonCloud!!
    }

@Suppress("ObjectPropertyName")
private var _MoonCloud: ImageVector? = null
