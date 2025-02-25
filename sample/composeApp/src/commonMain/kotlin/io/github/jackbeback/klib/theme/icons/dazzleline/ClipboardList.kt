package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ClipboardList: ImageVector
    get() {
        if (_ClipboardList != null) {
            return _ClipboardList!!
        }
        _ClipboardList = ImageVector.Builder(
            name = "ClipboardList",
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
                moveTo(8f, 5f)
                curveTo(7.012f, 5.001f, 6.494f, 5.013f, 6.092f, 5.218f)
                curveTo(5.716f, 5.41f, 5.41f, 5.716f, 5.218f, 6.092f)
                curveTo(5f, 6.52f, 5f, 7.08f, 5f, 8.2f)
                verticalLineTo(17.8f)
                curveTo(5f, 18.92f, 5f, 19.48f, 5.218f, 19.908f)
                curveTo(5.41f, 20.284f, 5.716f, 20.59f, 6.092f, 20.782f)
                curveTo(6.52f, 21f, 7.08f, 21f, 8.2f, 21f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 21f, 17.48f, 21f, 17.908f, 20.782f)
                curveTo(18.284f, 20.59f, 18.59f, 20.284f, 18.782f, 19.908f)
                curveTo(19f, 19.48f, 19f, 18.92f, 19f, 17.8f)
                verticalLineTo(8.2f)
                curveTo(19f, 7.08f, 19f, 6.52f, 18.782f, 6.092f)
                curveTo(18.59f, 5.716f, 18.284f, 5.41f, 17.908f, 5.218f)
                curveTo(17.506f, 5.013f, 16.988f, 5.001f, 16f, 5f)
                moveTo(8f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                moveTo(8f, 5f)
                verticalLineTo(4.707f)
                curveTo(8f, 4.254f, 8.18f, 3.82f, 8.5f, 3.5f)
                curveTo(8.82f, 3.18f, 9.254f, 3f, 9.707f, 3f)
                horizontalLineTo(14.293f)
                curveTo(14.746f, 3f, 15.18f, 3.18f, 15.5f, 3.5f)
                curveTo(15.82f, 3.82f, 16f, 4.254f, 16f, 4.707f)
                verticalLineTo(5f)
                moveTo(16f, 11f)
                horizontalLineTo(14f)
                moveTo(16f, 16f)
                horizontalLineTo(14f)
                moveTo(8f, 11f)
                lineTo(9f, 12f)
                lineTo(11f, 10f)
                moveTo(8f, 16f)
                lineTo(9f, 17f)
                lineTo(11f, 15f)
            }
        }.build()

        return _ClipboardList!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardList: ImageVector? = null
