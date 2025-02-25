package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrashSlashAlt: ImageVector
    get() {
        if (_TrashSlashAlt != null) {
            return _TrashSlashAlt!!
        }
        _TrashSlashAlt = ImageVector.Builder(
            name = "TrashSlashAlt",
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
                moveTo(18f, 6f)
                lineTo(17.6f, 12f)
                moveTo(17.25f, 17.253f)
                lineTo(17.199f, 18.013f)
                curveTo(17.129f, 19.065f, 17.094f, 19.591f, 16.867f, 19.99f)
                curveTo(16.667f, 20.341f, 16.365f, 20.624f, 16.001f, 20.8f)
                curveTo(15.588f, 21f, 15.061f, 21f, 14.006f, 21f)
                horizontalLineTo(9.994f)
                curveTo(8.939f, 21f, 8.412f, 21f, 7.999f, 20.8f)
                curveTo(7.635f, 20.624f, 7.333f, 20.341f, 7.133f, 19.99f)
                curveTo(6.906f, 19.591f, 6.871f, 19.065f, 6.801f, 18.013f)
                lineTo(6f, 6f)
                horizontalLineTo(4f)
                moveTo(16f, 6f)
                lineTo(15.456f, 4.368f)
                curveTo(15.184f, 3.551f, 14.419f, 3f, 13.559f, 3f)
                horizontalLineTo(10.442f)
                curveTo(9.942f, 3f, 9.476f, 3.185f, 9.119f, 3.5f)
                moveTo(11.613f, 6f)
                horizontalLineTo(20f)
                moveTo(14f, 14f)
                verticalLineTo(17f)
                moveTo(10f, 10f)
                verticalLineTo(17f)
            }
        }.build()

        return _TrashSlashAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TrashSlashAlt: ImageVector? = null
