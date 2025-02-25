package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.List: ImageVector
    get() {
        if (_List != null) {
            return _List!!
        }
        _List = ImageVector.Builder(
            name = "List",
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
                moveTo(8f, 6f)
                lineTo(21f, 6.001f)
                moveTo(8f, 12f)
                lineTo(21f, 12.001f)
                moveTo(8f, 18f)
                lineTo(21f, 18.001f)
                moveTo(3f, 6.5f)
                horizontalLineTo(4f)
                verticalLineTo(5.5f)
                horizontalLineTo(3f)
                verticalLineTo(6.5f)
                close()
                moveTo(3f, 12.5f)
                horizontalLineTo(4f)
                verticalLineTo(11.5f)
                horizontalLineTo(3f)
                verticalLineTo(12.5f)
                close()
                moveTo(3f, 18.5f)
                horizontalLineTo(4f)
                verticalLineTo(17.5f)
                horizontalLineTo(3f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _List!!
    }

@Suppress("ObjectPropertyName")
private var _List: ImageVector? = null
