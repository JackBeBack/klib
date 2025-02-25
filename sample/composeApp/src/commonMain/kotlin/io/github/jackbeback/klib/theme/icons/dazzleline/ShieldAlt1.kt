package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldAlt1: ImageVector
    get() {
        if (_ShieldAlt1 != null) {
            return _ShieldAlt1!!
        }
        _ShieldAlt1 = ImageVector.Builder(
            name = "ShieldAlt1",
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
                moveTo(11.302f, 21.615f)
                curveTo(11.523f, 21.744f, 11.634f, 21.809f, 11.79f, 21.842f)
                curveTo(11.912f, 21.868f, 12.088f, 21.868f, 12.21f, 21.842f)
                curveTo(12.366f, 21.809f, 12.477f, 21.744f, 12.698f, 21.615f)
                curveTo(14.646f, 20.478f, 20f, 16.908f, 20f, 12f)
                verticalLineTo(6.6f)
                curveTo(20f, 6.042f, 20f, 5.763f, 19.893f, 5.55f)
                curveTo(19.797f, 5.362f, 19.649f, 5.212f, 19.461f, 5.114f)
                curveTo(19.25f, 5.004f, 18.966f, 5.001f, 18.399f, 4.994f)
                curveTo(15.427f, 4.959f, 13.714f, 4.714f, 12f, 3f)
                curveTo(10.286f, 4.714f, 8.573f, 4.959f, 5.601f, 4.994f)
                curveTo(5.034f, 5.001f, 4.75f, 5.004f, 4.539f, 5.114f)
                curveTo(4.351f, 5.212f, 4.203f, 5.362f, 4.107f, 5.55f)
                curveTo(4f, 5.763f, 4f, 6.042f, 4f, 6.6f)
                verticalLineTo(12f)
                curveTo(4f, 16.908f, 9.354f, 20.478f, 11.302f, 21.615f)
                close()
            }
        }.build()

        return _ShieldAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAlt1: ImageVector? = null
