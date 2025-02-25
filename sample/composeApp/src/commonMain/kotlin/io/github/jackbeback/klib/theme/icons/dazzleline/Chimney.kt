package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Chimney: ImageVector
    get() {
        if (_Chimney != null) {
            return _Chimney!!
        }
        _Chimney = ImageVector.Builder(
            name = "Chimney",
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
                moveTo(19f, 9f)
                verticalLineTo(16f)
                moveTo(19f, 16f)
                verticalLineTo(21f)
                moveTo(19f, 16f)
                horizontalLineTo(14f)
                moveTo(10f, 9f)
                verticalLineTo(16f)
                moveTo(10f, 16f)
                horizontalLineTo(5f)
                moveTo(10f, 16f)
                horizontalLineTo(14f)
                moveTo(5f, 16f)
                verticalLineTo(9f)
                moveTo(5f, 16f)
                verticalLineTo(21f)
                moveTo(14f, 16f)
                verticalLineTo(21f)
                moveTo(4.6f, 9f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 9f, 20.24f, 9f, 20.454f, 8.891f)
                curveTo(20.642f, 8.795f, 20.795f, 8.642f, 20.891f, 8.454f)
                curveTo(21f, 8.24f, 21f, 7.96f, 21f, 7.4f)
                verticalLineTo(4.6f)
                curveTo(21f, 4.04f, 21f, 3.76f, 20.891f, 3.546f)
                curveTo(20.795f, 3.358f, 20.642f, 3.205f, 20.454f, 3.109f)
                curveTo(20.24f, 3f, 19.96f, 3f, 19.4f, 3f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 3f, 3.76f, 3f, 3.546f, 3.109f)
                curveTo(3.358f, 3.205f, 3.205f, 3.358f, 3.109f, 3.546f)
                curveTo(3f, 3.76f, 3f, 4.04f, 3f, 4.6f)
                verticalLineTo(7.4f)
                curveTo(3f, 7.96f, 3f, 8.24f, 3.109f, 8.454f)
                curveTo(3.205f, 8.642f, 3.358f, 8.795f, 3.546f, 8.891f)
                curveTo(3.76f, 9f, 4.04f, 9f, 4.6f, 9f)
                close()
            }
        }.build()

        return _Chimney!!
    }

@Suppress("ObjectPropertyName")
private var _Chimney: ImageVector? = null
