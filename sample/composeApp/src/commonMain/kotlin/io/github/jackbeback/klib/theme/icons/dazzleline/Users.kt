package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Users: ImageVector
    get() {
        if (_Users != null) {
            return _Users!!
        }
        _Users = ImageVector.Builder(
            name = "Users",
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
                moveTo(13f, 20f)
                verticalLineTo(18f)
                curveTo(13f, 15.239f, 10.761f, 13f, 8f, 13f)
                curveTo(5.239f, 13f, 3f, 15.239f, 3f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                close()
                moveTo(13f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                curveTo(21f, 16.055f, 18.761f, 14f, 16f, 14f)
                curveTo(14.587f, 14f, 13.31f, 14.625f, 12.401f, 15.631f)
                moveTo(11f, 7f)
                curveTo(11f, 8.657f, 9.657f, 10f, 8f, 10f)
                curveTo(6.343f, 10f, 5f, 8.657f, 5f, 7f)
                curveTo(5f, 5.343f, 6.343f, 4f, 8f, 4f)
                curveTo(9.657f, 4f, 11f, 5.343f, 11f, 7f)
                close()
                moveTo(18f, 9f)
                curveTo(18f, 10.105f, 17.105f, 11f, 16f, 11f)
                curveTo(14.895f, 11f, 14f, 10.105f, 14f, 9f)
                curveTo(14f, 7.895f, 14.895f, 7f, 16f, 7f)
                curveTo(17.105f, 7f, 18f, 7.895f, 18f, 9f)
                close()
            }
        }.build()

        return _Users!!
    }

@Suppress("ObjectPropertyName")
private var _Users: ImageVector? = null
