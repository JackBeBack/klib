package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Ruler: ImageVector
    get() {
        if (_Ruler != null) {
            return _Ruler!!
        }
        _Ruler = ImageVector.Builder(
            name = "Ruler",
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
                moveTo(5.636f, 14.124f)
                lineTo(7.05f, 15.538f)
                moveTo(8.464f, 11.295f)
                lineTo(9.879f, 12.71f)
                moveTo(11.293f, 8.467f)
                lineTo(12.707f, 9.881f)
                moveTo(14.121f, 5.638f)
                lineTo(15.535f, 7.053f)
                moveTo(2.808f, 16.952f)
                lineTo(7.05f, 21.195f)
                lineTo(21.192f, 7.053f)
                lineTo(16.95f, 2.81f)
                lineTo(2.808f, 16.952f)
                close()
            }
        }.build()

        return _Ruler!!
    }

@Suppress("ObjectPropertyName")
private var _Ruler: ImageVector? = null
