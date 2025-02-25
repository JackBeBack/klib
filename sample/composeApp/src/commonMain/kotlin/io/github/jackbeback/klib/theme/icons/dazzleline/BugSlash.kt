package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BugSlash: ImageVector
    get() {
        if (_BugSlash != null) {
            return _BugSlash!!
        }
        _BugSlash = ImageVector.Builder(
            name = "BugSlash",
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
                moveTo(12f, 19f)
                verticalLineTo(17f)
                moveTo(12f, 19f)
                curveTo(9.239f, 19f, 7f, 16.761f, 7f, 14f)
                moveTo(12f, 19f)
                curveTo(13.895f, 19f, 15.544f, 17.945f, 16.392f, 16.391f)
                moveTo(7f, 14f)
                verticalLineTo(11f)
                curveTo(7f, 9.895f, 7.895f, 9f, 9f, 9f)
                moveTo(7f, 14f)
                horizontalLineTo(4f)
                moveTo(17f, 11.398f)
                verticalLineTo(11f)
                curveTo(17f, 9.895f, 16.105f, 9f, 15f, 9f)
                horizontalLineTo(14.598f)
                moveTo(4.5f, 20.5f)
                lineTo(8f, 17f)
                moveTo(7f, 10f)
                lineTo(4.5f, 7.5f)
                moveTo(19.598f, 14f)
                horizontalLineTo(20f)
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(10.071f, 4.472f)
                curveTo(10.302f, 3.623f, 11.078f, 3f, 12f, 3f)
                curveTo(13.105f, 3f, 14f, 3.895f, 14f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11.598f)
                moveTo(17f, 10f)
                lineTo(19.5f, 7.5f)
            }
        }.build()

        return _BugSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BugSlash: ImageVector? = null
