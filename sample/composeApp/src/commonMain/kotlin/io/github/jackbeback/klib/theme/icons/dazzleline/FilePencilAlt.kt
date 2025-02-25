package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.FilePencilAlt: ImageVector
    get() {
        if (_FilePencilAlt != null) {
            return _FilePencilAlt!!
        }
        _FilePencilAlt = ImageVector.Builder(
            name = "FilePencilAlt",
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
                horizontalLineTo(10f)
                moveTo(13f, 3f)
                lineTo(19f, 9f)
                moveTo(13f, 3f)
                verticalLineTo(7.4f)
                curveTo(13f, 7.96f, 13f, 8.24f, 13.109f, 8.454f)
                curveTo(13.205f, 8.642f, 13.358f, 8.795f, 13.546f, 8.891f)
                curveTo(13.76f, 9f, 14.04f, 9f, 14.6f, 9f)
                horizontalLineTo(19f)
                moveTo(19f, 9f)
                verticalLineTo(10f)
                moveTo(9f, 17f)
                horizontalLineTo(11.5f)
                moveTo(9f, 13f)
                horizontalLineTo(14f)
                moveTo(9f, 9f)
                horizontalLineTo(10f)
                moveTo(14f, 21f)
                lineTo(16.025f, 20.595f)
                curveTo(16.201f, 20.56f, 16.29f, 20.542f, 16.372f, 20.51f)
                curveTo(16.445f, 20.481f, 16.515f, 20.444f, 16.579f, 20.399f)
                curveTo(16.652f, 20.348f, 16.715f, 20.285f, 16.843f, 20.157f)
                lineTo(21f, 16f)
                curveTo(21.552f, 15.448f, 21.552f, 14.552f, 21f, 14f)
                curveTo(20.448f, 13.448f, 19.552f, 13.448f, 19f, 14f)
                lineTo(14.843f, 18.157f)
                curveTo(14.715f, 18.285f, 14.652f, 18.348f, 14.601f, 18.421f)
                curveTo(14.556f, 18.485f, 14.519f, 18.555f, 14.49f, 18.628f)
                curveTo(14.458f, 18.71f, 14.44f, 18.799f, 14.405f, 18.975f)
                lineTo(14f, 21f)
                close()
            }
        }.build()

        return _FilePencilAlt!!
    }

@Suppress("ObjectPropertyName")
private var _FilePencilAlt: ImageVector? = null
