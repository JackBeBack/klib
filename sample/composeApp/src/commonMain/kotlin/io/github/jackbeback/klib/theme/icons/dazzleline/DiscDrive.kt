package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.DiscDrive: ImageVector
    get() {
        if (_DiscDrive != null) {
            return _DiscDrive!!
        }
        _DiscDrive = ImageVector.Builder(
            name = "DiscDrive",
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
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                moveTo(12f, 12f)
                horizontalLineTo(12.01f)
                moveTo(20f, 20f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(20f)
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                curveTo(14.761f, 7f, 17f, 9.239f, 17f, 12f)
                close()
                moveTo(12.5f, 12f)
                curveTo(12.5f, 12.276f, 12.276f, 12.5f, 12f, 12.5f)
                curveTo(11.724f, 12.5f, 11.5f, 12.276f, 11.5f, 12f)
                curveTo(11.5f, 11.724f, 11.724f, 11.5f, 12f, 11.5f)
                curveTo(12.276f, 11.5f, 12.5f, 11.724f, 12.5f, 12f)
                close()
            }
        }.build()

        return _DiscDrive!!
    }

@Suppress("ObjectPropertyName")
private var _DiscDrive: ImageVector? = null
