package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Train: ImageVector
    get() {
        if (_Train != null) {
            return _Train!!
        }
        _Train = ImageVector.Builder(
            name = "Train",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 12f)
                curveTo(11f, 12.552f, 10.552f, 13f, 10f, 13f)
                curveTo(9.448f, 13f, 9f, 12.552f, 9f, 12f)
                curveTo(9f, 11.448f, 9.448f, 11f, 10f, 11f)
                curveTo(10.552f, 11f, 11f, 11.448f, 11f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 13f)
                curveTo(14.552f, 13f, 15f, 12.552f, 15f, 12f)
                curveTo(15f, 11.448f, 14.552f, 11f, 14f, 11f)
                curveTo(13.448f, 11f, 13f, 11.448f, 13f, 12f)
                curveTo(13f, 12.552f, 13.448f, 13f, 14f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19f, 4f)
                curveTo(19f, 2.343f, 17.657f, 1f, 16f, 1f)
                horizontalLineTo(8f)
                curveTo(6.343f, 1f, 5f, 2.343f, 5f, 4f)
                verticalLineTo(13f)
                curveTo(5f, 14.487f, 6.082f, 15.721f, 7.501f, 15.959f)
                lineTo(5.081f, 21.606f)
                curveTo(4.863f, 22.114f, 5.098f, 22.702f, 5.606f, 22.919f)
                curveTo(6.114f, 23.137f, 6.702f, 22.902f, 6.919f, 22.394f)
                lineTo(7.088f, 22f)
                horizontalLineTo(16.912f)
                lineTo(17.081f, 22.394f)
                curveTo(17.298f, 22.902f, 17.886f, 23.137f, 18.394f, 22.919f)
                curveTo(18.902f, 22.702f, 19.137f, 22.114f, 18.919f, 21.606f)
                lineTo(16.499f, 15.959f)
                curveTo(17.918f, 15.721f, 19f, 14.487f, 19f, 13f)
                verticalLineTo(4f)
                close()
                moveTo(16.055f, 20f)
                horizontalLineTo(7.945f)
                lineTo(8.374f, 19f)
                horizontalLineTo(15.626f)
                lineTo(16.055f, 20f)
                close()
                moveTo(14.769f, 17f)
                horizontalLineTo(9.231f)
                lineTo(9.659f, 16f)
                horizontalLineTo(14.341f)
                lineTo(14.769f, 17f)
                close()
                moveTo(17f, 4f)
                curveTo(17f, 3.448f, 16.552f, 3f, 16f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                close()
                moveTo(11f, 8f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                curveTo(7.448f, 3f, 7f, 3.448f, 7f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                close()
                moveTo(7f, 13f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                curveTo(17f, 13.552f, 16.552f, 14f, 16f, 14f)
                horizontalLineTo(8f)
                curveTo(7.448f, 14f, 7f, 13.552f, 7f, 13f)
                close()
            }
        }.build()

        return _Train!!
    }

@Suppress("ObjectPropertyName")
private var _Train: ImageVector? = null
