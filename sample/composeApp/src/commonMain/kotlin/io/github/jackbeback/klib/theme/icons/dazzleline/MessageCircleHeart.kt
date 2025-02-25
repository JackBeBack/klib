package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MessageCircleHeart: ImageVector
    get() {
        if (_MessageCircleHeart != null) {
            return _MessageCircleHeart!!
        }
        _MessageCircleHeart = ImageVector.Builder(
            name = "MessageCircleHeart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.993f, 9.281f)
                curveTo(11.191f, 8.355f, 9.854f, 8.105f, 8.849f, 8.953f)
                curveTo(7.844f, 9.801f, 7.703f, 11.219f, 8.492f, 12.222f)
                curveTo(8.96f, 12.817f, 10.105f, 13.883f, 10.959f, 14.651f)
                curveTo(11.313f, 14.97f, 11.491f, 15.13f, 11.704f, 15.194f)
                curveTo(11.887f, 15.249f, 12.099f, 15.249f, 12.282f, 15.194f)
                curveTo(12.496f, 15.13f, 12.673f, 14.97f, 13.028f, 14.651f)
                curveTo(13.882f, 13.883f, 15.027f, 12.817f, 15.495f, 12.222f)
                curveTo(16.284f, 11.219f, 16.16f, 9.792f, 15.138f, 8.953f)
                curveTo(14.115f, 8.114f, 12.795f, 8.355f, 11.993f, 9.281f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(9.964f, 21f, 3.001f, 21f, 3.001f, 21f)
                curveTo(3.001f, 21f, 4.56f, 17.256f, 3.936f, 16.001f)
                curveTo(3.337f, 14.796f, 3f, 13.437f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                close()
            }
        }.build()

        return _MessageCircleHeart!!
    }

@Suppress("ObjectPropertyName")
private var _MessageCircleHeart: ImageVector? = null
