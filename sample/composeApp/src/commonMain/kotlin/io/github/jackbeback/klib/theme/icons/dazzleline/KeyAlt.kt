package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.KeyAlt: ImageVector
    get() {
        if (_KeyAlt != null) {
            return _KeyAlt!!
        }
        _KeyAlt = ImageVector.Builder(
            name = "KeyAlt",
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
                moveTo(15f, 9f)
                horizontalLineTo(15.01f)
                moveTo(15f, 15f)
                curveTo(18.314f, 15f, 21f, 12.314f, 21f, 9f)
                curveTo(21f, 5.686f, 18.314f, 3f, 15f, 3f)
                curveTo(11.686f, 3f, 9f, 5.686f, 9f, 9f)
                curveTo(9f, 9.274f, 9.018f, 9.543f, 9.054f, 9.807f)
                curveTo(9.112f, 10.241f, 9.141f, 10.458f, 9.122f, 10.596f)
                curveTo(9.101f, 10.739f, 9.075f, 10.816f, 9.005f, 10.942f)
                curveTo(8.937f, 11.063f, 8.818f, 11.182f, 8.579f, 11.421f)
                lineTo(3.469f, 16.531f)
                curveTo(3.296f, 16.704f, 3.209f, 16.791f, 3.147f, 16.892f)
                curveTo(3.093f, 16.981f, 3.052f, 17.079f, 3.028f, 17.181f)
                curveTo(3f, 17.296f, 3f, 17.418f, 3f, 17.663f)
                verticalLineTo(19.4f)
                curveTo(3f, 19.96f, 3f, 20.24f, 3.109f, 20.454f)
                curveTo(3.205f, 20.642f, 3.358f, 20.795f, 3.546f, 20.891f)
                curveTo(3.76f, 21f, 4.04f, 21f, 4.6f, 21f)
                horizontalLineTo(6.337f)
                curveTo(6.582f, 21f, 6.704f, 21f, 6.819f, 20.972f)
                curveTo(6.921f, 20.948f, 7.019f, 20.907f, 7.108f, 20.853f)
                curveTo(7.209f, 20.791f, 7.296f, 20.704f, 7.469f, 20.531f)
                lineTo(12.579f, 15.421f)
                curveTo(12.818f, 15.182f, 12.937f, 15.063f, 13.058f, 14.995f)
                curveTo(13.184f, 14.925f, 13.261f, 14.899f, 13.404f, 14.878f)
                curveTo(13.542f, 14.859f, 13.759f, 14.888f, 14.193f, 14.946f)
                curveTo(14.457f, 14.982f, 14.726f, 15f, 15f, 15f)
                close()
            }
        }.build()

        return _KeyAlt!!
    }

@Suppress("ObjectPropertyName")
private var _KeyAlt: ImageVector? = null
