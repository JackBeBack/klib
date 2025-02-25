package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.BullseyeArrow: ImageVector
    get() {
        if (_BullseyeArrow != null) {
            return _BullseyeArrow!!
        }
        _BullseyeArrow = ImageVector.Builder(
            name = "BullseyeArrow",
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
                moveTo(21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                moveTo(17f, 12f)
                curveTo(17f, 14.761f, 14.761f, 17f, 12f, 17f)
                curveTo(9.239f, 17f, 7f, 14.761f, 7f, 12f)
                curveTo(7f, 9.239f, 9.239f, 7f, 12f, 7f)
                moveTo(14.758f, 9.352f)
                lineTo(18.717f, 9.767f)
                lineTo(20.863f, 6.763f)
                lineTo(18.288f, 5.905f)
                lineTo(17.429f, 3.329f)
                lineTo(14.425f, 5.475f)
                lineTo(14.758f, 9.352f)
                close()
                moveTo(14.758f, 9.352f)
                lineTo(12f, 12f)
            }
        }.build()

        return _BullseyeArrow!!
    }

@Suppress("ObjectPropertyName")
private var _BullseyeArrow: ImageVector? = null
