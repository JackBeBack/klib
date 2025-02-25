package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CircleMicrophone: ImageVector
    get() {
        if (_CircleMicrophone != null) {
            return _CircleMicrophone!!
        }
        _CircleMicrophone = ImageVector.Builder(
            name = "CircleMicrophone",
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
                moveTo(17f, 11f)
                verticalLineTo(13f)
                curveTo(17f, 15.761f, 14.761f, 18f, 12f, 18f)
                curveTo(9.239f, 18f, 7f, 15.761f, 7f, 13f)
                verticalLineTo(11f)
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
                moveTo(12f, 15f)
                curveTo(10.895f, 15f, 10f, 14.105f, 10f, 13f)
                verticalLineTo(8f)
                curveTo(10f, 6.895f, 10.895f, 6f, 12f, 6f)
                curveTo(13.105f, 6f, 14f, 6.895f, 14f, 8f)
                verticalLineTo(13f)
                curveTo(14f, 14.105f, 13.105f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _CircleMicrophone!!
    }

@Suppress("ObjectPropertyName")
private var _CircleMicrophone: ImageVector? = null
