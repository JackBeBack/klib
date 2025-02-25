package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Notebook",
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
                moveTo(8f, 7f)
                horizontalLineTo(4f)
                moveTo(8f, 12f)
                horizontalLineTo(4f)
                moveTo(8f, 17f)
                horizontalLineTo(4f)
                moveTo(12f, 3f)
                verticalLineTo(21f)
                moveTo(9.2f, 21f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 21f, 18.48f, 21f, 18.908f, 20.782f)
                curveTo(19.284f, 20.59f, 19.59f, 20.284f, 19.782f, 19.908f)
                curveTo(20f, 19.48f, 20f, 18.92f, 20f, 17.8f)
                verticalLineTo(6.2f)
                curveTo(20f, 5.08f, 20f, 4.52f, 19.782f, 4.092f)
                curveTo(19.59f, 3.716f, 19.284f, 3.41f, 18.908f, 3.218f)
                curveTo(18.48f, 3f, 17.92f, 3f, 16.8f, 3f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 3f, 7.52f, 3f, 7.092f, 3.218f)
                curveTo(6.716f, 3.41f, 6.41f, 3.716f, 6.218f, 4.092f)
                curveTo(6f, 4.52f, 6f, 5.08f, 6f, 6.2f)
                verticalLineTo(17.8f)
                curveTo(6f, 18.92f, 6f, 19.48f, 6.218f, 19.908f)
                curveTo(6.41f, 20.284f, 6.716f, 20.59f, 7.092f, 20.782f)
                curveTo(7.52f, 21f, 8.08f, 21f, 9.2f, 21f)
                close()
            }
        }.build()

        return _Notebook!!
    }

@Suppress("ObjectPropertyName")
private var _Notebook: ImageVector? = null
