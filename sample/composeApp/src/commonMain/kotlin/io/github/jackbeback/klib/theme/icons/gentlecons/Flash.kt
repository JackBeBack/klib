package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Flash: ImageVector
    get() {
        if (_Flash != null) {
            return _Flash!!
        }
        _Flash = ImageVector.Builder(
            name = "Flash",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.665f, 2.742f)
                curveTo(5.995f, 1.705f, 6.959f, 1f, 8.047f, 1f)
                horizontalLineTo(13.176f)
                curveTo(14.97f, 1f, 16.181f, 2.835f, 15.474f, 4.485f)
                lineTo(13.967f, 8f)
                horizontalLineTo(18.24f)
                curveTo(20.488f, 8f, 21.594f, 10.735f, 19.978f, 12.297f)
                lineTo(9.431f, 22.493f)
                curveTo(8.253f, 23.631f, 6.364f, 22.329f, 7.009f, 20.824f)
                lineTo(9.934f, 14f)
                horizontalLineTo(5.502f)
                curveTo(3.81f, 14f, 2.606f, 12.354f, 3.119f, 10.742f)
                lineTo(5.665f, 2.742f)
                close()
                moveTo(8.047f, 3f)
                curveTo(7.83f, 3f, 7.637f, 3.141f, 7.571f, 3.348f)
                lineTo(5.025f, 11.348f)
                curveTo(4.923f, 11.671f, 5.163f, 12f, 5.502f, 12f)
                horizontalLineTo(11.147f)
                curveTo(12.009f, 12f, 12.589f, 12.881f, 12.25f, 13.673f)
                lineTo(9.826f, 19.33f)
                lineTo(18.588f, 10.859f)
                curveTo(18.911f, 10.547f, 18.69f, 10f, 18.24f, 10f)
                horizontalLineTo(12.754f)
                curveTo(11.892f, 10f, 11.311f, 9.119f, 11.651f, 8.327f)
                lineTo(13.635f, 3.697f)
                curveTo(13.777f, 3.367f, 13.535f, 3f, 13.176f, 3f)
                horizontalLineTo(8.047f)
                close()
            }
        }.build()

        return _Flash!!
    }

@Suppress("ObjectPropertyName")
private var _Flash: ImageVector? = null
