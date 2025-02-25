package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BrakeWarning: ImageVector
    get() {
        if (_BrakeWarning != null) {
            return _BrakeWarning!!
        }
        _BrakeWarning = ImageVector.Builder(
            name = "BrakeWarning",
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
                moveTo(12f, 10f)
                verticalLineTo(11.5f)
                moveTo(12f, 14f)
                horizontalLineTo(12.01f)
                moveTo(19.5f, 7.023f)
                curveTo(20.448f, 8.449f, 21f, 10.16f, 21f, 12f)
                curveTo(21f, 13.84f, 20.448f, 15.551f, 19.5f, 16.977f)
                moveTo(4.5f, 7.023f)
                curveTo(3.552f, 8.449f, 3f, 10.16f, 3f, 12f)
                curveTo(3f, 13.84f, 3.552f, 15.551f, 4.5f, 16.977f)
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                close()
            }
        }.build()

        return _BrakeWarning!!
    }

@Suppress("ObjectPropertyName")
private var _BrakeWarning: ImageVector? = null
