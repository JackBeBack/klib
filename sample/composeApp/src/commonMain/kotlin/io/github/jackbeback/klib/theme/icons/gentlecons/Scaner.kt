package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Scaner: ImageVector
    get() {
        if (_Scaner != null) {
            return _Scaner!!
        }
        _Scaner = ImageVector.Builder(
            name = "Scaner",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(7f, 18f)
                curveTo(7f, 18.552f, 6.552f, 19f, 6f, 19f)
                curveTo(5.448f, 19f, 5f, 18.552f, 5f, 18f)
                curveTo(5f, 17.448f, 5.448f, 17f, 6f, 17f)
                curveTo(6.552f, 17f, 7f, 17.448f, 7f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.6f, 2.2f)
                curveTo(6.158f, 1.869f, 5.531f, 1.958f, 5.2f, 2.4f)
                curveTo(4.869f, 2.842f, 4.958f, 3.469f, 5.4f, 3.8f)
                lineTo(19f, 14f)
                horizontalLineTo(4f)
                curveTo(2.343f, 14f, 1f, 15.343f, 1f, 17f)
                verticalLineTo(19f)
                curveTo(1f, 20.657f, 2.343f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.657f, 22f, 23f, 20.657f, 23f, 19f)
                verticalLineTo(16f)
                curveTo(23f, 15.056f, 22.56f, 14.17f, 21.805f, 13.604f)
                curveTo(18.401f, 11.051f, 8.759f, 3.82f, 6.6f, 2.2f)
                close()
                moveTo(21f, 17f)
                curveTo(21f, 16.448f, 20.552f, 16f, 20f, 16f)
                horizontalLineTo(4f)
                curveTo(3.448f, 16f, 3f, 16.448f, 3f, 17f)
                verticalLineTo(19f)
                curveTo(3f, 19.552f, 3.448f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.552f, 20f, 21f, 19.552f, 21f, 19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Scaner!!
    }

@Suppress("ObjectPropertyName")
private var _Scaner: ImageVector? = null
