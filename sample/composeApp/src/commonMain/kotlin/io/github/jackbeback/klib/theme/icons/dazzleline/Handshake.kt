package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Handshake: ImageVector
    get() {
        if (_Handshake != null) {
            return _Handshake!!
        }
        _Handshake = ImageVector.Builder(
            name = "Handshake",
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
                moveTo(22f, 8f)
                horizontalLineTo(20f)
                moveTo(20f, 8f)
                horizontalLineTo(19f)
                curveTo(17f, 6.002f, 14f, 4f, 12f, 6f)
                moveTo(20f, 8f)
                verticalLineTo(16f)
                moveTo(12f, 6f)
                lineTo(9f, 9.002f)
                curveTo(8.92f, 9.081f, 8.881f, 9.121f, 8.849f, 9.156f)
                curveTo(8.155f, 9.919f, 8.155f, 11.084f, 8.849f, 11.847f)
                curveTo(8.881f, 11.882f, 8.921f, 11.922f, 9f, 12.001f)
                curveTo(9.08f, 12.08f, 9.119f, 12.12f, 9.154f, 12.152f)
                curveTo(9.917f, 12.845f, 11.082f, 12.845f, 11.845f, 12.152f)
                curveTo(11.88f, 12.12f, 11.92f, 12.08f, 11.999f, 12.001f)
                lineTo(13f, 11f)
                moveTo(12f, 6f)
                curveTo(10f, 4f, 7f, 6.002f, 5f, 8f)
                horizontalLineTo(4f)
                moveTo(2f, 8f)
                horizontalLineTo(4f)
                moveTo(4f, 8f)
                verticalLineTo(16f)
                moveTo(20f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                moveTo(20f, 16f)
                horizontalLineTo(17.172f)
                moveTo(15f, 13f)
                lineTo(16.5f, 14.5f)
                curveTo(16.58f, 14.58f, 16.619f, 14.619f, 16.652f, 14.655f)
                curveTo(17.345f, 15.417f, 17.345f, 16.582f, 16.652f, 17.345f)
                curveTo(16.619f, 17.381f, 16.58f, 17.42f, 16.5f, 17.5f)
                curveTo(16.42f, 17.58f, 16.381f, 17.619f, 16.345f, 17.652f)
                curveTo(15.582f, 18.345f, 14.418f, 18.345f, 13.655f, 17.652f)
                curveTo(13.62f, 17.619f, 13.58f, 17.58f, 13.5f, 17.5f)
                lineTo(13f, 17f)
                curveTo(12.455f, 17.545f, 12.182f, 17.818f, 11.888f, 17.964f)
                curveTo(11.328f, 18.241f, 10.672f, 18.241f, 10.112f, 17.964f)
                curveTo(9.818f, 17.818f, 9.545f, 17.545f, 9f, 17f)
                curveTo(8.311f, 17.919f, 6.896f, 17.791f, 6.382f, 16.764f)
                lineTo(6f, 16f)
                horizontalLineTo(4f)
                moveTo(4f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
            }
        }.build()

        return _Handshake!!
    }

@Suppress("ObjectPropertyName")
private var _Handshake: ImageVector? = null
