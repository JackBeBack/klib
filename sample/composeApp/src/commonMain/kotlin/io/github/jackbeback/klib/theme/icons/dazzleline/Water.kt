package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Water: ImageVector
    get() {
        if (_Water != null) {
            return _Water!!
        }
        _Water = ImageVector.Builder(
            name = "Water",
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
                moveTo(2.5f, 5.5f)
                lineTo(3.116f, 6.116f)
                curveTo(3.682f, 6.682f, 4.45f, 7f, 5.25f, 7f)
                curveTo(6.05f, 7f, 6.818f, 6.682f, 7.384f, 6.116f)
                lineTo(7.616f, 5.884f)
                curveTo(8.182f, 5.318f, 8.95f, 5f, 9.75f, 5f)
                curveTo(10.55f, 5f, 11.318f, 5.318f, 11.884f, 5.884f)
                lineTo(12.116f, 6.116f)
                curveTo(12.682f, 6.682f, 13.45f, 7f, 14.25f, 7f)
                curveTo(15.05f, 7f, 15.818f, 6.682f, 16.384f, 6.116f)
                lineTo(16.616f, 5.884f)
                curveTo(17.182f, 5.318f, 17.95f, 5f, 18.75f, 5f)
                curveTo(19.55f, 5f, 20.318f, 5.318f, 20.884f, 5.884f)
                lineTo(21.5f, 6.5f)
                moveTo(2.5f, 11.5f)
                lineTo(3.116f, 12.116f)
                curveTo(3.682f, 12.682f, 4.45f, 13f, 5.25f, 13f)
                curveTo(6.05f, 13f, 6.818f, 12.682f, 7.384f, 12.116f)
                lineTo(7.616f, 11.884f)
                curveTo(8.182f, 11.318f, 8.95f, 11f, 9.75f, 11f)
                curveTo(10.55f, 11f, 11.318f, 11.318f, 11.884f, 11.884f)
                lineTo(12.116f, 12.116f)
                curveTo(12.682f, 12.682f, 13.45f, 13f, 14.25f, 13f)
                curveTo(15.05f, 13f, 15.818f, 12.682f, 16.384f, 12.116f)
                lineTo(16.616f, 11.884f)
                curveTo(17.182f, 11.318f, 17.95f, 11f, 18.75f, 11f)
                curveTo(19.55f, 11f, 20.318f, 11.318f, 20.884f, 11.884f)
                lineTo(21.5f, 12.5f)
                moveTo(2.5f, 17.5f)
                lineTo(3.116f, 18.116f)
                curveTo(3.682f, 18.682f, 4.45f, 19f, 5.25f, 19f)
                curveTo(6.05f, 19f, 6.818f, 18.682f, 7.384f, 18.116f)
                lineTo(7.616f, 17.884f)
                curveTo(8.182f, 17.318f, 8.95f, 17f, 9.75f, 17f)
                curveTo(10.55f, 17f, 11.318f, 17.318f, 11.884f, 17.884f)
                lineTo(12.116f, 18.116f)
                curveTo(12.682f, 18.682f, 13.45f, 19f, 14.25f, 19f)
                curveTo(15.05f, 19f, 15.818f, 18.682f, 16.384f, 18.116f)
                lineTo(16.616f, 17.884f)
                curveTo(17.182f, 17.318f, 17.95f, 17f, 18.75f, 17f)
                curveTo(19.55f, 17f, 20.318f, 17.318f, 20.884f, 17.884f)
                lineTo(21.5f, 18.5f)
            }
        }.build()

        return _Water!!
    }

@Suppress("ObjectPropertyName")
private var _Water: ImageVector? = null
