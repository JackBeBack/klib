package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Moon",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.397f, 11.632f)
                curveTo(3.397f, 16.602f, 7.426f, 20.632f, 12.397f, 20.632f)
                curveTo(15.686f, 20.632f, 18.566f, 18.866f, 20.136f, 16.23f)
                curveTo(16.729f, 17.329f, 12.692f, 16.755f, 9.983f, 14.045f)
                curveTo(7.252f, 11.315f, 6.726f, 7.284f, 7.867f, 3.893f)
                curveTo(5.207f, 5.479f, 3.397f, 8.389f, 3.397f, 11.632f)
                close()
                moveTo(21.187f, 13.585f)
                curveTo(22.013f, 13.102f, 23.255f, 13.649f, 23f, 14.571f)
                curveTo(21.714f, 19.219f, 17.454f, 22.632f, 12.397f, 22.632f)
                curveTo(6.322f, 22.632f, 1.397f, 17.707f, 1.397f, 11.632f)
                curveTo(1.397f, 6.589f, 4.935f, 2.258f, 9.615f, 1f)
                curveTo(10.539f, 0.752f, 11.064f, 1.994f, 10.564f, 2.809f)
                curveTo(8.7f, 5.847f, 8.832f, 10.066f, 11.397f, 12.631f)
                curveTo(13.932f, 15.166f, 18.136f, 15.37f, 21.187f, 13.585f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
