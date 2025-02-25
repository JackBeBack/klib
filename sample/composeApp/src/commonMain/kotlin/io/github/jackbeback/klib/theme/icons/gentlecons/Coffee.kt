package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Coffee: ImageVector
    get() {
        if (_Coffee != null) {
            return _Coffee!!
        }
        _Coffee = ImageVector.Builder(
            name = "Coffee",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 4f)
                curveTo(3f, 2.895f, 3.895f, 2f, 5f, 2f)
                horizontalLineTo(17f)
                curveTo(18.105f, 2f, 19f, 2.895f, 19f, 4f)
                verticalLineTo(5.09f)
                curveTo(19.389f, 5.151f, 19.865f, 5.256f, 20.351f, 5.439f)
                curveTo(20.944f, 5.661f, 21.604f, 6.018f, 22.122f, 6.601f)
                curveTo(22.66f, 7.205f, 23f, 8.004f, 23f, 9f)
                curveTo(23f, 9.996f, 22.66f, 10.795f, 22.122f, 11.399f)
                curveTo(21.604f, 11.982f, 20.944f, 12.339f, 20.351f, 12.561f)
                curveTo(19.831f, 12.756f, 19.322f, 12.863f, 18.92f, 12.922f)
                lineTo(18.919f, 12.93f)
                curveTo(18.84f, 13.457f, 18.68f, 14.177f, 18.349f, 14.91f)
                curveTo(18.019f, 15.645f, 17.503f, 16.425f, 16.697f, 17.022f)
                curveTo(15.879f, 17.628f, 14.823f, 18f, 13.5f, 18f)
                horizontalLineTo(8.5f)
                curveTo(7.177f, 18f, 6.121f, 17.628f, 5.303f, 17.022f)
                curveTo(4.497f, 16.425f, 3.981f, 15.645f, 3.651f, 14.91f)
                curveTo(3.248f, 14.015f, 3.003f, 12.99f, 3f, 12.002f)
                lineTo(3f, 4f)
                close()
                moveTo(19f, 10.876f)
                verticalLineTo(7.124f)
                curveTo(19.209f, 7.169f, 19.431f, 7.23f, 19.649f, 7.311f)
                curveTo(20.056f, 7.464f, 20.396f, 7.67f, 20.628f, 7.93f)
                curveTo(20.84f, 8.17f, 21f, 8.496f, 21f, 9f)
                curveTo(21f, 9.504f, 20.84f, 9.83f, 20.628f, 10.07f)
                curveTo(20.396f, 10.33f, 20.056f, 10.536f, 19.649f, 10.689f)
                curveTo(19.431f, 10.77f, 19.209f, 10.831f, 19f, 10.876f)
                close()
                moveTo(5f, 11.997f)
                curveTo(5.009f, 12.707f, 5.185f, 13.446f, 5.474f, 14.09f)
                curveTo(5.706f, 14.605f, 6.034f, 15.075f, 6.494f, 15.415f)
                curveTo(6.942f, 15.747f, 7.573f, 16f, 8.5f, 16f)
                horizontalLineTo(13.5f)
                curveTo(14.427f, 16f, 15.058f, 15.747f, 15.506f, 15.415f)
                curveTo(15.966f, 15.075f, 16.294f, 14.605f, 16.526f, 14.09f)
                curveTo(16.814f, 13.45f, 16.997f, 12.705f, 17f, 11.997f)
                lineTo(17f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(11.997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(23f, 21f)
                curveTo(23f, 20.448f, 22.552f, 20f, 22f, 20f)
                horizontalLineTo(2f)
                curveTo(1.448f, 20f, 1f, 20.448f, 1f, 21f)
                curveTo(1f, 21.552f, 1.448f, 22f, 2f, 22f)
                horizontalLineTo(22f)
                curveTo(22.552f, 22f, 23f, 21.552f, 23f, 21f)
                close()
            }
        }.build()

        return _Coffee!!
    }

@Suppress("ObjectPropertyName")
private var _Coffee: ImageVector? = null
