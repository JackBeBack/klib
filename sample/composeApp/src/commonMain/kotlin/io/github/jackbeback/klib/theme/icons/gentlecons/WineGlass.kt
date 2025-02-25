package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.WineGlass: ImageVector
    get() {
        if (_WineGlass != null) {
            return _WineGlass!!
        }
        _WineGlass = ImageVector.Builder(
            name = "WineGlass",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.047f, 3.065f)
                curveTo(2.963f, 1.892f, 3.912f, 1f, 5f, 1f)
                horizontalLineTo(19f)
                curveTo(20.088f, 1f, 21.037f, 1.892f, 20.953f, 3.065f)
                curveTo(20.847f, 4.544f, 20.493f, 7.444f, 19.273f, 10.006f)
                curveTo(18.15f, 12.361f, 16.214f, 14.563f, 13f, 14.942f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                curveTo(18.552f, 21f, 19f, 21.448f, 19f, 22f)
                curveTo(19f, 22.552f, 18.552f, 23f, 18f, 23f)
                horizontalLineTo(6f)
                curveTo(5.448f, 23f, 5f, 22.552f, 5f, 22f)
                curveTo(5f, 21.448f, 5.448f, 21f, 6f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(14.942f)
                curveTo(7.786f, 14.563f, 5.85f, 12.361f, 4.727f, 10.006f)
                curveTo(3.506f, 7.444f, 3.153f, 4.544f, 3.047f, 3.065f)
                close()
                moveTo(5.047f, 3f)
                curveTo(5.154f, 4.415f, 5.493f, 6.963f, 6.533f, 9.145f)
                curveTo(7.578f, 11.339f, 9.235f, 13f, 12f, 13f)
                curveTo(14.765f, 13f, 16.422f, 11.339f, 17.467f, 9.145f)
                curveTo(18.507f, 6.963f, 18.846f, 4.415f, 18.953f, 3f)
                horizontalLineTo(5.047f)
                close()
            }
        }.build()

        return _WineGlass!!
    }

@Suppress("ObjectPropertyName")
private var _WineGlass: ImageVector? = null
