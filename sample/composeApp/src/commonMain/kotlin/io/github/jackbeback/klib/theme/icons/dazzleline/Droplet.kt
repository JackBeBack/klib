package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Droplet: ImageVector
    get() {
        if (_Droplet != null) {
            return _Droplet!!
        }
        _Droplet = ImageVector.Builder(
            name = "Droplet",
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
                moveTo(19f, 13.8f)
                curveTo(19f, 17.776f, 15.866f, 21f, 12f, 21f)
                curveTo(8.134f, 21f, 5f, 17.776f, 5f, 13.8f)
                curveTo(5f, 12.845f, 5.181f, 11.934f, 5.509f, 11.1f)
                curveTo(6.547f, 8.461f, 12f, 3f, 12f, 3f)
                curveTo(12f, 3f, 17.453f, 8.461f, 18.491f, 11.1f)
                curveTo(18.819f, 11.934f, 19f, 12.845f, 19f, 13.8f)
                close()
            }
        }.build()

        return _Droplet!!
    }

@Suppress("ObjectPropertyName")
private var _Droplet: ImageVector? = null
