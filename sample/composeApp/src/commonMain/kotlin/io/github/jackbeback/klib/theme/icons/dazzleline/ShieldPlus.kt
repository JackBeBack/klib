package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldPlus: ImageVector
    get() {
        if (_ShieldPlus != null) {
            return _ShieldPlus!!
        }
        _ShieldPlus = ImageVector.Builder(
            name = "ShieldPlus",
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
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                moveTo(12f, 9f)
                verticalLineTo(15f)
                moveTo(20f, 12f)
                curveTo(20f, 16.461f, 14.54f, 19.694f, 12.641f, 20.683f)
                curveTo(12.436f, 20.79f, 12.333f, 20.844f, 12.191f, 20.871f)
                curveTo(12.08f, 20.893f, 11.92f, 20.893f, 11.809f, 20.871f)
                curveTo(11.667f, 20.844f, 11.564f, 20.79f, 11.359f, 20.683f)
                curveTo(9.46f, 19.694f, 4f, 16.461f, 4f, 12f)
                verticalLineTo(8.218f)
                curveTo(4f, 7.418f, 4f, 7.018f, 4.131f, 6.675f)
                curveTo(4.246f, 6.371f, 4.434f, 6.1f, 4.678f, 5.886f)
                curveTo(4.953f, 5.642f, 5.328f, 5.502f, 6.076f, 5.221f)
                lineTo(11.438f, 3.211f)
                curveTo(11.646f, 3.133f, 11.75f, 3.094f, 11.857f, 3.078f)
                curveTo(11.952f, 3.065f, 12.048f, 3.065f, 12.143f, 3.078f)
                curveTo(12.25f, 3.094f, 12.354f, 3.133f, 12.562f, 3.211f)
                lineTo(17.924f, 5.221f)
                curveTo(18.672f, 5.502f, 19.046f, 5.642f, 19.322f, 5.886f)
                curveTo(19.566f, 6.1f, 19.754f, 6.371f, 19.869f, 6.675f)
                curveTo(20f, 7.018f, 20f, 7.418f, 20f, 8.218f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ShieldPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldPlus: ImageVector? = null
