package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Microphone",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(14.5f, 4.119f, 13.381f, 3f, 12f, 3f)
                curveTo(10.619f, 3f, 9.5f, 4.119f, 9.5f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(9.5f, 11.881f, 10.619f, 13f, 12f, 13f)
                curveTo(13.381f, 13f, 14.5f, 11.881f, 14.5f, 10.5f)
                close()
                moveTo(12f, 1f)
                curveTo(9.515f, 1f, 7.5f, 3.015f, 7.5f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(7.5f, 12.985f, 9.515f, 15f, 12f, 15f)
                curveTo(14.485f, 15f, 16.5f, 12.985f, 16.5f, 10.5f)
                verticalLineTo(5.5f)
                curveTo(16.5f, 3.015f, 14.485f, 1f, 12f, 1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 17f)
                curveTo(5.5f, 17f, 6f, 12f, 6f, 12f)
                curveTo(6f, 12f, 6f, 11f, 5f, 11f)
                curveTo(4f, 11f, 4f, 12f, 4f, 12f)
                curveTo(4f, 12f, 3.54f, 18.438f, 11f, 18.966f)
                verticalLineTo(22f)
                curveTo(11f, 22.552f, 11.448f, 23f, 12f, 23f)
                curveTo(12.552f, 23f, 13f, 22.552f, 13f, 22f)
                verticalLineTo(18.966f)
                curveTo(20.46f, 18.438f, 20f, 12f, 20f, 12f)
                curveTo(20f, 12f, 20f, 11f, 19f, 11f)
                curveTo(18f, 11f, 18f, 12f, 18f, 12f)
                curveTo(18f, 12f, 18.5f, 17f, 12f, 17f)
                close()
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
