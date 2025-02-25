package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LetterChineseA: ImageVector
    get() {
        if (_LetterChineseA != null) {
            return _LetterChineseA!!
        }
        _LetterChineseA = ImageVector.Builder(
            name = "LetterChineseA",
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
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                moveTo(12f, 4f)
                verticalLineTo(6f)
                moveTo(8.096f, 9.979f)
                curveTo(8.575f, 11.554f, 9.508f, 14.097f, 12.144f, 16.394f)
                moveTo(12.144f, 16.394f)
                curveTo(13.726f, 17.772f, 15.921f, 19.062f, 19f, 20f)
                moveTo(12.144f, 16.394f)
                curveTo(15.24f, 13.246f, 17.069f, 8.77f, 17.069f, 6f)
                moveTo(12.144f, 16.394f)
                curveTo(10.21f, 18.36f, 7.784f, 19.808f, 5f, 20f)
            }
        }.build()

        return _LetterChineseA!!
    }

@Suppress("ObjectPropertyName")
private var _LetterChineseA: ImageVector? = null
