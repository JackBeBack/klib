package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Yen: ImageVector
    get() {
        if (_Yen != null) {
            return _Yen!!
        }
        _Yen = ImageVector.Builder(
            name = "Yen",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(5.4f, 2.2f)
                curveTo(5.842f, 1.869f, 6.469f, 1.958f, 6.8f, 2.4f)
                lineTo(12f, 9.333f)
                lineTo(17.2f, 2.4f)
                curveTo(17.531f, 1.958f, 18.158f, 1.869f, 18.6f, 2.2f)
                curveTo(19.042f, 2.531f, 19.131f, 3.158f, 18.8f, 3.6f)
                lineTo(13.25f, 11f)
                horizontalLineTo(17f)
                curveTo(17.552f, 11f, 18f, 11.448f, 18f, 12f)
                curveTo(18f, 12.552f, 17.552f, 13f, 17f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                curveTo(17.552f, 15f, 18f, 15.448f, 18f, 16f)
                curveTo(18f, 16.552f, 17.552f, 17f, 17f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                curveTo(13f, 21.552f, 12.552f, 22f, 12f, 22f)
                curveTo(11.448f, 22f, 11f, 21.552f, 11f, 21f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(6.448f, 17f, 6f, 16.552f, 6f, 16f)
                curveTo(6f, 15.448f, 6.448f, 15f, 7f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
                curveTo(6f, 11.448f, 6.448f, 11f, 7f, 11f)
                horizontalLineTo(10.75f)
                lineTo(5.2f, 3.6f)
                curveTo(4.869f, 3.158f, 4.958f, 2.531f, 5.4f, 2.2f)
                close()
            }
        }.build()

        return _Yen!!
    }

@Suppress("ObjectPropertyName")
private var _Yen: ImageVector? = null
