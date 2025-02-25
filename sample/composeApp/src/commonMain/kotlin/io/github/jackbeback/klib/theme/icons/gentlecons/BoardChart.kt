package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.BoardChart: ImageVector
    get() {
        if (_BoardChart != null) {
            return _BoardChart!!
        }
        _BoardChart = ImageVector.Builder(
            name = "BoardChart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(17.894f, 5.447f)
                curveTo(18.141f, 4.953f, 17.941f, 4.353f, 17.447f, 4.106f)
                curveTo(16.953f, 3.859f, 16.353f, 4.059f, 16.106f, 4.553f)
                lineTo(13.641f, 9.481f)
                lineTo(11.043f, 7.533f)
                curveTo(10.332f, 6.999f, 9.315f, 7.198f, 8.857f, 7.961f)
                lineTo(6.143f, 12.486f)
                curveTo(5.858f, 12.959f, 6.012f, 13.573f, 6.485f, 13.858f)
                curveTo(6.959f, 14.142f, 7.573f, 13.988f, 7.857f, 13.514f)
                lineTo(10.287f, 9.465f)
                lineTo(12.921f, 11.441f)
                curveTo(13.669f, 12.002f, 14.744f, 11.748f, 15.162f, 10.911f)
                lineTo(17.894f, 5.447f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23f, 4f)
                curveTo(23f, 2.343f, 21.657f, 1f, 20f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(14f)
                curveTo(1f, 15.657f, 2.343f, 17f, 4f, 17f)
                horizontalLineTo(10.438f)
                lineTo(5.36f, 21.232f)
                curveTo(4.936f, 21.585f, 4.878f, 22.216f, 5.232f, 22.64f)
                curveTo(5.585f, 23.065f, 6.216f, 23.122f, 6.64f, 22.768f)
                lineTo(11f, 19.135f)
                verticalLineTo(22f)
                curveTo(11f, 22.552f, 11.448f, 23f, 12f, 23f)
                curveTo(12.552f, 23f, 13f, 22.552f, 13f, 22f)
                verticalLineTo(19.135f)
                lineTo(17.36f, 22.768f)
                curveTo(17.784f, 23.122f, 18.415f, 23.065f, 18.768f, 22.64f)
                curveTo(19.122f, 22.216f, 19.065f, 21.585f, 18.64f, 21.232f)
                lineTo(13.562f, 17f)
                horizontalLineTo(20f)
                curveTo(21.657f, 17f, 23f, 15.657f, 23f, 14f)
                verticalLineTo(4f)
                close()
                moveTo(21f, 4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.448f, 3f, 3f, 3.448f, 3f, 4f)
                verticalLineTo(14f)
                curveTo(3f, 14.552f, 3.448f, 15f, 4f, 15f)
                horizontalLineTo(20f)
                curveTo(20.552f, 15f, 21f, 14.552f, 21f, 14f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _BoardChart!!
    }

@Suppress("ObjectPropertyName")
private var _BoardChart: ImageVector? = null
