package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DocumentLayoutRight: ImageVector
    get() {
        if (_DocumentLayoutRight != null) {
            return _DocumentLayoutRight!!
        }
        _DocumentLayoutRight = ImageVector.Builder(
            name = "DocumentLayoutRight",
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
                moveTo(3f, 15f)
                horizontalLineTo(21f)
                moveTo(3f, 19f)
                horizontalLineTo(15f)
                moveTo(3f, 7f)
                horizontalLineTo(11f)
                moveTo(3f, 11f)
                horizontalLineTo(11f)
                moveTo(19.4f, 11f)
                horizontalLineTo(16.6f)
                curveTo(16.04f, 11f, 15.76f, 11f, 15.546f, 10.891f)
                curveTo(15.358f, 10.795f, 15.205f, 10.642f, 15.109f, 10.454f)
                curveTo(15f, 10.24f, 15f, 9.96f, 15f, 9.4f)
                verticalLineTo(6.6f)
                curveTo(15f, 6.04f, 15f, 5.76f, 15.109f, 5.546f)
                curveTo(15.205f, 5.358f, 15.358f, 5.205f, 15.546f, 5.109f)
                curveTo(15.76f, 5f, 16.04f, 5f, 16.6f, 5f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 5f, 20.24f, 5f, 20.454f, 5.109f)
                curveTo(20.642f, 5.205f, 20.795f, 5.358f, 20.891f, 5.546f)
                curveTo(21f, 5.76f, 21f, 6.04f, 21f, 6.6f)
                verticalLineTo(9.4f)
                curveTo(21f, 9.96f, 21f, 10.24f, 20.891f, 10.454f)
                curveTo(20.795f, 10.642f, 20.642f, 10.795f, 20.454f, 10.891f)
                curveTo(20.24f, 11f, 19.96f, 11f, 19.4f, 11f)
                close()
            }
        }.build()

        return _DocumentLayoutRight!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentLayoutRight: ImageVector? = null
