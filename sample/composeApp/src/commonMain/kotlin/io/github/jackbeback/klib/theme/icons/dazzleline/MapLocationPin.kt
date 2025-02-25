package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MapLocationPin: ImageVector
    get() {
        if (_MapLocationPin != null) {
            return _MapLocationPin!!
        }
        _MapLocationPin = ImageVector.Builder(
            name = "MapLocationPin",
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
                moveTo(12f, 6f)
                horizontalLineTo(12.01f)
                moveTo(9f, 20f)
                lineTo(3f, 17f)
                verticalLineTo(4f)
                lineTo(5f, 5f)
                moveTo(9f, 20f)
                lineTo(15f, 17f)
                moveTo(9f, 20f)
                verticalLineTo(14f)
                moveTo(15f, 17f)
                lineTo(21f, 20f)
                verticalLineTo(7f)
                lineTo(19f, 6f)
                moveTo(15f, 17f)
                verticalLineTo(14f)
                moveTo(15f, 6.2f)
                curveTo(15f, 7.967f, 13.5f, 9.4f, 12f, 11f)
                curveTo(10.5f, 9.4f, 9f, 7.967f, 9f, 6.2f)
                curveTo(9f, 4.433f, 10.343f, 3f, 12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.433f, 15f, 6.2f)
                close()
            }
        }.build()

        return _MapLocationPin!!
    }

@Suppress("ObjectPropertyName")
private var _MapLocationPin: ImageVector? = null
