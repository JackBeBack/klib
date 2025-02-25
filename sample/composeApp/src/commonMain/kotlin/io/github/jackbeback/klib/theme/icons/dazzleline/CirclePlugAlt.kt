package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CirclePlugAlt: ImageVector
    get() {
        if (_CirclePlugAlt != null) {
            return _CirclePlugAlt!!
        }
        _CirclePlugAlt = ImageVector.Builder(
            name = "CirclePlugAlt",
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
                moveTo(17.401f, 19.2f)
                curveTo(19.586f, 17.558f, 21f, 14.944f, 21f, 12f)
                curveTo(21f, 7.029f, 16.971f, 3f, 12f, 3f)
                curveTo(7.029f, 3f, 3f, 7.029f, 3f, 12f)
                curveTo(3f, 16.971f, 7.029f, 21f, 12f, 21f)
                verticalLineTo(16f)
                moveTo(10f, 8f)
                verticalLineTo(11f)
                moveTo(14f, 8f)
                verticalLineTo(11f)
                moveTo(8f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(12.8f)
                curveTo(16f, 13.92f, 16f, 14.48f, 15.782f, 14.908f)
                curveTo(15.59f, 15.284f, 15.284f, 15.59f, 14.908f, 15.782f)
                curveTo(14.48f, 16f, 13.92f, 16f, 12.8f, 16f)
                horizontalLineTo(11.2f)
                curveTo(10.08f, 16f, 9.52f, 16f, 9.092f, 15.782f)
                curveTo(8.716f, 15.59f, 8.41f, 15.284f, 8.218f, 14.908f)
                curveTo(8f, 14.48f, 8f, 13.92f, 8f, 12.8f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CirclePlugAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CirclePlugAlt: ImageVector? = null
