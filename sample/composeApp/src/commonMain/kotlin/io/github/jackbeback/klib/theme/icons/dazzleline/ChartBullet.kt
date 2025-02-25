package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartBullet: ImageVector
    get() {
        if (_ChartBullet != null) {
            return _ChartBullet!!
        }
        _ChartBullet = ImageVector.Builder(
            name = "ChartBullet",
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
                moveTo(13f, 4f)
                verticalLineTo(11f)
                moveTo(8f, 5f)
                verticalLineTo(10f)
                moveTo(11f, 14f)
                verticalLineTo(19f)
                moveTo(16f, 13f)
                verticalLineTo(20f)
                moveTo(4.6f, 10f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 10f, 20.24f, 10f, 20.454f, 9.891f)
                curveTo(20.642f, 9.795f, 20.795f, 9.642f, 20.891f, 9.454f)
                curveTo(21f, 9.24f, 21f, 8.96f, 21f, 8.4f)
                verticalLineTo(6.6f)
                curveTo(21f, 6.04f, 21f, 5.76f, 20.891f, 5.546f)
                curveTo(20.795f, 5.358f, 20.642f, 5.205f, 20.454f, 5.109f)
                curveTo(20.24f, 5f, 19.96f, 5f, 19.4f, 5f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 5f, 3.76f, 5f, 3.546f, 5.109f)
                curveTo(3.358f, 5.205f, 3.205f, 5.358f, 3.109f, 5.546f)
                curveTo(3f, 5.76f, 3f, 6.04f, 3f, 6.6f)
                verticalLineTo(8.4f)
                curveTo(3f, 8.96f, 3f, 9.24f, 3.109f, 9.454f)
                curveTo(3.205f, 9.642f, 3.358f, 9.795f, 3.546f, 9.891f)
                curveTo(3.76f, 10f, 4.04f, 10f, 4.6f, 10f)
                close()
                moveTo(4.6f, 19f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 19f, 20.24f, 19f, 20.454f, 18.891f)
                curveTo(20.642f, 18.795f, 20.795f, 18.642f, 20.891f, 18.454f)
                curveTo(21f, 18.24f, 21f, 17.96f, 21f, 17.4f)
                verticalLineTo(15.6f)
                curveTo(21f, 15.04f, 21f, 14.76f, 20.891f, 14.546f)
                curveTo(20.795f, 14.358f, 20.642f, 14.205f, 20.454f, 14.109f)
                curveTo(20.24f, 14f, 19.96f, 14f, 19.4f, 14f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 14f, 3.76f, 14f, 3.546f, 14.109f)
                curveTo(3.358f, 14.205f, 3.205f, 14.358f, 3.109f, 14.546f)
                curveTo(3f, 14.76f, 3f, 15.04f, 3f, 15.6f)
                verticalLineTo(17.4f)
                curveTo(3f, 17.96f, 3f, 18.24f, 3.109f, 18.454f)
                curveTo(3.205f, 18.642f, 3.358f, 18.795f, 3.546f, 18.891f)
                curveTo(3.76f, 19f, 4.04f, 19f, 4.6f, 19f)
                close()
            }
        }.build()

        return _ChartBullet!!
    }

@Suppress("ObjectPropertyName")
private var _ChartBullet: ImageVector? = null
