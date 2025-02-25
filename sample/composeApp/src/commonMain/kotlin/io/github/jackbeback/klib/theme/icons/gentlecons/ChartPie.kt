package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.ChartPie: ImageVector
    get() {
        if (_ChartPie != null) {
            return _ChartPie!!
        }
        _ChartPie = ImageVector.Builder(
            name = "ChartPie",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 23f)
                curveTo(18.075f, 23f, 23f, 18.075f, 23f, 12f)
                curveTo(23f, 5.925f, 18.075f, 1f, 12f, 1f)
                curveTo(5.925f, 1f, 1f, 5.925f, 1f, 12f)
                curveTo(1f, 18.075f, 5.925f, 23f, 12f, 23f)
                close()
                moveTo(12f, 20.993f)
                curveTo(7.033f, 20.993f, 3.007f, 16.967f, 3.007f, 12f)
                curveTo(3.007f, 7.371f, 6.504f, 3.559f, 11f, 3.062f)
                verticalLineTo(11.586f)
                curveTo(11f, 12.116f, 11.211f, 12.625f, 11.586f, 13f)
                lineTo(17.613f, 19.027f)
                curveTo(16.074f, 20.257f, 14.123f, 20.993f, 12f, 20.993f)
                close()
                moveTo(19.027f, 17.613f)
                lineTo(14.756f, 13.341f)
                curveTo(14.63f, 13.215f, 14.719f, 13f, 14.897f, 13f)
                horizontalLineTo(20.938f)
                curveTo(20.746f, 14.734f, 20.062f, 16.319f, 19.027f, 17.613f)
                close()
                moveTo(20.938f, 11f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 11f, 13f, 10.776f, 13f, 10.5f)
                verticalLineTo(3.062f)
                curveTo(17.168f, 3.523f, 20.477f, 6.832f, 20.938f, 11f)
                close()
            }
        }.build()

        return _ChartPie!!
    }

@Suppress("ObjectPropertyName")
private var _ChartPie: ImageVector? = null
