package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Send: ImageVector
    get() {
        if (_Send != null) {
            return _Send!!
        }
        _Send = ImageVector.Builder(
            name = "Send",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.265f, 4.426f)
                curveTo(1.043f, 2.872f, 2.617f, 1.679f, 4.053f, 2.314f)
                lineTo(21.834f, 10.171f)
                curveTo(23.423f, 10.873f, 23.423f, 13.127f, 21.834f, 13.829f)
                lineTo(4.053f, 21.686f)
                curveTo(2.617f, 22.321f, 1.043f, 21.128f, 1.265f, 19.574f)
                lineTo(1.991f, 14.492f)
                curveTo(2.06f, 14.009f, 2.415f, 13.616f, 2.888f, 13.497f)
                lineTo(8.877f, 12f)
                lineTo(2.888f, 10.503f)
                curveTo(2.415f, 10.384f, 2.06f, 9.991f, 1.991f, 9.508f)
                lineTo(1.265f, 4.426f)
                close()
                moveTo(21.026f, 12f)
                lineTo(3.245f, 4.143f)
                lineTo(3.895f, 8.693f)
                lineTo(12.854f, 10.933f)
                curveTo(13.965f, 11.211f, 13.965f, 12.789f, 12.854f, 13.067f)
                lineTo(3.895f, 15.307f)
                lineTo(3.245f, 19.857f)
                lineTo(21.026f, 12f)
                close()
            }
        }.build()

        return _Send!!
    }

@Suppress("ObjectPropertyName")
private var _Send: ImageVector? = null
