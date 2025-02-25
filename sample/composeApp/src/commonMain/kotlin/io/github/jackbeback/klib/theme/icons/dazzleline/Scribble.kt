package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Scribble: ImageVector
    get() {
        if (_Scribble != null) {
            return _Scribble!!
        }
        _Scribble = ImageVector.Builder(
            name = "Scribble",
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
                moveTo(3.631f, 8.37f)
                lineTo(8.324f, 3.676f)
                curveTo(9.25f, 2.75f, 10.764f, 2.764f, 11.707f, 3.707f)
                curveTo(12.649f, 4.649f, 12.663f, 6.164f, 11.737f, 7.089f)
                lineTo(3.691f, 15.135f)
                curveTo(2.766f, 16.061f, 2.779f, 17.575f, 3.722f, 18.518f)
                curveTo(4.664f, 19.46f, 6.179f, 19.474f, 7.104f, 18.548f)
                lineTo(15.15f, 10.502f)
                curveTo(16.076f, 9.577f, 17.59f, 9.59f, 18.533f, 10.533f)
                curveTo(19.475f, 11.475f, 19.49f, 12.989f, 18.564f, 13.915f)
                lineTo(15.546f, 16.933f)
                curveTo(13.767f, 18.712f, 16.231f, 21.587f, 18.216f, 20.836f)
                curveTo(18.768f, 20.628f, 21f, 18.999f, 21f, 18.999f)
            }
        }.build()

        return _Scribble!!
    }

@Suppress("ObjectPropertyName")
private var _Scribble: ImageVector? = null
