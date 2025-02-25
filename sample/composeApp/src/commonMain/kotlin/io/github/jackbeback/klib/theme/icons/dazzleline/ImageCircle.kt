package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImageCircle: ImageVector
    get() {
        if (_ImageCircle != null) {
            return _ImageCircle!!
        }
        _ImageCircle = ImageVector.Builder(
            name = "ImageCircle",
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
                moveTo(13.647f, 16.375f)
                lineTo(12.096f, 14.962f)
                curveTo(11.335f, 14.269f, 10.955f, 13.923f, 10.524f, 13.792f)
                curveTo(10.144f, 13.676f, 9.738f, 13.676f, 9.359f, 13.792f)
                curveTo(8.928f, 13.923f, 8.547f, 14.269f, 7.787f, 14.962f)
                lineTo(4.92f, 17.558f)
                moveTo(13.647f, 16.375f)
                lineTo(13.963f, 16.087f)
                curveTo(14.724f, 15.394f, 15.104f, 15.048f, 15.535f, 14.917f)
                curveTo(15.915f, 14.801f, 16.32f, 14.801f, 16.7f, 14.917f)
                curveTo(17.131f, 15.048f, 17.511f, 15.394f, 18.272f, 16.087f)
                lineTo(19.424f, 17.09f)
                moveTo(13.647f, 16.375f)
                lineTo(17.047f, 19.453f)
                moveTo(17f, 9f)
                curveTo(17f, 10.105f, 16.105f, 11f, 15f, 11f)
                curveTo(13.895f, 11f, 13f, 10.105f, 13f, 9f)
                curveTo(13f, 7.895f, 13.895f, 7f, 15f, 7f)
                curveTo(16.105f, 7f, 17f, 7.895f, 17f, 9f)
                close()
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _ImageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCircle: ImageVector? = null
