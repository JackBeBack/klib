package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.EuroCircle: ImageVector
    get() {
        if (_EuroCircle != null) {
            return _EuroCircle!!
        }
        _EuroCircle = ImageVector.Builder(
            name = "EuroCircle",
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
                moveTo(16f, 8.944f)
                curveTo(15.183f, 7.762f, 13.904f, 7f, 12.465f, 7f)
                curveTo(9.999f, 7f, 8f, 9.239f, 8f, 12f)
                curveTo(8f, 14.761f, 9.999f, 17f, 12.465f, 17f)
                curveTo(13.904f, 17f, 15.183f, 16.238f, 16f, 15.056f)
                moveTo(7f, 10.5f)
                horizontalLineTo(11f)
                moveTo(7f, 13.5f)
                horizontalLineTo(11f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _EuroCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EuroCircle: ImageVector? = null
