package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Phone: ImageVector
    get() {
        if (_Phone != null) {
            return _Phone!!
        }
        _Phone = ImageVector.Builder(
            name = "Phone",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
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
                    moveTo(2.014f, 6.871f)
                    curveTo(1.347f, 10.062f, 3.86f, 13.86f, 7.015f, 17.015f)
                    curveTo(10.17f, 20.17f, 13.968f, 22.682f, 17.158f, 22.015f)
                    curveTo(19.782f, 21.467f, 21.122f, 20.07f, 21.875f, 18.879f)
                    curveTo(22.135f, 18.468f, 22.004f, 17.934f, 21.614f, 17.644f)
                    lineTo(17.922f, 14.89f)
                    curveTo(17.524f, 14.593f, 16.969f, 14.633f, 16.617f, 14.984f)
                    lineTo(14.658f, 16.944f)
                    curveTo(14.658f, 16.944f, 12.753f, 16.325f, 10.229f, 13.801f)
                    curveTo(7.705f, 11.277f, 7.086f, 9.372f, 7.086f, 9.372f)
                    lineTo(9.045f, 7.412f)
                    curveTo(9.396f, 7.061f, 9.437f, 6.505f, 9.14f, 6.107f)
                    lineTo(6.386f, 2.415f)
                    curveTo(6.095f, 2.025f, 5.562f, 1.894f, 5.151f, 2.154f)
                    curveTo(3.96f, 2.908f, 2.562f, 4.247f, 2.014f, 6.871f)
                    close()
                }
            }
        }.build()

        return _Phone!!
    }

@Suppress("ObjectPropertyName")
private var _Phone: ImageVector? = null
