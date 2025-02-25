package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.GoogleDrive: ImageVector
    get() {
        if (_GoogleDrive != null) {
            return _GoogleDrive!!
        }
        _GoogleDrive = ImageVector.Builder(
            name = "GoogleDrive",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.574f, 2f)
                curveTo(7.863f, 2f, 7.205f, 2.378f, 6.847f, 2.992f)
                lineTo(0.451f, 13.957f)
                curveTo(0.066f, 14.617f, 0.09f, 15.438f, 0.514f, 16.074f)
                lineTo(3.871f, 21.109f)
                curveTo(4.242f, 21.666f, 4.866f, 22f, 5.535f, 22f)
                horizontalLineTo(18.465f)
                curveTo(19.133f, 22f, 19.758f, 21.666f, 20.129f, 21.109f)
                lineTo(23.486f, 16.074f)
                curveTo(23.91f, 15.438f, 23.934f, 14.617f, 23.549f, 13.957f)
                lineTo(17.153f, 2.992f)
                curveTo(16.795f, 2.378f, 16.137f, 2f, 15.426f, 2f)
                horizontalLineTo(8.574f)
                close()
                moveTo(9.804f, 4f)
                horizontalLineTo(15.426f)
                lineTo(21.259f, 14f)
                horizontalLineTo(16.054f)
                lineTo(9.804f, 4f)
                close()
                moveTo(13.696f, 14f)
                lineTo(11.909f, 11.141f)
                lineTo(10.241f, 14f)
                horizontalLineTo(13.696f)
                close()
                moveTo(9.074f, 16f)
                lineTo(6.741f, 20f)
                horizontalLineTo(18.465f)
                lineTo(21.132f, 16f)
                horizontalLineTo(9.074f)
                close()
                moveTo(10.711f, 9.225f)
                lineTo(4.943f, 19.112f)
                lineTo(2.178f, 14.965f)
                lineTo(8.03f, 4.934f)
                lineTo(10.711f, 9.225f)
                close()
            }
        }.build()

        return _GoogleDrive!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleDrive: ImageVector? = null
