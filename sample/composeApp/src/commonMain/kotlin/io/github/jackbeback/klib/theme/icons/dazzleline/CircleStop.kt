package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleStop: ImageVector
    get() {
        if (_CircleStop != null) {
            return _CircleStop!!
        }
        _CircleStop = ImageVector.Builder(
            name = "CircleStop",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10.6f)
                curveTo(9f, 10.04f, 9f, 9.76f, 9.109f, 9.546f)
                curveTo(9.205f, 9.358f, 9.358f, 9.205f, 9.546f, 9.109f)
                curveTo(9.76f, 9f, 10.04f, 9f, 10.6f, 9f)
                horizontalLineTo(13.4f)
                curveTo(13.96f, 9f, 14.24f, 9f, 14.454f, 9.109f)
                curveTo(14.642f, 9.205f, 14.795f, 9.358f, 14.891f, 9.546f)
                curveTo(15f, 9.76f, 15f, 10.04f, 15f, 10.6f)
                verticalLineTo(13.4f)
                curveTo(15f, 13.96f, 15f, 14.24f, 14.891f, 14.454f)
                curveTo(14.795f, 14.642f, 14.642f, 14.795f, 14.454f, 14.891f)
                curveTo(14.24f, 15f, 13.96f, 15f, 13.4f, 15f)
                horizontalLineTo(10.6f)
                curveTo(10.04f, 15f, 9.76f, 15f, 9.546f, 14.891f)
                curveTo(9.358f, 14.795f, 9.205f, 14.642f, 9.109f, 14.454f)
                curveTo(9f, 14.24f, 9f, 13.96f, 9f, 13.4f)
                verticalLineTo(10.6f)
                close()
            }
        }.build()

        return _CircleStop!!
    }

@Suppress("ObjectPropertyName")
private var _CircleStop: ImageVector? = null
