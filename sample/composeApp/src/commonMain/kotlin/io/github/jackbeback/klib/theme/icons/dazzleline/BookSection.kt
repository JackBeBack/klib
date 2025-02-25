package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BookSection: ImageVector
    get() {
        if (_BookSection != null) {
            return _BookSection!!
        }
        _BookSection = ImageVector.Builder(
            name = "BookSection",
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
                moveTo(14.5f, 8f)
                verticalLineTo(7.917f)
                curveTo(14.5f, 6.858f, 13.642f, 6f, 12.583f, 6f)
                horizontalLineTo(11.5f)
                curveTo(10.395f, 6f, 9.5f, 6.895f, 9.5f, 8f)
                curveTo(9.5f, 9.105f, 10.395f, 10f, 11.5f, 10f)
                horizontalLineTo(12.5f)
                curveTo(13.605f, 10f, 14.5f, 10.895f, 14.5f, 12f)
                curveTo(14.5f, 13.105f, 13.605f, 14f, 12.5f, 14f)
                horizontalLineTo(11.458f)
                curveTo(10.377f, 14f, 9.5f, 13.123f, 9.5f, 12.042f)
                verticalLineTo(12f)
            }
        }.build()

        return _BookSection!!
    }

@Suppress("ObjectPropertyName")
private var _BookSection: ImageVector? = null
