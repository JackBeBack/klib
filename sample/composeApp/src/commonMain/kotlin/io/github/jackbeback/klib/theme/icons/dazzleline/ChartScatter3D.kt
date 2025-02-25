package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.ChartScatter3D: ImageVector
    get() {
        if (_ChartScatter3D != null) {
            return _ChartScatter3D!!
        }
        _ChartScatter3D = ImageVector.Builder(
            name = "ChartScatter3D",
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
                moveTo(12f, 4f)
                verticalLineTo(14f)
                moveTo(12f, 14f)
                lineTo(4f, 20f)
                moveTo(12f, 14f)
                lineTo(20f, 20f)
                moveTo(12f, 20f)
                horizontalLineTo(12.01f)
                moveTo(4f, 13f)
                horizontalLineTo(4.01f)
                moveTo(17f, 13f)
                horizontalLineTo(17.01f)
                moveTo(8f, 9f)
                horizontalLineTo(8.01f)
                moveTo(20f, 9f)
                horizontalLineTo(20.01f)
                moveTo(5f, 5f)
                horizontalLineTo(5.01f)
                moveTo(18f, 5f)
                horizontalLineTo(18.01f)
            }
        }.build()

        return _ChartScatter3D!!
    }

@Suppress("ObjectPropertyName")
private var _ChartScatter3D: ImageVector? = null
