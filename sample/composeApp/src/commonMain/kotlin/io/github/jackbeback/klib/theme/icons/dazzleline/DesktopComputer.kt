package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DesktopComputer: ImageVector
    get() {
        if (_DesktopComputer != null) {
            return _DesktopComputer!!
        }
        _DesktopComputer = ImageVector.Builder(
            name = "DesktopComputer",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(16f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(4.6f)
                curveTo(21f, 4.04f, 21f, 3.76f, 20.891f, 3.546f)
                curveTo(20.795f, 3.358f, 20.642f, 3.205f, 20.454f, 3.109f)
                curveTo(20.24f, 3f, 19.96f, 3f, 19.4f, 3f)
                horizontalLineTo(13.6f)
                curveTo(13.04f, 3f, 12.76f, 3f, 12.546f, 3.109f)
                curveTo(12.358f, 3.205f, 12.205f, 3.358f, 12.109f, 3.546f)
                curveTo(12f, 3.76f, 12f, 4.04f, 12f, 4.6f)
                verticalLineTo(6f)
                moveTo(10f, 18f)
                verticalLineTo(21f)
                moveTo(7f, 21f)
                horizontalLineTo(13f)
                moveTo(6.2f, 18f)
                horizontalLineTo(13.8f)
                curveTo(14.92f, 18f, 15.48f, 18f, 15.908f, 17.782f)
                curveTo(16.284f, 17.59f, 16.59f, 17.284f, 16.782f, 16.908f)
                curveTo(17f, 16.48f, 17f, 15.92f, 17f, 14.8f)
                verticalLineTo(9.2f)
                curveTo(17f, 8.08f, 17f, 7.52f, 16.782f, 7.092f)
                curveTo(16.59f, 6.716f, 16.284f, 6.41f, 15.908f, 6.218f)
                curveTo(15.48f, 6f, 14.92f, 6f, 13.8f, 6f)
                horizontalLineTo(6.2f)
                curveTo(5.08f, 6f, 4.52f, 6f, 4.092f, 6.218f)
                curveTo(3.716f, 6.41f, 3.41f, 6.716f, 3.218f, 7.092f)
                curveTo(3f, 7.52f, 3f, 8.08f, 3f, 9.2f)
                verticalLineTo(14.8f)
                curveTo(3f, 15.92f, 3f, 16.48f, 3.218f, 16.908f)
                curveTo(3.41f, 17.284f, 3.716f, 17.59f, 4.092f, 17.782f)
                curveTo(4.52f, 18f, 5.08f, 18f, 6.2f, 18f)
                close()
            }
        }.build()

        return _DesktopComputer!!
    }

@Suppress("ObjectPropertyName")
private var _DesktopComputer: ImageVector? = null
