package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Dram: ImageVector
    get() {
        if (_Dram != null) {
            return _Dram!!
        }
        _Dram = ImageVector.Builder(
            name = "Dram",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(6.539f, 5.247f)
                curveTo(5.638f, 6.048f, 5f, 7.271f, 5f, 9f)
                curveTo(5f, 9.552f, 4.552f, 10f, 4f, 10f)
                curveTo(3.448f, 10f, 3f, 9.552f, 3f, 9f)
                curveTo(3f, 6.729f, 3.862f, 4.951f, 5.211f, 3.752f)
                curveTo(6.541f, 2.57f, 8.287f, 2f, 10f, 2f)
                curveTo(11.713f, 2f, 13.459f, 2.57f, 14.789f, 3.753f)
                curveTo(16.138f, 4.952f, 17f, 6.729f, 17f, 9f)
                lineTo(17f, 12f)
                horizontalLineTo(20f)
                curveTo(20.552f, 12f, 21f, 12.448f, 21f, 13f)
                curveTo(21f, 13.552f, 20.552f, 14f, 20f, 14f)
                horizontalLineTo(17f)
                lineTo(17f, 16f)
                horizontalLineTo(20f)
                curveTo(20.552f, 16f, 21f, 16.448f, 21f, 17f)
                curveTo(21f, 17.552f, 20.552f, 18f, 20f, 18f)
                horizontalLineTo(17f)
                lineTo(17f, 21f)
                curveTo(17f, 21.552f, 16.552f, 22f, 16f, 22f)
                curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
                lineTo(15f, 18f)
                horizontalLineTo(12f)
                curveTo(11.448f, 18f, 11f, 17.552f, 11f, 17f)
                curveTo(11f, 16.448f, 11.448f, 16f, 12f, 16f)
                horizontalLineTo(15f)
                lineTo(15f, 14f)
                horizontalLineTo(12f)
                curveTo(11.448f, 14f, 11f, 13.552f, 11f, 13f)
                curveTo(11f, 12.448f, 11.448f, 12f, 12f, 12f)
                horizontalLineTo(15f)
                lineTo(15f, 9f)
                curveTo(15f, 7.271f, 14.362f, 6.048f, 13.461f, 5.247f)
                curveTo(12.541f, 4.43f, 11.287f, 4f, 10f, 4f)
                curveTo(8.713f, 4f, 7.459f, 4.43f, 6.539f, 5.247f)
                close()
            }
        }.build()

        return _Dram!!
    }

@Suppress("ObjectPropertyName")
private var _Dram: ImageVector? = null
