package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WebcamAlt2: ImageVector
    get() {
        if (_WebcamAlt2 != null) {
            return _WebcamAlt2!!
        }
        _WebcamAlt2 = ImageVector.Builder(
            name = "WebcamAlt2",
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
                moveTo(7f, 21f)
                horizontalLineTo(17f)
                moveTo(9f, 18f)
                verticalLineTo(21f)
                moveTo(9f, 18f)
                horizontalLineTo(15f)
                moveTo(9f, 18f)
                curveTo(6.239f, 18f, 4f, 15.761f, 4f, 13f)
                curveTo(4f, 10.239f, 6.239f, 8f, 9f, 8f)
                horizontalLineTo(15f)
                curveTo(17.761f, 8f, 20f, 10.239f, 20f, 13f)
                curveTo(20f, 15.761f, 17.761f, 18f, 15f, 18f)
                moveTo(15f, 18f)
                verticalLineTo(21f)
                moveTo(12f, 3f)
                verticalLineTo(5f)
                moveTo(16.5f, 4f)
                lineTo(16f, 5f)
                moveTo(7.5f, 4f)
                lineTo(8f, 5f)
                moveTo(14f, 13f)
                curveTo(14f, 14.105f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 14.105f, 10f, 13f)
                curveTo(10f, 11.895f, 10.895f, 11f, 12f, 11f)
                curveTo(13.105f, 11f, 14f, 11.895f, 14f, 13f)
                close()
            }
        }.build()

        return _WebcamAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamAlt2: ImageVector? = null
