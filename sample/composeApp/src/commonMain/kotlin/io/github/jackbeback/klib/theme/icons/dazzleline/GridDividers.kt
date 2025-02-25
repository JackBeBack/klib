package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GridDividers: ImageVector
    get() {
        if (_GridDividers != null) {
            return _GridDividers!!
        }
        _GridDividers = ImageVector.Builder(
            name = "GridDividers",
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
                horizontalLineTo(21f)
                moveTo(3f, 14f)
                horizontalLineTo(21f)
                moveTo(10.5f, 10f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                close()
                moveTo(17.5f, 10f)
                horizontalLineTo(20.5f)
                verticalLineTo(7f)
                horizontalLineTo(17.5f)
                verticalLineTo(10f)
                close()
                moveTo(3.5f, 10f)
                horizontalLineTo(6.5f)
                verticalLineTo(7f)
                horizontalLineTo(3.5f)
                verticalLineTo(10f)
                close()
                moveTo(10.5f, 21f)
                horizontalLineTo(13.5f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                verticalLineTo(21f)
                close()
                moveTo(17.5f, 21f)
                horizontalLineTo(20.5f)
                verticalLineTo(18f)
                horizontalLineTo(17.5f)
                verticalLineTo(21f)
                close()
                moveTo(3.5f, 21f)
                horizontalLineTo(6.5f)
                verticalLineTo(18f)
                horizontalLineTo(3.5f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _GridDividers!!
    }

@Suppress("ObjectPropertyName")
private var _GridDividers: ImageVector? = null
