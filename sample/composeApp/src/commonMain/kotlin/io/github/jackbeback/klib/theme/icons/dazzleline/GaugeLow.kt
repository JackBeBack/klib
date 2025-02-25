package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GaugeLow: ImageVector
    get() {
        if (_GaugeLow != null) {
            return _GaugeLow!!
        }
        _GaugeLow = ImageVector.Builder(
            name = "GaugeLow",
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
                moveTo(22f, 13.257f)
                curveTo(21.049f, 12.472f, 19.83f, 12f, 18.5f, 12f)
                curveTo(15.631f, 12f, 13.275f, 14.197f, 13.022f, 17f)
                horizontalLineTo(12.2f)
                curveTo(11.08f, 17f, 10.52f, 17f, 10.092f, 16.782f)
                curveTo(9.716f, 16.59f, 9.41f, 16.284f, 9.218f, 15.908f)
                curveTo(9f, 15.48f, 9f, 14.92f, 9f, 13.8f)
                verticalLineTo(10f)
                horizontalLineTo(6.8f)
                curveTo(5.12f, 10f, 4.28f, 10f, 3.638f, 10.327f)
                curveTo(3.074f, 10.615f, 2.615f, 11.073f, 2.327f, 11.638f)
                curveTo(2f, 12.28f, 2f, 13.12f, 2f, 14.8f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(9f, 17.5f)
                curveTo(9f, 18.881f, 7.881f, 20f, 6.5f, 20f)
                curveTo(5.119f, 20f, 4f, 18.881f, 4f, 17.5f)
                moveTo(5f, 7f)
                horizontalLineTo(9f)
                moveTo(15.5f, 6f)
                horizontalLineTo(18.5f)
                moveTo(17f, 12f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                moveTo(18.75f, 7f)
                lineTo(18.25f, 5f)
                moveTo(21f, 17.5f)
                curveTo(21f, 18.881f, 19.881f, 20f, 18.5f, 20f)
                curveTo(17.119f, 20f, 16f, 18.881f, 16f, 17.5f)
                curveTo(16f, 16.119f, 17.119f, 15f, 18.5f, 15f)
                curveTo(19.881f, 15f, 21f, 16.119f, 21f, 17.5f)
                close()
            }
        }.build()

        return _GaugeLow!!
    }

@Suppress("ObjectPropertyName")
private var _GaugeLow: ImageVector? = null
