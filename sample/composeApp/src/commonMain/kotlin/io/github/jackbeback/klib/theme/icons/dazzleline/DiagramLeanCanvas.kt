package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiagramLeanCanvas: ImageVector
    get() {
        if (_DiagramLeanCanvas != null) {
            return _DiagramLeanCanvas!!
        }
        _DiagramLeanCanvas = ImageVector.Builder(
            name = "DiagramLeanCanvas",
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
                moveTo(2f, 14f)
                horizontalLineTo(22f)
                moveTo(12f, 14f)
                verticalLineTo(20f)
                moveTo(10f, 4f)
                verticalLineTo(14f)
                moveTo(18f, 4f)
                verticalLineTo(14f)
                moveTo(6f, 4f)
                verticalLineTo(14f)
                moveTo(14f, 4f)
                verticalLineTo(14f)
                moveTo(6f, 9f)
                horizontalLineTo(10f)
                moveTo(14f, 9f)
                horizontalLineTo(18f)
                moveTo(5.2f, 20f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 20f, 20.48f, 20f, 20.908f, 19.782f)
                curveTo(21.284f, 19.59f, 21.59f, 19.284f, 21.782f, 18.908f)
                curveTo(22f, 18.48f, 22f, 17.92f, 22f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(22f, 6.08f, 22f, 5.52f, 21.782f, 5.092f)
                curveTo(21.59f, 4.716f, 21.284f, 4.41f, 20.908f, 4.218f)
                curveTo(20.48f, 4f, 19.92f, 4f, 18.8f, 4f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 4f, 3.52f, 4f, 3.092f, 4.218f)
                curveTo(2.716f, 4.41f, 2.41f, 4.716f, 2.218f, 5.092f)
                curveTo(2f, 5.52f, 2f, 6.08f, 2f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(2f, 17.92f, 2f, 18.48f, 2.218f, 18.908f)
                curveTo(2.41f, 19.284f, 2.716f, 19.59f, 3.092f, 19.782f)
                curveTo(3.52f, 20f, 4.08f, 20f, 5.2f, 20f)
                close()
            }
        }.build()

        return _DiagramLeanCanvas!!
    }

@Suppress("ObjectPropertyName")
private var _DiagramLeanCanvas: ImageVector? = null
