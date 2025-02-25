package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Printer: ImageVector
    get() {
        if (_Printer != null) {
            return _Printer!!
        }
        _Printer = ImageVector.Builder(
            name = "Printer",
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
                moveTo(7f, 18f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 18f, 4.52f, 18f, 4.092f, 17.782f)
                curveTo(3.716f, 17.59f, 3.41f, 17.284f, 3.218f, 16.908f)
                curveTo(3f, 16.48f, 3f, 15.92f, 3f, 14.8f)
                verticalLineTo(10.2f)
                curveTo(3f, 9.08f, 3f, 8.52f, 3.218f, 8.092f)
                curveTo(3.41f, 7.716f, 3.716f, 7.41f, 4.092f, 7.218f)
                curveTo(4.52f, 7f, 5.08f, 7f, 6.2f, 7f)
                horizontalLineTo(7f)
                moveTo(17f, 18f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 18f, 19.48f, 18f, 19.908f, 17.782f)
                curveTo(20.284f, 17.59f, 20.59f, 17.284f, 20.782f, 16.908f)
                curveTo(21f, 16.48f, 21f, 15.92f, 21f, 14.8f)
                verticalLineTo(10.2f)
                curveTo(21f, 9.08f, 21f, 8.52f, 20.782f, 8.092f)
                curveTo(20.59f, 7.716f, 20.284f, 7.41f, 19.908f, 7.218f)
                curveTo(19.48f, 7f, 18.92f, 7f, 17.8f, 7f)
                horizontalLineTo(17f)
                moveTo(7f, 11f)
                horizontalLineTo(7.01f)
                moveTo(17f, 7f)
                verticalLineTo(5.4f)
                verticalLineTo(4.6f)
                curveTo(17f, 4.04f, 17f, 3.76f, 16.891f, 3.546f)
                curveTo(16.795f, 3.358f, 16.642f, 3.205f, 16.454f, 3.109f)
                curveTo(16.24f, 3f, 15.96f, 3f, 15.4f, 3f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 3f, 7.76f, 3f, 7.546f, 3.109f)
                curveTo(7.358f, 3.205f, 7.205f, 3.358f, 7.109f, 3.546f)
                curveTo(7f, 3.76f, 7f, 4.04f, 7f, 4.6f)
                verticalLineTo(5.4f)
                verticalLineTo(7f)
                moveTo(17f, 7f)
                horizontalLineTo(7f)
                moveTo(8.6f, 21f)
                horizontalLineTo(15.4f)
                curveTo(15.96f, 21f, 16.24f, 21f, 16.454f, 20.891f)
                curveTo(16.642f, 20.795f, 16.795f, 20.642f, 16.891f, 20.454f)
                curveTo(17f, 20.24f, 17f, 19.96f, 17f, 19.4f)
                verticalLineTo(16.6f)
                curveTo(17f, 16.04f, 17f, 15.76f, 16.891f, 15.546f)
                curveTo(16.795f, 15.358f, 16.642f, 15.205f, 16.454f, 15.109f)
                curveTo(16.24f, 15f, 15.96f, 15f, 15.4f, 15f)
                horizontalLineTo(8.6f)
                curveTo(8.04f, 15f, 7.76f, 15f, 7.546f, 15.109f)
                curveTo(7.358f, 15.205f, 7.205f, 15.358f, 7.109f, 15.546f)
                curveTo(7f, 15.76f, 7f, 16.04f, 7f, 16.6f)
                verticalLineTo(19.4f)
                curveTo(7f, 19.96f, 7f, 20.24f, 7.109f, 20.454f)
                curveTo(7.205f, 20.642f, 7.358f, 20.795f, 7.546f, 20.891f)
                curveTo(7.76f, 21f, 8.04f, 21f, 8.6f, 21f)
                close()
            }
        }.build()

        return _Printer!!
    }

@Suppress("ObjectPropertyName")
private var _Printer: ImageVector? = null
