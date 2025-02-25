package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) {
            return _ShieldSlash!!
        }
        _ShieldSlash = ImageVector.Builder(
            name = "ShieldSlash",
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
                moveTo(3f, 3f)
                lineTo(21f, 21f)
                moveTo(19.625f, 14.023f)
                curveTo(19.863f, 13.382f, 20f, 12.707f, 20f, 12f)
                verticalLineTo(8.218f)
                curveTo(20f, 7.418f, 20f, 7.018f, 19.869f, 6.675f)
                curveTo(19.754f, 6.371f, 19.566f, 6.1f, 19.322f, 5.886f)
                curveTo(19.046f, 5.642f, 18.672f, 5.502f, 17.924f, 5.221f)
                lineTo(12.562f, 3.211f)
                curveTo(12.354f, 3.133f, 12.25f, 3.094f, 12.143f, 3.078f)
                curveTo(12.048f, 3.065f, 11.952f, 3.065f, 11.857f, 3.078f)
                curveTo(11.75f, 3.094f, 11.646f, 3.133f, 11.438f, 3.211f)
                lineTo(9.526f, 3.928f)
                moveTo(17.345f, 17.345f)
                curveTo(15.677f, 18.99f, 13.658f, 20.153f, 12.645f, 20.681f)
                curveTo(12.437f, 20.789f, 12.334f, 20.843f, 12.191f, 20.871f)
                curveTo(12.08f, 20.893f, 11.92f, 20.893f, 11.809f, 20.871f)
                curveTo(11.667f, 20.844f, 11.564f, 20.79f, 11.359f, 20.683f)
                curveTo(9.46f, 19.694f, 4f, 16.461f, 4f, 12f)
                verticalLineTo(8.218f)
                curveTo(4f, 7.418f, 4f, 7.018f, 4.131f, 6.675f)
                curveTo(4.246f, 6.371f, 4.434f, 6.1f, 4.678f, 5.886f)
                curveTo(4.865f, 5.721f, 5.097f, 5.603f, 5.459f, 5.457f)
            }
        }.build()

        return _ShieldSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSlash: ImageVector? = null
