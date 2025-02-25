package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneIntercom: ImageVector
    get() {
        if (_PhoneIntercom != null) {
            return _PhoneIntercom!!
        }
        _PhoneIntercom = ImageVector.Builder(
            name = "PhoneIntercom",
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
                moveTo(18f, 13f)
                horizontalLineTo(16f)
                moveTo(18f, 8f)
                horizontalLineTo(10f)
                moveTo(18f, 16f)
                horizontalLineTo(16f)
                moveTo(10.2f, 20f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 20f, 19.48f, 20f, 19.908f, 19.782f)
                curveTo(20.284f, 19.59f, 20.59f, 19.284f, 20.782f, 18.908f)
                curveTo(21f, 18.48f, 21f, 17.92f, 21f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 4f, 8.52f, 4f, 8.092f, 4.218f)
                curveTo(7.716f, 4.41f, 7.41f, 4.716f, 7.218f, 5.092f)
                curveTo(7f, 5.52f, 7f, 6.08f, 7f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(7f, 17.92f, 7f, 18.48f, 7.218f, 18.908f)
                curveTo(7.41f, 19.284f, 7.716f, 19.59f, 8.092f, 19.782f)
                curveTo(8.52f, 20f, 9.08f, 20f, 10.2f, 20f)
                close()
                moveTo(13f, 14.5f)
                curveTo(13f, 15.328f, 12.328f, 16f, 11.5f, 16f)
                curveTo(10.672f, 16f, 10f, 15.328f, 10f, 14.5f)
                curveTo(10f, 13.672f, 10.672f, 13f, 11.5f, 13f)
                curveTo(12.328f, 13f, 13f, 13.672f, 13f, 14.5f)
                close()
                moveTo(5f, 20f)
                curveTo(3.895f, 20f, 3f, 19.105f, 3f, 18f)
                verticalLineTo(6f)
                curveTo(3f, 4.895f, 3.895f, 4f, 5f, 4f)
                curveTo(6.105f, 4f, 7f, 4.895f, 7f, 6f)
                verticalLineTo(18f)
                curveTo(7f, 19.105f, 6.105f, 20f, 5f, 20f)
                close()
            }
        }.build()

        return _PhoneIntercom!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneIntercom: ImageVector? = null
