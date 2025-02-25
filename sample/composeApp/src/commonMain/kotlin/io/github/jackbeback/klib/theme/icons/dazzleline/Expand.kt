package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Expand: ImageVector
    get() {
        if (_Expand != null) {
            return _Expand!!
        }
        _Expand = ImageVector.Builder(
            name = "Expand",
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
                moveTo(4f, 9f)
                verticalLineTo(5.6f)
                curveTo(4f, 5.04f, 4f, 4.76f, 4.109f, 4.546f)
                curveTo(4.205f, 4.358f, 4.358f, 4.205f, 4.546f, 4.109f)
                curveTo(4.76f, 4f, 5.04f, 4f, 5.6f, 4f)
                lineTo(9f, 4f)
                moveTo(4f, 15f)
                verticalLineTo(18.4f)
                curveTo(4f, 18.96f, 4f, 19.24f, 4.109f, 19.454f)
                curveTo(4.205f, 19.642f, 4.358f, 19.795f, 4.546f, 19.891f)
                curveTo(4.76f, 20f, 5.04f, 20f, 5.6f, 20f)
                lineTo(9f, 20f)
                moveTo(15f, 4f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 4f, 19.24f, 4f, 19.454f, 4.109f)
                curveTo(19.642f, 4.205f, 19.795f, 4.358f, 19.891f, 4.546f)
                curveTo(20f, 4.76f, 20f, 5.04f, 20f, 5.6f)
                verticalLineTo(9f)
                moveTo(20f, 15f)
                verticalLineTo(18.4f)
                curveTo(20f, 18.96f, 20f, 19.24f, 19.891f, 19.454f)
                curveTo(19.795f, 19.642f, 19.642f, 19.795f, 19.454f, 19.891f)
                curveTo(19.24f, 20f, 18.96f, 20f, 18.4f, 20f)
                horizontalLineTo(15f)
            }
        }.build()

        return _Expand!!
    }

@Suppress("ObjectPropertyName")
private var _Expand: ImageVector? = null
