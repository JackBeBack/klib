package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.MedicalBottle: ImageVector
    get() {
        if (_MedicalBottle != null) {
            return _MedicalBottle!!
        }
        _MedicalBottle = ImageVector.Builder(
            name = "MedicalBottle",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(12f, 11f)
                curveTo(12.552f, 11f, 13f, 11.448f, 13f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                curveTo(15.552f, 14f, 16f, 14.448f, 16f, 15f)
                curveTo(16f, 15.552f, 15.552f, 16f, 15f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                curveTo(13f, 18.552f, 12.552f, 19f, 12f, 19f)
                curveTo(11.448f, 19f, 11f, 18.552f, 11f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                curveTo(8.448f, 16f, 8f, 15.552f, 8f, 15f)
                curveTo(8f, 14.448f, 8.448f, 14f, 9f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                curveTo(11f, 11.448f, 11.448f, 11f, 12f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                curveTo(6.895f, 1f, 6f, 1.895f, 6f, 3f)
                verticalLineTo(4f)
                curveTo(6f, 5.105f, 6.895f, 6f, 8f, 6f)
                verticalLineTo(8.382f)
                lineTo(5.658f, 9.553f)
                curveTo(4.642f, 10.061f, 4f, 11.1f, 4f, 12.236f)
                verticalLineTo(20f)
                curveTo(4f, 21.657f, 5.343f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(18.657f, 23f, 20f, 21.657f, 20f, 20f)
                verticalLineTo(12.236f)
                curveTo(20f, 11.1f, 19.358f, 10.061f, 18.342f, 9.553f)
                lineTo(16f, 8.382f)
                verticalLineTo(6f)
                curveTo(17.105f, 6f, 18f, 5.105f, 18f, 4f)
                verticalLineTo(3f)
                curveTo(18f, 1.895f, 17.105f, 1f, 16f, 1f)
                horizontalLineTo(8f)
                close()
                moveTo(14f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(8.382f)
                curveTo(10f, 9.14f, 9.572f, 9.832f, 8.894f, 10.171f)
                lineTo(6.553f, 11.342f)
                curveTo(6.214f, 11.511f, 6f, 11.857f, 6f, 12.236f)
                verticalLineTo(20f)
                curveTo(6f, 20.552f, 6.448f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(17.552f, 21f, 18f, 20.552f, 18f, 20f)
                verticalLineTo(12.236f)
                curveTo(18f, 11.857f, 17.786f, 11.511f, 17.447f, 11.342f)
                lineTo(15.106f, 10.171f)
                curveTo(14.428f, 9.832f, 14f, 9.14f, 14f, 8.382f)
                verticalLineTo(6f)
                close()
                moveTo(8f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MedicalBottle!!
    }

@Suppress("ObjectPropertyName")
private var _MedicalBottle: ImageVector? = null
