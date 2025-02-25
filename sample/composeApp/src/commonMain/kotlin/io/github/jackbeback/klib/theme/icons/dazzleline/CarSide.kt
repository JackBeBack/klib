package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CarSide: ImageVector
    get() {
        if (_CarSide != null) {
            return _CarSide!!
        }
        _CarSide = ImageVector.Builder(
            name = "CarSide",
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
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                moveTo(8f, 17f)
                curveTo(8f, 18.105f, 7.105f, 19f, 6f, 19f)
                curveTo(4.895f, 19f, 4f, 18.105f, 4f, 17f)
                moveTo(8f, 17f)
                curveTo(8f, 15.895f, 7.105f, 15f, 6f, 15f)
                curveTo(4.895f, 15f, 4f, 15.895f, 4f, 17f)
                moveTo(16f, 17f)
                curveTo(16f, 18.105f, 16.895f, 19f, 18f, 19f)
                curveTo(19.105f, 19f, 20f, 18.105f, 20f, 17f)
                moveTo(16f, 17f)
                curveTo(16f, 15.895f, 16.895f, 15f, 18f, 15f)
                curveTo(19.105f, 15f, 20f, 15.895f, 20f, 17f)
                moveTo(10f, 5f)
                verticalLineTo(11f)
                moveTo(4f, 11f)
                lineTo(4.332f, 9.011f)
                curveTo(4.569f, 7.586f, 4.688f, 6.873f, 5.043f, 6.339f)
                curveTo(5.357f, 5.867f, 5.797f, 5.494f, 6.313f, 5.263f)
                curveTo(6.899f, 5f, 7.622f, 5f, 9.066f, 5f)
                horizontalLineTo(12.431f)
                curveTo(13.37f, 5f, 13.84f, 5f, 14.266f, 5.129f)
                curveTo(14.644f, 5.244f, 14.995f, 5.432f, 15.299f, 5.682f)
                curveTo(15.644f, 5.965f, 15.904f, 6.356f, 16.425f, 7.137f)
                lineTo(19f, 11f)
                moveTo(4f, 17f)
                horizontalLineTo(3.6f)
                curveTo(3.04f, 17f, 2.76f, 17f, 2.546f, 16.891f)
                curveTo(2.358f, 16.795f, 2.205f, 16.642f, 2.109f, 16.454f)
                curveTo(2f, 16.24f, 2f, 15.96f, 2f, 15.4f)
                verticalLineTo(14.2f)
                curveTo(2f, 13.08f, 2f, 12.52f, 2.218f, 12.092f)
                curveTo(2.41f, 11.716f, 2.716f, 11.41f, 3.092f, 11.218f)
                curveTo(3.52f, 11f, 4.08f, 11f, 5.2f, 11f)
                horizontalLineTo(17.2f)
                curveTo(17.943f, 11f, 18.315f, 11f, 18.626f, 11.049f)
                curveTo(20.337f, 11.32f, 21.68f, 12.663f, 21.951f, 14.374f)
                curveTo(22f, 14.685f, 22f, 15.057f, 22f, 15.8f)
                curveTo(22f, 15.986f, 22f, 16.079f, 21.988f, 16.156f)
                curveTo(21.92f, 16.584f, 21.584f, 16.92f, 21.156f, 16.988f)
                curveTo(21.079f, 17f, 20.986f, 17f, 20.8f, 17f)
                horizontalLineTo(20f)
            }
        }.build()

        return _CarSide!!
    }

@Suppress("ObjectPropertyName")
private var _CarSide: ImageVector? = null
