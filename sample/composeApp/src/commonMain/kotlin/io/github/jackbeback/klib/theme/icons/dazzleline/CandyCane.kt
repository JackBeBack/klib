package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CandyCane: ImageVector
    get() {
        if (_CandyCane != null) {
            return _CandyCane!!
        }
        _CandyCane = ImageVector.Builder(
            name = "CandyCane",
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
                moveTo(14.101f, 15.524f)
                lineTo(17.925f, 13.145f)
                curveTo(18.065f, 13.057f, 18.199f, 12.965f, 18.329f, 12.867f)
                moveTo(14.101f, 15.524f)
                lineTo(9.852f, 18.169f)
                moveTo(14.101f, 15.524f)
                lineTo(10.293f, 13.197f)
                moveTo(9.852f, 18.169f)
                lineTo(6.195f, 20.445f)
                curveTo(5.242f, 21.038f, 3.992f, 20.789f, 3.34f, 19.875f)
                curveTo(2.618f, 18.865f, 2.912f, 17.453f, 3.977f, 16.815f)
                lineTo(15.779f, 9.736f)
                curveTo(16.488f, 9.311f, 16.713f, 8.389f, 16.282f, 7.686f)
                moveTo(9.852f, 18.169f)
                lineTo(6.053f, 15.847f)
                moveTo(18.329f, 12.867f)
                curveTo(20.579f, 11.169f, 21.197f, 8.002f, 19.675f, 5.566f)
                curveTo(18.065f, 2.99f, 14.672f, 2.207f, 12.096f, 3.816f)
                lineTo(10.824f, 4.611f)
                lineTo(12.943f, 8.003f)
                lineTo(14.226f, 7.201f)
                curveTo(14.923f, 6.766f, 15.84f, 6.978f, 16.275f, 7.674f)
                curveTo(16.277f, 7.678f, 16.279f, 7.682f, 16.282f, 7.686f)
                moveTo(18.329f, 12.867f)
                lineTo(14.533f, 10.547f)
                moveTo(16.282f, 7.686f)
                lineTo(20.415f, 8.64f)
                moveTo(16f, 7.349f)
                verticalLineTo(3.156f)
            }
        }.build()

        return _CandyCane!!
    }

@Suppress("ObjectPropertyName")
private var _CandyCane: ImageVector? = null
