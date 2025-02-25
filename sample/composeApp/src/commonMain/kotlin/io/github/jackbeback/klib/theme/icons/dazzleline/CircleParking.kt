package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleParking: ImageVector
    get() {
        if (_CircleParking != null) {
            return _CircleParking!!
        }
        _CircleParking = ImageVector.Builder(
            name = "CircleParking",
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
                moveTo(9.5f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                curveTo(14.381f, 8f, 15.5f, 9.119f, 15.5f, 10.5f)
                curveTo(15.5f, 11.881f, 14.381f, 13f, 13f, 13f)
                horizontalLineTo(9.5f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _CircleParking!!
    }

@Suppress("ObjectPropertyName")
private var _CircleParking: ImageVector? = null
