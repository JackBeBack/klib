package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DropletAlt: ImageVector
    get() {
        if (_DropletAlt != null) {
            return _DropletAlt!!
        }
        _DropletAlt = ImageVector.Builder(
            name = "DropletAlt",
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
                moveTo(12f, 21.5f)
                curveTo(13.856f, 21.5f, 15.637f, 20.763f, 16.95f, 19.45f)
                curveTo(18.263f, 18.137f, 19f, 16.357f, 19f, 14.5f)
                curveTo(19f, 12.5f, 18f, 10.6f, 16f, 9f)
                curveTo(14f, 7.4f, 12.5f, 5f, 12f, 2.5f)
                curveTo(11.5f, 5f, 10f, 7.4f, 8f, 9f)
                curveTo(6f, 10.6f, 5f, 12.5f, 5f, 14.5f)
                curveTo(5f, 16.357f, 5.738f, 18.137f, 7.05f, 19.45f)
                curveTo(8.363f, 20.763f, 10.144f, 21.5f, 12f, 21.5f)
                verticalLineTo(21.5f)
                close()
            }
        }.build()

        return _DropletAlt!!
    }

@Suppress("ObjectPropertyName")
private var _DropletAlt: ImageVector? = null
