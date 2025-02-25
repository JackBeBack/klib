package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.School: ImageVector
    get() {
        if (_School != null) {
            return _School!!
        }
        _School = ImageVector.Builder(
            name = "School",
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
                moveTo(6f, 11.5f)
                horizontalLineTo(7f)
                moveTo(6f, 15.5f)
                horizontalLineTo(7f)
                moveTo(17f, 15.5f)
                horizontalLineTo(18f)
                moveTo(17f, 11.5f)
                horizontalLineTo(18f)
                moveTo(11.5f, 11.5f)
                horizontalLineTo(12.5f)
                moveTo(10f, 21f)
                verticalLineTo(17f)
                curveTo(10f, 15.895f, 10.895f, 15f, 12f, 15f)
                curveTo(13.105f, 15f, 14f, 15.895f, 14f, 17f)
                verticalLineTo(21f)
                moveTo(17f, 7.5f)
                lineTo(18.576f, 7.894f)
                curveTo(19.443f, 8.111f, 19.876f, 8.219f, 20.199f, 8.461f)
                curveTo(20.483f, 8.674f, 20.706f, 8.959f, 20.844f, 9.287f)
                curveTo(21f, 9.658f, 21f, 10.105f, 21f, 10.998f)
                verticalLineTo(17.8f)
                curveTo(21f, 18.92f, 21f, 19.48f, 20.782f, 19.908f)
                curveTo(20.59f, 20.284f, 20.284f, 20.59f, 19.908f, 20.782f)
                curveTo(19.48f, 21f, 18.92f, 21f, 17.8f, 21f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 21f, 4.52f, 21f, 4.092f, 20.782f)
                curveTo(3.716f, 20.59f, 3.41f, 20.284f, 3.218f, 19.908f)
                curveTo(3f, 19.48f, 3f, 18.92f, 3f, 17.8f)
                verticalLineTo(10.998f)
                curveTo(3f, 10.105f, 3f, 9.658f, 3.156f, 9.287f)
                curveTo(3.294f, 8.959f, 3.517f, 8.674f, 3.801f, 8.461f)
                curveTo(4.124f, 8.219f, 4.557f, 8.111f, 5.424f, 7.894f)
                lineTo(7f, 7.5f)
                lineTo(9.859f, 4.927f)
                curveTo(10.616f, 4.246f, 10.994f, 3.905f, 11.422f, 3.776f)
                curveTo(11.799f, 3.662f, 12.201f, 3.662f, 12.578f, 3.776f)
                curveTo(13.006f, 3.905f, 13.384f, 4.246f, 14.141f, 4.927f)
                lineTo(17f, 7.5f)
                close()
            }
        }.build()

        return _School!!
    }

@Suppress("ObjectPropertyName")
private var _School: ImageVector? = null
