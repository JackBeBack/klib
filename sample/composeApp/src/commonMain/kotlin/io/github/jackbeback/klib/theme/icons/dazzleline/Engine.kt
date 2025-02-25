package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Engine: ImageVector
    get() {
        if (_Engine != null) {
            return _Engine!!
        }
        _Engine = ImageVector.Builder(
            name = "Engine",
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
                moveTo(14f, 8f)
                verticalLineTo(5f)
                moveTo(11f, 5f)
                horizontalLineTo(17f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveTo(3f, 9f)
                verticalLineTo(15f)
                moveTo(21f, 11f)
                verticalLineTo(19f)
                moveTo(9f, 12f)
                horizontalLineTo(9.01f)
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(15f, 12f)
                horizontalLineTo(15.01f)
                moveTo(6f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                lineTo(10f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                lineTo(16f, 8f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Engine!!
    }

@Suppress("ObjectPropertyName")
private var _Engine: ImageVector? = null
