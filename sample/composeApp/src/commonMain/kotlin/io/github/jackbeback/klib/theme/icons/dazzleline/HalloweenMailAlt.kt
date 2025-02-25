package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenMailAlt: ImageVector
    get() {
        if (_HalloweenMailAlt != null) {
            return _HalloweenMailAlt!!
        }
        _HalloweenMailAlt = ImageVector.Builder(
            name = "HalloweenMailAlt",
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
                moveTo(3f, 12f)
                verticalLineTo(14f)
                lineTo(4f, 15f)
                moveTo(4f, 15f)
                lineTo(7f, 14f)
                lineTo(9f, 15f)
                moveTo(4f, 15f)
                lineTo(3f, 16f)
                moveTo(7f, 6f)
                lineTo(5f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                lineTo(12f, 13f)
                lineTo(21f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                moveTo(7f, 6f)
                lineTo(9f, 8f)
                moveTo(7f, 6f)
                lineTo(9f, 5f)
                moveTo(21f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(21f, 13f)
                horizontalLineTo(19f)
                curveTo(18.448f, 13f, 18f, 13.448f, 18f, 14f)
                curveTo(18f, 14.552f, 17.552f, 15f, 17f, 15f)
                horizontalLineTo(16.5f)
                curveTo(15.672f, 15f, 15f, 15.672f, 15f, 16.5f)
                verticalLineTo(17f)
                curveTo(15f, 18.105f, 14.105f, 19f, 13f, 19f)
                horizontalLineTo(3f)
            }
        }.build()

        return _HalloweenMailAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenMailAlt: ImageVector? = null
