package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCirclePencil: ImageVector
    get() {
        if (_MessageCirclePencil != null) {
            return _MessageCirclePencil!!
        }
        _MessageCirclePencil = ImageVector.Builder(
            name = "MessageCirclePencil",
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
                moveTo(21.004f, 12f)
                curveTo(21.004f, 16.971f, 16.975f, 21f, 12.004f, 21f)
                curveTo(9.967f, 21f, 3.005f, 21f, 3.005f, 21f)
                curveTo(3.005f, 21f, 4.564f, 17.256f, 3.94f, 16.001f)
                curveTo(3.341f, 14.796f, 3.004f, 13.437f, 3.004f, 12f)
                curveTo(3.004f, 7.029f, 7.033f, 3f, 12.004f, 3f)
                curveTo(16.975f, 3f, 21.004f, 7.029f, 21.004f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.405f, 13.975f)
                curveTo(8.44f, 13.799f, 8.458f, 13.71f, 8.49f, 13.628f)
                curveTo(8.519f, 13.555f, 8.556f, 13.485f, 8.601f, 13.421f)
                curveTo(8.652f, 13.348f, 8.715f, 13.285f, 8.843f, 13.157f)
                lineTo(13f, 9f)
                curveTo(13.552f, 8.448f, 14.448f, 8.448f, 15f, 9f)
                curveTo(15.552f, 9.552f, 15.552f, 10.448f, 15f, 11f)
                lineTo(10.843f, 15.157f)
                curveTo(10.715f, 15.285f, 10.652f, 15.348f, 10.579f, 15.399f)
                curveTo(10.515f, 15.444f, 10.445f, 15.481f, 10.372f, 15.51f)
                curveTo(10.29f, 15.542f, 10.201f, 15.56f, 10.025f, 15.595f)
                lineTo(8f, 16f)
                lineTo(8.405f, 13.975f)
                close()
            }
        }.build()

        return _MessageCirclePencil!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCirclePencil: ImageVector? = null
