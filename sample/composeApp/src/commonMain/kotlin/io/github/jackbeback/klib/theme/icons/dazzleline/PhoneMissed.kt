package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PhoneMissed: ImageVector
    get() {
        if (_PhoneMissed != null) {
            return _PhoneMissed!!
        }
        _PhoneMissed = ImageVector.Builder(
            name = "PhoneMissed",
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
                moveTo(20f, 3f)
                lineTo(16.215f, 6.312f)
                curveTo(14.722f, 7.619f, 13.975f, 8.272f, 13.135f, 8.521f)
                curveTo(12.394f, 8.74f, 11.606f, 8.74f, 10.866f, 8.521f)
                curveTo(10.026f, 8.272f, 9.279f, 7.619f, 7.786f, 6.312f)
                lineTo(4f, 3f)
                moveTo(4f, 3f)
                horizontalLineTo(8f)
                moveTo(4f, 3f)
                verticalLineTo(7f)
                moveTo(3.392f, 16.571f)
                curveTo(8.172f, 11.835f, 15.885f, 11.87f, 20.622f, 16.65f)
                curveTo(20.766f, 16.796f, 20.906f, 16.944f, 21.041f, 17.095f)
                curveTo(21.324f, 17.41f, 21.466f, 17.568f, 21.529f, 17.792f)
                curveTo(21.58f, 17.974f, 21.573f, 18.212f, 21.511f, 18.391f)
                curveTo(21.435f, 18.61f, 21.265f, 18.778f, 20.926f, 19.115f)
                lineTo(19.73f, 20.3f)
                curveTo(19.443f, 20.584f, 19.3f, 20.726f, 19.13f, 20.801f)
                curveTo(18.98f, 20.867f, 18.816f, 20.895f, 18.653f, 20.883f)
                curveTo(18.468f, 20.869f, 18.285f, 20.783f, 17.92f, 20.61f)
                lineTo(15.967f, 19.688f)
                curveTo(15.542f, 19.487f, 15.33f, 19.387f, 15.192f, 19.229f)
                curveTo(15.071f, 19.089f, 14.991f, 18.918f, 14.96f, 18.736f)
                curveTo(14.926f, 18.529f, 14.984f, 18.301f, 15.1f, 17.846f)
                lineTo(15.34f, 16.904f)
                curveTo(13.204f, 16.09f, 10.814f, 16.077f, 8.671f, 16.873f)
                lineTo(8.902f, 17.817f)
                curveTo(9.014f, 18.274f, 9.07f, 18.502f, 9.034f, 18.708f)
                curveTo(9.002f, 18.891f, 8.92f, 19.061f, 8.797f, 19.199f)
                curveTo(8.658f, 19.356f, 8.445f, 19.455f, 8.018f, 19.651f)
                lineTo(6.057f, 20.556f)
                curveTo(5.69f, 20.725f, 5.507f, 20.809f, 5.322f, 20.822f)
                curveTo(5.158f, 20.832f, 4.995f, 20.803f, 4.845f, 20.735f)
                curveTo(4.676f, 20.659f, 4.534f, 20.516f, 4.25f, 20.229f)
                lineTo(3.065f, 19.033f)
                curveTo(2.729f, 18.693f, 2.56f, 18.524f, 2.486f, 18.303f)
                curveTo(2.426f, 18.124f, 2.421f, 17.886f, 2.474f, 17.704f)
                curveTo(2.539f, 17.481f, 2.682f, 17.325f, 2.968f, 17.012f)
                curveTo(3.105f, 16.863f, 3.246f, 16.715f, 3.392f, 16.571f)
                close()
            }
        }.build()

        return _PhoneMissed!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneMissed: ImageVector? = null
