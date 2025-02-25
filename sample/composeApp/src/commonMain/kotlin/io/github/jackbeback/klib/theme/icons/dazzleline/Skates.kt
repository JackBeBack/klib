package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Skates: ImageVector
    get() {
        if (_Skates != null) {
            return _Skates!!
        }
        _Skates = ImageVector.Builder(
            name = "Skates",
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
                moveTo(21f, 21f)
                horizontalLineTo(7f)
                curveTo(4.791f, 21f, 3f, 19.209f, 3f, 17f)
                moveTo(10.667f, 12.625f)
                horizontalLineTo(8.188f)
                curveTo(6.979f, 12.625f, 6f, 13.604f, 6f, 14.813f)
                curveTo(6f, 16.021f, 6.979f, 17f, 8.188f, 17f)
                horizontalLineTo(18.4f)
                curveTo(18.96f, 17f, 19.24f, 17f, 19.454f, 16.891f)
                curveTo(19.642f, 16.795f, 19.795f, 16.642f, 19.891f, 16.454f)
                curveTo(20f, 16.24f, 20f, 15.96f, 20f, 15.4f)
                verticalLineTo(6.2f)
                curveTo(20f, 5.08f, 20f, 4.52f, 19.782f, 4.092f)
                curveTo(19.59f, 3.716f, 19.284f, 3.41f, 18.908f, 3.218f)
                curveTo(18.48f, 3f, 17.92f, 3f, 16.8f, 3f)
                horizontalLineTo(16.2f)
                curveTo(15.08f, 3f, 14.52f, 3f, 14.092f, 3.218f)
                curveTo(13.716f, 3.41f, 13.41f, 3.716f, 13.218f, 4.092f)
                curveTo(13f, 4.52f, 13f, 5.08f, 13f, 6.2f)
                verticalLineTo(10.292f)
                curveTo(13f, 10.601f, 13f, 10.756f, 12.983f, 10.886f)
                curveTo(12.865f, 11.783f, 12.158f, 12.49f, 11.261f, 12.608f)
                curveTo(11.131f, 12.625f, 10.976f, 12.625f, 10.667f, 12.625f)
                close()
            }
        }.build()

        return _Skates!!
    }

@Suppress("ObjectPropertyName")
private var _Skates: ImageVector? = null
