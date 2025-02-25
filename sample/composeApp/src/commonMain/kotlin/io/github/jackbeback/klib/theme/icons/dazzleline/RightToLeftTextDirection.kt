package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RightToLeftTextDirection: ImageVector
    get() {
        if (_RightToLeftTextDirection != null) {
            return _RightToLeftTextDirection!!
        }
        _RightToLeftTextDirection = ImageVector.Builder(
            name = "RightToLeftTextDirection",
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
                moveTo(3f, 18f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                lineTo(6f, 21f)
                moveTo(3f, 18f)
                lineTo(6f, 15f)
                moveTo(11f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                moveTo(15f, 3f)
                verticalLineTo(12f)
                moveTo(10.5f, 3f)
                curveTo(10.04f, 3f, 9.585f, 3.078f, 9.161f, 3.228f)
                curveTo(8.736f, 3.379f, 8.35f, 3.6f, 8.025f, 3.879f)
                curveTo(7.7f, 4.157f, 7.442f, 4.488f, 7.266f, 4.852f)
                curveTo(7.091f, 5.216f, 7f, 5.606f, 7f, 6f)
                curveTo(7f, 6.394f, 7.091f, 6.784f, 7.266f, 7.148f)
                curveTo(7.442f, 7.512f, 7.7f, 7.843f, 8.025f, 8.121f)
                curveTo(8.35f, 8.4f, 8.736f, 8.621f, 9.161f, 8.772f)
                curveTo(9.585f, 8.922f, 10.04f, 9f, 10.5f, 9f)
                lineTo(10.5f, 3f)
                close()
            }
        }.build()

        return _RightToLeftTextDirection!!
    }

@Suppress("ObjectPropertyName")
private var _RightToLeftTextDirection: ImageVector? = null
