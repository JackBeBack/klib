package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TentArrowTurnLeft: ImageVector
    get() {
        if (_TentArrowTurnLeft != null) {
            return _TentArrowTurnLeft!!
        }
        _TentArrowTurnLeft = ImageVector.Builder(
            name = "TentArrowTurnLeft",
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
                moveTo(19f, 9f)
                verticalLineTo(8.2f)
                curveTo(19f, 7.08f, 19f, 6.52f, 18.782f, 6.092f)
                curveTo(18.59f, 5.716f, 18.284f, 5.41f, 17.908f, 5.218f)
                curveTo(17.48f, 5f, 16.92f, 5f, 15.8f, 5f)
                horizontalLineTo(5f)
                moveTo(5f, 5f)
                lineTo(8f, 2f)
                moveTo(5f, 5f)
                lineTo(8f, 8f)
                moveTo(12f, 10f)
                lineTo(16.404f, 12.936f)
                curveTo(16.809f, 13.206f, 17.011f, 13.34f, 17.171f, 13.513f)
                curveTo(17.313f, 13.666f, 17.43f, 13.84f, 17.518f, 14.029f)
                curveTo(17.618f, 14.243f, 17.667f, 14.481f, 17.764f, 14.957f)
                lineTo(18.607f, 19.079f)
                curveTo(18.742f, 19.737f, 18.809f, 20.066f, 18.721f, 20.324f)
                curveTo(18.643f, 20.55f, 18.488f, 20.741f, 18.282f, 20.862f)
                curveTo(18.047f, 21f, 17.711f, 21f, 17.04f, 21f)
                horizontalLineTo(16f)
                moveTo(12f, 10f)
                lineTo(7.596f, 12.936f)
                curveTo(7.191f, 13.206f, 6.989f, 13.34f, 6.829f, 13.513f)
                curveTo(6.687f, 13.666f, 6.57f, 13.84f, 6.482f, 14.029f)
                curveTo(6.382f, 14.243f, 6.333f, 14.481f, 6.236f, 14.957f)
                lineTo(5.393f, 19.079f)
                curveTo(5.258f, 19.737f, 5.191f, 20.066f, 5.279f, 20.324f)
                curveTo(5.357f, 20.55f, 5.512f, 20.741f, 5.718f, 20.862f)
                curveTo(5.953f, 21f, 6.289f, 21f, 6.96f, 21f)
                horizontalLineTo(12f)
                moveTo(12f, 10f)
                verticalLineTo(15f)
                moveTo(12f, 21f)
                horizontalLineTo(16f)
                moveTo(12f, 21f)
                verticalLineTo(15f)
                moveTo(16f, 21f)
                lineTo(12f, 15f)
            }
        }.build()

        return _TentArrowTurnLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TentArrowTurnLeft: ImageVector? = null
