package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) {
            return _ChevronLeft!!
        }
        _ChevronLeft = ImageVector.Builder(
            name = "ChevronLeft",
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
                moveTo(14.5f, 17f)
                lineTo(9.5f, 12f)
                lineTo(14.5f, 7f)
            }
        }.build()

        return _ChevronLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronLeft: ImageVector? = null
