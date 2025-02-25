package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ScaleUnbalanced: ImageVector
    get() {
        if (_ScaleUnbalanced != null) {
            return _ScaleUnbalanced!!
        }
        _ScaleUnbalanced = ImageVector.Builder(
            name = "ScaleUnbalanced",
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
                moveTo(19.999f, 21f)
                horizontalLineTo(11.999f)
                verticalLineTo(8f)
                moveTo(11.999f, 8f)
                curveTo(13.104f, 8f, 13.999f, 7.104f, 13.999f, 6f)
                curveTo(13.999f, 5.76f, 13.957f, 5.529f, 13.879f, 5.316f)
                moveTo(11.999f, 8f)
                curveTo(10.895f, 8f, 9.999f, 7.104f, 9.999f, 6f)
                curveTo(9.999f, 4.895f, 10.895f, 4f, 11.999f, 4f)
                curveTo(12.863f, 4f, 13.6f, 4.548f, 13.879f, 5.316f)
                moveTo(10.12f, 6.684f)
                lineTo(4.482f, 8.736f)
                moveTo(19.517f, 3.264f)
                lineTo(13.879f, 5.316f)
                moveTo(5.999f, 21f)
                curveTo(7.512f, 21f, 8.763f, 20.158f, 8.969f, 18.751f)
                curveTo(8.982f, 18.662f, 8.989f, 18.617f, 8.984f, 18.518f)
                curveTo(8.98f, 18.45f, 8.957f, 18.326f, 8.936f, 18.26f)
                curveTo(8.905f, 18.166f, 8.868f, 18.1f, 8.794f, 17.968f)
                lineTo(5.999f, 13f)
                lineTo(3.205f, 17.968f)
                curveTo(3.136f, 18.09f, 3.101f, 18.152f, 3.069f, 18.258f)
                curveTo(3.05f, 18.324f, 3.027f, 18.481f, 3.027f, 18.549f)
                curveTo(3.028f, 18.66f, 3.035f, 18.69f, 3.048f, 18.749f)
                curveTo(3.303f, 19.86f, 4.527f, 21f, 5.999f, 21f)
                close()
                moveTo(17.999f, 17f)
                curveTo(19.512f, 17f, 20.763f, 16.158f, 20.969f, 14.751f)
                curveTo(20.982f, 14.662f, 20.989f, 14.617f, 20.984f, 14.519f)
                curveTo(20.98f, 14.45f, 20.957f, 14.325f, 20.936f, 14.26f)
                curveTo(20.905f, 14.166f, 20.868f, 14.1f, 20.794f, 13.968f)
                lineTo(17.999f, 9f)
                lineTo(15.205f, 13.968f)
                curveTo(15.136f, 14.09f, 15.101f, 14.152f, 15.069f, 14.258f)
                curveTo(15.05f, 14.324f, 15.027f, 14.481f, 15.027f, 14.549f)
                curveTo(15.028f, 14.66f, 15.035f, 14.69f, 15.048f, 14.748f)
                curveTo(15.303f, 15.86f, 16.527f, 17f, 17.999f, 17f)
                close()
            }
        }.build()

        return _ScaleUnbalanced!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleUnbalanced: ImageVector? = null
