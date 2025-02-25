package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Percent: ImageVector
    get() {
        if (_Percent != null) {
            return _Percent!!
        }
        _Percent = ImageVector.Builder(
            name = "Percent",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(21.707f, 3.707f)
                curveTo(22.098f, 3.317f, 22.098f, 2.683f, 21.707f, 2.293f)
                curveTo(21.317f, 1.902f, 20.683f, 1.902f, 20.293f, 2.293f)
                lineTo(2.293f, 20.293f)
                curveTo(1.902f, 20.683f, 1.902f, 21.317f, 2.293f, 21.707f)
                curveTo(2.683f, 22.098f, 3.317f, 22.098f, 3.707f, 21.707f)
                lineTo(21.707f, 3.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 6.5f)
                curveTo(11f, 8.985f, 8.985f, 11f, 6.5f, 11f)
                curveTo(4.015f, 11f, 2f, 8.985f, 2f, 6.5f)
                curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
                curveTo(8.985f, 2f, 11f, 4.015f, 11f, 6.5f)
                close()
                moveTo(4.007f, 6.5f)
                curveTo(4.007f, 7.877f, 5.123f, 8.993f, 6.5f, 8.993f)
                curveTo(7.877f, 8.993f, 8.993f, 7.877f, 8.993f, 6.5f)
                curveTo(8.993f, 5.123f, 7.877f, 4.007f, 6.5f, 4.007f)
                curveTo(5.123f, 4.007f, 4.007f, 5.123f, 4.007f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 17.5f)
                curveTo(22f, 19.985f, 19.985f, 22f, 17.5f, 22f)
                curveTo(15.015f, 22f, 13f, 19.985f, 13f, 17.5f)
                curveTo(13f, 15.015f, 15.015f, 13f, 17.5f, 13f)
                curveTo(19.985f, 13f, 22f, 15.015f, 22f, 17.5f)
                close()
                moveTo(15.007f, 17.5f)
                curveTo(15.007f, 18.877f, 16.123f, 19.993f, 17.5f, 19.993f)
                curveTo(18.877f, 19.993f, 19.993f, 18.877f, 19.993f, 17.5f)
                curveTo(19.993f, 16.123f, 18.877f, 15.007f, 17.5f, 15.007f)
                curveTo(16.123f, 15.007f, 15.007f, 16.123f, 15.007f, 17.5f)
                close()
            }
        }.build()

        return _Percent!!
    }

@Suppress("ObjectPropertyName")
private var _Percent: ImageVector? = null
