package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Webcam: ImageVector
    get() {
        if (_Webcam != null) {
            return _Webcam!!
        }
        _Webcam = ImageVector.Builder(
            name = "Webcam",
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
                moveTo(18f, 14f)
                lineTo(19.472f, 15.717f)
                curveTo(20.913f, 17.398f, 21.633f, 18.239f, 21.651f, 18.95f)
                curveTo(21.667f, 19.569f, 21.395f, 20.16f, 20.915f, 20.55f)
                curveTo(20.364f, 21f, 19.257f, 21f, 17.043f, 21f)
                horizontalLineTo(6.958f)
                curveTo(4.744f, 21f, 3.637f, 21f, 3.085f, 20.55f)
                curveTo(2.606f, 20.16f, 2.334f, 19.569f, 2.349f, 18.95f)
                curveTo(2.367f, 18.239f, 3.087f, 17.398f, 4.528f, 15.717f)
                lineTo(6f, 14f)
                moveTo(19f, 10f)
                curveTo(19f, 13.866f, 15.866f, 17f, 12f, 17f)
                curveTo(8.134f, 17f, 5f, 13.866f, 5f, 10f)
                curveTo(5f, 6.134f, 8.134f, 3f, 12f, 3f)
                curveTo(15.866f, 3f, 19f, 6.134f, 19f, 10f)
                close()
                moveTo(15f, 10f)
                curveTo(15f, 11.657f, 13.657f, 13f, 12f, 13f)
                curveTo(10.343f, 13f, 9f, 11.657f, 9f, 10f)
                curveTo(9f, 8.343f, 10.343f, 7f, 12f, 7f)
                curveTo(13.657f, 7f, 15f, 8.343f, 15f, 10f)
                close()
            }
        }.build()

        return _Webcam!!
    }

@Suppress("ObjectPropertyName")
private var _Webcam: ImageVector? = null
