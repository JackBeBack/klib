package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Umbrella: ImageVector
    get() {
        if (_Umbrella != null) {
            return _Umbrella!!
        }
        _Umbrella = ImageVector.Builder(
            name = "Umbrella",
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
                moveTo(8f, 19f)
                curveTo(8f, 20.105f, 8.895f, 21f, 10f, 21f)
                curveTo(11.105f, 21f, 12f, 20.105f, 12f, 19f)
                verticalLineTo(11f)
                moveTo(12f, 11f)
                curveTo(13.126f, 11f, 14.164f, 11.372f, 15f, 12f)
                curveTo(15.836f, 11.372f, 16.874f, 11f, 18f, 11f)
                curveTo(19.126f, 11f, 20.164f, 11.372f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3.836f, 11.372f, 4.874f, 11f, 6f, 11f)
                curveTo(7.126f, 11f, 8.164f, 11.372f, 9f, 12f)
                curveTo(9.836f, 11.372f, 10.874f, 11f, 12f, 11f)
                close()
            }
        }.build()

        return _Umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _Umbrella: ImageVector? = null
