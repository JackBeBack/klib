package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSunAlt: ImageVector
    get() {
        if (_CloudSunAlt != null) {
            return _CloudSunAlt!!
        }
        _CloudSunAlt = ImageVector.Builder(
            name = "CloudSunAlt",
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
                moveTo(7.455f, 2f)
                verticalLineTo(3f)
                moveTo(11.344f, 3.611f)
                lineTo(10.637f, 4.318f)
                moveTo(4.273f, 10.682f)
                lineTo(3.566f, 11.389f)
                moveTo(1.955f, 7.5f)
                horizontalLineTo(2.955f)
                moveTo(3.566f, 3.611f)
                lineTo(4.274f, 4.318f)
                moveTo(6.5f, 9.213f)
                curveTo(6.389f, 9.152f, 6.283f, 9.08f, 6.186f, 9f)
                curveTo(5.74f, 8.633f, 5.455f, 8.077f, 5.455f, 7.455f)
                curveTo(5.455f, 6.35f, 6.351f, 5.455f, 7.455f, 5.455f)
                curveTo(8.214f, 5.455f, 8.874f, 5.877f, 9.213f, 6.5f)
                curveTo(9.298f, 6.655f, 9.362f, 6.823f, 9.403f, 7f)
                moveTo(9.8f, 21f)
                curveTo(7.149f, 21f, 5f, 18.947f, 5f, 16.414f)
                curveTo(5f, 14.314f, 6.6f, 12.375f, 9f, 12f)
                curveTo(9.753f, 10.274f, 11.535f, 9f, 13.613f, 9f)
                curveTo(16.275f, 9f, 18.45f, 10.991f, 18.6f, 13.5f)
                curveTo(20.013f, 14.096f, 21f, 15.557f, 21f, 17.14f)
                curveTo(21f, 19.272f, 19.209f, 21f, 17f, 21f)
                lineTo(9.8f, 21f)
                close()
            }
        }.build()

        return _CloudSunAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSunAlt: ImageVector? = null
