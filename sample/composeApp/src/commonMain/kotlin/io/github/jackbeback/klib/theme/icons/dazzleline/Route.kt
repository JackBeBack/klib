package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Route: ImageVector
    get() {
        if (_Route != null) {
            return _Route!!
        }
        _Route = ImageVector.Builder(
            name = "Route",
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
                moveTo(6f, 21f)
                curveTo(7.5f, 19.4f, 9f, 17.967f, 9f, 16.2f)
                curveTo(9f, 14.433f, 7.657f, 13f, 6f, 13f)
                curveTo(4.343f, 13f, 3f, 14.433f, 3f, 16.2f)
                curveTo(3f, 17.967f, 4.5f, 19.4f, 6f, 21f)
                close()
                moveTo(6f, 21f)
                horizontalLineTo(17.5f)
                curveTo(18.881f, 21f, 20f, 19.881f, 20f, 18.5f)
                curveTo(20f, 17.119f, 18.881f, 16f, 17.5f, 16f)
                horizontalLineTo(15f)
                moveTo(18f, 11f)
                curveTo(19.5f, 9.4f, 21f, 7.967f, 21f, 6.2f)
                curveTo(21f, 4.433f, 19.657f, 3f, 18f, 3f)
                curveTo(16.343f, 3f, 15f, 4.433f, 15f, 6.2f)
                curveTo(15f, 7.967f, 16.5f, 9.4f, 18f, 11f)
                close()
                moveTo(18f, 11f)
                horizontalLineTo(14.5f)
                curveTo(13.119f, 11f, 12f, 12.119f, 12f, 13.5f)
                curveTo(12f, 14.881f, 13.119f, 16f, 14.5f, 16f)
                horizontalLineTo(15.6f)
            }
        }.build()

        return _Route!!
    }

@Suppress("ObjectPropertyName")
private var _Route: ImageVector? = null
