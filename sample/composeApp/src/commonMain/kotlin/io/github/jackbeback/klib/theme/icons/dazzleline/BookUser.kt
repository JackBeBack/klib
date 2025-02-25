package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BookUser: ImageVector
    get() {
        if (_BookUser != null) {
            return _BookUser!!
        }
        _BookUser = ImageVector.Builder(
            name = "BookUser",
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
                moveTo(5f, 19f)
                verticalLineTo(6.2f)
                curveTo(5f, 5.08f, 5f, 4.52f, 5.218f, 4.092f)
                curveTo(5.41f, 3.716f, 5.716f, 3.41f, 6.092f, 3.218f)
                curveTo(6.52f, 3f, 7.08f, 3f, 8.2f, 3f)
                horizontalLineTo(15.8f)
                curveTo(16.92f, 3f, 17.48f, 3f, 17.908f, 3.218f)
                curveTo(18.284f, 3.41f, 18.59f, 3.716f, 18.782f, 4.092f)
                curveTo(19f, 4.52f, 19f, 5.08f, 19f, 6.2f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                curveTo(5.895f, 17f, 5f, 17.895f, 5f, 19f)
                close()
                moveTo(5f, 19f)
                curveTo(5f, 20.105f, 5.895f, 21f, 7f, 21f)
                horizontalLineTo(19f)
                moveTo(18f, 17f)
                verticalLineTo(21f)
                moveTo(15f, 13.5f)
                curveTo(14.716f, 12.359f, 13.481f, 11.5f, 12f, 11.5f)
                curveTo(10.519f, 11.5f, 9.284f, 12.359f, 9f, 13.5f)
                moveTo(12f, 7.5f)
                horizontalLineTo(12.01f)
                moveTo(13f, 7.5f)
                curveTo(13f, 8.052f, 12.552f, 8.5f, 12f, 8.5f)
                curveTo(11.448f, 8.5f, 11f, 8.052f, 11f, 7.5f)
                curveTo(11f, 6.948f, 11.448f, 6.5f, 12f, 6.5f)
                curveTo(12.552f, 6.5f, 13f, 6.948f, 13f, 7.5f)
                close()
            }
        }.build()

        return _BookUser!!
    }

@Suppress("ObjectPropertyName")
private var _BookUser: ImageVector? = null
