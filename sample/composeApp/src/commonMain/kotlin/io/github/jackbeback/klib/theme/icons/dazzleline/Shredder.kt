package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Shredder: ImageVector
    get() {
        if (_Shredder != null) {
            return _Shredder!!
        }
        _Shredder = ImageVector.Builder(
            name = "Shredder",
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
                moveTo(20f, 16f)
                verticalLineTo(12.2f)
                curveTo(20f, 11.08f, 20f, 10.52f, 19.782f, 10.092f)
                curveTo(19.59f, 9.716f, 19.284f, 9.41f, 18.908f, 9.218f)
                curveTo(18.48f, 9f, 17.92f, 9f, 16.8f, 9f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 9f, 5.52f, 9f, 5.092f, 9.218f)
                curveTo(4.716f, 9.41f, 4.41f, 9.716f, 4.218f, 10.092f)
                curveTo(4f, 10.52f, 4f, 11.08f, 4f, 12.2f)
                verticalLineTo(16f)
                moveTo(5f, 9.268f)
                verticalLineTo(4.6f)
                curveTo(5f, 4.04f, 5f, 3.76f, 5.109f, 3.546f)
                curveTo(5.205f, 3.358f, 5.358f, 3.205f, 5.546f, 3.109f)
                curveTo(5.76f, 3f, 6.04f, 3f, 6.6f, 3f)
                horizontalLineTo(16.337f)
                curveTo(16.582f, 3f, 16.704f, 3f, 16.819f, 3.028f)
                curveTo(16.921f, 3.052f, 17.019f, 3.093f, 17.108f, 3.147f)
                curveTo(17.209f, 3.209f, 17.296f, 3.296f, 17.469f, 3.469f)
                lineTo(18.531f, 4.531f)
                curveTo(18.704f, 4.704f, 18.791f, 4.791f, 18.853f, 4.892f)
                curveTo(18.907f, 4.981f, 18.948f, 5.079f, 18.972f, 5.181f)
                curveTo(19f, 5.296f, 19f, 5.418f, 19f, 5.663f)
                verticalLineTo(9.268f)
                moveTo(8f, 16f)
                verticalLineTo(21f)
                moveTo(12f, 16f)
                verticalLineTo(21f)
                moveTo(16f, 16f)
                verticalLineTo(21f)
            }
        }.build()

        return _Shredder!!
    }

@Suppress("ObjectPropertyName")
private var _Shredder: ImageVector? = null
