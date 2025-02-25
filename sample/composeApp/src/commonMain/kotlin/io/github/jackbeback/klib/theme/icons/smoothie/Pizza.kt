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

val Smoothie.Pizza: ImageVector
    get() {
        if (_Pizza != null) {
            return _Pizza!!
        }
        _Pizza = ImageVector.Builder(
            name = "Pizza",
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
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(7.939f, 4.182f)
                    lineTo(2.561f, 20.316f)
                    curveTo(2.301f, 21.098f, 3.045f, 21.841f, 3.826f, 21.581f)
                    lineTo(19.96f, 16.203f)
                    moveTo(7.939f, 4.182f)
                    lineTo(7.977f, 4.07f)
                    curveTo(8.447f, 2.66f, 10.237f, 2.237f, 11.288f, 3.288f)
                    lineTo(20.854f, 12.854f)
                    curveTo(21.905f, 13.905f, 21.483f, 15.695f, 20.072f, 16.166f)
                    lineTo(19.96f, 16.203f)
                    moveTo(7.939f, 4.182f)
                    lineTo(19.96f, 16.203f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(9.5f, 11.5f)
                    moveToRelative(-1.5f, 0f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(13f, 15f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(7.5f, 16.5f)
                    moveToRelative(-1f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                }
            }
        }.build()

        return _Pizza!!
    }

@Suppress("ObjectPropertyName")
private var _Pizza: ImageVector? = null
