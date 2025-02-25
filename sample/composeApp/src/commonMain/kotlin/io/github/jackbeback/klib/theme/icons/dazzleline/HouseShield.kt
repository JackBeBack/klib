package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseShield: ImageVector
    get() {
        if (_HouseShield != null) {
            return _HouseShield!!
        }
        _HouseShield = ImageVector.Builder(
            name = "HouseShield",
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
                moveTo(15f, 11.167f)
                curveTo(15f, 11.167f, 14.694f, 11.167f, 14.625f, 11.167f)
                curveTo(13.601f, 11.167f, 12.708f, 10.752f, 12f, 10f)
                curveTo(11.292f, 10.752f, 10.399f, 11.167f, 9.375f, 11.167f)
                curveTo(9.306f, 11.167f, 9f, 11.167f, 9f, 11.167f)
                curveTo(9f, 11.167f, 9f, 11.944f, 9f, 12.398f)
                curveTo(9f, 14.612f, 10.275f, 16.473f, 12f, 17f)
                curveTo(13.725f, 16.473f, 15f, 14.612f, 15f, 12.398f)
                curveTo(15f, 11.944f, 15f, 11.167f, 15f, 11.167f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12.13f)
                verticalLineTo(14.6f)
                curveTo(3f, 16.84f, 3f, 17.96f, 3.436f, 18.816f)
                curveTo(3.819f, 19.569f, 4.431f, 20.181f, 5.184f, 20.564f)
                curveTo(6.04f, 21f, 7.16f, 21f, 9.4f, 21f)
                horizontalLineTo(14.6f)
                curveTo(16.84f, 21f, 17.96f, 21f, 18.816f, 20.564f)
                curveTo(19.569f, 20.181f, 20.181f, 19.569f, 20.564f, 18.816f)
                curveTo(21f, 17.96f, 21f, 16.84f, 21f, 14.6f)
                verticalLineTo(12.13f)
                curveTo(21f, 10.981f, 21f, 10.407f, 20.852f, 9.878f)
                curveTo(20.721f, 9.41f, 20.505f, 8.969f, 20.216f, 8.578f)
                curveTo(19.889f, 8.136f, 19.436f, 7.784f, 18.529f, 7.078f)
                lineTo(15.929f, 5.056f)
                curveTo(14.524f, 3.963f, 13.821f, 3.417f, 13.045f, 3.207f)
                curveTo(12.361f, 3.021f, 11.639f, 3.021f, 10.955f, 3.207f)
                curveTo(10.179f, 3.417f, 9.476f, 3.963f, 8.071f, 5.056f)
                lineTo(5.471f, 7.078f)
                curveTo(4.564f, 7.784f, 4.111f, 8.136f, 3.784f, 8.578f)
                curveTo(3.495f, 8.969f, 3.279f, 9.41f, 3.148f, 9.878f)
                curveTo(3f, 10.407f, 3f, 10.981f, 3f, 12.13f)
                close()
            }
        }.build()

        return _HouseShield!!
    }

@Suppress("ObjectPropertyName")
private var _HouseShield: ImageVector? = null
