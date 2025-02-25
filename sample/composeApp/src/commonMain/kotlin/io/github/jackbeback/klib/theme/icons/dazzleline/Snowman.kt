package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Snowman: ImageVector
    get() {
        if (_Snowman != null) {
            return _Snowman!!
        }
        _Snowman = ImageVector.Builder(
            name = "Snowman",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 8f)
                lineTo(19.806f, 10.388f)
                curveTo(19.312f, 11.376f, 18.302f, 12f, 17.197f, 12f)
                moveTo(3.197f, 8f)
                lineTo(4.391f, 10.388f)
                curveTo(4.856f, 11.318f, 5.778f, 11.925f, 6.806f, 11.994f)
                moveTo(9.094f, 9.749f)
                curveTo(9.824f, 10.519f, 10.856f, 11f, 12f, 11f)
                curveTo(13.144f, 11f, 14.176f, 10.519f, 14.906f, 9.749f)
                moveTo(9.094f, 9.749f)
                curveTo(8.416f, 9.032f, 8f, 8.065f, 8f, 7f)
                curveTo(8f, 4.791f, 9.791f, 3f, 12f, 3f)
                curveTo(14.209f, 3f, 16f, 4.791f, 16f, 7f)
                curveTo(16f, 8.065f, 15.584f, 9.032f, 14.906f, 9.749f)
                moveTo(9.094f, 9.749f)
                curveTo(8.144f, 10.276f, 7.351f, 11.054f, 6.806f, 11.994f)
                moveTo(14.906f, 9.749f)
                curveTo(16.751f, 10.773f, 18f, 12.74f, 18f, 15f)
                curveTo(18f, 18.314f, 15.314f, 21f, 12f, 21f)
                curveTo(8.686f, 21f, 6f, 18.314f, 6f, 15f)
                curveTo(6f, 13.905f, 6.294f, 12.878f, 6.806f, 11.994f)
                moveTo(12f, 14f)
                horizontalLineTo(12.01f)
                moveTo(12f, 17f)
                horizontalLineTo(12.01f)
            }
        }.build()

        return _Snowman!!
    }

@Suppress("ObjectPropertyName")
private var _Snowman: ImageVector? = null
