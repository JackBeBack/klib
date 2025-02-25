package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Shop: ImageVector
    get() {
        if (_Shop != null) {
            return _Shop!!
        }
        _Shop = ImageVector.Builder(
            name = "Shop",
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
                moveTo(15f, 14f)
                verticalLineTo(17.6f)
                curveTo(15f, 18.44f, 15f, 18.86f, 14.837f, 19.181f)
                curveTo(14.693f, 19.463f, 14.463f, 19.693f, 14.181f, 19.837f)
                curveTo(13.86f, 20f, 13.44f, 20f, 12.6f, 20f)
                horizontalLineTo(7.4f)
                curveTo(6.56f, 20f, 6.14f, 20f, 5.819f, 19.837f)
                curveTo(5.537f, 19.693f, 5.307f, 19.463f, 5.163f, 19.181f)
                curveTo(5f, 18.86f, 5f, 18.44f, 5f, 17.6f)
                verticalLineTo(10f)
                moveTo(19f, 10f)
                verticalLineTo(20f)
                moveTo(5f, 16f)
                horizontalLineTo(15f)
                moveTo(5.558f, 4.884f)
                lineTo(3.579f, 8.842f)
                curveTo(3.387f, 9.226f, 3.291f, 9.417f, 3.314f, 9.573f)
                curveTo(3.335f, 9.709f, 3.41f, 9.831f, 3.522f, 9.91f)
                curveTo(3.652f, 10f, 3.866f, 10f, 4.294f, 10f)
                horizontalLineTo(19.706f)
                curveTo(20.134f, 10f, 20.348f, 10f, 20.478f, 9.91f)
                curveTo(20.59f, 9.831f, 20.666f, 9.709f, 20.686f, 9.573f)
                curveTo(20.709f, 9.417f, 20.613f, 9.226f, 20.421f, 8.842f)
                lineTo(18.442f, 4.884f)
                curveTo(18.282f, 4.563f, 18.201f, 4.403f, 18.082f, 4.286f)
                curveTo(17.976f, 4.182f, 17.848f, 4.103f, 17.708f, 4.055f)
                curveTo(17.55f, 4f, 17.37f, 4f, 17.011f, 4f)
                horizontalLineTo(6.989f)
                curveTo(6.63f, 4f, 6.45f, 4f, 6.292f, 4.055f)
                curveTo(6.152f, 4.103f, 6.024f, 4.182f, 5.918f, 4.286f)
                curveTo(5.799f, 4.403f, 5.718f, 4.563f, 5.558f, 4.884f)
                close()
            }
        }.build()

        return _Shop!!
    }

@Suppress("ObjectPropertyName")
private var _Shop: ImageVector? = null
