package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BackpackAlt: ImageVector
    get() {
        if (_BackpackAlt != null) {
            return _BackpackAlt!!
        }
        _BackpackAlt = ImageVector.Builder(
            name = "BackpackAlt",
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
                moveTo(15f, 21f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                moveTo(15f, 16f)
                horizontalLineTo(9f)
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                moveTo(15f, 6.038f)
                verticalLineTo(6f)
                curveTo(15f, 5.068f, 15f, 4.602f, 14.848f, 4.235f)
                curveTo(14.645f, 3.745f, 14.255f, 3.355f, 13.765f, 3.152f)
                curveTo(13.398f, 3f, 12.932f, 3f, 12f, 3f)
                curveTo(11.068f, 3f, 10.602f, 3f, 10.235f, 3.152f)
                curveTo(9.745f, 3.355f, 9.355f, 3.745f, 9.152f, 4.235f)
                curveTo(9f, 4.602f, 9f, 5.068f, 9f, 6f)
                verticalLineTo(6.038f)
                moveTo(15f, 6.038f)
                curveTo(14.371f, 6f, 13.597f, 6f, 12.6f, 6f)
                horizontalLineTo(11.4f)
                curveTo(10.403f, 6f, 9.629f, 6f, 9f, 6.038f)
                moveTo(15f, 6.038f)
                curveTo(15.784f, 6.086f, 16.341f, 6.194f, 16.816f, 6.436f)
                curveTo(17.569f, 6.819f, 18.181f, 7.431f, 18.564f, 8.184f)
                curveTo(19f, 9.04f, 19f, 10.16f, 19f, 12.4f)
                verticalLineTo(17.8f)
                curveTo(19f, 18.92f, 19f, 19.48f, 18.782f, 19.908f)
                curveTo(18.59f, 20.284f, 18.284f, 20.59f, 17.908f, 20.782f)
                curveTo(17.48f, 21f, 16.92f, 21f, 15.8f, 21f)
                horizontalLineTo(8.2f)
                curveTo(7.08f, 21f, 6.52f, 21f, 6.092f, 20.782f)
                curveTo(5.716f, 20.59f, 5.41f, 20.284f, 5.218f, 19.908f)
                curveTo(5f, 19.48f, 5f, 18.92f, 5f, 17.8f)
                verticalLineTo(12.4f)
                curveTo(5f, 10.16f, 5f, 9.04f, 5.436f, 8.184f)
                curveTo(5.819f, 7.431f, 6.431f, 6.819f, 7.184f, 6.436f)
                curveTo(7.659f, 6.194f, 8.216f, 6.086f, 9f, 6.038f)
            }
        }.build()

        return _BackpackAlt!!
    }

@Suppress("ObjectPropertyName")
private var _BackpackAlt: ImageVector? = null
