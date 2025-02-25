package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Annotation: ImageVector
    get() {
        if (_Annotation != null) {
            return _Annotation!!
        }
        _Annotation = ImageVector.Builder(
            name = "Annotation",
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
                moveTo(4f, 7.2f)
                curveTo(4f, 6.08f, 4f, 5.52f, 4.218f, 5.092f)
                curveTo(4.41f, 4.716f, 4.716f, 4.41f, 5.092f, 4.218f)
                curveTo(5.52f, 4f, 6.08f, 4f, 7.2f, 4f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 4f, 18.48f, 4f, 18.908f, 4.218f)
                curveTo(19.284f, 4.41f, 19.59f, 4.716f, 19.782f, 5.092f)
                curveTo(20f, 5.52f, 20f, 6.08f, 20f, 7.2f)
                verticalLineTo(13.8f)
                curveTo(20f, 14.92f, 20f, 15.48f, 19.782f, 15.908f)
                curveTo(19.59f, 16.284f, 19.284f, 16.59f, 18.908f, 16.782f)
                curveTo(18.48f, 17f, 17.92f, 17f, 16.8f, 17f)
                horizontalLineTo(15.663f)
                curveTo(15.418f, 17f, 15.296f, 17f, 15.181f, 17.028f)
                curveTo(15.079f, 17.052f, 14.981f, 17.093f, 14.892f, 17.147f)
                curveTo(14.791f, 17.209f, 14.704f, 17.296f, 14.531f, 17.469f)
                lineTo(12f, 20f)
                lineTo(9.469f, 17.469f)
                curveTo(9.296f, 17.296f, 9.209f, 17.209f, 9.108f, 17.147f)
                curveTo(9.019f, 17.093f, 8.921f, 17.052f, 8.819f, 17.028f)
                curveTo(8.704f, 17f, 8.582f, 17f, 8.337f, 17f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 17f, 5.52f, 17f, 5.092f, 16.782f)
                curveTo(4.716f, 16.59f, 4.41f, 16.284f, 4.218f, 15.908f)
                curveTo(4f, 15.48f, 4f, 14.92f, 4f, 13.8f)
                verticalLineTo(7.2f)
                close()
            }
        }.build()

        return _Annotation!!
    }

@Suppress("ObjectPropertyName")
private var _Annotation: ImageVector? = null
