package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Drone: ImageVector
    get() {
        if (_Drone != null) {
            return _Drone!!
        }
        _Drone = ImageVector.Builder(
            name = "Drone",
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
                moveTo(6f, 11f)
                verticalLineTo(11.613f)
                curveTo(6f, 11.937f, 6f, 12.099f, 6.046f, 12.245f)
                curveTo(6.086f, 12.374f, 6.153f, 12.494f, 6.241f, 12.597f)
                curveTo(6.34f, 12.713f, 6.477f, 12.798f, 6.752f, 12.97f)
                lineTo(7.753f, 13.596f)
                moveTo(18f, 11f)
                verticalLineTo(11.613f)
                curveTo(18f, 11.937f, 18f, 12.099f, 17.954f, 12.245f)
                curveTo(17.914f, 12.374f, 17.847f, 12.494f, 17.759f, 12.597f)
                curveTo(17.66f, 12.713f, 17.522f, 12.798f, 17.248f, 12.97f)
                lineTo(16.247f, 13.596f)
                moveTo(7.753f, 13.596f)
                curveTo(8.322f, 12.079f, 9.785f, 11f, 11.5f, 11f)
                horizontalLineTo(12.5f)
                curveTo(14.215f, 11f, 15.678f, 12.079f, 16.247f, 13.596f)
                moveTo(7.753f, 13.596f)
                lineTo(8.857f, 14.286f)
                moveTo(16.247f, 13.596f)
                lineTo(15.143f, 14.286f)
                moveTo(8f, 18f)
                verticalLineTo(16.236f)
                curveTo(8f, 16.081f, 8.036f, 15.928f, 8.106f, 15.789f)
                lineTo(8.857f, 14.286f)
                moveTo(16f, 18f)
                verticalLineTo(16.236f)
                curveTo(16f, 16.081f, 15.964f, 15.928f, 15.894f, 15.789f)
                lineTo(15.143f, 14.286f)
                moveTo(15.143f, 14.286f)
                lineTo(14.389f, 14.757f)
                curveTo(14.244f, 14.847f, 14.172f, 14.892f, 14.094f, 14.925f)
                curveTo(14.025f, 14.953f, 13.953f, 14.974f, 13.88f, 14.986f)
                curveTo(13.797f, 15f, 13.712f, 15f, 13.541f, 15f)
                horizontalLineTo(10.459f)
                curveTo(10.288f, 15f, 10.203f, 15f, 10.12f, 14.986f)
                curveTo(10.047f, 14.974f, 9.975f, 14.953f, 9.906f, 14.925f)
                curveTo(9.828f, 14.892f, 9.756f, 14.847f, 9.611f, 14.757f)
                lineTo(8.857f, 14.286f)
                moveTo(2f, 8f)
                horizontalLineTo(10f)
                moveTo(14f, 8f)
                horizontalLineTo(22f)
                moveTo(6f, 8f)
                verticalLineTo(6f)
                moveTo(18f, 8f)
                verticalLineTo(6f)
            }
        }.build()

        return _Drone!!
    }

@Suppress("ObjectPropertyName")
private var _Drone: ImageVector? = null
