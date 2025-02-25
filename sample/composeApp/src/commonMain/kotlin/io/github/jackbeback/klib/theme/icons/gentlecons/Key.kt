package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Key: ImageVector
    get() {
        if (_Key != null) {
            return _Key!!
        }
        _Key = ImageVector.Builder(
            name = "Key",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.677f, 1.337f)
                curveTo(22.287f, 0.947f, 21.654f, 0.947f, 21.264f, 1.337f)
                lineTo(9.748f, 12.853f)
                curveTo(9.707f, 12.894f, 9.671f, 12.937f, 9.638f, 12.983f)
                curveTo(8.748f, 12.363f, 7.667f, 12f, 6.5f, 12f)
                curveTo(3.462f, 12f, 1f, 14.462f, 1f, 17.5f)
                curveTo(1f, 20.538f, 3.462f, 23f, 6.5f, 23f)
                curveTo(9.538f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 16.34f, 11.641f, 15.264f, 11.028f, 14.377f)
                curveTo(11.075f, 14.345f, 11.119f, 14.307f, 11.161f, 14.266f)
                lineTo(16.506f, 8.921f)
                lineTo(19.31f, 11.724f)
                curveTo(19.7f, 12.114f, 20.333f, 12.114f, 20.724f, 11.724f)
                curveTo(21.114f, 11.333f, 21.114f, 10.7f, 20.724f, 10.31f)
                lineTo(17.92f, 7.506f)
                lineTo(19.506f, 5.921f)
                lineTo(20.776f, 7.191f)
                curveTo(21.167f, 7.581f, 21.8f, 7.581f, 22.191f, 7.191f)
                curveTo(22.581f, 6.8f, 22.581f, 6.167f, 22.191f, 5.776f)
                lineTo(20.92f, 4.506f)
                lineTo(22.677f, 2.75f)
                curveTo(23.067f, 2.36f, 23.067f, 1.727f, 22.677f, 1.337f)
                close()
                moveTo(6.5f, 20.979f)
                curveTo(4.579f, 20.979f, 3.021f, 19.421f, 3.021f, 17.5f)
                curveTo(3.021f, 15.578f, 4.579f, 14.021f, 6.5f, 14.021f)
                curveTo(8.421f, 14.021f, 9.979f, 15.578f, 9.979f, 17.5f)
                curveTo(9.979f, 19.421f, 8.421f, 20.979f, 6.5f, 20.979f)
                close()
            }
        }.build()

        return _Key!!
    }

@Suppress("ObjectPropertyName")
private var _Key: ImageVector? = null
