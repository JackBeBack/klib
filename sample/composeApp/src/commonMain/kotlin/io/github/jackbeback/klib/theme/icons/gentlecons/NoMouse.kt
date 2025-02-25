package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.NoMouse: ImageVector
    get() {
        if (_NoMouse != null) {
            return _NoMouse!!
        }
        _NoMouse = ImageVector.Builder(
            name = "NoMouse",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1f)
                curveTo(9.137f, 1f, 7.382f, 2.047f, 6.349f, 3.33f)
                lineTo(7.776f, 4.757f)
                curveTo(8.302f, 4.019f, 9.24f, 3.264f, 11f, 3.056f)
                verticalLineTo(7.981f)
                lineTo(14.019f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13.981f)
                lineTo(19f, 15.981f)
                lineTo(19f, 6.995f)
                curveTo(18.998f, 6.668f, 18.951f, 6.342f, 18.887f, 6.023f)
                curveTo(18.777f, 5.475f, 18.557f, 4.734f, 18.108f, 3.986f)
                curveTo(17.17f, 2.424f, 15.339f, 1f, 12f, 1f)
                close()
                moveTo(17f, 9f)
                verticalLineTo(7.005f)
                curveTo(16.994f, 6.807f, 16.965f, 6.609f, 16.926f, 6.415f)
                curveTo(16.848f, 6.026f, 16.693f, 5.516f, 16.392f, 5.015f)
                curveTo(15.906f, 4.203f, 14.966f, 3.289f, 13f, 3.056f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5f, 17.001f)
                lineTo(5f, 7.946f)
                lineTo(8.055f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(16.995f)
                curveTo(7.006f, 17.194f, 7.036f, 17.391f, 7.074f, 17.585f)
                curveTo(7.152f, 17.975f, 7.307f, 18.484f, 7.607f, 18.986f)
                curveTo(8.17f, 19.924f, 9.339f, 21f, 12f, 21f)
                curveTo(14.46f, 21f, 15.645f, 20.08f, 16.254f, 19.2f)
                lineTo(17.684f, 20.629f)
                curveTo(16.655f, 21.931f, 14.894f, 23f, 12f, 23f)
                curveTo(8.661f, 23f, 6.83f, 21.576f, 5.893f, 20.015f)
                curveTo(5.443f, 19.266f, 5.223f, 18.526f, 5.113f, 17.978f)
                curveTo(5.049f, 17.658f, 5.001f, 17.328f, 5f, 17.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2.008f, 2.008f)
                curveTo(1.617f, 2.399f, 1.617f, 3.032f, 2.008f, 3.422f)
                lineTo(20.586f, 22f)
                curveTo(20.977f, 22.391f, 21.61f, 22.391f, 22f, 22f)
                curveTo(22.391f, 21.61f, 22.391f, 20.977f, 22f, 20.586f)
                lineTo(3.422f, 2.008f)
                curveTo(3.032f, 1.617f, 2.398f, 1.617f, 2.008f, 2.008f)
                close()
            }
        }.build()

        return _NoMouse!!
    }

@Suppress("ObjectPropertyName")
private var _NoMouse: ImageVector? = null
