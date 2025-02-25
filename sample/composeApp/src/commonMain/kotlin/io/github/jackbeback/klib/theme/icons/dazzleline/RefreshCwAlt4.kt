package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.RefreshCwAlt4: ImageVector
    get() {
        if (_RefreshCwAlt4 != null) {
            return _RefreshCwAlt4!!
        }
        _RefreshCwAlt4 = ImageVector.Builder(
            name = "RefreshCwAlt4",
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
                moveTo(18.609f, 5.891f)
                lineTo(15.5f, 9f)
                horizontalLineTo(21.5f)
                verticalLineTo(3f)
                lineTo(18.609f, 5.891f)
                close()
                moveTo(18.609f, 5.891f)
                curveTo(16.965f, 4.113f, 14.613f, 3f, 12f, 3f)
                curveTo(7.367f, 3f, 3.552f, 6.5f, 3.055f, 11f)
                moveTo(5.391f, 18.109f)
                lineTo(2.5f, 21f)
                verticalLineTo(15f)
                horizontalLineTo(8.5f)
                lineTo(5.391f, 18.109f)
                close()
                moveTo(5.391f, 18.109f)
                curveTo(7.035f, 19.887f, 9.388f, 21f, 12f, 21f)
                curveTo(16.633f, 21f, 20.448f, 17.5f, 20.945f, 13f)
            }
        }.build()

        return _RefreshCwAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshCwAlt4: ImageVector? = null
