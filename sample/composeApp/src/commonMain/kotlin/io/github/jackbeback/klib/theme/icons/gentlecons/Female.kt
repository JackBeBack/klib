package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Female: ImageVector
    get() {
        if (_Female != null) {
            return _Female!!
        }
        _Female = ImageVector.Builder(
            name = "Female",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 9f)
                curveTo(20f, 13.08f, 16.945f, 16.447f, 12.998f, 16.938f)
                curveTo(12.999f, 16.959f, 13f, 16.979f, 13f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(14.552f, 19f, 15f, 19.448f, 15f, 20f)
                curveTo(15f, 20.552f, 14.552f, 21f, 14f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                curveTo(9.448f, 21f, 9f, 20.552f, 9f, 20f)
                curveTo(9f, 19.448f, 9.448f, 19f, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                curveTo(11f, 16.979f, 11.001f, 16.959f, 11.002f, 16.938f)
                curveTo(7.055f, 16.447f, 4f, 13.08f, 4f, 9f)
                curveTo(4f, 4.582f, 7.582f, 1f, 12f, 1f)
                curveTo(16.418f, 1f, 20f, 4.582f, 20f, 9f)
                close()
                moveTo(6.004f, 9f)
                curveTo(6.004f, 12.312f, 8.688f, 14.996f, 12f, 14.996f)
                curveTo(15.312f, 14.996f, 17.996f, 12.312f, 17.996f, 9f)
                curveTo(17.996f, 5.688f, 15.312f, 3.004f, 12f, 3.004f)
                curveTo(8.688f, 3.004f, 6.004f, 5.688f, 6.004f, 9f)
                close()
            }
        }.build()

        return _Female!!
    }

@Suppress("ObjectPropertyName")
private var _Female: ImageVector? = null
