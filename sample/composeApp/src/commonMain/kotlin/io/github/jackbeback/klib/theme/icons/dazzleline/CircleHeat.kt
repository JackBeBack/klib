package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleHeat: ImageVector
    get() {
        if (_CircleHeat != null) {
            return _CircleHeat!!
        }
        _CircleHeat = ImageVector.Builder(
            name = "CircleHeat",
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
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                moveTo(8f, 8.5f)
                curveTo(8f, 8.5f, 9f, 9f, 10f, 9f)
                curveTo(11.5f, 9f, 12.5f, 8f, 14f, 8f)
                curveTo(15f, 8f, 16f, 8.5f, 16f, 8.5f)
                moveTo(8f, 15.5f)
                curveTo(8f, 15.5f, 9f, 16f, 10f, 16f)
                curveTo(11.5f, 16f, 12.5f, 15f, 14f, 15f)
                curveTo(15f, 15f, 16f, 15.5f, 16f, 15.5f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleHeat!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHeat: ImageVector? = null
