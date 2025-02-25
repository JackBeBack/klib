package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Podcast: ImageVector
    get() {
        if (_Podcast != null) {
            return _Podcast!!
        }
        _Podcast = ImageVector.Builder(
            name = "Podcast",
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
                moveTo(6f, 17.708f)
                curveTo(4.159f, 16.06f, 3f, 13.665f, 3f, 11f)
                curveTo(3f, 6.029f, 7.029f, 2f, 12f, 2f)
                curveTo(16.971f, 2f, 21f, 6.029f, 21f, 11f)
                curveTo(21f, 13.665f, 19.841f, 16.06f, 18f, 17.708f)
                moveTo(7.802f, 13.718f)
                curveTo(7.295f, 12.935f, 7f, 12.002f, 7f, 11f)
                curveTo(7f, 8.239f, 9.239f, 6f, 12f, 6f)
                curveTo(14.761f, 6f, 17f, 8.239f, 17f, 11f)
                curveTo(17f, 12.001f, 16.706f, 12.933f, 16.2f, 13.715f)
                moveTo(12f, 22f)
                curveTo(10.895f, 22f, 10f, 21.105f, 10f, 20f)
                verticalLineTo(18f)
                curveTo(10f, 16.895f, 10.895f, 16f, 12f, 16f)
                curveTo(13.105f, 16f, 14f, 16.895f, 14f, 18f)
                verticalLineTo(20f)
                curveTo(14f, 21.105f, 13.105f, 22f, 12f, 22f)
                close()
                moveTo(13f, 11f)
                curveTo(13f, 11.552f, 12.552f, 12f, 12f, 12f)
                curveTo(11.448f, 12f, 11f, 11.552f, 11f, 11f)
                curveTo(11f, 10.448f, 11.448f, 10f, 12f, 10f)
                curveTo(12.552f, 10f, 13f, 10.448f, 13f, 11f)
                close()
            }
        }.build()

        return _Podcast!!
    }

@Suppress("ObjectPropertyName")
private var _Podcast: ImageVector? = null
