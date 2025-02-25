package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldSlashAlt1: ImageVector
    get() {
        if (_ShieldSlashAlt1 != null) {
            return _ShieldSlashAlt1!!
        }
        _ShieldSlashAlt1 = ImageVector.Builder(
            name = "ShieldSlashAlt1",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(9.983f, 4.384f)
                curveTo(10.701f, 4.088f, 11.35f, 3.65f, 12f, 3f)
                curveTo(13.714f, 4.714f, 15.427f, 4.959f, 18.399f, 4.994f)
                curveTo(18.966f, 5.001f, 19.25f, 5.004f, 19.461f, 5.114f)
                curveTo(19.649f, 5.212f, 19.797f, 5.362f, 19.893f, 5.55f)
                curveTo(20f, 5.763f, 20f, 6.042f, 20f, 6.6f)
                verticalLineTo(12f)
                curveTo(20f, 12.722f, 19.884f, 13.415f, 19.68f, 14.076f)
                moveTo(17.622f, 17.626f)
                curveTo(15.935f, 19.587f, 13.786f, 20.98f, 12.698f, 21.615f)
                curveTo(12.477f, 21.744f, 12.366f, 21.809f, 12.21f, 21.842f)
                curveTo(12.088f, 21.868f, 11.912f, 21.868f, 11.79f, 21.842f)
                curveTo(11.634f, 21.809f, 11.523f, 21.744f, 11.302f, 21.615f)
                curveTo(9.354f, 20.478f, 4f, 16.908f, 4f, 12f)
                verticalLineTo(6.6f)
                curveTo(4f, 6.042f, 4f, 5.763f, 4.107f, 5.55f)
                curveTo(4.203f, 5.362f, 4.351f, 5.212f, 4.539f, 5.114f)
                curveTo(4.657f, 5.052f, 4.799f, 5.024f, 5f, 5.01f)
            }
        }.build()

        return _ShieldSlashAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlashAlt1: ImageVector? = null
