package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ToriiGate: ImageVector
    get() {
        if (_ToriiGate != null) {
            return _ToriiGate!!
        }
        _ToriiGate = ImageVector.Builder(
            name = "ToriiGate",
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
                moveTo(3f, 13f)
                horizontalLineTo(12f)
                moveTo(12f, 13f)
                horizontalLineTo(21f)
                moveTo(12f, 13f)
                verticalLineTo(9f)
                moveTo(5f, 21f)
                verticalLineTo(9f)
                moveTo(19f, 21f)
                verticalLineTo(9f)
                moveTo(3f, 3.5f)
                verticalLineTo(8.2f)
                curveTo(3f, 8.48f, 3f, 8.62f, 3.055f, 8.727f)
                curveTo(3.102f, 8.821f, 3.179f, 8.898f, 3.273f, 8.946f)
                curveTo(3.38f, 9f, 3.52f, 9f, 3.8f, 9f)
                horizontalLineTo(20.2f)
                curveTo(20.48f, 9f, 20.62f, 9f, 20.727f, 8.946f)
                curveTo(20.821f, 8.898f, 20.898f, 8.821f, 20.945f, 8.727f)
                curveTo(21f, 8.62f, 21f, 8.48f, 21f, 8.2f)
                verticalLineTo(3.5f)
                curveTo(21f, 3.5f, 17f, 5f, 12f, 5f)
                curveTo(7f, 5f, 3f, 3.5f, 3f, 3.5f)
                close()
            }
        }.build()

        return _ToriiGate!!
    }

@Suppress("ObjectPropertyName")
private var _ToriiGate: ImageVector? = null
