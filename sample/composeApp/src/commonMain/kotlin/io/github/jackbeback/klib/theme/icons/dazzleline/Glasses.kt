package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Glasses: ImageVector
    get() {
        if (_Glasses != null) {
            return _Glasses!!
        }
        _Glasses = ImageVector.Builder(
            name = "Glasses",
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
                moveTo(6f, 5f)
                curveTo(5.733f, 5f, 5.599f, 5f, 5.483f, 5.009f)
                curveTo(4.121f, 5.114f, 3.002f, 6.127f, 2.762f, 7.472f)
                curveTo(2.741f, 7.586f, 2.728f, 7.719f, 2.701f, 7.985f)
                lineTo(2.021f, 14.59f)
                moveTo(10f, 15f)
                horizontalLineTo(14f)
                moveTo(10f, 15f)
                curveTo(10f, 17.209f, 8.209f, 19f, 6f, 19f)
                curveTo(3.791f, 19f, 2f, 17.209f, 2f, 15f)
                curveTo(2f, 12.791f, 3.791f, 11f, 6f, 11f)
                curveTo(8.209f, 11f, 10f, 12.791f, 10f, 15f)
                close()
                moveTo(14f, 15f)
                curveTo(14f, 17.209f, 15.791f, 19f, 18f, 19f)
                curveTo(20.209f, 19f, 22f, 17.209f, 22f, 15f)
                curveTo(22f, 12.791f, 20.209f, 11f, 18f, 11f)
                curveTo(15.791f, 11f, 14f, 12.791f, 14f, 15f)
                close()
                moveTo(18.015f, 5f)
                curveTo(18.282f, 5f, 18.416f, 5f, 18.531f, 5.009f)
                curveTo(19.894f, 5.114f, 21.013f, 6.127f, 21.253f, 7.472f)
                curveTo(21.274f, 7.586f, 21.287f, 7.719f, 21.313f, 7.985f)
                lineTo(21.98f, 14.602f)
            }
        }.build()

        return _Glasses!!
    }

@Suppress("ObjectPropertyName")
private var _Glasses: ImageVector? = null
