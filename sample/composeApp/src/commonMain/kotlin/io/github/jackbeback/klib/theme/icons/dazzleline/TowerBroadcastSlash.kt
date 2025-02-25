package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TowerBroadcastSlash: ImageVector
    get() {
        if (_TowerBroadcastSlash != null) {
            return _TowerBroadcastSlash!!
        }
        _TowerBroadcastSlash = ImageVector.Builder(
            name = "TowerBroadcastSlash",
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
                moveTo(10f, 10.001f)
                curveTo(10f, 11.105f, 10.896f, 12.001f, 12f, 12.001f)
                verticalLineTo(21.001f)
                moveTo(16.243f, 5.758f)
                curveTo(17.942f, 7.457f, 18.409f, 9.922f, 17.644f, 12.041f)
                moveTo(19.072f, 2.93f)
                curveTo(22.355f, 6.213f, 22.878f, 11.211f, 20.64f, 15.041f)
                moveTo(7.758f, 14.243f)
                curveTo(5.76f, 12.246f, 5.465f, 9.19f, 6.874f, 6.881f)
                moveTo(4.929f, 17.072f)
                curveTo(1.363f, 13.506f, 1.053f, 7.917f, 3.999f, 4f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
            }
        }.build()

        return _TowerBroadcastSlash!!
    }

@Suppress("ObjectPropertyName")
private var _TowerBroadcastSlash: ImageVector? = null
