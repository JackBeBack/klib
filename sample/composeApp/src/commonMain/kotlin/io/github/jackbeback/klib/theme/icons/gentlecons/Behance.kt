package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Behance: ImageVector
    get() {
        if (_Behance != null) {
            return _Behance!!
        }
        _Behance = ImageVector.Builder(
            name = "Behance",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.5f, 19f)
                curveTo(1.672f, 19f, 1f, 18.328f, 1f, 17.5f)
                verticalLineTo(6.5f)
                curveTo(1f, 5.672f, 1.672f, 5f, 2.5f, 5f)
                horizontalLineTo(8f)
                curveTo(13f, 5f, 13f, 11.5f, 10f, 11.5f)
                curveTo(13f, 11.5f, 14f, 19f, 8f, 19f)
                horizontalLineTo(2.5f)
                close()
                moveTo(4.5f, 11f)
                curveTo(4.224f, 11f, 4f, 10.776f, 4f, 10.5f)
                verticalLineTo(7.5f)
                curveTo(4f, 7.224f, 4.224f, 7f, 4.5f, 7f)
                horizontalLineTo(7f)
                curveTo(7f, 7f, 9f, 7f, 9f, 9f)
                curveTo(9f, 11f, 7f, 11f, 7f, 11f)
                horizontalLineTo(4.5f)
                close()
                moveTo(4.5f, 13f)
                curveTo(4.224f, 13f, 4f, 13.224f, 4f, 13.5f)
                verticalLineTo(16.5f)
                curveTo(4f, 16.776f, 4.224f, 17f, 4.5f, 17f)
                horizontalLineTo(8f)
                curveTo(8f, 17f, 9.5f, 17f, 9.5f, 15f)
                curveTo(9.5f, 13f, 8f, 13f, 8f, 13f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.499f, 14.003f)
                curveTo(22.328f, 14.003f, 23.021f, 13.32f, 22.852f, 12.509f)
                curveTo(21.607f, 6.529f, 12.913f, 7.081f, 13f, 14.003f)
                curveTo(13.066f, 19.276f, 20.434f, 20.967f, 22.604f, 16.19f)
                curveTo(22.948f, 15.431f, 22.175f, 15f, 21.537f, 15f)
                curveTo(20.971f, 15f, 20.531f, 15.522f, 20.169f, 15.958f)
                curveTo(19.127f, 17.213f, 15.963f, 17.122f, 15.545f, 14.514f)
                curveTo(15.5f, 14.238f, 15.73f, 14.003f, 16.011f, 14.003f)
                horizontalLineTo(21.499f)
                close()
                moveTo(15.818f, 12f)
                curveTo(15.671f, 12f, 15.576f, 11.845f, 15.655f, 11.721f)
                curveTo(16.714f, 10.042f, 19.261f, 10.061f, 20.34f, 11.719f)
                curveTo(20.421f, 11.843f, 20.326f, 12f, 20.177f, 12f)
                horizontalLineTo(15.818f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(16f, 6f)
                curveTo(15.448f, 6f, 15f, 6.448f, 15f, 7f)
                curveTo(15f, 7.552f, 15.448f, 8f, 16f, 8f)
                horizontalLineTo(20f)
                curveTo(20.552f, 8f, 21f, 7.552f, 21f, 7f)
                curveTo(21f, 6.448f, 20.552f, 6f, 20f, 6f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Behance!!
    }

@Suppress("ObjectPropertyName")
private var _Behance: ImageVector? = null
