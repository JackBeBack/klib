package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Map",
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
                moveTo(9f, 20f)
                lineTo(3f, 17f)
                verticalLineTo(4f)
                lineTo(9f, 7f)
                moveTo(9f, 20f)
                lineTo(15f, 17f)
                moveTo(9f, 20f)
                verticalLineTo(7f)
                moveTo(15f, 17f)
                lineTo(21f, 20f)
                verticalLineTo(7f)
                lineTo(15f, 4f)
                moveTo(15f, 17f)
                verticalLineTo(4f)
                moveTo(9f, 7f)
                lineTo(15f, 4f)
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
