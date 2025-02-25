package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Archway: ImageVector
    get() {
        if (_Archway != null) {
            return _Archway!!
        }
        _Archway = ImageVector.Builder(
            name = "Archway",
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
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                moveTo(4f, 3f)
                verticalLineTo(21f)
                moveTo(20f, 3f)
                verticalLineTo(21f)
                moveTo(3f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                curveTo(8f, 13.791f, 9.791f, 12f, 12f, 12f)
                curveTo(14.209f, 12f, 16f, 13.791f, 16f, 16f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                moveTo(20f, 7f)
                horizontalLineTo(4f)
            }
        }.build()

        return _Archway!!
    }

@Suppress("ObjectPropertyName")
private var _Archway: ImageVector? = null
