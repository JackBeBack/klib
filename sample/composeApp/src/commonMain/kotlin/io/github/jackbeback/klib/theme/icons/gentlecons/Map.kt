package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Map",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.723f, 1.52f)
                curveTo(14.512f, 1.126f, 15.435f, 1.099f, 16.247f, 1.446f)
                lineTo(21.182f, 3.561f)
                curveTo(22.285f, 4.034f, 23f, 5.119f, 23f, 6.319f)
                verticalLineTo(18.967f)
                curveTo(23f, 21.121f, 20.798f, 22.573f, 18.818f, 21.724f)
                lineTo(15.459f, 20.285f)
                curveTo(15.188f, 20.169f, 14.881f, 20.178f, 14.618f, 20.309f)
                lineTo(10.277f, 22.48f)
                curveTo(9.488f, 22.874f, 8.565f, 22.901f, 7.753f, 22.554f)
                lineTo(2.818f, 20.439f)
                curveTo(1.715f, 19.966f, 1f, 18.881f, 1f, 17.681f)
                verticalLineTo(5.033f)
                curveTo(1f, 2.879f, 3.202f, 1.427f, 5.182f, 2.276f)
                lineTo(8.541f, 3.716f)
                curveTo(8.812f, 3.831f, 9.119f, 3.822f, 9.382f, 3.691f)
                lineTo(13.723f, 1.52f)
                close()
                moveTo(16f, 3.517f)
                verticalLineTo(18.353f)
                curveTo(16.083f, 18.381f, 16.165f, 18.412f, 16.247f, 18.446f)
                lineTo(19.606f, 19.886f)
                curveTo(20.266f, 20.169f, 21f, 19.685f, 21f, 18.967f)
                verticalLineTo(6.319f)
                curveTo(21f, 5.919f, 20.762f, 5.557f, 20.394f, 5.4f)
                lineTo(16f, 3.517f)
                close()
                moveTo(14f, 18.399f)
                verticalLineTo(3.618f)
                lineTo(10.277f, 5.48f)
                curveTo(10.186f, 5.525f, 10.094f, 5.565f, 10f, 5.601f)
                verticalLineTo(20.382f)
                lineTo(13.723f, 18.521f)
                curveTo(13.814f, 18.475f, 13.906f, 18.435f, 14f, 18.399f)
                close()
                moveTo(7.753f, 5.554f)
                curveTo(7.835f, 5.589f, 7.917f, 5.62f, 8f, 5.647f)
                verticalLineTo(20.483f)
                lineTo(3.606f, 18.6f)
                curveTo(3.238f, 18.443f, 3f, 18.081f, 3f, 17.681f)
                verticalLineTo(5.033f)
                curveTo(3f, 4.315f, 3.734f, 3.831f, 4.394f, 4.114f)
                lineTo(7.753f, 5.554f)
                close()
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
