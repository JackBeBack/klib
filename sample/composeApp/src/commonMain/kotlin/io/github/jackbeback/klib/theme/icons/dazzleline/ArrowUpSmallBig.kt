package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowUpSmallBig: ImageVector
    get() {
        if (_ArrowUpSmallBig != null) {
            return _ArrowUpSmallBig!!
        }
        _ArrowUpSmallBig = ImageVector.Builder(
            name = "ArrowUpSmallBig",
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
                moveTo(7f, 4f)
                verticalLineTo(20f)
                moveTo(7f, 4f)
                lineTo(11f, 8f)
                moveTo(7f, 4f)
                lineTo(3f, 8f)
                moveTo(15.6f, 20f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 20f, 20.24f, 20f, 20.454f, 19.891f)
                curveTo(20.642f, 19.795f, 20.795f, 19.642f, 20.891f, 19.454f)
                curveTo(21f, 19.24f, 21f, 18.96f, 21f, 18.4f)
                verticalLineTo(14.6f)
                curveTo(21f, 14.04f, 21f, 13.76f, 20.891f, 13.546f)
                curveTo(20.795f, 13.358f, 20.642f, 13.205f, 20.454f, 13.109f)
                curveTo(20.24f, 13f, 19.96f, 13f, 19.4f, 13f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 13f, 14.76f, 13f, 14.546f, 13.109f)
                curveTo(14.358f, 13.205f, 14.205f, 13.358f, 14.109f, 13.546f)
                curveTo(14f, 13.76f, 14f, 14.04f, 14f, 14.6f)
                verticalLineTo(18.4f)
                curveTo(14f, 18.96f, 14f, 19.24f, 14.109f, 19.454f)
                curveTo(14.205f, 19.642f, 14.358f, 19.795f, 14.546f, 19.891f)
                curveTo(14.76f, 20f, 15.04f, 20f, 15.6f, 20f)
                close()
                moveTo(15.6f, 9f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 9f, 18.24f, 9f, 18.454f, 8.891f)
                curveTo(18.642f, 8.795f, 18.795f, 8.642f, 18.891f, 8.454f)
                curveTo(19f, 8.24f, 19f, 7.96f, 19f, 7.4f)
                verticalLineTo(5.6f)
                curveTo(19f, 5.04f, 19f, 4.76f, 18.891f, 4.546f)
                curveTo(18.795f, 4.358f, 18.642f, 4.205f, 18.454f, 4.109f)
                curveTo(18.24f, 4f, 17.96f, 4f, 17.4f, 4f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 4f, 14.76f, 4f, 14.546f, 4.109f)
                curveTo(14.358f, 4.205f, 14.205f, 4.358f, 14.109f, 4.546f)
                curveTo(14f, 4.76f, 14f, 5.04f, 14f, 5.6f)
                verticalLineTo(7.4f)
                curveTo(14f, 7.96f, 14f, 8.24f, 14.109f, 8.454f)
                curveTo(14.205f, 8.642f, 14.358f, 8.795f, 14.546f, 8.891f)
                curveTo(14.76f, 9f, 15.04f, 9f, 15.6f, 9f)
                close()
            }
        }.build()

        return _ArrowUpSmallBig!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpSmallBig: ImageVector? = null
