package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Notebook",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 12f)
                curveTo(6.448f, 12f, 6f, 11.552f, 6f, 11f)
                curveTo(6f, 10.448f, 6.448f, 10f, 7f, 10f)
                horizontalLineTo(17f)
                curveTo(17.552f, 10f, 18f, 10.448f, 18f, 11f)
                curveTo(18f, 11.552f, 17.552f, 12f, 17f, 12f)
                lineTo(7f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6f, 15f)
                curveTo(6f, 15.552f, 6.448f, 16f, 7f, 16f)
                horizontalLineTo(13f)
                curveTo(13.552f, 16f, 14f, 15.552f, 14f, 15f)
                curveTo(14f, 14.448f, 13.552f, 14f, 13f, 14f)
                horizontalLineTo(7f)
                curveTo(6.448f, 14f, 6f, 14.448f, 6f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                curveTo(6.448f, 1f, 6f, 1.448f, 6f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 21.209f, 3.791f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(20.209f, 23f, 22f, 21.209f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                curveTo(18f, 1.448f, 17.552f, 1f, 17f, 1f)
                curveTo(16.448f, 1f, 16f, 1.448f, 16f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                curveTo(13f, 1.448f, 12.552f, 1f, 12f, 1f)
                curveTo(11.448f, 1f, 11f, 1.448f, 11f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveTo(8f, 1.448f, 7.552f, 1f, 7f, 1f)
                close()
                moveTo(16f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                curveTo(13f, 6.552f, 12.552f, 7f, 12f, 7f)
                curveTo(11.448f, 7f, 11f, 6.552f, 11f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                curveTo(8f, 6.552f, 7.552f, 7f, 7f, 7f)
                curveTo(6.448f, 7f, 6f, 6.552f, 6f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                curveTo(4.448f, 5f, 4f, 5.448f, 4f, 6f)
                verticalLineTo(19f)
                curveTo(4f, 20.105f, 4.895f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(19.105f, 21f, 20f, 20.105f, 20f, 19f)
                verticalLineTo(6f)
                curveTo(20f, 5.448f, 19.552f, 5f, 19f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                curveTo(18f, 6.552f, 17.552f, 7f, 17f, 7f)
                curveTo(16.448f, 7f, 16f, 6.552f, 16f, 6f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _Notebook!!
    }

@Suppress("ObjectPropertyName")
private var _Notebook: ImageVector? = null
