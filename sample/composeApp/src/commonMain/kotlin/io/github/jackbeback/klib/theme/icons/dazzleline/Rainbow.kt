package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Rainbow: ImageVector
    get() {
        if (_Rainbow != null) {
            return _Rainbow!!
        }
        _Rainbow = ImageVector.Builder(
            name = "Rainbow",
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
                moveTo(21f, 21f)
                verticalLineTo(12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                verticalLineTo(21f)
                moveTo(18f, 21f)
                verticalLineTo(12f)
                curveTo(18f, 8.686f, 15.314f, 6f, 12f, 6f)
                curveTo(8.686f, 6f, 6f, 8.686f, 6f, 12f)
                verticalLineTo(21f)
                moveTo(15f, 21f)
                verticalLineTo(12f)
                curveTo(15f, 10.343f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
                verticalLineTo(21f)
            }
        }.build()

        return _Rainbow!!
    }

@Suppress("ObjectPropertyName")
private var _Rainbow: ImageVector? = null
