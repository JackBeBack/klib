package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) {
            return _LockClosed!!
        }
        _LockClosed = ImageVector.Builder(
            name = "LockClosed",
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
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 10f)
                verticalLineTo(8f)
                curveTo(8f, 5.791f, 9.791f, 4f, 12f, 4f)
                curveTo(14.209f, 4f, 16f, 5.791f, 16f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _LockClosed!!
    }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null
