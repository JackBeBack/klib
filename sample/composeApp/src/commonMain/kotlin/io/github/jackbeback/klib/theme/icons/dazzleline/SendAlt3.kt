package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SendAlt3: ImageVector
    get() {
        if (_SendAlt3 != null) {
            return _SendAlt3!!
        }
        _SendAlt3 = ImageVector.Builder(
            name = "SendAlt3",
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
                moveTo(3.236f, 12f)
                horizontalLineTo(13.945f)
                moveTo(21f, 16f)
                horizontalLineTo(18.5f)
                moveTo(20f, 12f)
                horizontalLineTo(18.5f)
                moveTo(19.5f, 8f)
                horizontalLineTo(18.5f)
                moveTo(14.039f, 11.51f)
                lineTo(14.93f, 8.551f)
                curveTo(15.268f, 7.431f, 15.436f, 6.871f, 15.293f, 6.537f)
                curveTo(15.168f, 6.246f, 14.914f, 6.032f, 14.606f, 5.959f)
                curveTo(14.252f, 5.874f, 13.729f, 6.136f, 12.683f, 6.659f)
                lineTo(4.862f, 10.569f)
                curveTo(3.941f, 11.03f, 3.481f, 11.26f, 3.333f, 11.571f)
                curveTo(3.204f, 11.843f, 3.204f, 12.157f, 3.333f, 12.429f)
                curveTo(3.481f, 12.74f, 3.941f, 12.97f, 4.862f, 13.431f)
                lineTo(12.693f, 17.347f)
                curveTo(13.737f, 17.868f, 14.259f, 18.129f, 14.612f, 18.045f)
                curveTo(14.92f, 17.972f, 15.174f, 17.758f, 15.299f, 17.468f)
                curveTo(15.443f, 17.134f, 15.276f, 16.575f, 14.942f, 15.458f)
                lineTo(14.038f, 12.43f)
                curveTo(13.987f, 12.259f, 13.961f, 12.173f, 13.951f, 12.086f)
                curveTo(13.942f, 12.009f, 13.942f, 11.931f, 13.951f, 11.854f)
                curveTo(13.962f, 11.767f, 13.987f, 11.681f, 14.039f, 11.51f)
                close()
            }
        }.build()

        return _SendAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SendAlt3: ImageVector? = null
