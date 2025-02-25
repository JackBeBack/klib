package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ImagesUser: ImageVector
    get() {
        if (_ImagesUser != null) {
            return _ImagesUser!!
        }
        _ImagesUser = ImageVector.Builder(
            name = "ImagesUser",
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
                moveTo(16.5f, 14f)
                curveTo(16.216f, 12.859f, 14.981f, 12f, 13.5f, 12f)
                curveTo(12.019f, 12f, 10.784f, 12.859f, 10.5f, 14f)
                moveTo(13.5f, 8f)
                horizontalLineTo(13.51f)
                moveTo(18f, 21f)
                horizontalLineTo(10.2f)
                curveTo(7.68f, 21f, 6.42f, 21f, 5.457f, 20.51f)
                curveTo(4.61f, 20.078f, 3.922f, 19.39f, 3.49f, 18.543f)
                curveTo(3f, 17.58f, 3f, 16.32f, 3f, 13.8f)
                verticalLineTo(6f)
                moveTo(9.2f, 18f)
                horizontalLineTo(17.8f)
                curveTo(18.92f, 18f, 19.48f, 18f, 19.908f, 17.782f)
                curveTo(20.284f, 17.59f, 20.59f, 17.284f, 20.782f, 16.908f)
                curveTo(21f, 16.48f, 21f, 15.92f, 21f, 14.8f)
                verticalLineTo(6.2f)
                curveTo(21f, 5.08f, 21f, 4.52f, 20.782f, 4.092f)
                curveTo(20.59f, 3.716f, 20.284f, 3.41f, 19.908f, 3.218f)
                curveTo(19.48f, 3f, 18.92f, 3f, 17.8f, 3f)
                horizontalLineTo(9.2f)
                curveTo(8.08f, 3f, 7.52f, 3f, 7.092f, 3.218f)
                curveTo(6.716f, 3.41f, 6.41f, 3.716f, 6.218f, 4.092f)
                curveTo(6f, 4.52f, 6f, 5.08f, 6f, 6.2f)
                verticalLineTo(14.8f)
                curveTo(6f, 15.92f, 6f, 16.48f, 6.218f, 16.908f)
                curveTo(6.41f, 17.284f, 6.716f, 17.59f, 7.092f, 17.782f)
                curveTo(7.52f, 18f, 8.08f, 18f, 9.2f, 18f)
                close()
                moveTo(14.5f, 8f)
                curveTo(14.5f, 8.552f, 14.052f, 9f, 13.5f, 9f)
                curveTo(12.948f, 9f, 12.5f, 8.552f, 12.5f, 8f)
                curveTo(12.5f, 7.448f, 12.948f, 7f, 13.5f, 7f)
                curveTo(14.052f, 7f, 14.5f, 7.448f, 14.5f, 8f)
                close()
            }
        }.build()

        return _ImagesUser!!
    }

@Suppress("ObjectPropertyName")
private var _ImagesUser: ImageVector? = null
