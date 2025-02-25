package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Braille: ImageVector
    get() {
        if (_Braille != null) {
            return _Braille!!
        }
        _Braille = ImageVector.Builder(
            name = "Braille",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 2f)
                curveTo(6f, 3.105f, 5.105f, 4f, 4f, 4f)
                curveTo(2.895f, 4f, 2f, 3.105f, 2f, 2f)
                curveTo(2f, 0.896f, 2.895f, 0f, 4f, 0f)
                curveTo(5.105f, 0f, 6f, 0.896f, 6f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(18.5f, 3f)
                curveTo(19.328f, 3f, 20f, 2.329f, 20f, 1.5f)
                curveTo(20f, 0.672f, 19.328f, 0f, 18.5f, 0f)
                curveTo(17.672f, 0f, 17f, 0.672f, 17f, 1.5f)
                curveTo(17f, 2.329f, 17.672f, 3f, 18.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 6.5f)
                verticalLineTo(9.05f)
                curveTo(13.162f, 9.017f, 13.329f, 9f, 13.5f, 9f)
                curveTo(14.389f, 9f, 15.169f, 9.464f, 15.612f, 10.162f)
                curveTo(15.888f, 10.058f, 16.187f, 10f, 16.5f, 10f)
                curveTo(17.389f, 10f, 18.169f, 10.464f, 18.612f, 11.162f)
                curveTo(18.888f, 11.058f, 19.187f, 11f, 19.5f, 11f)
                curveTo(20.881f, 11f, 22f, 12.12f, 22f, 13.5f)
                verticalLineTo(16.189f)
                curveTo(22f, 20.503f, 18.503f, 24f, 14.189f, 24f)
                curveTo(11.554f, 24f, 9.059f, 22.818f, 7.39f, 20.778f)
                lineTo(2.7f, 15.046f)
                curveTo(1.344f, 13.389f, 2.344f, 10.887f, 4.469f, 10.621f)
                curveTo(5.366f, 10.509f, 6.26f, 10.85f, 6.855f, 11.53f)
                lineTo(8f, 12.839f)
                verticalLineTo(6.5f)
                curveTo(8f, 5.12f, 9.119f, 4f, 10.5f, 4f)
                curveTo(11.881f, 4f, 13f, 5.12f, 13f, 6.5f)
                close()
                moveTo(10f, 6.5f)
                curveTo(10f, 6.224f, 10.224f, 6f, 10.5f, 6f)
                curveTo(10.776f, 6f, 11f, 6.224f, 11f, 6.5f)
                verticalLineTo(13f)
                curveTo(11f, 13.552f, 11.448f, 14f, 12f, 14f)
                curveTo(12.552f, 14f, 13f, 13.552f, 13f, 13f)
                verticalLineTo(11.5f)
                curveTo(13f, 11.224f, 13.224f, 11f, 13.5f, 11f)
                curveTo(13.776f, 11f, 14f, 11.224f, 14f, 11.5f)
                verticalLineTo(13f)
                curveTo(14f, 13.552f, 14.448f, 14f, 15f, 14f)
                curveTo(15.552f, 14f, 16f, 13.552f, 16f, 13f)
                verticalLineTo(12.5f)
                curveTo(16f, 12.224f, 16.224f, 12f, 16.5f, 12f)
                curveTo(16.776f, 12f, 17f, 12.224f, 17f, 12.5f)
                verticalLineTo(13f)
                curveTo(17f, 13.552f, 17.448f, 14f, 18f, 14f)
                curveTo(18.552f, 14f, 19f, 13.552f, 19f, 13f)
                curveTo(19f, 13f, 19.224f, 13f, 19.5f, 13f)
                curveTo(19.776f, 13f, 20f, 13.224f, 20f, 13.5f)
                verticalLineTo(16.189f)
                curveTo(20f, 19.399f, 17.398f, 22f, 14.189f, 22f)
                curveTo(12.154f, 22f, 10.227f, 21.087f, 8.938f, 19.512f)
                lineTo(4.248f, 13.779f)
                curveTo(3.888f, 13.34f, 4.153f, 12.676f, 4.717f, 12.606f)
                curveTo(4.955f, 12.576f, 5.192f, 12.667f, 5.35f, 12.847f)
                lineTo(7.897f, 15.758f)
                curveTo(8.627f, 16.592f, 10f, 16.076f, 10f, 14.968f)
                verticalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 6.5f)
                curveTo(20f, 7.329f, 19.328f, 8f, 18.5f, 8f)
                curveTo(17.672f, 8f, 17f, 7.329f, 17f, 6.5f)
                curveTo(17f, 5.672f, 17.672f, 5f, 18.5f, 5f)
                curveTo(19.328f, 5f, 20f, 5.672f, 20f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.5f, 3f)
                curveTo(12.328f, 3f, 13f, 2.329f, 13f, 1.5f)
                curveTo(13f, 0.672f, 12.328f, 0f, 11.5f, 0f)
                curveTo(10.672f, 0f, 10f, 0.672f, 10f, 1.5f)
                curveTo(10f, 2.329f, 10.672f, 3f, 11.5f, 3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4f, 8f)
                curveTo(4.552f, 8f, 5f, 7.553f, 5f, 7f)
                curveTo(5f, 6.448f, 4.552f, 6f, 4f, 6f)
                curveTo(3.448f, 6f, 3f, 6.448f, 3f, 7f)
                curveTo(3f, 7.553f, 3.448f, 8f, 4f, 8f)
                close()
            }
        }.build()

        return _Braille!!
    }

@Suppress("ObjectPropertyName")
private var _Braille: ImageVector? = null
