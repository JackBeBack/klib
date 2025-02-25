package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.524f, 4.464f)
                curveTo(11.674f, 4.003f, 12.326f, 4.003f, 12.476f, 4.464f)
                lineTo(13.908f, 8.873f)
                curveTo(13.975f, 9.079f, 14.167f, 9.219f, 14.384f, 9.219f)
                horizontalLineTo(19.021f)
                curveTo(19.505f, 9.219f, 19.706f, 9.839f, 19.315f, 10.123f)
                lineTo(15.563f, 12.849f)
                curveTo(15.388f, 12.976f, 15.315f, 13.202f, 15.382f, 13.408f)
                lineTo(16.815f, 17.818f)
                curveTo(16.964f, 18.278f, 16.437f, 18.661f, 16.045f, 18.377f)
                lineTo(12.294f, 15.651f)
                curveTo(12.119f, 15.524f, 11.881f, 15.524f, 11.706f, 15.651f)
                lineTo(7.955f, 18.377f)
                curveTo(7.563f, 18.661f, 7.036f, 18.278f, 7.185f, 17.818f)
                lineTo(8.618f, 13.408f)
                curveTo(8.685f, 13.202f, 8.612f, 12.976f, 8.437f, 12.849f)
                lineTo(4.685f, 10.123f)
                curveTo(4.294f, 9.839f, 4.495f, 9.219f, 4.979f, 9.219f)
                horizontalLineTo(9.616f)
                curveTo(9.833f, 9.219f, 10.025f, 9.079f, 10.092f, 8.873f)
                lineTo(11.524f, 4.464f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
