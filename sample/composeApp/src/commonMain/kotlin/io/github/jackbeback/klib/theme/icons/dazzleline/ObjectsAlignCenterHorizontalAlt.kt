package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ObjectsAlignCenterHorizontalAlt: ImageVector
    get() {
        if (_ObjectsAlignCenterHorizontalAlt != null) {
            return _ObjectsAlignCenterHorizontalAlt!!
        }
        _ObjectsAlignCenterHorizontalAlt = ImageVector.Builder(
            name = "ObjectsAlignCenterHorizontalAlt",
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
                moveTo(12f, 8f)
                verticalLineTo(4f)
                moveTo(12f, 20f)
                verticalLineTo(16f)
                moveTo(7.2f, 16f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 16f, 18.48f, 16f, 18.908f, 15.782f)
                curveTo(19.284f, 15.59f, 19.59f, 15.284f, 19.782f, 14.908f)
                curveTo(20f, 14.48f, 20f, 13.92f, 20f, 12.8f)
                verticalLineTo(11.2f)
                curveTo(20f, 10.08f, 20f, 9.52f, 19.782f, 9.092f)
                curveTo(19.59f, 8.716f, 19.284f, 8.41f, 18.908f, 8.218f)
                curveTo(18.48f, 8f, 17.92f, 8f, 16.8f, 8f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 8f, 5.52f, 8f, 5.092f, 8.218f)
                curveTo(4.716f, 8.41f, 4.41f, 8.716f, 4.218f, 9.092f)
                curveTo(4f, 9.52f, 4f, 10.08f, 4f, 11.2f)
                verticalLineTo(12.8f)
                curveTo(4f, 13.92f, 4f, 14.48f, 4.218f, 14.908f)
                curveTo(4.41f, 15.284f, 4.716f, 15.59f, 5.092f, 15.782f)
                curveTo(5.52f, 16f, 6.08f, 16f, 7.2f, 16f)
                close()
            }
        }.build()

        return _ObjectsAlignCenterHorizontalAlt!!
    }

@Suppress("ObjectPropertyName")
private var _ObjectsAlignCenterHorizontalAlt: ImageVector? = null
