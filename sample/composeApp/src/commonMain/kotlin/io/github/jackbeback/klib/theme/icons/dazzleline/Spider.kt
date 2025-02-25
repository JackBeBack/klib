package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Spider: ImageVector
    get() {
        if (_Spider != null) {
            return _Spider!!
        }
        _Spider = ImageVector.Builder(
            name = "Spider",
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
                moveTo(9f, 11.5f)
                lineTo(4.5f, 10f)
                lineTo(3f, 6f)
                moveTo(9f, 12.5f)
                lineTo(4f, 14f)
                lineTo(3.5f, 17f)
                moveTo(9f, 13f)
                lineTo(6f, 16.5f)
                lineTo(8f, 21f)
                moveTo(9f, 11f)
                lineTo(6f, 7f)
                lineTo(7.2f, 3f)
                moveTo(15f, 11.5f)
                lineTo(19.5f, 10f)
                lineTo(21f, 6f)
                moveTo(15f, 12.5f)
                lineTo(20f, 14f)
                lineTo(20.5f, 17f)
                moveTo(15f, 13f)
                lineTo(18f, 16.5f)
                lineTo(16f, 21f)
                moveTo(15f, 11f)
                lineTo(18f, 7f)
                lineTo(16.8f, 3f)
                moveTo(15f, 14f)
                curveTo(15f, 15.657f, 13.657f, 17f, 12f, 17f)
                curveTo(10.343f, 17f, 9f, 15.657f, 9f, 14f)
                curveTo(9f, 13.333f, 9.217f, 12.717f, 9.585f, 12.219f)
                curveTo(9.804f, 11.924f, 9.913f, 11.776f, 9.951f, 11.702f)
                curveTo(9.997f, 11.61f, 10.003f, 11.594f, 10.028f, 11.495f)
                curveTo(10.049f, 11.415f, 10.057f, 11.31f, 10.075f, 11.102f)
                lineTo(10.325f, 8.097f)
                curveTo(10.38f, 7.447f, 10.407f, 7.122f, 10.544f, 6.991f)
                curveTo(10.662f, 6.877f, 10.829f, 6.829f, 10.99f, 6.862f)
                curveTo(11.176f, 6.9f, 11.371f, 7.161f, 11.763f, 7.683f)
                lineTo(12f, 8f)
                lineTo(12.238f, 7.683f)
                curveTo(12.629f, 7.161f, 12.825f, 6.9f, 13.01f, 6.862f)
                curveTo(13.171f, 6.829f, 13.338f, 6.877f, 13.457f, 6.991f)
                curveTo(13.594f, 7.122f, 13.621f, 7.447f, 13.675f, 8.097f)
                lineTo(13.925f, 11.102f)
                curveTo(13.943f, 11.31f, 13.951f, 11.415f, 13.972f, 11.495f)
                curveTo(13.997f, 11.594f, 14.003f, 11.61f, 14.049f, 11.702f)
                curveTo(14.087f, 11.776f, 14.196f, 11.924f, 14.415f, 12.22f)
                curveTo(14.783f, 12.718f, 15f, 13.333f, 15f, 14f)
                close()
            }
        }.build()

        return _Spider!!
    }

@Suppress("ObjectPropertyName")
private var _Spider: ImageVector? = null
