package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ArrowDownBigSmall: ImageVector
    get() {
        if (_ArrowDownBigSmall != null) {
            return _ArrowDownBigSmall!!
        }
        _ArrowDownBigSmall = ImageVector.Builder(
            name = "ArrowDownBigSmall",
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
                moveTo(7f, 20f)
                lineTo(3f, 16f)
                moveTo(7f, 20f)
                lineTo(11f, 16f)
                moveTo(15.6f, 11f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 11f, 20.24f, 11f, 20.454f, 10.891f)
                curveTo(20.642f, 10.795f, 20.795f, 10.642f, 20.891f, 10.454f)
                curveTo(21f, 10.24f, 21f, 9.96f, 21f, 9.4f)
                verticalLineTo(5.6f)
                curveTo(21f, 5.04f, 21f, 4.76f, 20.891f, 4.546f)
                curveTo(20.795f, 4.358f, 20.642f, 4.205f, 20.454f, 4.109f)
                curveTo(20.24f, 4f, 19.96f, 4f, 19.4f, 4f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 4f, 14.76f, 4f, 14.546f, 4.109f)
                curveTo(14.358f, 4.205f, 14.205f, 4.358f, 14.109f, 4.546f)
                curveTo(14f, 4.76f, 14f, 5.04f, 14f, 5.6f)
                verticalLineTo(9.4f)
                curveTo(14f, 9.96f, 14f, 10.24f, 14.109f, 10.454f)
                curveTo(14.205f, 10.642f, 14.358f, 10.795f, 14.546f, 10.891f)
                curveTo(14.76f, 11f, 15.04f, 11f, 15.6f, 11f)
                close()
                moveTo(15.6f, 20f)
                horizontalLineTo(17.4f)
                curveTo(17.96f, 20f, 18.24f, 20f, 18.454f, 19.891f)
                curveTo(18.642f, 19.795f, 18.795f, 19.642f, 18.891f, 19.454f)
                curveTo(19f, 19.24f, 19f, 18.96f, 19f, 18.4f)
                verticalLineTo(16.6f)
                curveTo(19f, 16.04f, 19f, 15.76f, 18.891f, 15.546f)
                curveTo(18.795f, 15.358f, 18.642f, 15.205f, 18.454f, 15.109f)
                curveTo(18.24f, 15f, 17.96f, 15f, 17.4f, 15f)
                horizontalLineTo(15.6f)
                curveTo(15.04f, 15f, 14.76f, 15f, 14.546f, 15.109f)
                curveTo(14.358f, 15.205f, 14.205f, 15.358f, 14.109f, 15.546f)
                curveTo(14f, 15.76f, 14f, 16.04f, 14f, 16.6f)
                verticalLineTo(18.4f)
                curveTo(14f, 18.96f, 14f, 19.24f, 14.109f, 19.454f)
                curveTo(14.205f, 19.642f, 14.358f, 19.795f, 14.546f, 19.891f)
                curveTo(14.76f, 20f, 15.04f, 20f, 15.6f, 20f)
                close()
            }
        }.build()

        return _ArrowDownBigSmall!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownBigSmall: ImageVector? = null
