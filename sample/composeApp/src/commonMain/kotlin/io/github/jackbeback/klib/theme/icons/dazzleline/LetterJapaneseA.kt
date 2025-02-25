package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LetterJapaneseA: ImageVector
    get() {
        if (_LetterJapaneseA != null) {
            return _LetterJapaneseA!!
        }
        _LetterJapaneseA = ImageVector.Builder(
            name = "LetterJapaneseA",
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
                moveTo(15.486f, 9f)
                curveTo(15.556f, 9.451f, 15.512f, 10.037f, 15.359f, 10.701f)
                moveTo(15.359f, 10.701f)
                curveTo(14.647f, 13.804f, 11.565f, 18.623f, 6.633f, 19.492f)
                curveTo(6.633f, 19.492f, 5.284f, 19.78f, 4.543f, 19.023f)
                curveTo(3.282f, 17.735f, 3.413f, 14.328f, 14.021f, 11.002f)
                curveTo(14.456f, 10.865f, 14.908f, 10.764f, 15.359f, 10.701f)
                close()
                moveTo(15.359f, 10.701f)
                curveTo(19.612f, 10.106f, 23.899f, 12.862f, 14.876f, 21f)
                moveTo(7.531f, 6f)
                curveTo(9f, 6f, 13f, 5.5f, 15.535f, 5f)
                moveTo(11.531f, 3f)
                curveTo(10.5f, 7f, 9.5f, 10.5f, 11.531f, 19f)
            }
        }.build()

        return _LetterJapaneseA!!
    }

@Suppress("ObjectPropertyName")
private var _LetterJapaneseA: ImageVector? = null
