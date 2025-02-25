package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImagePen: ImageVector
    get() {
        if (_ImagePen != null) {
            return _ImagePen!!
        }
        _ImagePen = ImageVector.Builder(
            name = "ImagePen",
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
                curveTo(10.52f, 12.812f, 10.084f, 12.817f, 9.68f, 12.954f)
                curveTo(9.222f, 13.11f, 8.828f, 13.517f, 8.041f, 14.333f)
                lineTo(4.044f, 18.28f)
                moveTo(14.264f, 15.938f)
                lineTo(14.605f, 15.599f)
                curveTo(15.411f, 14.8f, 15.814f, 14.4f, 16.277f, 14.254f)
                curveTo(16.683f, 14.126f, 17.12f, 14.131f, 17.524f, 14.269f)
                curveTo(17.982f, 14.425f, 18.376f, 14.834f, 19.163f, 15.651f)
                lineTo(20f, 16.494f)
                moveTo(14.264f, 15.938f)
                lineTo(18.275f, 19.957f)
                moveTo(18.275f, 19.957f)
                curveTo(17.918f, 20f, 17.454f, 20f, 16.8f, 20f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 20f, 5.52f, 20f, 5.092f, 19.782f)
                curveTo(4.716f, 19.59f, 4.41f, 19.284f, 4.218f, 18.908f)
                curveTo(4.128f, 18.731f, 4.075f, 18.532f, 4.044f, 18.28f)
                moveTo(18.275f, 19.957f)
                curveTo(18.529f, 19.926f, 18.73f, 19.873f, 18.908f, 19.782f)
                curveTo(19.284f, 19.59f, 19.59f, 19.284f, 19.782f, 18.908f)
                curveTo(20f, 18.48f, 20f, 17.92f, 20f, 16.8f)
                verticalLineTo(16.494f)
                moveTo(12.5f, 4f)
                lineTo(7.2f, 4f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.458f, 4f, 17.922f, 4.044f, 18.28f)
                moveTo(20f, 11.5f)
                verticalLineTo(16.494f)
                moveTo(14f, 10f)
                lineTo(16.025f, 9.595f)
                curveTo(16.201f, 9.56f, 16.29f, 9.542f, 16.372f, 9.51f)
                curveTo(16.445f, 9.481f, 16.515f, 9.444f, 16.579f, 9.399f)
                curveTo(16.652f, 9.349f, 16.715f, 9.285f, 16.843f, 9.158f)
                lineTo(21f, 5f)
                curveTo(21.552f, 4.448f, 21.552f, 3.552f, 21f, 3f)
                curveTo(20.448f, 2.448f, 19.552f, 2.448f, 19f, 3f)
                lineTo(14.842f, 7.158f)
                curveTo(14.715f, 7.285f, 14.651f, 7.349f, 14.601f, 7.421f)
                curveTo(14.556f, 7.485f, 14.519f, 7.555f, 14.49f, 7.628f)
                curveTo(14.458f, 7.71f, 14.44f, 7.799f, 14.405f, 7.975f)
                lineTo(14f, 10f)
                close()
            }
        }.build()

        return _ImagePen!!
    }

@Suppress("ObjectPropertyName")
private var _ImagePen: ImageVector? = null
