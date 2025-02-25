package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ShieldHeart: ImageVector
    get() {
        if (_ShieldHeart != null) {
            return _ShieldHeart!!
        }
        _ShieldHeart = ImageVector.Builder(
            name = "ShieldHeart",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.998f, 10.212f)
                curveTo(11.298f, 9.433f, 10.131f, 9.223f, 9.254f, 9.937f)
                curveTo(8.377f, 10.65f, 8.254f, 11.843f, 8.942f, 12.687f)
                curveTo(9.331f, 13.163f, 10.255f, 13.998f, 10.985f, 14.635f)
                curveTo(11.332f, 14.937f, 11.505f, 15.088f, 11.715f, 15.15f)
                curveTo(11.893f, 15.203f, 12.102f, 15.203f, 12.281f, 15.15f)
                curveTo(12.49f, 15.088f, 12.663f, 14.937f, 13.01f, 14.635f)
                curveTo(13.74f, 13.998f, 14.664f, 13.163f, 15.053f, 12.687f)
                curveTo(15.741f, 11.843f, 15.633f, 10.643f, 14.741f, 9.937f)
                curveTo(13.849f, 9.231f, 12.697f, 9.433f, 11.998f, 10.212f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.359f, 20.683f)
                curveTo(11.564f, 20.79f, 11.667f, 20.844f, 11.809f, 20.871f)
                curveTo(11.92f, 20.893f, 12.08f, 20.893f, 12.191f, 20.871f)
                curveTo(12.333f, 20.844f, 12.436f, 20.79f, 12.641f, 20.683f)
                curveTo(14.54f, 19.694f, 20f, 16.461f, 20f, 12f)
                verticalLineTo(8.218f)
                curveTo(20f, 7.418f, 20f, 7.018f, 19.869f, 6.675f)
                curveTo(19.754f, 6.371f, 19.566f, 6.1f, 19.322f, 5.886f)
                curveTo(19.046f, 5.642f, 18.672f, 5.502f, 17.924f, 5.221f)
                lineTo(12.562f, 3.211f)
                curveTo(12.354f, 3.133f, 12.25f, 3.094f, 12.143f, 3.078f)
                curveTo(12.048f, 3.065f, 11.952f, 3.065f, 11.857f, 3.078f)
                curveTo(11.75f, 3.094f, 11.646f, 3.133f, 11.438f, 3.211f)
                lineTo(6.076f, 5.221f)
                curveTo(5.328f, 5.502f, 4.953f, 5.642f, 4.678f, 5.886f)
                curveTo(4.434f, 6.1f, 4.246f, 6.371f, 4.131f, 6.675f)
                curveTo(4f, 7.018f, 4f, 7.418f, 4f, 8.218f)
                verticalLineTo(12f)
                curveTo(4f, 16.461f, 9.46f, 19.694f, 11.359f, 20.683f)
                close()
            }
        }.build()

        return _ShieldHeart!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHeart: ImageVector? = null
