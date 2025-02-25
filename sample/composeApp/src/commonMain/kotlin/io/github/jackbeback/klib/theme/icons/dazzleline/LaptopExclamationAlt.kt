package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LaptopExclamationAlt: ImageVector
    get() {
        if (_LaptopExclamationAlt != null) {
            return _LaptopExclamationAlt!!
        }
        _LaptopExclamationAlt = ImageVector.Builder(
            name = "LaptopExclamationAlt",
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
                moveTo(5f, 3f)
                verticalLineTo(6f)
                moveTo(5f, 9f)
                horizontalLineTo(5.01f)
                moveTo(21f, 16f)
                verticalLineTo(7.2f)
                curveTo(21f, 6.08f, 21f, 5.52f, 20.782f, 5.092f)
                curveTo(20.59f, 4.716f, 20.284f, 4.41f, 19.908f, 4.218f)
                curveTo(19.48f, 4f, 18.92f, 4f, 17.8f, 4f)
                horizontalLineTo(9f)
                moveTo(3f, 16f)
                verticalLineTo(13f)
                moveTo(22f, 16f)
                verticalLineTo(16.8f)
                curveTo(22f, 17.92f, 22f, 18.48f, 21.782f, 18.908f)
                curveTo(21.59f, 19.284f, 21.284f, 19.59f, 20.908f, 19.782f)
                curveTo(20.48f, 20f, 19.92f, 20f, 18.8f, 20f)
                horizontalLineTo(5.2f)
                curveTo(4.08f, 20f, 3.52f, 20f, 3.092f, 19.782f)
                curveTo(2.716f, 19.59f, 2.41f, 19.284f, 2.218f, 18.908f)
                curveTo(2f, 18.48f, 2f, 17.92f, 2f, 16.8f)
                verticalLineTo(16f)
                horizontalLineTo(8.337f)
                curveTo(8.582f, 16f, 8.704f, 16f, 8.819f, 16.028f)
                curveTo(8.921f, 16.052f, 9.019f, 16.093f, 9.108f, 16.147f)
                curveTo(9.209f, 16.209f, 9.296f, 16.296f, 9.469f, 16.469f)
                lineTo(9.531f, 16.531f)
                curveTo(9.704f, 16.704f, 9.791f, 16.791f, 9.892f, 16.853f)
                curveTo(9.981f, 16.907f, 10.079f, 16.948f, 10.181f, 16.972f)
                curveTo(10.296f, 17f, 10.418f, 17f, 10.663f, 17f)
                horizontalLineTo(13.337f)
                curveTo(13.582f, 17f, 13.704f, 17f, 13.819f, 16.972f)
                curveTo(13.921f, 16.948f, 14.019f, 16.907f, 14.108f, 16.853f)
                curveTo(14.209f, 16.791f, 14.296f, 16.704f, 14.469f, 16.531f)
                lineTo(14.531f, 16.469f)
                curveTo(14.704f, 16.296f, 14.791f, 16.209f, 14.892f, 16.147f)
                curveTo(14.981f, 16.093f, 15.079f, 16.052f, 15.181f, 16.028f)
                curveTo(15.296f, 16f, 15.418f, 16f, 15.663f, 16f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _LaptopExclamationAlt!!
    }

@Suppress("ObjectPropertyName")
private var _LaptopExclamationAlt: ImageVector? = null
