package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Firewall: ImageVector
    get() {
        if (_Firewall != null) {
            return _Firewall!!
        }
        _Firewall = ImageVector.Builder(
            name = "Firewall",
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
                moveTo(9.5f, 20f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 20f, 4.52f, 20f, 4.092f, 19.782f)
                curveTo(3.716f, 19.59f, 3.41f, 19.284f, 3.218f, 18.908f)
                curveTo(3f, 18.48f, 3f, 17.92f, 3f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(3f, 6.08f, 3f, 5.52f, 3.218f, 5.092f)
                curveTo(3.41f, 4.716f, 3.716f, 4.41f, 4.092f, 4.218f)
                curveTo(4.52f, 4f, 5.08f, 4f, 6.2f, 4f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 4f, 17.48f, 4f, 17.908f, 4.218f)
                curveTo(18.284f, 4.41f, 18.59f, 4.716f, 18.782f, 5.092f)
                curveTo(19f, 5.52f, 19f, 6.08f, 19f, 7.2f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                moveTo(3f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(3f, 16f)
                horizontalLineTo(9f)
                moveTo(7f, 4f)
                verticalLineTo(8f)
                moveTo(7f, 12f)
                verticalLineTo(16f)
                moveTo(15f, 4f)
                verticalLineTo(8f)
                moveTo(19.828f, 19.828f)
                curveTo(18.266f, 21.39f, 15.734f, 21.39f, 14.172f, 19.828f)
                curveTo(13.391f, 19.047f, 13f, 18.024f, 13f, 17f)
                curveTo(13f, 15.976f, 13.391f, 14.953f, 14.172f, 14.172f)
                curveTo(14.172f, 14.172f, 14.5f, 15f, 15.5f, 15.5f)
                curveTo(15.5f, 14.5f, 15.75f, 13f, 16.993f, 12f)
                curveTo(18f, 13f, 19.046f, 13.389f, 19.828f, 14.172f)
                curveTo(20.61f, 14.953f, 21f, 15.976f, 21f, 17f)
                curveTo(21f, 18.024f, 20.61f, 19.047f, 19.828f, 19.828f)
                close()
            }
        }.build()

        return _Firewall!!
    }

@Suppress("ObjectPropertyName")
private var _Firewall: ImageVector? = null
