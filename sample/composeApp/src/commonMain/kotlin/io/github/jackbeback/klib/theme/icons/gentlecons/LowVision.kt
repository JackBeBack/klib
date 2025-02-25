package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.LowVision: ImageVector
    get() {
        if (_LowVision != null) {
            return _LowVision!!
        }
        _LowVision = ImageVector.Builder(
            name = "LowVision",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.515f, 1.135f)
                curveTo(5.041f, 1.412f, 4.879f, 2.025f, 5.152f, 2.504f)
                lineTo(6.681f, 5.183f)
                curveTo(4.164f, 6.442f, 2.469f, 8.414f, 1.575f, 9.9f)
                curveTo(0.808f, 11.176f, 0.808f, 12.754f, 1.575f, 14.03f)
                curveTo(2.996f, 16.394f, 6.446f, 19.985f, 12f, 19.985f)
                curveTo(13.049f, 19.985f, 14.023f, 19.857f, 14.923f, 19.633f)
                lineTo(16.558f, 22.499f)
                curveTo(16.831f, 22.978f, 17.437f, 23.143f, 17.911f, 22.866f)
                curveTo(18.384f, 22.589f, 18.547f, 21.976f, 18.273f, 21.496f)
                lineTo(16.835f, 18.975f)
                curveTo(19.619f, 17.737f, 21.475f, 15.61f, 22.425f, 14.03f)
                curveTo(23.192f, 12.754f, 23.192f, 11.176f, 22.425f, 9.9f)
                curveTo(21.004f, 7.536f, 17.554f, 3.945f, 12f, 3.945f)
                curveTo(10.741f, 3.945f, 9.589f, 4.13f, 8.545f, 4.443f)
                lineTo(6.868f, 1.502f)
                curveTo(6.594f, 1.022f, 5.989f, 0.858f, 5.515f, 1.135f)
                close()
                moveTo(7.671f, 6.919f)
                curveTo(7.367f, 7.065f, 7.076f, 7.224f, 6.798f, 7.393f)
                lineTo(12.818f, 17.948f)
                curveTo(13.184f, 17.92f, 13.539f, 17.873f, 13.883f, 17.809f)
                lineTo(7.671f, 6.919f)
                close()
                moveTo(15.839f, 17.23f)
                curveTo(18.163f, 16.267f, 19.802f, 14.536f, 20.733f, 12.988f)
                curveTo(21.115f, 12.352f, 21.115f, 11.578f, 20.733f, 10.942f)
                curveTo(19.352f, 8.646f, 16.416f, 5.95f, 12f, 5.95f)
                curveTo(11.133f, 5.95f, 10.322f, 6.054f, 9.57f, 6.239f)
                lineTo(10.679f, 8.183f)
                curveTo(11.092f, 8.035f, 11.537f, 7.955f, 12f, 7.955f)
                curveTo(14.188f, 7.955f, 15.962f, 9.75f, 15.962f, 11.965f)
                curveTo(15.962f, 13.185f, 15.424f, 14.277f, 14.575f, 15.013f)
                lineTo(15.839f, 17.23f)
                close()
                moveTo(13.555f, 13.225f)
                curveTo(13.828f, 12.88f, 13.992f, 12.442f, 13.992f, 11.965f)
                curveTo(13.992f, 10.851f, 13.1f, 9.949f, 12f, 9.949f)
                curveTo(11.898f, 9.949f, 11.797f, 9.957f, 11.699f, 9.972f)
                lineTo(13.555f, 13.225f)
                close()
                moveTo(10.487f, 17.871f)
                lineTo(5.197f, 8.597f)
                curveTo(4.937f, 8.834f, 4.694f, 9.079f, 4.47f, 9.328f)
                lineTo(9.181f, 17.588f)
                curveTo(9.598f, 17.708f, 10.033f, 17.804f, 10.487f, 17.871f)
                close()
                moveTo(5.977f, 15.98f)
                lineTo(3.187f, 11.089f)
                curveTo(2.888f, 11.694f, 2.914f, 12.401f, 3.267f, 12.988f)
                curveTo(3.873f, 13.995f, 4.778f, 15.08f, 5.977f, 15.98f)
                close()
            }
        }.build()

        return _LowVision!!
    }

@Suppress("ObjectPropertyName")
private var _LowVision: ImageVector? = null
