package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCcwAlt4: ImageVector
    get() {
        if (_RefreshCcwAlt4 != null) {
            return _RefreshCcwAlt4!!
        }
        _RefreshCcwAlt4 = ImageVector.Builder(
            name = "RefreshCcwAlt4",
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
                moveTo(5.391f, 5.891f)
                lineTo(8.5f, 9f)
                horizontalLineTo(2.5f)
                verticalLineTo(3f)
                lineTo(5.391f, 5.891f)
                close()
                moveTo(5.391f, 5.891f)
                curveTo(7.035f, 4.113f, 9.388f, 3f, 12f, 3f)
                curveTo(16.633f, 3f, 20.448f, 6.5f, 20.945f, 11f)
                moveTo(18.609f, 18.109f)
                lineTo(21.5f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(15.5f)
                lineTo(18.609f, 18.109f)
                close()
                moveTo(18.609f, 18.109f)
                curveTo(16.965f, 19.887f, 14.613f, 21f, 12f, 21f)
                curveTo(7.367f, 21f, 3.552f, 17.5f, 3.055f, 13f)
            }
        }.build()

        return _RefreshCcwAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCcwAlt4: ImageVector? = null
