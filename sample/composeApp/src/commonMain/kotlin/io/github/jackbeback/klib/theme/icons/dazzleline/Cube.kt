package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cube: ImageVector
    get() {
        if (_Cube != null) {
            return _Cube!!
        }
        _Cube = ImageVector.Builder(
            name = "Cube",
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
                moveTo(12f, 10.231f)
                lineTo(3.085f, 7.023f)
                moveTo(12f, 10.231f)
                lineTo(20.918f, 7.034f)
                moveTo(12f, 10.231f)
                verticalLineTo(20.879f)
                moveTo(5.135f, 18.577f)
                lineTo(10.935f, 20.624f)
                curveTo(11.33f, 20.764f, 11.527f, 20.833f, 11.729f, 20.861f)
                curveTo(11.909f, 20.885f, 12.091f, 20.885f, 12.271f, 20.861f)
                curveTo(12.473f, 20.833f, 12.67f, 20.764f, 13.065f, 20.624f)
                lineTo(18.865f, 18.577f)
                curveTo(19.634f, 18.306f, 20.018f, 18.17f, 20.302f, 17.927f)
                curveTo(20.552f, 17.712f, 20.746f, 17.439f, 20.865f, 17.131f)
                curveTo(21f, 16.782f, 21f, 16.375f, 21f, 15.559f)
                verticalLineTo(8.441f)
                curveTo(21f, 7.625f, 21f, 7.218f, 20.865f, 6.869f)
                curveTo(20.746f, 6.562f, 20.552f, 6.288f, 20.302f, 6.073f)
                curveTo(20.018f, 5.83f, 19.634f, 5.694f, 18.865f, 5.423f)
                lineTo(13.065f, 3.376f)
                curveTo(12.67f, 3.237f, 12.473f, 3.167f, 12.271f, 3.139f)
                curveTo(12.091f, 3.115f, 11.909f, 3.115f, 11.729f, 3.139f)
                curveTo(11.527f, 3.167f, 11.33f, 3.237f, 10.935f, 3.376f)
                lineTo(5.135f, 5.423f)
                curveTo(4.366f, 5.694f, 3.982f, 5.83f, 3.698f, 6.073f)
                curveTo(3.448f, 6.288f, 3.254f, 6.562f, 3.135f, 6.869f)
                curveTo(3f, 7.218f, 3f, 7.625f, 3f, 8.441f)
                verticalLineTo(15.559f)
                curveTo(3f, 16.375f, 3f, 16.782f, 3.135f, 17.131f)
                curveTo(3.254f, 17.439f, 3.448f, 17.712f, 3.698f, 17.927f)
                curveTo(3.982f, 18.17f, 4.366f, 18.306f, 5.135f, 18.577f)
                close()
            }
        }.build()

        return _Cube!!
    }

@Suppress("ObjectPropertyName")
private var _Cube: ImageVector? = null
