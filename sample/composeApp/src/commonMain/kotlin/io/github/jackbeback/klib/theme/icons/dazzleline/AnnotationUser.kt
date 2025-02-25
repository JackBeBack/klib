package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.AnnotationUser: ImageVector
    get() {
        if (_AnnotationUser != null) {
            return _AnnotationUser!!
        }
        _AnnotationUser = ImageVector.Builder(
            name = "AnnotationUser",
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
                moveTo(7f, 17f)
                curveTo(7f, 17f, 8f, 14f, 12f, 14f)
                curveTo(16f, 14f, 17f, 17f, 17f, 17f)
                moveTo(14f, 9f)
                curveTo(14f, 10.105f, 13.105f, 11f, 12f, 11f)
                curveTo(10.895f, 11f, 10f, 10.105f, 10f, 9f)
                curveTo(10f, 7.895f, 10.895f, 7f, 12f, 7f)
                curveTo(13.105f, 7f, 14f, 7.895f, 14f, 9f)
                close()
                moveTo(12f, 20f)
                lineTo(14.531f, 17.469f)
                curveTo(14.704f, 17.296f, 14.791f, 17.209f, 14.892f, 17.147f)
                curveTo(14.981f, 17.093f, 15.079f, 17.052f, 15.181f, 17.028f)
                curveTo(15.296f, 17f, 15.418f, 17f, 15.663f, 17f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 17f, 18.48f, 17f, 18.908f, 16.782f)
                curveTo(19.284f, 16.59f, 19.59f, 16.284f, 19.782f, 15.908f)
                curveTo(20f, 15.48f, 20f, 14.92f, 20f, 13.8f)
                verticalLineTo(7.2f)
                curveTo(20f, 6.08f, 20f, 5.52f, 19.782f, 5.092f)
                curveTo(19.59f, 4.716f, 19.284f, 4.41f, 18.908f, 4.218f)
                curveTo(18.48f, 4f, 17.92f, 4f, 16.8f, 4f)
                horizontalLineTo(7.2f)
                curveTo(6.08f, 4f, 5.52f, 4f, 5.092f, 4.218f)
                curveTo(4.716f, 4.41f, 4.41f, 4.716f, 4.218f, 5.092f)
                curveTo(4f, 5.52f, 4f, 6.08f, 4f, 7.2f)
                verticalLineTo(13.8f)
                curveTo(4f, 14.92f, 4f, 15.48f, 4.218f, 15.908f)
                curveTo(4.41f, 16.284f, 4.716f, 16.59f, 5.092f, 16.782f)
                curveTo(5.52f, 17f, 6.08f, 17f, 7.2f, 17f)
                horizontalLineTo(8.337f)
                curveTo(8.582f, 17f, 8.704f, 17f, 8.819f, 17.028f)
                curveTo(8.921f, 17.052f, 9.019f, 17.093f, 9.108f, 17.147f)
                curveTo(9.209f, 17.209f, 9.296f, 17.296f, 9.469f, 17.469f)
                lineTo(12f, 20f)
                close()
            }
        }.build()

        return _AnnotationUser!!
    }

@Suppress("ObjectPropertyName")
private var _AnnotationUser: ImageVector? = null
