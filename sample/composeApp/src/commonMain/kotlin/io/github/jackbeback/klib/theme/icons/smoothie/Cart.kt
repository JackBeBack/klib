package io.github.jackbeback.klib.theme.icons.smoothie

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smoothie.Cart: ImageVector
    get() {
        if (_Cart != null) {
            return _Cart!!
        }
        _Cart = ImageVector.Builder(
            name = "Cart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineToRelative(-24f)
                    close()
                }
            ) {
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
                    moveTo(5.333f, 6f)
                    horizontalLineTo(19.867f)
                    curveTo(20.469f, 6f, 20.934f, 6.527f, 20.86f, 7.124f)
                    lineTo(20.11f, 13.124f)
                    curveTo(20.047f, 13.625f, 19.622f, 14f, 19.117f, 14f)
                    horizontalLineTo(16.556f)
                    horizontalLineTo(9.444f)
                    horizontalLineTo(8f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(2f, 4f)
                    horizontalLineTo(4.234f)
                    curveTo(4.686f, 4f, 5.082f, 4.303f, 5.199f, 4.74f)
                    lineTo(8.301f, 16.26f)
                    curveTo(8.418f, 16.697f, 8.814f, 17f, 9.266f, 17f)
                    horizontalLineTo(19f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(10f, 20f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(17.5f, 20f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
        }.build()

        return _Cart!!
    }

@Suppress("ObjectPropertyName")
private var _Cart: ImageVector? = null
