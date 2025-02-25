package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.SelectionBoxOff: ImageVector
    get() {
        if (_SelectionBoxOff != null) {
            return _SelectionBoxOff!!
        }
        _SelectionBoxOff = ImageVector.Builder(
            name = "SelectionBoxOff",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                curveTo(4f, 4.895f, 4.895f, 4f, 6f, 4f)
                horizontalLineTo(18f)
                curveTo(19.105f, 4f, 20f, 4.895f, 20f, 6f)
                verticalLineTo(18f)
                curveTo(20f, 19.105f, 19.105f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(4.895f, 20f, 4f, 19.105f, 4f, 18f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _SelectionBoxOff!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionBoxOff: ImageVector? = null
