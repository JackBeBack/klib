package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Edit: ImageVector
    get() {
        if (_Edit != null) {
            return _Edit!!
        }
        _Edit = ImageVector.Builder(
            name = "Edit",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.848f, 1.879f)
                curveTo(19.676f, 0.707f, 17.777f, 0.707f, 16.605f, 1.879f)
                lineTo(2.447f, 16.036f)
                curveTo(2.029f, 16.455f, 1.743f, 16.989f, 1.627f, 17.569f)
                lineTo(1.04f, 20.505f)
                curveTo(0.76f, 21.904f, 1.994f, 23.138f, 3.393f, 22.858f)
                lineTo(6.329f, 22.271f)
                curveTo(6.909f, 22.155f, 7.443f, 21.869f, 7.862f, 21.451f)
                lineTo(22.019f, 7.293f)
                curveTo(23.191f, 6.121f, 23.191f, 4.222f, 22.019f, 3.05f)
                lineTo(20.848f, 1.879f)
                close()
                moveTo(18.019f, 3.293f)
                curveTo(18.41f, 2.902f, 19.043f, 2.902f, 19.434f, 3.293f)
                lineTo(20.605f, 4.464f)
                curveTo(20.996f, 4.855f, 20.996f, 5.488f, 20.605f, 5.879f)
                lineTo(17.933f, 8.55f)
                lineTo(15.348f, 5.964f)
                lineTo(18.019f, 3.293f)
                close()
                moveTo(13.933f, 7.379f)
                lineTo(3.862f, 17.451f)
                curveTo(3.722f, 17.59f, 3.627f, 17.768f, 3.588f, 17.962f)
                lineTo(3.001f, 20.897f)
                lineTo(5.936f, 20.31f)
                curveTo(6.13f, 20.271f, 6.308f, 20.176f, 6.447f, 20.036f)
                lineTo(16.519f, 9.964f)
                lineTo(13.933f, 7.379f)
                close()
            }
        }.build()

        return _Edit!!
    }

@Suppress("ObjectPropertyName")
private var _Edit: ImageVector? = null
