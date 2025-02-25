package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImageSquare: ImageVector
    get() {
        if (_ImageSquare != null) {
            return _ImageSquare!!
        }
        _ImageSquare = ImageVector.Builder(
            name = "ImageSquare",
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
                moveTo(14.264f, 15.938f)
                lineTo(12.596f, 14.283f)
                curveTo(11.791f, 13.485f, 11.388f, 13.086f, 10.927f, 12.94f)
                curveTo(10.52f, 12.812f, 10.084f, 12.816f, 9.68f, 12.954f)
                curveTo(9.222f, 13.109f, 8.828f, 13.517f, 8.041f, 14.333f)
                lineTo(4.044f, 18.28f)
                moveTo(14.264f, 15.938f)
                lineTo(14.605f, 15.599f)
                curveTo(15.411f, 14.8f, 15.814f, 14.4f, 16.277f, 14.254f)
                curveTo(16.683f, 14.126f, 17.12f, 14.131f, 17.524f, 14.269f)
                curveTo(17.982f, 14.425f, 18.376f, 14.834f, 19.163f, 15.651f)
                lineTo(20f, 16.493f)
                moveTo(14.264f, 15.938f)
                lineTo(18.275f, 19.956f)
                moveTo(18.275f, 19.956f)
                curveTo(17.918f, 20f, 17.454f, 20f, 16.8f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4.128f, 18.731f, 4.075f, 18.532f, 4.044f, 18.28f)
                moveTo(18.275f, 19.956f)
                curveTo(18.529f, 19.926f, 18.73f, 19.873f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(16.493f)
                moveTo(4.044f, 18.28f)
                curveTo(4f, 17.922f, 4f, 17.458f, 4f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(16.493f)
                moveTo(17f, 9f)
                curveTo(17f, 10.104f, 16.105f, 11f, 15f, 11f)
                curveTo(13.895f, 11f, 13f, 10.104f, 13f, 9f)
                curveTo(13f, 7.895f, 13.895f, 7f, 15f, 7f)
                curveTo(16.105f, 7f, 17f, 7.895f, 17f, 9f)
                close()
            }
        }.build()

        return _ImageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSquare: ImageVector? = null
