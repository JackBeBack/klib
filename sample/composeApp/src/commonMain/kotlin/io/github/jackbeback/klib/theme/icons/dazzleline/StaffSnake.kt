package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.StaffSnake: ImageVector
    get() {
        if (_StaffSnake != null) {
            return _StaffSnake!!
        }
        _StaffSnake = ImageVector.Builder(
            name = "StaffSnake",
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
                moveTo(15f, 19f)
                curveTo(16.105f, 19f, 17f, 18.105f, 17f, 17f)
                curveTo(17f, 15.895f, 16.105f, 15f, 15f, 15f)
                horizontalLineTo(10f)
                curveTo(8.895f, 15f, 8f, 14.105f, 8f, 13f)
                curveTo(8f, 12.26f, 8.402f, 11.613f, 9f, 11.268f)
                moveTo(12f, 19f)
                horizontalLineTo(10f)
                moveTo(15f, 11f)
                horizontalLineTo(17f)
                curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
                curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
                horizontalLineTo(8f)
                moveTo(12f, 3f)
                verticalLineTo(21f)
                moveTo(8f, 5f)
                horizontalLineTo(6f)
                curveTo(4.895f, 5f, 4f, 5.895f, 4f, 7f)
                curveTo(4f, 8.105f, 4.895f, 9f, 6f, 9f)
                curveTo(7.105f, 9f, 8f, 8.105f, 8f, 7f)
                verticalLineTo(6.5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _StaffSnake!!
    }

@Suppress("ObjectPropertyName")
private var _StaffSnake: ImageVector? = null
