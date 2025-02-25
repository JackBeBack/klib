package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LetterEnglishA: ImageVector
    get() {
        if (_LetterEnglishA != null) {
            return _LetterEnglishA!!
        }
        _LetterEnglishA = ImageVector.Builder(
            name = "LetterEnglishA",
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
                moveTo(6f, 21f)
                lineTo(7.5f, 15f)
                moveTo(18f, 21f)
                lineTo(16.5f, 15f)
                moveTo(16.5f, 15f)
                lineTo(14f, 5f)
                curveTo(14f, 5f, 13.5f, 3f, 12f, 3f)
                curveTo(10.5f, 3f, 10f, 5f, 10f, 5f)
                lineTo(7.5f, 15f)
                moveTo(16.5f, 15f)
                horizontalLineTo(7.5f)
            }
        }.build()

        return _LetterEnglishA!!
    }

@Suppress("ObjectPropertyName")
private var _LetterEnglishA: ImageVector? = null
