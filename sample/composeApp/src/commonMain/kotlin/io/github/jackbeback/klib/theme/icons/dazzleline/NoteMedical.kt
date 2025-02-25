package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.NoteMedical: ImageVector
    get() {
        if (_NoteMedical != null) {
            return _NoteMedical!!
        }
        _NoteMedical = ImageVector.Builder(
            name = "NoteMedical",
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
                moveTo(10f, 12f)
                horizontalLineTo(14f)
                moveTo(12f, 10f)
                verticalLineTo(14f)
                moveTo(19.959f, 15f)
                horizontalLineTo(16.6f)
                curveTo(16.04f, 15f, 15.76f, 15f, 15.546f, 15.109f)
                curveTo(15.358f, 15.205f, 15.205f, 15.358f, 15.109f, 15.546f)
                curveTo(15f, 15.76f, 15f, 16.04f, 15f, 16.6f)
                verticalLineTo(19.959f)
                moveTo(20f, 14.103f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(4f, 17.92f, 4f, 18.48f, 4.218f, 18.908f)
                curveTo(4.41f, 19.284f, 4.716f, 19.59f, 5.092f, 19.782f)
                curveTo(5.52f, 20f, 6.08f, 20f, 7.2f, 20f)
                horizontalLineTo(14.103f)
                curveTo(14.592f, 20f, 14.837f, 20f, 15.067f, 19.945f)
                curveTo(15.271f, 19.896f, 15.466f, 19.815f, 15.645f, 19.705f)
                curveTo(15.847f, 19.582f, 16.02f, 19.409f, 16.366f, 19.063f)
                lineTo(19.063f, 16.366f)
                curveTo(19.409f, 16.02f, 19.582f, 15.847f, 19.705f, 15.645f)
                curveTo(19.815f, 15.466f, 19.896f, 15.271f, 19.945f, 15.067f)
                curveTo(20f, 14.837f, 20f, 14.592f, 20f, 14.103f)
                close()
            }
        }.build()

        return _NoteMedical!!
    }

@Suppress("ObjectPropertyName")
private var _NoteMedical: ImageVector? = null
