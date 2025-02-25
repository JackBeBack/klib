package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Sun: ImageVector
    get() {
        if (_Sun != null) {
            return _Sun!!
        }
        _Sun = ImageVector.Builder(
            name = "Sun",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 1f)
                curveTo(11f, 0.448f, 11.448f, 0f, 12f, 0f)
                curveTo(12.552f, 0f, 13f, 0.448f, 13f, 1f)
                verticalLineTo(3f)
                curveTo(13f, 3.552f, 12.552f, 4f, 12f, 4f)
                curveTo(11.448f, 4f, 11f, 3.552f, 11f, 3f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 12f)
                curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
                curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
                curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
                curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
                close()
                moveTo(8.062f, 12f)
                curveTo(8.062f, 14.175f, 9.825f, 15.938f, 12f, 15.938f)
                curveTo(14.175f, 15.938f, 15.938f, 14.175f, 15.938f, 12f)
                curveTo(15.938f, 9.825f, 14.175f, 8.062f, 12f, 8.062f)
                curveTo(9.825f, 8.062f, 8.062f, 9.825f, 8.062f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20.485f, 3.515f)
                curveTo(20.095f, 3.124f, 19.462f, 3.124f, 19.071f, 3.515f)
                lineTo(17.657f, 4.929f)
                curveTo(17.266f, 5.319f, 17.266f, 5.953f, 17.657f, 6.343f)
                curveTo(18.047f, 6.734f, 18.681f, 6.734f, 19.071f, 6.343f)
                lineTo(20.485f, 4.929f)
                curveTo(20.876f, 4.538f, 20.876f, 3.905f, 20.485f, 3.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(1f, 13f)
                curveTo(0.448f, 13f, 0f, 12.552f, 0f, 12f)
                curveTo(0f, 11.448f, 0.448f, 11f, 1f, 11f)
                horizontalLineTo(3f)
                curveTo(3.552f, 11f, 4f, 11.448f, 4f, 12f)
                curveTo(4f, 12.552f, 3.552f, 13f, 3f, 13f)
                horizontalLineTo(1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(3.515f, 3.515f)
                curveTo(3.124f, 3.905f, 3.124f, 4.538f, 3.515f, 4.929f)
                lineTo(4.929f, 6.343f)
                curveTo(5.319f, 6.734f, 5.953f, 6.734f, 6.343f, 6.343f)
                curveTo(6.734f, 5.953f, 6.734f, 5.319f, 6.343f, 4.929f)
                lineTo(4.929f, 3.515f)
                curveTo(4.538f, 3.124f, 3.905f, 3.124f, 3.515f, 3.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11f, 21f)
                curveTo(11f, 20.448f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 20.448f, 13f, 21f)
                verticalLineTo(23f)
                curveTo(13f, 23.552f, 12.552f, 24f, 12f, 24f)
                curveTo(11.448f, 24f, 11f, 23.552f, 11f, 23f)
                verticalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.343f, 17.657f)
                curveTo(5.953f, 17.266f, 5.319f, 17.266f, 4.929f, 17.657f)
                lineTo(3.515f, 19.071f)
                curveTo(3.124f, 19.462f, 3.124f, 20.095f, 3.515f, 20.485f)
                curveTo(3.905f, 20.876f, 4.538f, 20.876f, 4.929f, 20.485f)
                lineTo(6.343f, 19.071f)
                curveTo(6.734f, 18.681f, 6.734f, 18.047f, 6.343f, 17.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21f, 13f)
                curveTo(20.448f, 13f, 20f, 12.552f, 20f, 12f)
                curveTo(20f, 11.448f, 20.448f, 11f, 21f, 11f)
                horizontalLineTo(23f)
                curveTo(23.552f, 11f, 24f, 11.448f, 24f, 12f)
                curveTo(24f, 12.552f, 23.552f, 13f, 23f, 13f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.657f, 17.657f)
                curveTo(17.266f, 18.047f, 17.266f, 18.681f, 17.657f, 19.071f)
                lineTo(19.071f, 20.485f)
                curveTo(19.462f, 20.876f, 20.095f, 20.876f, 20.485f, 20.485f)
                curveTo(20.876f, 20.095f, 20.876f, 19.462f, 20.485f, 19.071f)
                lineTo(19.071f, 17.657f)
                curveTo(18.681f, 17.266f, 18.047f, 17.266f, 17.657f, 17.657f)
                close()
            }
        }.build()

        return _Sun!!
    }

@Suppress("ObjectPropertyName")
private var _Sun: ImageVector? = null
