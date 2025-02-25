package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartSimple: ImageVector
    get() {
        if (_ChartSimple != null) {
            return _ChartSimple!!
        }
        _ChartSimple = ImageVector.Builder(
            name = "ChartSimple",
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
                moveTo(3f, 14.6f)
                curveTo(3f, 14.04f, 3f, 13.76f, 3.109f, 13.546f)
                curveTo(3.205f, 13.358f, 3.358f, 13.205f, 3.546f, 13.109f)
                curveTo(3.76f, 13f, 4.04f, 13f, 4.6f, 13f)
                horizontalLineTo(5.4f)
                curveTo(5.96f, 13f, 6.24f, 13f, 6.454f, 13.109f)
                curveTo(6.642f, 13.205f, 6.795f, 13.358f, 6.891f, 13.546f)
                curveTo(7f, 13.76f, 7f, 14.04f, 7f, 14.6f)
                verticalLineTo(19.4f)
                curveTo(7f, 19.96f, 7f, 20.24f, 6.891f, 20.454f)
                curveTo(6.795f, 20.642f, 6.642f, 20.795f, 6.454f, 20.891f)
                curveTo(6.24f, 21f, 5.96f, 21f, 5.4f, 21f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 21f, 3.76f, 21f, 3.546f, 20.891f)
                curveTo(3.358f, 20.795f, 3.205f, 20.642f, 3.109f, 20.454f)
                curveTo(3f, 20.24f, 3f, 19.96f, 3f, 19.4f)
                verticalLineTo(14.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4.6f)
                curveTo(10f, 4.04f, 10f, 3.76f, 10.109f, 3.546f)
                curveTo(10.205f, 3.358f, 10.358f, 3.205f, 10.546f, 3.109f)
                curveTo(10.76f, 3f, 11.04f, 3f, 11.6f, 3f)
                horizontalLineTo(12.4f)
                curveTo(12.96f, 3f, 13.24f, 3f, 13.454f, 3.109f)
                curveTo(13.642f, 3.205f, 13.795f, 3.358f, 13.891f, 3.546f)
                curveTo(14f, 3.76f, 14f, 4.04f, 14f, 4.6f)
                verticalLineTo(19.4f)
                curveTo(14f, 19.96f, 14f, 20.24f, 13.891f, 20.454f)
                curveTo(13.795f, 20.642f, 13.642f, 20.795f, 13.454f, 20.891f)
                curveTo(13.24f, 21f, 12.96f, 21f, 12.4f, 21f)
                horizontalLineTo(11.6f)
                curveTo(11.04f, 21f, 10.76f, 21f, 10.546f, 20.891f)
                curveTo(10.358f, 20.795f, 10.205f, 20.642f, 10.109f, 20.454f)
                curveTo(10f, 20.24f, 10f, 19.96f, 10f, 19.4f)
                verticalLineTo(4.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 10.6f)
                curveTo(17f, 10.04f, 17f, 9.76f, 17.109f, 9.546f)
                curveTo(17.205f, 9.358f, 17.358f, 9.205f, 17.546f, 9.109f)
                curveTo(17.76f, 9f, 18.04f, 9f, 18.6f, 9f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 9f, 20.24f, 9f, 20.454f, 9.109f)
                curveTo(20.642f, 9.205f, 20.795f, 9.358f, 20.891f, 9.546f)
                curveTo(21f, 9.76f, 21f, 10.04f, 21f, 10.6f)
                verticalLineTo(19.4f)
                curveTo(21f, 19.96f, 21f, 20.24f, 20.891f, 20.454f)
                curveTo(20.795f, 20.642f, 20.642f, 20.795f, 20.454f, 20.891f)
                curveTo(20.24f, 21f, 19.96f, 21f, 19.4f, 21f)
                horizontalLineTo(18.6f)
                curveTo(18.04f, 21f, 17.76f, 21f, 17.546f, 20.891f)
                curveTo(17.358f, 20.795f, 17.205f, 20.642f, 17.109f, 20.454f)
                curveTo(17f, 20.24f, 17f, 19.96f, 17f, 19.4f)
                verticalLineTo(10.6f)
                close()
            }
        }.build()

        return _ChartSimple!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSimple: ImageVector? = null
