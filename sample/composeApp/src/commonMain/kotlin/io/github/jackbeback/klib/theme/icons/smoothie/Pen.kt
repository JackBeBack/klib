package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Pen: ImageVector
    get() {
        if (_Pen != null) {
            return _Pen!!
        }
        _Pen = ImageVector.Builder(
            name = "Pen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.629f, 5.121f)
                lineTo(4.315f, 16.435f)
                moveTo(15.629f, 5.121f)
                lineTo(19.164f, 8.657f)
                moveTo(15.629f, 5.121f)
                lineTo(17.043f, 3.707f)
                curveTo(17.433f, 3.317f, 18.067f, 3.317f, 18.457f, 3.707f)
                lineTo(20.578f, 5.828f)
                curveTo(20.969f, 6.219f, 20.969f, 6.852f, 20.578f, 7.243f)
                lineTo(19.164f, 8.657f)
                moveTo(7.851f, 19.971f)
                lineTo(4.315f, 16.435f)
                moveTo(7.851f, 19.971f)
                lineTo(19.164f, 8.657f)
                moveTo(7.851f, 19.971f)
                lineTo(3.254f, 21.031f)
                lineTo(4.315f, 16.435f)
            }
        }.build()

        return _Pen!!
    }

@Suppress("ObjectPropertyName")
private var _Pen: ImageVector? = null
