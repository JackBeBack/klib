package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignBottomAlt: ImageVector
    get() {
        if (_ObjectsAlignBottomAlt != null) {
            return _ObjectsAlignBottomAlt!!
        }
        _ObjectsAlignBottomAlt = ImageVector.Builder(
            name = "ObjectsAlignBottomAlt",
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
                moveTo(4f, 20f)
                horizontalLineTo(20f)
                moveTo(11.2f, 16f)
                horizontalLineTo(12.8f)
                curveTo(13.92f, 16f, 14.48f, 16f, 14.908f, 15.782f)
                curveTo(15.284f, 15.59f, 15.59f, 15.284f, 15.782f, 14.908f)
                curveTo(16f, 14.48f, 16f, 13.92f, 16f, 12.8f)
                verticalLineTo(7.2f)
                curveTo(16f, 6.08f, 16f, 5.52f, 15.782f, 5.092f)
                curveTo(15.59f, 4.716f, 15.284f, 4.41f, 14.908f, 4.218f)
                curveTo(14.48f, 4f, 13.92f, 4f, 12.8f, 4f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 4f, 9.52f, 4f, 9.092f, 4.218f)
                curveTo(8.716f, 4.41f, 8.41f, 4.716f, 8.218f, 5.092f)
                curveTo(8f, 5.52f, 8f, 6.08f, 8f, 7.2f)
                verticalLineTo(12.8f)
                curveTo(8f, 13.92f, 8f, 14.48f, 8.218f, 14.908f)
                curveTo(8.41f, 15.284f, 8.716f, 15.59f, 9.092f, 15.782f)
                curveTo(9.52f, 16f, 10.08f, 16f, 11.2f, 16f)
                close()
            }
        }.build()

        return _ObjectsAlignBottomAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignBottomAlt: ImageVector? = null
