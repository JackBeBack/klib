package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HighDefinition: ImageVector
    get() {
        if (_HighDefinition != null) {
            return _HighDefinition!!
        }
        _HighDefinition = ImageVector.Builder(
            name = "HighDefinition",
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
                moveTo(6f, 12f)
                horizontalLineTo(10f)
                moveTo(6f, 9f)
                verticalLineTo(15f)
                moveTo(10f, 9f)
                verticalLineTo(15f)
                moveTo(13.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.776f, 13.724f, 15f, 14f, 15f)
                horizontalLineTo(15f)
                curveTo(16.657f, 15f, 18f, 13.657f, 18f, 12f)
                curveTo(18f, 10.343f, 16.657f, 9f, 15f, 9f)
                horizontalLineTo(14f)
                curveTo(13.724f, 9f, 13.5f, 9.224f, 13.5f, 9.5f)
                close()
                moveTo(5.2f, 19f)
                horizontalLineTo(18.8f)
                curveTo(19.92f, 19f, 20.48f, 19f, 20.908f, 18.782f)
                curveTo(21.284f, 18.59f, 21.59f, 18.284f, 21.782f, 17.908f)
                curveTo(22f, 17.48f, 22f, 16.92f, 22f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(22f, 7.08f, 22f, 6.52f, 21.782f, 6.092f)
                curveTo(21.59f, 5.716f, 21.284f, 5.41f, 20.908f, 5.218f)
                curveTo(20.48f, 5f, 19.92f, 5f, 18.8f, 5f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 5f, 3.52f, 5f, 3.092f, 5.218f)
                curveTo(2.716f, 5.41f, 2.41f, 5.716f, 2.218f, 6.092f)
                curveTo(2f, 6.52f, 2f, 7.08f, 2f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(2f, 16.92f, 2f, 17.48f, 2.218f, 17.908f)
                curveTo(2.41f, 18.284f, 2.716f, 18.59f, 3.092f, 18.782f)
                curveTo(3.52f, 19f, 4.08f, 19f, 5.2f, 19f)
                close()
            }
        }.build()

        return _HighDefinition!!
    }

@Suppress("ObjectPropertyName")
private var _HighDefinition: ImageVector? = null
