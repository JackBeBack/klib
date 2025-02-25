package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.University: ImageVector
    get() {
        if (_University != null) {
            return _University!!
        }
        _University = ImageVector.Builder(
            name = "University",
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
                moveTo(5f, 8f)
                verticalLineTo(17.019f)
                moveTo(9f, 8f)
                verticalLineTo(17f)
                moveTo(15f, 8f)
                verticalLineTo(17f)
                moveTo(19f, 8f)
                verticalLineTo(17.019f)
                moveTo(5f, 17.019f)
                curveTo(5.314f, 17f, 5.702f, 17f, 6.2f, 17f)
                horizontalLineTo(17.8f)
                curveTo(18.298f, 17f, 18.686f, 17f, 19f, 17.019f)
                moveTo(5f, 17.019f)
                curveTo(4.608f, 17.043f, 4.33f, 17.097f, 4.092f, 17.218f)
                curveTo(3.716f, 17.41f, 3.41f, 17.716f, 3.218f, 18.092f)
                curveTo(3f, 18.52f, 3f, 19.08f, 3f, 20.2f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(20.2f)
                curveTo(21f, 19.08f, 21f, 18.52f, 20.782f, 18.092f)
                curveTo(20.59f, 17.716f, 20.284f, 17.41f, 19.908f, 17.218f)
                curveTo(19.67f, 17.097f, 19.392f, 17.043f, 19f, 17.019f)
                moveTo(3f, 5.5f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(5.5f)
                lineTo(12f, 3f)
                lineTo(3f, 5.5f)
                close()
            }
        }.build()

        return _University!!
    }

@Suppress("ObjectPropertyName")
private var _University: ImageVector? = null
