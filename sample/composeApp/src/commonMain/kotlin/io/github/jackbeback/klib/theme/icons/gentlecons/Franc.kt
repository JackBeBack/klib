package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Franc: ImageVector
    get() {
        if (_Franc != null) {
            return _Franc!!
        }
        _Franc = ImageVector.Builder(
            name = "Franc",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 3f)
                curveTo(20f, 2.448f, 19.552f, 2f, 19f, 2f)
                lineTo(8f, 2f)
                curveTo(6.343f, 2f, 5f, 3.343f, 5f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveTo(2.448f, 14f, 2f, 14.448f, 2f, 15f)
                curveTo(2f, 15.552f, 2.448f, 16f, 3f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                curveTo(5f, 21.552f, 5.448f, 22f, 6f, 22f)
                curveTo(6.552f, 22f, 7f, 21.552f, 7f, 21f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                curveTo(11.552f, 16f, 12f, 15.552f, 12f, 15f)
                curveTo(12f, 14.448f, 11.552f, 14f, 11f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                curveTo(17.552f, 11f, 18f, 10.552f, 18f, 10f)
                curveTo(18f, 9.448f, 17.552f, 9f, 17f, 9f)
                lineTo(7f, 9f)
                verticalLineTo(5f)
                curveTo(7f, 4.448f, 7.448f, 4f, 8f, 4f)
                lineTo(19f, 4f)
                curveTo(19.552f, 4f, 20f, 3.552f, 20f, 3f)
                close()
            }
        }.build()

        return _Franc!!
    }

@Suppress("ObjectPropertyName")
private var _Franc: ImageVector? = null
