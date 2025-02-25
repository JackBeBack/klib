package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.WaterArrowUp: ImageVector
    get() {
        if (_WaterArrowUp != null) {
            return _WaterArrowUp!!
        }
        _WaterArrowUp = ImageVector.Builder(
            name = "WaterArrowUp",
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
                moveTo(2.5f, 14.5f)
                lineTo(3.116f, 15.116f)
                curveTo(3.682f, 15.682f, 4.45f, 16f, 5.25f, 16f)
                curveTo(6.05f, 16f, 6.818f, 15.682f, 7.384f, 15.116f)
                lineTo(7.616f, 14.884f)
                curveTo(8.182f, 14.318f, 8.95f, 14f, 9.75f, 14f)
                curveTo(10.55f, 14f, 11.318f, 14.318f, 11.884f, 14.884f)
                lineTo(12.116f, 15.116f)
                curveTo(12.682f, 15.682f, 13.45f, 16f, 14.25f, 16f)
                curveTo(15.05f, 16f, 15.818f, 15.682f, 16.384f, 15.116f)
                lineTo(16.616f, 14.884f)
                curveTo(17.182f, 14.318f, 17.95f, 14f, 18.75f, 14f)
                curveTo(19.55f, 14f, 20.318f, 14.318f, 20.884f, 14.884f)
                lineTo(21.5f, 15.5f)
                moveTo(2.5f, 19.5f)
                lineTo(3.116f, 20.116f)
                curveTo(3.682f, 20.682f, 4.45f, 21f, 5.25f, 21f)
                curveTo(6.05f, 21f, 6.818f, 20.682f, 7.384f, 20.116f)
                lineTo(7.616f, 19.884f)
                curveTo(8.182f, 19.318f, 8.95f, 19f, 9.75f, 19f)
                curveTo(10.55f, 19f, 11.318f, 19.318f, 11.884f, 19.884f)
                lineTo(12.116f, 20.116f)
                curveTo(12.682f, 20.682f, 13.45f, 21f, 14.25f, 21f)
                curveTo(15.05f, 21f, 15.818f, 20.682f, 16.384f, 20.116f)
                lineTo(16.616f, 19.884f)
                curveTo(17.182f, 19.318f, 17.95f, 19f, 18.75f, 19f)
                curveTo(19.55f, 19f, 20.318f, 19.318f, 20.884f, 19.884f)
                lineTo(21.5f, 20.5f)
                moveTo(12f, 11f)
                verticalLineTo(3f)
                moveTo(12f, 3f)
                lineTo(9f, 6f)
                moveTo(12f, 3f)
                lineTo(15f, 6f)
            }
        }.build()

        return _WaterArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _WaterArrowUp: ImageVector? = null
