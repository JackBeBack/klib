package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FileHeart: ImageVector
    get() {
        if (_FileHeart != null) {
            return _FileHeart!!
        }
        _FileHeart = ImageVector.Builder(
            name = "FileHeart",
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
                moveTo(13f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(9f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(11.998f, 12.212f)
                curveTo(11.298f, 11.433f, 10.131f, 11.223f, 9.254f, 11.937f)
                curveTo(8.377f, 12.65f, 8.254f, 13.843f, 8.942f, 14.687f)
                curveTo(9.331f, 15.163f, 10.255f, 15.998f, 10.985f, 16.635f)
                curveTo(11.332f, 16.937f, 11.505f, 17.088f, 11.715f, 17.15f)
                curveTo(11.893f, 17.203f, 12.102f, 17.203f, 12.281f, 17.15f)
                curveTo(12.49f, 17.088f, 12.663f, 16.937f, 13.01f, 16.635f)
                curveTo(13.74f, 15.998f, 14.664f, 15.163f, 15.053f, 14.687f)
                curveTo(15.741f, 13.843f, 15.633f, 12.643f, 14.741f, 11.937f)
                curveTo(13.849f, 11.231f, 12.697f, 11.433f, 11.998f, 12.212f)
                close()
            }
        }.build()

        return _FileHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FileHeart: ImageVector? = null
