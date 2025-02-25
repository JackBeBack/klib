package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartArea: ImageVector
    get() {
        if (_ChartArea != null) {
            return _ChartArea!!
        }
        _ChartArea = ImageVector.Builder(
            name = "ChartArea",
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
                moveTo(21f, 21f)
                horizontalLineTo(7.8f)
                curveTo(6.12f, 21f, 5.28f, 21f, 4.638f, 20.673f)
                curveTo(4.074f, 20.385f, 3.615f, 19.927f, 3.327f, 19.362f)
                curveTo(3f, 18.72f, 3f, 17.88f, 3f, 16.2f)
                verticalLineTo(3f)
                moveTo(14.429f, 10f)
                lineTo(12.815f, 8.263f)
                curveTo(12.408f, 7.824f, 12.204f, 7.605f, 11.966f, 7.523f)
                curveTo(11.757f, 7.452f, 11.529f, 7.452f, 11.32f, 7.523f)
                curveTo(11.081f, 7.605f, 10.878f, 7.824f, 10.47f, 8.263f)
                lineTo(7.428f, 11.54f)
                curveTo(7.27f, 11.71f, 7.19f, 11.795f, 7.134f, 11.892f)
                curveTo(7.084f, 11.979f, 7.047f, 12.073f, 7.025f, 12.17f)
                curveTo(7f, 12.28f, 7f, 12.396f, 7f, 12.628f)
                verticalLineTo(15.4f)
                curveTo(7f, 15.96f, 7f, 16.24f, 7.109f, 16.454f)
                curveTo(7.205f, 16.642f, 7.358f, 16.795f, 7.546f, 16.891f)
                curveTo(7.76f, 17f, 8.04f, 17f, 8.6f, 17f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 17f, 19.24f, 17f, 19.454f, 16.891f)
                curveTo(19.642f, 16.795f, 19.795f, 16.642f, 19.891f, 16.454f)
                curveTo(20f, 16.24f, 20f, 15.96f, 20f, 15.4f)
                verticalLineTo(12.628f)
                curveTo(20f, 12.396f, 20f, 12.28f, 19.975f, 12.17f)
                curveTo(19.953f, 12.073f, 19.916f, 11.979f, 19.866f, 11.892f)
                curveTo(19.809f, 11.795f, 19.73f, 11.71f, 19.573f, 11.54f)
                lineTo(18.143f, 10f)
                curveTo(17.962f, 9.806f, 17.872f, 9.708f, 17.781f, 9.646f)
                curveTo(17.44f, 9.411f, 16.989f, 9.411f, 16.647f, 9.646f)
                curveTo(16.557f, 9.708f, 16.466f, 9.806f, 16.286f, 10f)
                curveTo(16.105f, 10.194f, 16.015f, 10.292f, 15.924f, 10.354f)
                curveTo(15.583f, 10.589f, 15.132f, 10.589f, 14.79f, 10.354f)
                curveTo(14.699f, 10.292f, 14.609f, 10.194f, 14.429f, 10f)
                close()
            }
        }.build()

        return _ChartArea!!
    }

@Suppress("ObjectPropertyName")
private var _ChartArea: ImageVector? = null
