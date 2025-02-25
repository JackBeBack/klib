package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LocationArrow: ImageVector
    get() {
        if (_LocationArrow != null) {
            return _LocationArrow!!
        }
        _LocationArrow = ImageVector.Builder(
            name = "LocationArrow",
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
                moveTo(5.363f, 12.052f)
                curveTo(4.011f, 11.571f, 3.335f, 11.33f, 3.133f, 10.965f)
                curveTo(2.958f, 10.649f, 2.95f, 10.267f, 3.111f, 9.944f)
                curveTo(3.297f, 9.571f, 3.962f, 9.301f, 5.293f, 8.763f)
                lineTo(17.836f, 3.686f)
                curveTo(19.146f, 3.155f, 19.801f, 2.89f, 20.215f, 3.026f)
                curveTo(20.575f, 3.144f, 20.857f, 3.426f, 20.975f, 3.785f)
                curveTo(21.111f, 4.199f, 20.845f, 4.855f, 20.315f, 6.165f)
                lineTo(15.238f, 18.708f)
                curveTo(14.7f, 20.038f, 14.43f, 20.704f, 14.057f, 20.89f)
                curveTo(13.733f, 21.051f, 13.352f, 21.042f, 13.035f, 20.868f)
                curveTo(12.67f, 20.666f, 12.43f, 19.99f, 11.948f, 18.638f)
                lineTo(10.475f, 14.497f)
                curveTo(10.382f, 14.234f, 10.335f, 14.102f, 10.258f, 13.992f)
                curveTo(10.191f, 13.895f, 10.106f, 13.81f, 10.009f, 13.743f)
                curveTo(9.899f, 13.666f, 9.767f, 13.619f, 9.504f, 13.526f)
                lineTo(5.363f, 12.052f)
                close()
            }
        }.build()

        return _LocationArrow!!
    }

@Suppress("ObjectPropertyName")
private var _LocationArrow: ImageVector? = null
