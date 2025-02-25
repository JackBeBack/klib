package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ScaleBalanced: ImageVector
    get() {
        if (_ScaleBalanced != null) {
            return _ScaleBalanced!!
        }
        _ScaleBalanced = ImageVector.Builder(
            name = "ScaleBalanced",
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
                moveTo(3.999f, 21f)
                horizontalLineTo(19.999f)
                moveTo(11.999f, 21f)
                verticalLineTo(7f)
                moveTo(11.999f, 7f)
                curveTo(13.104f, 7f, 13.999f, 6.105f, 13.999f, 5f)
                moveTo(11.999f, 7f)
                curveTo(10.895f, 7f, 9.999f, 6.105f, 9.999f, 5f)
                moveTo(13.999f, 5f)
                curveTo(13.999f, 3.895f, 13.104f, 3f, 11.999f, 3f)
                curveTo(10.895f, 3f, 9.999f, 3.895f, 9.999f, 5f)
                moveTo(13.999f, 5f)
                horizontalLineTo(19.999f)
                moveTo(9.999f, 5f)
                horizontalLineTo(3.999f)
                moveTo(5.999f, 17f)
                curveTo(7.512f, 17f, 8.763f, 16.158f, 8.969f, 14.751f)
                curveTo(8.982f, 14.662f, 8.989f, 14.618f, 8.984f, 14.519f)
                curveTo(8.98f, 14.45f, 8.957f, 14.326f, 8.936f, 14.26f)
                curveTo(8.905f, 14.166f, 8.868f, 14.1f, 8.794f, 13.968f)
                lineTo(5.999f, 9f)
                lineTo(3.205f, 13.968f)
                curveTo(3.136f, 14.091f, 3.101f, 14.152f, 3.069f, 14.258f)
                curveTo(3.05f, 14.324f, 3.027f, 14.481f, 3.027f, 14.549f)
                curveTo(3.028f, 14.661f, 3.035f, 14.69f, 3.048f, 14.749f)
                curveTo(3.303f, 15.86f, 4.527f, 17f, 5.999f, 17f)
                close()
                moveTo(17.999f, 17f)
                curveTo(19.512f, 17f, 20.763f, 16.158f, 20.969f, 14.751f)
                curveTo(20.982f, 14.662f, 20.989f, 14.618f, 20.984f, 14.519f)
                curveTo(20.98f, 14.45f, 20.957f, 14.326f, 20.936f, 14.26f)
                curveTo(20.905f, 14.166f, 20.868f, 14.1f, 20.794f, 13.968f)
                lineTo(17.999f, 9f)
                lineTo(15.205f, 13.968f)
                curveTo(15.136f, 14.091f, 15.101f, 14.152f, 15.069f, 14.258f)
                curveTo(15.05f, 14.324f, 15.027f, 14.481f, 15.027f, 14.549f)
                curveTo(15.028f, 14.661f, 15.035f, 14.69f, 15.048f, 14.749f)
                curveTo(15.303f, 15.86f, 16.527f, 17f, 17.999f, 17f)
                close()
            }
        }.build()

        return _ScaleBalanced!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleBalanced: ImageVector? = null
