package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Bus",
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
                moveTo(5f, 6f)
                verticalLineTo(15.8f)
                curveTo(5f, 16.92f, 5f, 17.48f, 5.218f, 17.908f)
                curveTo(5.41f, 18.284f, 5.716f, 18.59f, 6.092f, 18.782f)
                curveTo(6.52f, 19f, 7.08f, 19f, 8.2f, 19f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 19f, 17.48f, 19f, 17.908f, 18.782f)
                curveTo(18.284f, 18.59f, 18.59f, 18.284f, 18.782f, 17.908f)
                curveTo(19f, 17.48f, 19f, 16.92f, 19f, 15.8f)
                verticalLineTo(6f)
                moveTo(5f, 6f)
                curveTo(5f, 6f, 5f, 3f, 12f, 3f)
                curveTo(19f, 3f, 19f, 6f, 19f, 6f)
                moveTo(5f, 6f)
                horizontalLineTo(19f)
                moveTo(5f, 13f)
                horizontalLineTo(19f)
                moveTo(17f, 21f)
                verticalLineTo(19f)
                moveTo(7f, 21f)
                verticalLineTo(19f)
                moveTo(8f, 16f)
                horizontalLineTo(8.01f)
                moveTo(16f, 16f)
                horizontalLineTo(16.01f)
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null
