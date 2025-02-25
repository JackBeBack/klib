package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Ruler",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.556f, 1.414f)
                curveTo(16.337f, 0.633f, 17.604f, 0.633f, 18.385f, 1.414f)
                lineTo(22.627f, 5.657f)
                curveTo(23.409f, 6.438f, 23.409f, 7.704f, 22.627f, 8.485f)
                lineTo(8.485f, 22.627f)
                curveTo(7.704f, 23.409f, 6.438f, 23.409f, 5.657f, 22.627f)
                lineTo(1.414f, 18.385f)
                curveTo(0.633f, 17.604f, 0.633f, 16.337f, 1.414f, 15.556f)
                lineTo(15.556f, 1.414f)
                close()
                moveTo(16.263f, 3.536f)
                curveTo(16.654f, 3.145f, 17.287f, 3.145f, 17.678f, 3.536f)
                lineTo(20.506f, 6.364f)
                curveTo(20.897f, 6.754f, 20.897f, 7.388f, 20.506f, 7.778f)
                lineTo(19.799f, 7.071f)
                curveTo(19.409f, 6.681f, 18.775f, 6.681f, 18.385f, 7.071f)
                curveTo(17.994f, 7.462f, 17.994f, 8.095f, 18.385f, 8.485f)
                lineTo(19.092f, 9.192f)
                lineTo(17.678f, 10.607f)
                lineTo(15.556f, 8.485f)
                curveTo(15.166f, 8.095f, 14.533f, 8.095f, 14.142f, 8.485f)
                curveTo(13.752f, 8.876f, 13.752f, 9.509f, 14.142f, 9.899f)
                lineTo(16.263f, 12.021f)
                lineTo(14.849f, 13.435f)
                lineTo(14.142f, 12.728f)
                curveTo(13.752f, 12.337f, 13.118f, 12.337f, 12.728f, 12.728f)
                curveTo(12.337f, 13.118f, 12.337f, 13.752f, 12.728f, 14.142f)
                lineTo(13.435f, 14.849f)
                lineTo(12.021f, 16.264f)
                lineTo(9.899f, 14.142f)
                curveTo(9.509f, 13.752f, 8.876f, 13.752f, 8.485f, 14.142f)
                curveTo(8.095f, 14.533f, 8.095f, 15.166f, 8.485f, 15.556f)
                lineTo(10.607f, 17.678f)
                lineTo(9.192f, 19.092f)
                lineTo(8.485f, 18.385f)
                curveTo(8.095f, 17.994f, 7.462f, 17.994f, 7.071f, 18.385f)
                curveTo(6.681f, 18.775f, 6.681f, 19.409f, 7.071f, 19.799f)
                lineTo(7.778f, 20.506f)
                curveTo(7.388f, 20.897f, 6.754f, 20.897f, 6.364f, 20.506f)
                lineTo(3.536f, 17.678f)
                curveTo(3.145f, 17.287f, 3.145f, 16.654f, 3.536f, 16.264f)
                lineTo(16.263f, 3.536f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
