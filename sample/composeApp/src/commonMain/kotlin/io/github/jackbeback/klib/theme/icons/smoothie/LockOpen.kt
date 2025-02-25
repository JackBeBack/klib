package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.LockOpen: ImageVector
    get() {
        if (_LockOpen != null) {
            return _LockOpen!!
        }
        _LockOpen = ImageVector.Builder(
            name = "LockOpen",
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
                moveTo(6f, 19f)
                verticalLineTo(11f)
                curveTo(6f, 10.448f, 6.448f, 10f, 7f, 10f)
                horizontalLineTo(17f)
                curveTo(17.552f, 10f, 18f, 10.448f, 18f, 11f)
                verticalLineTo(19f)
                curveTo(18f, 19.552f, 17.552f, 20f, 17f, 20f)
                horizontalLineTo(7f)
                curveTo(6.448f, 20f, 6f, 19.552f, 6f, 19f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
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
                moveTo(16f, 10f)
                verticalLineTo(6.5f)
                curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
                verticalLineTo(4f)
                verticalLineTo(4f)
                curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
                verticalLineTo(10f)
            }
        }.build()

        return _LockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpen: ImageVector? = null
