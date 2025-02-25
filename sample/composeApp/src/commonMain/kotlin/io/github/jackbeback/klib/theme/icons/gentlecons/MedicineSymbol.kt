package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MedicineSymbol: ImageVector
    get() {
        if (_MedicineSymbol != null) {
            return _MedicineSymbol!!
        }
        _MedicineSymbol = ImageVector.Builder(
            name = "MedicineSymbol",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 5f)
                curveTo(9.895f, 5f, 9f, 5.895f, 9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                curveTo(5.895f, 9f, 5f, 9.895f, 5f, 11f)
                verticalLineTo(13f)
                curveTo(5f, 14.105f, 5.895f, 15f, 7f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                curveTo(9f, 18.105f, 9.895f, 19f, 11f, 19f)
                horizontalLineTo(13f)
                curveTo(14.105f, 19f, 15f, 18.105f, 15f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                curveTo(18.105f, 15f, 19f, 14.105f, 19f, 13f)
                verticalLineTo(11f)
                curveTo(19f, 9.895f, 18.105f, 9f, 17f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                curveTo(15f, 5.895f, 14.105f, 5f, 13f, 5f)
                horizontalLineTo(11f)
                close()
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9.5f)
                curveTo(13f, 10.328f, 13.672f, 11f, 14.5f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(14.5f)
                curveTo(13.672f, 13f, 13f, 13.672f, 13f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(14.5f)
                curveTo(11f, 13.672f, 10.328f, 13f, 9.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9.5f)
                curveTo(10.328f, 11f, 11f, 10.328f, 11f, 9.5f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(20f)
                curveTo(23f, 21.657f, 21.657f, 23f, 20f, 23f)
                horizontalLineTo(4f)
                curveTo(2.343f, 23f, 1f, 21.657f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 3f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 20.552f, 20.552f, 21f, 20f, 21f)
                horizontalLineTo(4f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _MedicineSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _MedicineSymbol: ImageVector? = null
