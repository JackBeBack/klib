package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignLeftAlt: ImageVector
    get() {
        if (_ObjectsAlignLeftAlt != null) {
            return _ObjectsAlignLeftAlt!!
        }
        _ObjectsAlignLeftAlt = ImageVector.Builder(
            name = "ObjectsAlignLeftAlt",
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
                moveTo(4f, 4f)
                verticalLineTo(20f)
                moveTo(11.2f, 16f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 16f, 18.48f, 16f, 18.908f, 15.782f)
                curveTo(19.284f, 15.59f, 19.59f, 15.284f, 19.782f, 14.908f)
                curveTo(20f, 14.48f, 20f, 13.92f, 20f, 12.8f)
                verticalLineTo(11.2f)
                curveTo(20f, 10.08f, 20f, 9.52f, 19.782f, 9.092f)
                curveTo(19.59f, 8.716f, 19.284f, 8.41f, 18.908f, 8.218f)
                curveTo(18.48f, 8f, 17.92f, 8f, 16.8f, 8f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 8f, 9.52f, 8f, 9.092f, 8.218f)
                curveTo(8.716f, 8.41f, 8.41f, 8.716f, 8.218f, 9.092f)
                curveTo(8f, 9.52f, 8f, 10.08f, 8f, 11.2f)
                verticalLineTo(12.8f)
                curveTo(8f, 13.92f, 8f, 14.48f, 8.218f, 14.908f)
                curveTo(8.41f, 15.284f, 8.716f, 15.59f, 9.092f, 15.782f)
                curveTo(9.52f, 16f, 10.08f, 16f, 11.2f, 16f)
                close()
            }
        }.build()

        return _ObjectsAlignLeftAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignLeftAlt: ImageVector? = null
