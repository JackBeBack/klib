package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Male: ImageVector
    get() {
        if (_Male != null) {
            return _Male!!
        }
        _Male = ImageVector.Builder(
            name = "Male",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 3f)
                curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
                horizontalLineTo(20f)
                curveTo(21.105f, 2f, 22f, 2.895f, 22f, 4f)
                verticalLineTo(8f)
                curveTo(22f, 8.552f, 21.552f, 9f, 21f, 9f)
                curveTo(20.448f, 9f, 20f, 8.552f, 20f, 8f)
                verticalLineTo(5.413f)
                lineTo(15.467f, 9.946f)
                curveTo(15.417f, 9.996f, 15.363f, 10.039f, 15.306f, 10.077f)
                curveTo(16.367f, 11.434f, 17f, 13.143f, 17f, 15f)
                curveTo(17f, 19.418f, 13.418f, 23f, 9f, 23f)
                curveTo(4.582f, 23f, 1f, 19.418f, 1f, 15f)
                curveTo(1f, 10.582f, 4.582f, 7f, 9f, 7f)
                curveTo(10.856f, 7f, 12.564f, 7.632f, 13.921f, 8.692f)
                curveTo(13.959f, 8.635f, 14.002f, 8.581f, 14.052f, 8.531f)
                lineTo(18.584f, 4f)
                horizontalLineTo(16f)
                curveTo(15.448f, 4f, 15f, 3.552f, 15f, 3f)
                close()
                moveTo(9f, 20.996f)
                curveTo(5.688f, 20.996f, 3.004f, 18.312f, 3.004f, 15f)
                curveTo(3.004f, 11.688f, 5.688f, 9.004f, 9f, 9.004f)
                curveTo(12.312f, 9.004f, 14.996f, 11.688f, 14.996f, 15f)
                curveTo(14.996f, 18.312f, 12.312f, 20.996f, 9f, 20.996f)
                close()
            }
        }.build()

        return _Male!!
    }

@Suppress("ObjectPropertyName")
private var _Male: ImageVector? = null
