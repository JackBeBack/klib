package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Train: ImageVector
    get() {
        if (_Train != null) {
            return _Train!!
        }
        _Train = ImageVector.Builder(
            name = "Train",
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
                moveTo(5f, 11f)
                horizontalLineTo(19f)
                moveTo(9f, 18f)
                lineTo(6f, 21f)
                moveTo(15f, 18f)
                lineTo(18f, 21f)
                moveTo(12f, 15f)
                horizontalLineTo(12.01f)
                moveTo(8.2f, 18f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 18f, 17.48f, 18f, 17.908f, 17.782f)
                curveTo(18.284f, 17.59f, 18.59f, 17.284f, 18.782f, 16.908f)
                curveTo(19f, 16.48f, 19f, 15.92f, 19f, 14.8f)
                verticalLineTo(6.2f)
                curveTo(19f, 5.08f, 19f, 4.52f, 18.782f, 4.092f)
                curveTo(18.59f, 3.716f, 18.284f, 3.41f, 17.908f, 3.218f)
                curveTo(17.48f, 3f, 16.92f, 3f, 15.8f, 3f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 3f, 6.52f, 3f, 6.092f, 3.218f)
                curveTo(5.716f, 3.41f, 5.41f, 3.716f, 5.218f, 4.092f)
                curveTo(5f, 4.52f, 5f, 5.08f, 5f, 6.2f)
                verticalLineTo(14.8f)
                curveTo(5f, 15.92f, 5f, 16.48f, 5.218f, 16.908f)
                curveTo(5.41f, 17.284f, 5.716f, 17.59f, 6.092f, 17.782f)
                curveTo(6.52f, 18f, 7.08f, 18f, 8.2f, 18f)
                close()
            }
        }.build()

        return _Train!!
    }

@Suppress("ObjectPropertyName")
private var _Train: ImageVector? = null
