package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TriangleArrowsBolt: ImageVector
    get() {
        if (_TriangleArrowsBolt != null) {
            return _TriangleArrowsBolt!!
        }
        _TriangleArrowsBolt = ImageVector.Builder(
            name = "TriangleArrowsBolt",
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
                moveTo(8f, 8f)
                lineTo(10.211f, 3.578f)
                curveTo(10.948f, 2.104f, 13.052f, 2.104f, 13.789f, 3.578f)
                lineTo(16f, 8f)
                moveTo(16f, 8f)
                lineTo(13f, 7f)
                moveTo(16f, 8f)
                lineTo(17f, 5f)
                moveTo(18.67f, 12.5f)
                lineTo(21.028f, 16.415f)
                curveTo(21.815f, 17.72f, 20.763f, 19.542f, 19.24f, 19.513f)
                lineTo(14.67f, 19.428f)
                moveTo(14.67f, 19.428f)
                lineTo(16.953f, 17.282f)
                moveTo(14.67f, 19.428f)
                lineTo(16.52f, 21.651f)
                moveTo(5.33f, 12.5f)
                lineTo(2.972f, 16.415f)
                curveTo(2.185f, 17.72f, 3.237f, 19.542f, 4.76f, 19.513f)
                lineTo(9.33f, 19.428f)
                moveTo(9.33f, 19.428f)
                lineTo(7.047f, 17.282f)
                moveTo(9.33f, 19.428f)
                lineTo(7.48f, 21.651f)
                moveTo(11.5f, 10.5f)
                lineTo(10f, 13.5f)
                horizontalLineTo(14f)
                lineTo(12.5f, 16.5f)
            }
        }.build()

        return _TriangleArrowsBolt!!
    }

@Suppress("ObjectPropertyName")
private var _TriangleArrowsBolt: ImageVector? = null
