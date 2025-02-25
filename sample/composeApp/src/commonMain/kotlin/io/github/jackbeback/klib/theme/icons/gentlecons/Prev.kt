package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Prev: ImageVector
    get() {
        if (_Prev != null) {
            return _Prev!!
        }
        _Prev = ImageVector.Builder(
            name = "Prev",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.396f, 19.769f)
                curveTo(19.054f, 20.269f, 20f, 19.799f, 20f, 18.972f)
                lineTo(20f, 5.028f)
                curveTo(20f, 4.201f, 19.054f, 3.731f, 18.396f, 4.231f)
                lineTo(9.205f, 11.203f)
                curveTo(8.677f, 11.604f, 8.677f, 12.396f, 9.205f, 12.797f)
                lineTo(18.396f, 19.769f)
                close()
                moveTo(22f, 18.972f)
                curveTo(22f, 21.452f, 19.162f, 22.861f, 17.187f, 21.362f)
                lineTo(7.996f, 14.39f)
                curveTo(6.414f, 13.19f, 6.414f, 10.81f, 7.996f, 9.61f)
                lineTo(17.187f, 2.638f)
                curveTo(19.162f, 1.139f, 22f, 2.548f, 22f, 5.028f)
                lineTo(22f, 18.972f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(2f, 3f)
                curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
                curveTo(3.552f, 2f, 4f, 2.448f, 4f, 3f)
                verticalLineTo(21f)
                curveTo(4f, 21.552f, 3.552f, 22f, 3f, 22f)
                curveTo(2.448f, 22f, 2f, 21.552f, 2f, 21f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Prev!!
    }

@Suppress("ObjectPropertyName")
private var _Prev: ImageVector? = null
