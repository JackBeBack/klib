package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.GlobeStand: ImageVector
    get() {
        if (_GlobeStand != null) {
            return _GlobeStand!!
        }
        _GlobeStand = ImageVector.Builder(
            name = "GlobeStand",
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
                moveTo(12f, 18f)
                curveTo(16.971f, 18f, 21f, 13.971f, 21f, 9f)
                curveTo(21f, 7.16f, 20.448f, 5.449f, 19.5f, 4.023f)
                moveTo(12f, 18f)
                curveTo(8.88f, 18f, 6.13f, 16.412f, 4.516f, 14f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                moveTo(21f, 3f)
                lineTo(19.5f, 4f)
                moveTo(4.5f, 14f)
                lineTo(3f, 15f)
                moveTo(17f, 9f)
                curveTo(17f, 11.761f, 14.761f, 14f, 12f, 14f)
                curveTo(9.239f, 14f, 7f, 11.761f, 7f, 9f)
                curveTo(7f, 6.239f, 9.239f, 4f, 12f, 4f)
                curveTo(14.761f, 4f, 17f, 6.239f, 17f, 9f)
                close()
            }
        }.build()

        return _GlobeStand!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeStand: ImageVector? = null
