package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.NfcSymbol: ImageVector
    get() {
        if (_NfcSymbol != null) {
            return _NfcSymbol!!
        }
        _NfcSymbol = ImageVector.Builder(
            name = "NfcSymbol",
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
                moveTo(8f, 18.93f)
                curveTo(5.609f, 17.547f, 4f, 14.961f, 4f, 12f)
                curveTo(4f, 9.039f, 5.609f, 6.454f, 8f, 5.07f)
                lineTo(14f, 11f)
                moveTo(16f, 5f)
                curveTo(18.391f, 6.383f, 20f, 8.969f, 20f, 11.93f)
                curveTo(20f, 14.891f, 18.391f, 17.476f, 16f, 18.86f)
                lineTo(10f, 13f)
            }
        }.build()

        return _NfcSymbol!!
    }

@Suppress("ObjectPropertyName")
private var _NfcSymbol: ImageVector? = null
