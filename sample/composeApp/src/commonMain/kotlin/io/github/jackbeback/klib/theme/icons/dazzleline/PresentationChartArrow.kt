package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PresentationChartArrow: ImageVector
    get() {
        if (_PresentationChartArrow != null) {
            return _PresentationChartArrow!!
        }
        _PresentationChartArrow = ImageVector.Builder(
            name = "PresentationChartArrow",
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
                moveTo(5f, 3f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(3f, 16f)
                horizontalLineTo(21f)
                moveTo(11.5f, 20f)
                curveTo(11.224f, 20f, 11f, 20.224f, 11f, 20.5f)
                curveTo(11f, 20.776f, 11.224f, 21f, 11.5f, 21f)
                curveTo(11.776f, 21f, 12f, 20.776f, 12f, 20.5f)
                curveTo(12f, 20.224f, 11.776f, 20f, 11.5f, 20f)
                close()
                moveTo(11.5f, 20f)
                verticalLineTo(16f)
                moveTo(8f, 11f)
                verticalLineTo(8f)
                lineTo(12f, 11f)
                lineTo(16f, 7f)
                moveTo(16f, 7f)
                horizontalLineTo(13f)
                moveTo(16f, 7f)
                verticalLineTo(10f)
                moveTo(11.5f, 20.5f)
                horizontalLineTo(11.51f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
            }
        }.build()

        return _PresentationChartArrow!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationChartArrow: ImageVector? = null
