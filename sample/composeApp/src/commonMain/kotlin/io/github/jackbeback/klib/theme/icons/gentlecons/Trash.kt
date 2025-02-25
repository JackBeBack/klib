package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Trash: ImageVector
    get() {
        if (_Trash != null) {
            return _Trash!!
        }
        _Trash = ImageVector.Builder(
            name = "Trash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(9f, 11f)
                curveTo(9f, 10.448f, 9.448f, 10f, 10f, 10f)
                curveTo(10.552f, 10f, 11f, 10.448f, 11f, 11f)
                verticalLineTo(17f)
                curveTo(11f, 17.552f, 10.552f, 18f, 10f, 18f)
                curveTo(9.448f, 18f, 9f, 17.552f, 9f, 17f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(14f, 10f)
                curveTo(13.448f, 10f, 13f, 10.448f, 13f, 11f)
                verticalLineTo(17f)
                curveTo(13f, 17.552f, 13.448f, 18f, 14f, 18f)
                curveTo(14.552f, 18f, 15f, 17.552f, 15f, 17f)
                verticalLineTo(11f)
                curveTo(15f, 10.448f, 14.552f, 10f, 14f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.531f, 1f)
                curveTo(5.524f, 1f, 3.197f, 3.636f, 3.57f, 6.62f)
                lineTo(5.289f, 20.372f)
                curveTo(5.476f, 21.873f, 6.753f, 23f, 8.266f, 23f)
                horizontalLineTo(15.734f)
                curveTo(17.247f, 23f, 18.524f, 21.873f, 18.711f, 20.372f)
                lineTo(20.43f, 6.62f)
                curveTo(20.803f, 3.636f, 18.476f, 1f, 15.469f, 1f)
                horizontalLineTo(8.531f)
                close()
                moveTo(5.701f, 5f)
                curveTo(6.111f, 3.845f, 7.212f, 3f, 8.531f, 3f)
                horizontalLineTo(15.469f)
                curveTo(16.788f, 3f, 17.889f, 3.845f, 18.299f, 5f)
                horizontalLineTo(5.701f)
                close()
                moveTo(5.633f, 7f)
                lineTo(7.273f, 20.124f)
                curveTo(7.336f, 20.625f, 7.761f, 21f, 8.266f, 21f)
                horizontalLineTo(15.734f)
                curveTo(16.239f, 21f, 16.664f, 20.625f, 16.727f, 20.124f)
                lineTo(18.367f, 7f)
                horizontalLineTo(5.633f)
                close()
            }
        }.build()

        return _Trash!!
    }

@Suppress("ObjectPropertyName")
private var _Trash: ImageVector? = null
