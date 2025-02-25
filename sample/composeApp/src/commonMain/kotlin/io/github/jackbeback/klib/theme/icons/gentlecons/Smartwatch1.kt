package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Smartwatch1: ImageVector
    get() {
        if (_Smartwatch1 != null) {
            return _Smartwatch1!!
        }
        _Smartwatch1 = ImageVector.Builder(
            name = "Smartwatch1",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(11.962f, 8.225f)
                curveTo(11.851f, 7.838f, 11.519f, 7.556f, 11.12f, 7.507f)
                curveTo(10.721f, 7.459f, 10.331f, 7.655f, 10.132f, 8.004f)
                lineTo(8.42f, 11f)
                horizontalLineTo(8f)
                curveTo(7.448f, 11f, 7f, 11.448f, 7f, 12f)
                curveTo(7f, 12.552f, 7.448f, 13f, 8f, 13f)
                horizontalLineTo(9f)
                curveTo(9.359f, 13f, 9.69f, 12.808f, 9.868f, 12.496f)
                lineTo(10.691f, 11.057f)
                lineTo(12.038f, 15.775f)
                curveTo(12.144f, 16.144f, 12.451f, 16.42f, 12.83f, 16.485f)
                curveTo(13.208f, 16.551f, 13.591f, 16.394f, 13.814f, 16.081f)
                lineTo(16.015f, 13f)
                curveTo(16.56f, 12.992f, 17f, 12.547f, 17f, 12f)
                curveTo(17f, 11.448f, 16.552f, 11f, 16f, 11f)
                horizontalLineTo(15.5f)
                curveTo(15.177f, 11f, 14.874f, 11.156f, 14.686f, 11.419f)
                lineTo(13.392f, 13.231f)
                lineTo(11.962f, 8.225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 3f)
                verticalLineTo(4f)
                curveTo(5.343f, 4f, 4f, 5.343f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 18.657f, 5.343f, 20f, 7f, 20f)
                lineTo(7f, 21f)
                curveTo(7f, 22.657f, 8.343f, 24f, 10f, 24f)
                horizontalLineTo(14f)
                curveTo(15.657f, 24f, 17f, 22.657f, 17f, 21f)
                verticalLineTo(20f)
                curveTo(18.657f, 20f, 20f, 18.657f, 20f, 17f)
                verticalLineTo(13f)
                curveTo(20.552f, 13f, 21f, 12.552f, 21f, 12f)
                curveTo(21f, 11.448f, 20.552f, 11f, 20f, 11f)
                verticalLineTo(7f)
                curveTo(20f, 5.343f, 18.657f, 4f, 17f, 4f)
                verticalLineTo(3f)
                curveTo(17f, 1.343f, 15.657f, 0f, 14f, 0f)
                horizontalLineTo(10f)
                curveTo(8.343f, 0f, 7f, 1.343f, 7f, 3f)
                close()
                moveTo(10f, 2f)
                curveTo(9.448f, 2f, 9f, 2.448f, 9f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 14.552f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                close()
                moveTo(7f, 18f)
                curveTo(6.448f, 18f, 6f, 17.552f, 6f, 17f)
                verticalLineTo(7f)
                curveTo(6f, 6.448f, 6.448f, 6f, 7f, 6f)
                horizontalLineTo(17f)
                curveTo(17.552f, 6f, 18f, 6.448f, 18f, 7f)
                verticalLineTo(17f)
                curveTo(18f, 17.552f, 17.552f, 18f, 17f, 18f)
                horizontalLineTo(7f)
                close()
                moveTo(9f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 21.552f, 14.552f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.448f, 22f, 9f, 21.552f, 9f, 21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _Smartwatch1!!
    }

@Suppress("ObjectPropertyName")
private var _Smartwatch1: ImageVector? = null
