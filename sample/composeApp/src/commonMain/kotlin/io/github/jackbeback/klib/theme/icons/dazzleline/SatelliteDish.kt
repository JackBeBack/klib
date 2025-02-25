package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SatelliteDish: ImageVector
    get() {
        if (_SatelliteDish != null) {
            return _SatelliteDish!!
        }
        _SatelliteDish = ImageVector.Builder(
            name = "SatelliteDish",
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
                moveTo(12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                moveTo(12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                moveTo(10f, 14f)
                lineTo(12f, 12f)
                moveTo(10f, 21f)
                curveTo(6.134f, 21f, 3f, 17.866f, 3f, 14f)
                curveTo(3f, 12.067f, 3.783f, 10.317f, 5.05f, 9.05f)
                lineTo(14.951f, 18.951f)
                curveTo(13.684f, 20.218f, 11.933f, 21f, 10f, 21f)
                close()
            }
        }.build()

        return _SatelliteDish!!
    }

@Suppress("ObjectPropertyName")
private var _SatelliteDish: ImageVector? = null
