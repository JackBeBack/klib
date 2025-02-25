package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ListUlAlt: ImageVector
    get() {
        if (_ListUlAlt != null) {
            return _ListUlAlt!!
        }
        _ListUlAlt = ImageVector.Builder(
            name = "ListUlAlt",
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
                moveTo(8f, 6.001f)
                lineTo(21f, 6.001f)
                moveTo(8f, 12.001f)
                lineTo(21f, 12.002f)
                moveTo(8f, 18.001f)
                lineTo(21f, 18.001f)
                moveTo(3.5f, 6f)
                horizontalLineTo(3.51f)
                moveTo(3.5f, 12f)
                horizontalLineTo(3.51f)
                moveTo(3.5f, 18f)
                horizontalLineTo(3.51f)
                moveTo(4f, 6f)
                curveTo(4f, 6.276f, 3.776f, 6.5f, 3.5f, 6.5f)
                curveTo(3.224f, 6.5f, 3f, 6.276f, 3f, 6f)
                curveTo(3f, 5.724f, 3.224f, 5.5f, 3.5f, 5.5f)
                curveTo(3.776f, 5.5f, 4f, 5.724f, 4f, 6f)
                close()
                moveTo(4f, 12f)
                curveTo(4f, 12.276f, 3.776f, 12.5f, 3.5f, 12.5f)
                curveTo(3.224f, 12.5f, 3f, 12.276f, 3f, 12f)
                curveTo(3f, 11.724f, 3.224f, 11.5f, 3.5f, 11.5f)
                curveTo(3.776f, 11.5f, 4f, 11.724f, 4f, 12f)
                close()
                moveTo(4f, 18f)
                curveTo(4f, 18.276f, 3.776f, 18.5f, 3.5f, 18.5f)
                curveTo(3.224f, 18.5f, 3f, 18.276f, 3f, 18f)
                curveTo(3f, 17.724f, 3.224f, 17.5f, 3.5f, 17.5f)
                curveTo(3.776f, 17.5f, 4f, 17.724f, 4f, 18f)
                close()
            }
        }.build()

        return _ListUlAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ListUlAlt: ImageVector? = null
