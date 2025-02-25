package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartSimpleHorizontal: ImageVector
    get() {
        if (_ChartSimpleHorizontal != null) {
            return _ChartSimpleHorizontal!!
        }
        _ChartSimpleHorizontal = ImageVector.Builder(
            name = "ChartSimpleHorizontal",
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
                moveTo(3f, 4.6f)
                curveTo(3f, 4.04f, 3f, 3.76f, 3.109f, 3.546f)
                curveTo(3.205f, 3.358f, 3.358f, 3.205f, 3.546f, 3.109f)
                curveTo(3.76f, 3f, 4.04f, 3f, 4.6f, 3f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 3f, 14.24f, 3f, 14.454f, 3.109f)
                curveTo(14.642f, 3.205f, 14.795f, 3.358f, 14.891f, 3.546f)
                curveTo(15f, 3.76f, 15f, 4.04f, 15f, 4.6f)
                verticalLineTo(5.4f)
                curveTo(15f, 5.96f, 15f, 6.24f, 14.891f, 6.454f)
                curveTo(14.795f, 6.642f, 14.642f, 6.795f, 14.454f, 6.891f)
                curveTo(14.24f, 7f, 13.96f, 7f, 13.4f, 7f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 7f, 3.76f, 7f, 3.546f, 6.891f)
                curveTo(3.358f, 6.795f, 3.205f, 6.642f, 3.109f, 6.454f)
                curveTo(3f, 6.24f, 3f, 5.96f, 3f, 5.4f)
                verticalLineTo(4.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 11.6f)
                curveTo(3f, 11.04f, 3f, 10.76f, 3.109f, 10.546f)
                curveTo(3.205f, 10.358f, 3.358f, 10.205f, 3.546f, 10.109f)
                curveTo(3.76f, 10f, 4.04f, 10f, 4.6f, 10f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 10f, 20.24f, 10f, 20.454f, 10.109f)
                curveTo(20.642f, 10.205f, 20.795f, 10.358f, 20.891f, 10.546f)
                curveTo(21f, 10.76f, 21f, 11.04f, 21f, 11.6f)
                verticalLineTo(12.4f)
                curveTo(21f, 12.96f, 21f, 13.24f, 20.891f, 13.454f)
                curveTo(20.795f, 13.642f, 20.642f, 13.795f, 20.454f, 13.891f)
                curveTo(20.24f, 14f, 19.96f, 14f, 19.4f, 14f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 14f, 3.76f, 14f, 3.546f, 13.891f)
                curveTo(3.358f, 13.795f, 3.205f, 13.642f, 3.109f, 13.454f)
                curveTo(3f, 13.24f, 3f, 12.96f, 3f, 12.4f)
                verticalLineTo(11.6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 18.6f)
                curveTo(3f, 18.04f, 3f, 17.76f, 3.109f, 17.546f)
                curveTo(3.205f, 17.358f, 3.358f, 17.205f, 3.546f, 17.109f)
                curveTo(3.76f, 17f, 4.04f, 17f, 4.6f, 17f)
                horizontalLineTo(9.4f)
                curveTo(9.96f, 17f, 10.24f, 17f, 10.454f, 17.109f)
                curveTo(10.642f, 17.205f, 10.795f, 17.358f, 10.891f, 17.546f)
                curveTo(11f, 17.76f, 11f, 18.04f, 11f, 18.6f)
                verticalLineTo(19.4f)
                curveTo(11f, 19.96f, 11f, 20.24f, 10.891f, 20.454f)
                curveTo(10.795f, 20.642f, 10.642f, 20.795f, 10.454f, 20.891f)
                curveTo(10.24f, 21f, 9.96f, 21f, 9.4f, 21f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 21f, 3.76f, 21f, 3.546f, 20.891f)
                curveTo(3.358f, 20.795f, 3.205f, 20.642f, 3.109f, 20.454f)
                curveTo(3f, 20.24f, 3f, 19.96f, 3f, 19.4f)
                verticalLineTo(18.6f)
                close()
            }
        }.build()

        return _ChartSimpleHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSimpleHorizontal: ImageVector? = null
