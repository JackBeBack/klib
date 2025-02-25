package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HurricaneAlt1: ImageVector
    get() {
        if (_HurricaneAlt1 != null) {
            return _HurricaneAlt1!!
        }
        _HurricaneAlt1 = ImageVector.Builder(
            name = "HurricaneAlt1",
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
                moveTo(11.95f, 11.95f)
                horizontalLineTo(11.959f)
                moveTo(11f, 17f)
                curveTo(7.134f, 17f, 4f, 13.866f, 4f, 10f)
                curveTo(4f, 6.134f, 7.134f, 3f, 11f, 3f)
                moveTo(12f, 21f)
                curveTo(15.866f, 21f, 19f, 17.866f, 19f, 14f)
                curveTo(19f, 10.134f, 15.866f, 7f, 12f, 7f)
                moveTo(12.4f, 11.95f)
                curveTo(12.4f, 12.198f, 12.198f, 12.4f, 11.95f, 12.4f)
                curveTo(11.701f, 12.4f, 11.5f, 12.198f, 11.5f, 11.95f)
                curveTo(11.5f, 11.701f, 11.701f, 11.5f, 11.95f, 11.5f)
                curveTo(12.198f, 11.5f, 12.4f, 11.701f, 12.4f, 11.95f)
                close()
            }
        }.build()

        return _HurricaneAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _HurricaneAlt1: ImageVector? = null
