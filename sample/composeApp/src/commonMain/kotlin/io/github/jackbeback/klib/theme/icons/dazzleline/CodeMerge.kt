package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CodeMerge: ImageVector
    get() {
        if (_CodeMerge != null) {
            return _CodeMerge!!
        }
        _CodeMerge = ImageVector.Builder(
            name = "CodeMerge",
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
                moveTo(5.5f, 8f)
                curveTo(6.881f, 8f, 8f, 6.881f, 8f, 5.5f)
                curveTo(8f, 4.119f, 6.881f, 3f, 5.5f, 3f)
                curveTo(4.119f, 3f, 3f, 4.119f, 3f, 5.5f)
                curveTo(3f, 6.881f, 4.119f, 8f, 5.5f, 8f)
                close()
                moveTo(5.5f, 8f)
                verticalLineTo(16f)
                moveTo(5.5f, 8f)
                curveTo(5.5f, 10.209f, 7.291f, 12f, 9.5f, 12f)
                horizontalLineTo(16f)
                moveTo(5.5f, 16f)
                curveTo(4.119f, 16f, 3f, 17.119f, 3f, 18.5f)
                curveTo(3f, 19.881f, 4.119f, 21f, 5.5f, 21f)
                curveTo(6.881f, 21f, 8f, 19.881f, 8f, 18.5f)
                curveTo(8f, 17.119f, 6.881f, 16f, 5.5f, 16f)
                close()
                moveTo(16f, 12f)
                curveTo(16f, 13.381f, 17.119f, 14.5f, 18.5f, 14.5f)
                curveTo(19.881f, 14.5f, 21f, 13.381f, 21f, 12f)
                curveTo(21f, 10.619f, 19.881f, 9.5f, 18.5f, 9.5f)
                curveTo(17.119f, 9.5f, 16f, 10.619f, 16f, 12f)
                close()
            }
        }.build()

        return _CodeMerge!!
    }

@Suppress("ObjectPropertyName")
private var _CodeMerge: ImageVector? = null
