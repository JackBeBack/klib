package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrashSlash: ImageVector
    get() {
        if (_TrashSlash != null) {
            return _TrashSlash!!
        }
        _TrashSlash = ImageVector.Builder(
            name = "TrashSlash",
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
                lineTo(6f, 6f)
                moveTo(6f, 6f)
                lineTo(10f, 10f)
                moveTo(6f, 6f)
                verticalLineTo(18f)
                curveTo(6f, 19.657f, 7.343f, 21f, 9f, 21f)
                horizontalLineTo(15f)
                curveTo(16.657f, 21f, 18f, 19.657f, 18f, 18f)
                moveTo(6f, 6f)
                horizontalLineTo(4f)
                moveTo(10f, 10f)
                lineTo(14f, 14f)
                moveTo(10f, 10f)
                verticalLineTo(17f)
                moveTo(14f, 14f)
                lineTo(18f, 18f)
                moveTo(14f, 14f)
                verticalLineTo(17f)
                moveTo(18f, 18f)
                lineTo(21f, 21f)
                moveTo(18f, 6f)
                verticalLineTo(12.391f)
                moveTo(18f, 6f)
                horizontalLineTo(16f)
                moveTo(18f, 6f)
                horizontalLineTo(20f)
                moveTo(16f, 6f)
                lineTo(15.456f, 4.368f)
                curveTo(15.184f, 3.551f, 14.419f, 3f, 13.559f, 3f)
                horizontalLineTo(10.441f)
                curveTo(9.942f, 3f, 9.476f, 3.185f, 9.119f, 3.5f)
                moveTo(16f, 6f)
                horizontalLineTo(11.613f)
            }
        }.build()

        return _TrashSlash!!
    }

@Suppress("ObjectPropertyName")
private var _TrashSlash: ImageVector? = null
