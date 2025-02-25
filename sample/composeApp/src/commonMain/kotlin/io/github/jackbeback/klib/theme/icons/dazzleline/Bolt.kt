package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bolt: ImageVector
    get() {
        if (_Bolt != null) {
            return _Bolt!!
        }
        _Bolt = ImageVector.Builder(
            name = "Bolt",
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
                moveTo(13f, 3f)
                lineTo(5.069f, 12.693f)
                curveTo(4.727f, 13.111f, 4.556f, 13.32f, 4.555f, 13.496f)
                curveTo(4.553f, 13.649f, 4.622f, 13.794f, 4.741f, 13.89f)
                curveTo(4.879f, 14f, 5.148f, 14f, 5.688f, 14f)
                horizontalLineTo(12f)
                lineTo(11f, 21f)
                lineTo(18.931f, 11.307f)
                curveTo(19.272f, 10.889f, 19.443f, 10.68f, 19.444f, 10.504f)
                curveTo(19.446f, 10.351f, 19.377f, 10.206f, 19.258f, 10.11f)
                curveTo(19.121f, 10f, 18.851f, 10f, 18.311f, 10f)
                horizontalLineTo(12f)
                lineTo(13f, 3f)
                close()
            }
        }.build()

        return _Bolt!!
    }

@Suppress("ObjectPropertyName")
private var _Bolt: ImageVector? = null
