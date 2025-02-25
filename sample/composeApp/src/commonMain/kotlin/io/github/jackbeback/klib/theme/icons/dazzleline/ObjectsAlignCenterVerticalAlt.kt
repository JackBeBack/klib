package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignCenterVerticalAlt: ImageVector
    get() {
        if (_ObjectsAlignCenterVerticalAlt != null) {
            return _ObjectsAlignCenterVerticalAlt!!
        }
        _ObjectsAlignCenterVerticalAlt = ImageVector.Builder(
            name = "ObjectsAlignCenterVerticalAlt",
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
                moveTo(8f, 12f)
                horizontalLineTo(4f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                moveTo(11.2f, 20f)
                horizontalLineTo(12.8f)
                curveTo(13.92f, 20f, 14.48f, 20f, 14.908f, 19.782f)
                curveTo(15.284f, 19.59f, 15.59f, 19.284f, 15.782f, 18.908f)
                curveTo(16f, 18.48f, 16f, 17.92f, 16f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(16f, 6.08f, 16f, 5.52f, 15.782f, 5.092f)
                curveTo(15.59f, 4.716f, 15.284f, 4.41f, 14.908f, 4.218f)
                curveTo(14.48f, 4f, 13.92f, 4f, 12.8f, 4f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 4f, 9.52f, 4f, 9.092f, 4.218f)
                curveTo(8.716f, 4.41f, 8.41f, 4.716f, 8.218f, 5.092f)
                curveTo(8f, 5.52f, 8f, 6.08f, 8f, 7.2f)
                verticalLineTo(16.8f)
                curveTo(8f, 17.92f, 8f, 18.48f, 8.218f, 18.908f)
                curveTo(8.41f, 19.284f, 8.716f, 19.59f, 9.092f, 19.782f)
                curveTo(9.52f, 20f, 10.08f, 20f, 11.2f, 20f)
                close()
            }
        }.build()

        return _ObjectsAlignCenterVerticalAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignCenterVerticalAlt: ImageVector? = null
