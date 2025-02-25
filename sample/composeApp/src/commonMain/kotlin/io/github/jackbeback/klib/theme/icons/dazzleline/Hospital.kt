package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Hospital: ImageVector
    get() {
        if (_Hospital != null) {
            return _Hospital!!
        }
        _Hospital = ImageVector.Builder(
            name = "Hospital",
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
                moveTo(7f, 6f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 6f, 3.52f, 6f, 3.092f, 6.218f)
                curveTo(2.716f, 6.41f, 2.41f, 6.716f, 2.218f, 7.092f)
                curveTo(2f, 7.52f, 2f, 8.08f, 2f, 9.2f)
                verticalLineTo(17.8f)
                curveTo(2f, 18.92f, 2f, 19.48f, 2.218f, 19.908f)
                curveTo(2.41f, 20.284f, 2.716f, 20.59f, 3.092f, 20.782f)
                curveTo(3.52f, 21f, 4.08f, 21f, 5.2f, 21f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 21f, 20.48f, 21f, 20.908f, 20.782f)
                curveTo(21.284f, 20.59f, 21.59f, 20.284f, 21.782f, 19.908f)
                curveTo(22f, 19.48f, 22f, 18.92f, 22f, 17.8f)
                verticalLineTo(9.2f)
                curveTo(22f, 8.08f, 22f, 7.52f, 21.782f, 7.092f)
                curveTo(21.59f, 6.716f, 21.284f, 6.41f, 20.908f, 6.218f)
                curveTo(20.48f, 6f, 19.92f, 6f, 18.8f, 6f)
                horizontalLineTo(17f)
                moveTo(2f, 10f)
                horizontalLineTo(4f)
                moveTo(20f, 10f)
                horizontalLineTo(22f)
                moveTo(2f, 14f)
                horizontalLineTo(4f)
                moveTo(20f, 14f)
                horizontalLineTo(22f)
                moveTo(12f, 6f)
                verticalLineTo(10f)
                moveTo(10f, 8f)
                horizontalLineTo(14f)
                moveTo(17f, 21f)
                verticalLineTo(6.2f)
                curveTo(17f, 5.08f, 17f, 4.52f, 16.782f, 4.092f)
                curveTo(16.59f, 3.716f, 16.284f, 3.41f, 15.908f, 3.218f)
                curveTo(15.48f, 3f, 14.92f, 3f, 13.8f, 3f)
                horizontalLineTo(10.2f)
                curveTo(9.08f, 3f, 8.52f, 3f, 8.092f, 3.218f)
                curveTo(7.716f, 3.41f, 7.41f, 3.716f, 7.218f, 4.092f)
                curveTo(7f, 4.52f, 7f, 5.08f, 7f, 6.2f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                close()
                moveTo(14f, 21f)
                verticalLineTo(17f)
                curveTo(14f, 15.895f, 13.105f, 15f, 12f, 15f)
                curveTo(10.895f, 15f, 10f, 15.895f, 10f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Hospital!!
    }

@Suppress("ObjectPropertyName")
private var _Hospital: ImageVector? = null
