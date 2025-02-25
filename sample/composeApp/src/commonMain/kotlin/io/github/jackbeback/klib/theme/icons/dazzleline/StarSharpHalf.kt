package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.StarSharpHalf: ImageVector
    get() {
        if (_StarSharpHalf != null) {
            return _StarSharpHalf!!
        }
        _StarSharpHalf = ImageVector.Builder(
            name = "StarSharpHalf",
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
                moveTo(8.306f, 19.371f)
                lineTo(12.001f, 16.8f)
                lineTo(12.001f, 4.448f)
                verticalLineTo(4.448f)
                curveTo(12.001f, 4.181f, 12.001f, 4.047f, 11.967f, 4.018f)
                curveTo(11.939f, 3.992f, 11.898f, 3.985f, 11.862f, 4f)
                curveTo(11.821f, 4.017f, 11.777f, 4.143f, 11.69f, 4.395f)
                lineTo(9.95f, 9.4f)
                curveTo(9.884f, 9.589f, 9.851f, 9.684f, 9.792f, 9.755f)
                curveTo(9.739f, 9.817f, 9.672f, 9.866f, 9.597f, 9.896f)
                curveTo(9.512f, 9.931f, 9.411f, 9.933f, 9.211f, 9.937f)
                lineTo(5.267f, 10.017f)
                curveTo(4.562f, 10.032f, 4.209f, 10.039f, 4.069f, 10.173f)
                curveTo(3.947f, 10.289f, 3.892f, 10.459f, 3.922f, 10.625f)
                curveTo(3.957f, 10.816f, 4.238f, 11.029f, 4.8f, 11.455f)
                lineTo(7.943f, 13.838f)
                curveTo(8.103f, 13.959f, 8.183f, 14.02f, 8.232f, 14.098f)
                curveTo(8.275f, 14.167f, 8.3f, 14.246f, 8.306f, 14.327f)
                curveTo(8.313f, 14.419f, 8.284f, 14.515f, 8.226f, 14.707f)
                lineTo(7.083f, 18.483f)
                curveTo(6.879f, 19.157f, 6.777f, 19.495f, 6.861f, 19.67f)
                curveTo(6.934f, 19.822f, 7.078f, 19.927f, 7.245f, 19.949f)
                curveTo(7.438f, 19.975f, 7.727f, 19.774f, 8.306f, 19.371f)
                close()
            }
        }.build()

        return _StarSharpHalf!!
    }

@Suppress("ObjectPropertyName")
private var _StarSharpHalf: ImageVector? = null
