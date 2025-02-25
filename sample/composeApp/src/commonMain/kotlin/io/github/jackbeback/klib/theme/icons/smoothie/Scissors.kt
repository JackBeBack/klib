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

val Smoothie.Scissors: ImageVector
    get() {
        if (_Scissors != null) {
            return _Scissors!!
        }
        _Scissors = ImageVector.Builder(
            name = "Scissors",
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
                    moveTo(4.688f, 11.787f)
                    moveToRelative(-1f, -1.732f)
                    arcToRelative(2f, 2f, 95.194f, isMoreThanHalf = true, isPositiveArc = true, 2f, 3.464f)
                    arcToRelative(2f, 2f, 95.194f, isMoreThanHalf = true, isPositiveArc = true, -2f, -3.464f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(5.688f, 13.519f)
                    lineTo(21.044f, 8.117f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(12.127f, 19.226f)
                    moveToRelative(-1.732f, -1f)
                    arcToRelative(2f, 2f, 62.656f, isMoreThanHalf = true, isPositiveArc = true, 3.464f, 2f)
                    arcToRelative(2f, 2f, 62.656f, isMoreThanHalf = true, isPositiveArc = true, -3.464f, -2f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1f,
                    strokeLineCap = StrokeCap.Round,
                    strokeLineJoin = StrokeJoin.Round
                ) {
                    moveTo(10.395f, 18.226f)
                    lineTo(15.797f, 2.87f)
                }
            }
        }.build()

        return _Scissors!!
    }

@Suppress("ObjectPropertyName")
private var _Scissors: ImageVector? = null
