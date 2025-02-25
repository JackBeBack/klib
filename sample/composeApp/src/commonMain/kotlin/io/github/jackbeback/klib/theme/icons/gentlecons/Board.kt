package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Board: ImageVector
    get() {
        if (_Board != null) {
            return _Board!!
        }
        _Board = ImageVector.Builder(
            name = "Board",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 1f)
                curveTo(21.657f, 1f, 23f, 2.343f, 23f, 4f)
                verticalLineTo(14f)
                curveTo(23f, 15.657f, 21.657f, 17f, 20f, 17f)
                horizontalLineTo(13.562f)
                lineTo(18.64f, 21.232f)
                curveTo(19.065f, 21.585f, 19.122f, 22.216f, 18.768f, 22.64f)
                curveTo(18.415f, 23.065f, 17.784f, 23.122f, 17.36f, 22.768f)
                lineTo(13f, 19.135f)
                verticalLineTo(22f)
                curveTo(13f, 22.552f, 12.552f, 23f, 12f, 23f)
                curveTo(11.448f, 23f, 11f, 22.552f, 11f, 22f)
                verticalLineTo(19.135f)
                lineTo(6.64f, 22.768f)
                curveTo(6.216f, 23.122f, 5.585f, 23.065f, 5.232f, 22.64f)
                curveTo(4.878f, 22.216f, 4.936f, 21.585f, 5.36f, 21.232f)
                lineTo(10.438f, 17f)
                horizontalLineTo(4f)
                curveTo(2.343f, 17f, 1f, 15.657f, 1f, 14f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 3f)
                curveTo(20.552f, 3f, 21f, 3.448f, 21f, 4f)
                verticalLineTo(14f)
                curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
                horizontalLineTo(4f)
                curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
                verticalLineTo(4f)
                curveTo(3f, 3.448f, 3.448f, 3f, 4f, 3f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Board!!
    }

@Suppress("ObjectPropertyName")
private var _Board: ImageVector? = null
