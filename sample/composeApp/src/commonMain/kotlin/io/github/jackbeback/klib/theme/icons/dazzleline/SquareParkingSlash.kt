package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SquareParkingSlash: ImageVector
    get() {
        if (_SquareParkingSlash != null) {
            return _SquareParkingSlash!!
        }
        _SquareParkingSlash = ImageVector.Builder(
            name = "SquareParkingSlash",
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
                moveTo(9.6f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(14.4f)
                moveTo(3f, 3f)
                lineTo(4.586f, 4.586f)
                moveTo(21f, 21f)
                lineTo(19.414f, 19.414f)
                moveTo(4.586f, 4.586f)
                curveTo(4.438f, 4.733f, 4.314f, 4.904f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 20f, 18.48f, 20f, 18.908f, 19.782f)
                curveTo(19.096f, 19.686f, 19.267f, 19.562f, 19.414f, 19.414f)
                moveTo(4.586f, 4.586f)
                lineTo(19.414f, 19.414f)
                moveTo(13f, 13f)
                horizontalLineTo(9.5f)
                moveTo(9.5f, 13f)
                verticalLineTo(9.5f)
                moveTo(9.5f, 13f)
                verticalLineTo(16f)
                moveTo(13.694f, 8.098f)
                curveTo(14.514f, 8.334f, 15.161f, 8.979f, 15.4f, 9.798f)
            }
        }.build()

        return _SquareParkingSlash!!
    }

@Suppress("ObjectPropertyName")
private var _SquareParkingSlash: ImageVector? = null
