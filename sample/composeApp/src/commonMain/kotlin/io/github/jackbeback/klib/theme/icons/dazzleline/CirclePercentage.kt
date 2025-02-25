package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CirclePercentage: ImageVector
    get() {
        if (_CirclePercentage != null) {
            return _CirclePercentage!!
        }
        _CirclePercentage = ImageVector.Builder(
            name = "CirclePercentage",
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
                moveTo(15.5f, 8.5f)
                lineTo(8.5f, 15.5f)
                moveTo(9.5f, 9.5f)
                horizontalLineTo(9.51f)
                moveTo(14.5f, 14.5f)
                horizontalLineTo(14.51f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(10f, 9.5f)
                curveTo(10f, 9.776f, 9.776f, 10f, 9.5f, 10f)
                curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
                curveTo(9f, 9.224f, 9.224f, 9f, 9.5f, 9f)
                curveTo(9.776f, 9f, 10f, 9.224f, 10f, 9.5f)
                close()
                moveTo(15f, 14.5f)
                curveTo(15f, 14.776f, 14.776f, 15f, 14.5f, 15f)
                curveTo(14.224f, 15f, 14f, 14.776f, 14f, 14.5f)
                curveTo(14f, 14.224f, 14.224f, 14f, 14.5f, 14f)
                curveTo(14.776f, 14f, 15f, 14.224f, 15f, 14.5f)
                close()
            }
        }.build()

        return _CirclePercentage!!
    }

@Suppress("ObjectPropertyName")
private var _CirclePercentage: ImageVector? = null
