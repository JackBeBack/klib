package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.MouseAlt4: ImageVector
    get() {
        if (_MouseAlt4 != null) {
            return _MouseAlt4!!
        }
        _MouseAlt4 = ImageVector.Builder(
            name = "MouseAlt4",
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
                moveTo(12f, 3f)
                verticalLineTo(9f)
                moveTo(12f, 3f)
                curveTo(9.019f, 3f, 7.148f, 5.222f, 6.389f, 6.354f)
                curveTo(6.29f, 6.502f, 6.24f, 6.576f, 6.169f, 6.739f)
                curveTo(6.119f, 6.852f, 6.053f, 7.068f, 6.031f, 7.19f)
                curveTo(6f, 7.365f, 6f, 7.495f, 6f, 7.755f)
                verticalLineTo(15f)
                curveTo(6f, 18.314f, 8.686f, 21f, 12f, 21f)
                curveTo(15.314f, 21f, 18f, 18.314f, 18f, 15f)
                verticalLineTo(7.755f)
                curveTo(18f, 7.495f, 18f, 7.365f, 17.969f, 7.19f)
                curveTo(17.947f, 7.068f, 17.881f, 6.852f, 17.831f, 6.739f)
                curveTo(17.76f, 6.576f, 17.71f, 6.502f, 17.611f, 6.354f)
                curveTo(16.852f, 5.222f, 14.981f, 3f, 12f, 3f)
                close()
                moveTo(6f, 9f)
                horizontalLineTo(18f)
            }
        }.build()

        return _MouseAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _MouseAlt4: ImageVector? = null
