package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Broom: ImageVector
    get() {
        if (_Broom != null) {
            return _Broom!!
        }
        _Broom = ImageVector.Builder(
            name = "Broom",
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
                moveTo(21f, 3f)
                lineTo(13.25f, 10.75f)
                moveTo(9.461f, 11.073f)
                lineTo(11f, 8.5f)
                lineTo(13.25f, 10.75f)
                moveTo(12.927f, 14.539f)
                lineTo(15.5f, 13f)
                lineTo(13.25f, 10.75f)
                moveTo(3f, 21f)
                lineTo(4.198f, 15.008f)
                curveTo(4.665f, 12.677f, 6.711f, 11f, 9.087f, 11f)
                curveTo(9.351f, 11f, 9.605f, 11.105f, 9.792f, 11.292f)
                lineTo(12.708f, 14.208f)
                curveTo(12.895f, 14.395f, 13f, 14.649f, 13f, 14.913f)
                curveTo(13f, 17.289f, 11.323f, 19.336f, 8.992f, 19.802f)
                lineTo(3f, 21f)
                close()
            }
        }.build()

        return _Broom!!
    }

@Suppress("ObjectPropertyName")
private var _Broom: ImageVector? = null
