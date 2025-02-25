package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Tower: ImageVector
    get() {
        if (_Tower != null) {
            return _Tower!!
        }
        _Tower = ImageVector.Builder(
            name = "Tower",
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
                moveTo(3f, 10f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(3f)
                moveTo(14f, 10f)
                verticalLineTo(3f)
                moveTo(10f, 3f)
                verticalLineTo(10f)
                moveTo(3f, 6f)
                horizontalLineTo(10f)
                moveTo(14f, 6f)
                horizontalLineTo(21f)
                moveTo(6.5f, 6f)
                verticalLineTo(3f)
                moveTo(17.5f, 6f)
                verticalLineTo(3f)
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Tower!!
    }

@Suppress("ObjectPropertyName")
private var _Tower: ImageVector? = null
