package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CirclePlay: ImageVector
    get() {
        if (_CirclePlay != null) {
            return _CirclePlay!!
        }
        _CirclePlay = ImageVector.Builder(
            name = "CirclePlay",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.002f, 11.334f)
                curveTo(15.335f, 11.557f, 15.502f, 11.668f, 15.561f, 11.809f)
                curveTo(15.611f, 11.931f, 15.611f, 12.069f, 15.561f, 12.191f)
                curveTo(15.502f, 12.332f, 15.335f, 12.443f, 15.002f, 12.666f)
                lineTo(11.244f, 15.171f)
                curveTo(10.84f, 15.44f, 10.638f, 15.575f, 10.47f, 15.565f)
                curveTo(10.324f, 15.556f, 10.189f, 15.484f, 10.101f, 15.367f)
                curveTo(10f, 15.234f, 10f, 14.991f, 10f, 14.505f)
                verticalLineTo(9.495f)
                curveTo(10f, 9.009f, 10f, 8.766f, 10.101f, 8.633f)
                curveTo(10.189f, 8.516f, 10.324f, 8.444f, 10.47f, 8.435f)
                curveTo(10.638f, 8.425f, 10.84f, 8.56f, 11.244f, 8.829f)
                lineTo(15.002f, 11.334f)
                close()
            }
        }.build()

        return _CirclePlay!!
    }

@Suppress("ObjectPropertyName")
private var _CirclePlay: ImageVector? = null
