package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Cube: ImageVector
    get() {
        if (_Cube != null) {
            return _Cube!!
        }
        _Cube = ImageVector.Builder(
            name = "Cube",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.514f, 1.126f)
                curveTo(11.816f, 0.958f, 12.184f, 0.958f, 12.486f, 1.126f)
                lineTo(21.485f, 6.125f)
                curveTo(21.492f, 6.129f, 21.5f, 6.134f, 21.507f, 6.138f)
                curveTo(21.813f, 6.318f, 22f, 6.646f, 22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 17.363f, 21.803f, 17.698f, 21.486f, 17.874f)
                lineTo(12.486f, 22.874f)
                curveTo(12.179f, 23.045f, 11.806f, 23.042f, 11.502f, 22.867f)
                lineTo(2.514f, 17.874f)
                curveTo(2.197f, 17.698f, 2f, 17.363f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 6.646f, 2.187f, 6.318f, 2.493f, 6.138f)
                lineTo(2.507f, 6.138f)
                lineTo(2.514f, 6.126f)
                lineTo(11.514f, 1.126f)
                close()
                moveTo(12f, 10.856f)
                lineTo(5.059f, 7f)
                lineTo(12f, 3.144f)
                lineTo(18.941f, 7f)
                lineTo(12f, 10.856f)
                close()
                moveTo(4f, 8.7f)
                verticalLineTo(16.412f)
                lineTo(11f, 20.3f)
                verticalLineTo(12.588f)
                lineTo(4f, 8.7f)
                close()
                moveTo(13f, 12.588f)
                verticalLineTo(20.301f)
                lineTo(20f, 16.412f)
                verticalLineTo(8.7f)
                lineTo(13f, 12.588f)
                close()
            }
        }.build()

        return _Cube!!
    }

@Suppress("ObjectPropertyName")
private var _Cube: ImageVector? = null
