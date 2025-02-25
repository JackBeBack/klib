package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ModemAlt3: ImageVector
    get() {
        if (_ModemAlt3 != null) {
            return _ModemAlt3!!
        }
        _ModemAlt3 = ImageVector.Builder(
            name = "ModemAlt3",
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
                moveTo(7f, 17f)
                horizontalLineTo(7.01f)
                moveTo(10f, 17f)
                horizontalLineTo(10.01f)
                moveTo(13f, 17f)
                horizontalLineTo(13.01f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                moveTo(13f, 5f)
                curveTo(13.75f, 4f, 15.619f, 3f, 17f, 3f)
                curveTo(18.381f, 3f, 20f, 3.667f, 21f, 5f)
                moveTo(15f, 8f)
                curveTo(15.375f, 7.5f, 16.31f, 7f, 17f, 7f)
                curveTo(17.69f, 7f, 18.5f, 7.333f, 19f, 8f)
                moveTo(6.2f, 13f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 13f, 19.48f, 13f, 19.908f, 13.218f)
                curveTo(20.284f, 13.41f, 20.59f, 13.716f, 20.782f, 14.092f)
                curveTo(21f, 14.52f, 21f, 15.08f, 21f, 16.2f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(16.2f)
                curveTo(3f, 15.08f, 3f, 14.52f, 3.218f, 14.092f)
                curveTo(3.41f, 13.716f, 3.716f, 13.41f, 4.092f, 13.218f)
                curveTo(4.52f, 13f, 5.08f, 13f, 6.2f, 13f)
                close()
            }
        }.build()

        return _ModemAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _ModemAlt3: ImageVector? = null
