package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.SoundOff: ImageVector
    get() {
        if (_SoundOff != null) {
            return _SoundOff!!
        }
        _SoundOff = ImageVector.Builder(
            name = "SoundOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 3f)
                curveTo(14f, 1.078f, 11.553f, 0.262f, 10.4f, 1.8f)
                lineTo(6.5f, 7f)
                horizontalLineTo(4f)
                curveTo(2.343f, 7f, 1f, 8.343f, 1f, 10f)
                verticalLineTo(14f)
                curveTo(1f, 15.657f, 2.343f, 17f, 4f, 17f)
                horizontalLineTo(6.494f)
                lineTo(10.388f, 22.305f)
                curveTo(11.531f, 23.863f, 14f, 23.054f, 14f, 21.121f)
                verticalLineTo(3f)
                close()
                moveTo(8.1f, 8.2f)
                lineTo(12f, 3f)
                verticalLineTo(21.121f)
                lineTo(8.106f, 15.816f)
                curveTo(7.729f, 15.303f, 7.13f, 15f, 6.494f, 15f)
                horizontalLineTo(4f)
                curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
                verticalLineTo(10f)
                curveTo(3f, 9.448f, 3.448f, 9f, 4f, 9f)
                horizontalLineTo(6.5f)
                curveTo(7.13f, 9f, 7.722f, 8.704f, 8.1f, 8.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21.293f, 8.571f)
                curveTo(21.683f, 8.18f, 22.317f, 8.18f, 22.707f, 8.571f)
                curveTo(23.098f, 8.961f, 23.098f, 9.595f, 22.707f, 9.985f)
                lineTo(20.76f, 11.932f)
                lineTo(22.707f, 13.879f)
                curveTo(23.098f, 14.269f, 23.098f, 14.902f, 22.707f, 15.293f)
                curveTo(22.317f, 15.683f, 21.683f, 15.683f, 21.293f, 15.293f)
                lineTo(19.346f, 13.346f)
                lineTo(17.399f, 15.293f)
                curveTo(17.009f, 15.683f, 16.376f, 15.683f, 15.985f, 15.293f)
                curveTo(15.595f, 14.902f, 15.595f, 14.269f, 15.985f, 13.879f)
                lineTo(17.932f, 11.932f)
                lineTo(15.985f, 9.985f)
                curveTo(15.595f, 9.595f, 15.595f, 8.961f, 15.985f, 8.571f)
                curveTo(16.376f, 8.18f, 17.009f, 8.18f, 17.399f, 8.571f)
                lineTo(19.346f, 10.518f)
                lineTo(21.293f, 8.571f)
                close()
            }
        }.build()

        return _SoundOff!!
    }

@Suppress("ObjectPropertyName")
private var _SoundOff: ImageVector? = null
