package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.LeftToRightTextDirection: ImageVector
    get() {
        if (_LeftToRightTextDirection != null) {
            return _LeftToRightTextDirection!!
        }
        _LeftToRightTextDirection = ImageVector.Builder(
            name = "LeftToRightTextDirection",
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
                moveTo(21f, 18f)
                horizontalLineTo(3f)
                moveTo(21f, 18f)
                lineTo(18f, 21f)
                moveTo(21f, 18f)
                lineTo(18f, 15f)
                moveTo(13f, 3f)
                verticalLineTo(12f)
                moveTo(13f, 3f)
                horizontalLineTo(7f)
                moveTo(13f, 3f)
                curveTo(13.46f, 3f, 13.915f, 3.078f, 14.339f, 3.228f)
                curveTo(14.764f, 3.379f, 15.15f, 3.6f, 15.475f, 3.879f)
                curveTo(15.8f, 4.157f, 16.058f, 4.488f, 16.234f, 4.852f)
                curveTo(16.41f, 5.216f, 16.5f, 5.606f, 16.5f, 6f)
                curveTo(16.5f, 6.394f, 16.41f, 6.784f, 16.234f, 7.148f)
                curveTo(16.058f, 7.512f, 15.8f, 7.843f, 15.475f, 8.121f)
                curveTo(15.15f, 8.4f, 14.764f, 8.621f, 14.339f, 8.772f)
                curveTo(13.915f, 8.922f, 13.46f, 9f, 13f, 9f)
                verticalLineTo(3f)
                close()
                moveTo(9f, 3f)
                verticalLineTo(12f)
            }
        }.build()

        return _LeftToRightTextDirection!!
    }

@Suppress("ObjectPropertyName")
private var _LeftToRightTextDirection: ImageVector? = null
