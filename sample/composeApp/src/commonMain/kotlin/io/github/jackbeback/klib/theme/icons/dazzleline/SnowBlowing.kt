package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SnowBlowing: ImageVector
    get() {
        if (_SnowBlowing != null) {
            return _SnowBlowing!!
        }
        _SnowBlowing = ImageVector.Builder(
            name = "SnowBlowing",
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
                moveTo(6.765f, 6f)
                verticalLineTo(16.835f)
                moveTo(5.681f, 6.542f)
                lineTo(6.765f, 7.625f)
                lineTo(7.848f, 6.542f)
                moveTo(5.681f, 16.294f)
                lineTo(6.765f, 15.21f)
                lineTo(7.848f, 16.294f)
                moveTo(2.073f, 8.709f)
                lineTo(11.457f, 14.127f)
                moveTo(2f, 9.918f)
                lineTo(3.48f, 9.522f)
                lineTo(3.084f, 8.041f)
                moveTo(10.445f, 14.794f)
                lineTo(10.049f, 13.314f)
                lineTo(11.529f, 12.917f)
                moveTo(11.456f, 8.709f)
                lineTo(2.072f, 14.127f)
                moveTo(10.446f, 8.041f)
                lineTo(10.049f, 9.521f)
                lineTo(11.529f, 9.918f)
                moveTo(2f, 12.917f)
                lineTo(3.48f, 13.314f)
                lineTo(3.084f, 14.794f)
                moveTo(15f, 10f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 10f, 22f, 8.881f, 22f, 7.5f)
                curveTo(22f, 6.119f, 20.881f, 5f, 19.5f, 5f)
                horizontalLineTo(18.5f)
                moveTo(15f, 14f)
                horizontalLineTo(19.5f)
                curveTo(20.881f, 14f, 22f, 15.119f, 22f, 16.5f)
                curveTo(22f, 17.881f, 20.881f, 19f, 19.5f, 19f)
                horizontalLineTo(18.5f)
            }
        }.build()

        return _SnowBlowing!!
    }

@Suppress("ObjectPropertyName")
private var _SnowBlowing: ImageVector? = null
