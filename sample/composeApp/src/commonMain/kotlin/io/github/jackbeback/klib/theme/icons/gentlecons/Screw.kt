package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Screw: ImageVector
    get() {
        if (_Screw != null) {
            return _Screw!!
        }
        _Screw = ImageVector.Builder(
            name = "Screw",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.617f, 1.076f)
                curveTo(12.991f, 0.921f, 13.421f, 1.007f, 13.707f, 1.293f)
                lineTo(22.707f, 10.293f)
                curveTo(22.993f, 10.579f, 23.079f, 11.009f, 22.924f, 11.383f)
                curveTo(22.769f, 11.756f, 22.404f, 12f, 22f, 12f)
                horizontalLineTo(17.414f)
                lineTo(7f, 22.414f)
                curveTo(6.625f, 22.789f, 6.116f, 23f, 5.586f, 23f)
                horizontalLineTo(3f)
                curveTo(1.895f, 23f, 1f, 22.105f, 1f, 21f)
                verticalLineTo(18.414f)
                curveTo(1f, 17.884f, 1.211f, 17.375f, 1.586f, 17f)
                curveTo(5.057f, 13.529f, 8.529f, 10.057f, 12f, 6.586f)
                verticalLineTo(2f)
                curveTo(12f, 1.596f, 12.244f, 1.231f, 12.617f, 1.076f)
                close()
                moveTo(10.5f, 10.914f)
                lineTo(9.414f, 12f)
                lineTo(12f, 14.586f)
                lineTo(13.086f, 13.5f)
                lineTo(10.5f, 10.914f)
                close()
                moveTo(14.5f, 12.086f)
                lineTo(11.914f, 9.5f)
                lineTo(13f, 8.414f)
                lineTo(15.586f, 11f)
                lineTo(14.5f, 12.086f)
                close()
                moveTo(10.586f, 16f)
                lineTo(8f, 13.414f)
                lineTo(6.914f, 14.5f)
                lineTo(9.5f, 17.086f)
                lineTo(10.586f, 16f)
                close()
                moveTo(8.086f, 18.5f)
                lineTo(5.5f, 15.914f)
                lineTo(4.414f, 17f)
                lineTo(7f, 19.586f)
                lineTo(8.086f, 18.5f)
                close()
                moveTo(5.586f, 21f)
                lineTo(3f, 18.414f)
                verticalLineTo(21f)
                horizontalLineTo(5.586f)
                close()
                moveTo(14f, 4.414f)
                verticalLineTo(6.586f)
                lineTo(17.414f, 10f)
                horizontalLineTo(19.586f)
                lineTo(14f, 4.414f)
                close()
            }
        }.build()

        return _Screw!!
    }

@Suppress("ObjectPropertyName")
private var _Screw: ImageVector? = null
