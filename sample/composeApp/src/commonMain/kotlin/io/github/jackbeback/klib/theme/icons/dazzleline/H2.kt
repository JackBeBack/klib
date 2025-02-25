package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.H2: ImageVector
    get() {
        if (_H2 != null) {
            return _H2!!
        }
        _H2 = ImageVector.Builder(
            name = "H2",
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
                moveTo(3f, 6f)
                verticalLineTo(18f)
                moveTo(10f, 12f)
                horizontalLineTo(3f)
                moveTo(10f, 6f)
                verticalLineTo(18f)
                moveTo(14f, 9.231f)
                curveTo(14f, 7.385f, 15.809f, 6f, 17.5f, 6f)
                curveTo(19.191f, 6f, 21f, 6.923f, 21f, 9.231f)
                curveTo(21f, 12.923f, 14f, 18f, 14f, 18f)
                horizontalLineTo(21f)
            }
        }.build()

        return _H2!!
    }

@Suppress("ObjectPropertyName")
private var _H2: ImageVector? = null
