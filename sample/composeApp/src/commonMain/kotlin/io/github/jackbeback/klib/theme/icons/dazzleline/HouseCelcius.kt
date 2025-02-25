package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HouseCelcius: ImageVector
    get() {
        if (_HouseCelcius != null) {
            return _HouseCelcius!!
        }
        _HouseCelcius = ImageVector.Builder(
            name = "HouseCelcius",
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
                moveTo(13f, 11f)
                horizontalLineTo(12f)
                curveTo(11.068f, 11f, 10.602f, 11f, 10.235f, 11.152f)
                curveTo(9.745f, 11.355f, 9.355f, 11.745f, 9.152f, 12.235f)
                curveTo(9f, 12.602f, 9f, 13.068f, 9f, 14f)
                curveTo(9f, 14.932f, 9f, 15.398f, 9.152f, 15.765f)
                curveTo(9.355f, 16.255f, 9.745f, 16.645f, 10.235f, 16.848f)
                curveTo(10.602f, 17f, 11.068f, 17f, 12f, 17f)
                horizontalLineTo(13f)
                moveTo(15f, 9f)
                horizontalLineTo(15.01f)
                moveTo(3f, 14.6f)
                verticalLineTo(12.13f)
                curveTo(3f, 10.981f, 3f, 10.407f, 3.148f, 9.878f)
                curveTo(3.279f, 9.41f, 3.495f, 8.969f, 3.784f, 8.578f)
                curveTo(4.111f, 8.136f, 4.564f, 7.784f, 5.471f, 7.078f)
                lineTo(8.071f, 5.056f)
                curveTo(9.476f, 3.963f, 10.179f, 3.417f, 10.955f, 3.206f)
                curveTo(11.639f, 3.021f, 12.361f, 3.021f, 13.045f, 3.206f)
                curveTo(13.821f, 3.417f, 14.524f, 3.963f, 15.929f, 5.056f)
                lineTo(18.529f, 7.078f)
                curveTo(19.436f, 7.784f, 19.889f, 8.136f, 20.216f, 8.578f)
                curveTo(20.505f, 8.969f, 20.721f, 9.41f, 20.852f, 9.878f)
                curveTo(21f, 10.407f, 21f, 10.981f, 21f, 12.13f)
                verticalLineTo(14.6f)
                curveTo(21f, 16.84f, 21f, 17.96f, 20.564f, 18.816f)
                curveTo(20.181f, 19.569f, 19.569f, 20.181f, 18.816f, 20.564f)
                curveTo(17.96f, 21f, 16.84f, 21f, 14.6f, 21f)
                horizontalLineTo(9.4f)
                curveTo(7.16f, 21f, 6.04f, 21f, 5.184f, 20.564f)
                curveTo(4.431f, 20.181f, 3.819f, 19.569f, 3.436f, 18.816f)
                curveTo(3f, 17.96f, 3f, 16.84f, 3f, 14.6f)
                close()
            }
        }.build()

        return _HouseCelcius!!
    }

@Suppress("ObjectPropertyName")
private var _HouseCelcius: ImageVector? = null
