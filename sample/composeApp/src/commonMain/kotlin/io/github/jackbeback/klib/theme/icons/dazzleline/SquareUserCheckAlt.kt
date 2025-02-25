package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareUserCheckAlt: ImageVector
    get() {
        if (_SquareUserCheckAlt != null) {
            return _SquareUserCheckAlt!!
        }
        _SquareUserCheckAlt = ImageVector.Builder(
            name = "SquareUserCheckAlt",
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
                moveTo(12.001f, 9f)
                horizontalLineTo(12.011f)
                moveTo(15.001f, 19f)
                lineTo(17.001f, 21f)
                lineTo(21.001f, 17f)
                moveTo(9.172f, 15f)
                curveTo(9.584f, 13.835f, 10.695f, 13f, 12.001f, 13f)
                curveTo(13.307f, 13f, 14.419f, 13.835f, 14.83f, 15f)
                moveTo(20f, 13f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(11.001f)
                moveTo(13.001f, 9f)
                curveTo(13.001f, 9.552f, 12.553f, 10f, 12.001f, 10f)
                curveTo(11.449f, 10f, 11.001f, 9.552f, 11.001f, 9f)
                curveTo(11.001f, 8.448f, 11.449f, 8f, 12.001f, 8f)
                curveTo(12.553f, 8f, 13.001f, 8.448f, 13.001f, 9f)
                close()
            }
        }.build()

        return _SquareUserCheckAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SquareUserCheckAlt: ImageVector? = null
