package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.PresentationChart: ImageVector
    get() {
        if (_PresentationChart != null) {
            return _PresentationChart!!
        }
        _PresentationChart = ImageVector.Builder(
            name = "PresentationChart",
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
                moveTo(8f, 9f)
                verticalLineTo(11f)
                moveTo(12f, 7f)
                verticalLineTo(11f)
                moveTo(16f, 8f)
                verticalLineTo(11f)
                moveTo(3f, 3f)
                horizontalLineTo(5f)
                moveTo(21f, 3f)
                horizontalLineTo(19f)
                moveTo(12f, 18f)
                lineTo(7f, 21f)
                moveTo(12f, 18f)
                lineTo(17f, 21f)
                moveTo(12f, 18f)
                verticalLineTo(21f)
                moveTo(12f, 18f)
                verticalLineTo(15f)
                moveTo(19f, 3f)
                verticalLineTo(11.8f)
                curveTo(19f, 12.92f, 19f, 13.48f, 18.782f, 13.908f)
                curveTo(18.59f, 14.284f, 18.284f, 14.59f, 17.908f, 14.782f)
                curveTo(17.48f, 15f, 16.92f, 15f, 15.8f, 15f)
                horizontalLineTo(12f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                moveTo(5f, 3f)
                verticalLineTo(11.8f)
                curveTo(5f, 12.92f, 5f, 13.48f, 5.218f, 13.908f)
                curveTo(5.41f, 14.284f, 5.716f, 14.59f, 6.092f, 14.782f)
                curveTo(6.52f, 15f, 7.08f, 15f, 8.2f, 15f)
                horizontalLineTo(12f)
            }
        }.build()

        return _PresentationChart!!
    }

@Suppress("ObjectPropertyName")
private var _PresentationChart: ImageVector? = null
