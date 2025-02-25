package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.File: ImageVector
    get() {
        if (_File != null) {
            return _File!!
        }
        _File = ImageVector.Builder(
            name = "File",
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
                verticalLineTo(17.8f)
                curveTo(19f, 18.92f, 19f, 19.48f, 18.782f, 19.908f)
                curveTo(18.59f, 20.284f, 18.284f, 20.59f, 17.908f, 20.782f)
                curveTo(17.48f, 21f, 16.92f, 21f, 15.8f, 21f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 21f, 6.52f, 21f, 6.092f, 20.782f)
                curveTo(5.716f, 20.59f, 5.41f, 20.284f, 5.218f, 19.908f)
                curveTo(5f, 19.48f, 5f, 18.92f, 5f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(5f, 5.08f, 5f, 4.52f, 5.218f, 4.092f)
                curveTo(5.41f, 3.716f, 5.716f, 3.41f, 6.092f, 3.218f)
                curveTo(6.52f, 3f, 7.08f, 3f, 8.2f, 3f)
                horizontalLineTo(13f)
                moveTo(19f, 9f)
                lineTo(13f, 3f)
                moveTo(19f, 9f)
                horizontalLineTo(14f)
                curveTo(13.448f, 9f, 13f, 8.552f, 13f, 8f)
                verticalLineTo(3f)
            }
        }.build()

        return _File!!
    }

@Suppress("ObjectPropertyName")
private var _File: ImageVector? = null
