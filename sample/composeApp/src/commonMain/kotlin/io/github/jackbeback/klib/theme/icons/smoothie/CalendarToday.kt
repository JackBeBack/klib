package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.CalendarToday: ImageVector
    get() {
        if (_CalendarToday != null) {
            return _CalendarToday!!
        }
        _CalendarToday = ImageVector.Builder(
            name = "CalendarToday",
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
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 8.267f)
                verticalLineTo(19f)
                curveTo(3f, 19.552f, 3.448f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(20.552f, 20f, 21f, 19.552f, 21f, 19f)
                verticalLineTo(8.267f)
                moveTo(3f, 8.267f)
                verticalLineTo(5f)
                curveTo(3f, 4.448f, 3.448f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                curveTo(20.552f, 4f, 21f, 4.448f, 21f, 5f)
                verticalLineTo(8.267f)
                moveTo(3f, 8.267f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 2f)
                verticalLineTo(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 2f)
                verticalLineTo(5f)
            }
        }.build()

        return _CalendarToday!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarToday: ImageVector? = null
