package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Brightness: ImageVector
    get() {
        if (_Brightness != null) {
            return _Brightness!!
        }
        _Brightness = ImageVector.Builder(
            name = "Brightness",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 0f)
                curveTo(11.448f, 0f, 11f, 0.448f, 11f, 1f)
                verticalLineTo(3f)
                curveTo(11f, 3.552f, 11.448f, 4f, 12f, 4f)
                curveTo(12.552f, 4f, 13f, 3.552f, 13f, 3f)
                verticalLineTo(1f)
                curveTo(13f, 0.448f, 12.552f, 0f, 12f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 18f)
                curveTo(15.314f, 18f, 18f, 15.314f, 18f, 12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                curveTo(6f, 15.314f, 8.686f, 18f, 12f, 18f)
                close()
                moveTo(9.215f, 14.785f)
                curveTo(8.502f, 14.072f, 8.062f, 13.087f, 8.062f, 12f)
                curveTo(8.062f, 9.825f, 9.825f, 8.062f, 12f, 8.062f)
                curveTo(13.087f, 8.062f, 14.072f, 8.502f, 14.785f, 9.215f)
                lineTo(9.215f, 14.785f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(19.071f, 3.515f)
                curveTo(19.462f, 3.124f, 20.095f, 3.124f, 20.485f, 3.515f)
                curveTo(20.876f, 3.905f, 20.876f, 4.538f, 20.485f, 4.929f)
                lineTo(19.071f, 6.343f)
                curveTo(18.681f, 6.734f, 18.047f, 6.734f, 17.657f, 6.343f)
                curveTo(17.266f, 5.953f, 17.266f, 5.319f, 17.657f, 4.929f)
                lineTo(19.071f, 3.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(0f, 12f)
                curveTo(0f, 12.552f, 0.448f, 13f, 1f, 13f)
                horizontalLineTo(3f)
                curveTo(3.552f, 13f, 4f, 12.552f, 4f, 12f)
                curveTo(4f, 11.448f, 3.552f, 11f, 3f, 11f)
                horizontalLineTo(1f)
                curveTo(0.448f, 11f, 0f, 11.448f, 0f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3.515f, 4.929f)
                curveTo(3.124f, 4.538f, 3.124f, 3.905f, 3.515f, 3.515f)
                curveTo(3.905f, 3.124f, 4.538f, 3.124f, 4.929f, 3.515f)
                lineTo(6.343f, 4.929f)
                curveTo(6.734f, 5.319f, 6.734f, 5.953f, 6.343f, 6.343f)
                curveTo(5.953f, 6.734f, 5.319f, 6.734f, 4.929f, 6.343f)
                lineTo(3.515f, 4.929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 20f)
                curveTo(11.448f, 20f, 11f, 20.448f, 11f, 21f)
                verticalLineTo(23f)
                curveTo(11f, 23.552f, 11.448f, 24f, 12f, 24f)
                curveTo(12.552f, 24f, 13f, 23.552f, 13f, 23f)
                verticalLineTo(21f)
                curveTo(13f, 20.448f, 12.552f, 20f, 12f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(4.929f, 17.657f)
                curveTo(5.319f, 17.266f, 5.953f, 17.266f, 6.343f, 17.657f)
                curveTo(6.734f, 18.047f, 6.734f, 18.681f, 6.343f, 19.071f)
                lineTo(4.929f, 20.485f)
                curveTo(4.538f, 20.876f, 3.905f, 20.876f, 3.515f, 20.485f)
                curveTo(3.124f, 20.095f, 3.124f, 19.462f, 3.515f, 19.071f)
                lineTo(4.929f, 17.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 12f)
                curveTo(20f, 12.552f, 20.448f, 13f, 21f, 13f)
                horizontalLineTo(23f)
                curveTo(23.552f, 13f, 24f, 12.552f, 24f, 12f)
                curveTo(24f, 11.448f, 23.552f, 11f, 23f, 11f)
                horizontalLineTo(21f)
                curveTo(20.448f, 11f, 20f, 11.448f, 20f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.657f, 19.071f)
                curveTo(17.266f, 18.681f, 17.266f, 18.047f, 17.657f, 17.657f)
                curveTo(18.047f, 17.266f, 18.681f, 17.266f, 19.071f, 17.657f)
                lineTo(20.485f, 19.071f)
                curveTo(20.876f, 19.462f, 20.876f, 20.095f, 20.485f, 20.485f)
                curveTo(20.095f, 20.876f, 19.462f, 20.876f, 19.071f, 20.485f)
                lineTo(17.657f, 19.071f)
                close()
            }
        }.build()

        return _Brightness!!
    }

@Suppress("ObjectPropertyName")
private var _Brightness: ImageVector? = null
