package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Vial: ImageVector
    get() {
        if (_Vial != null) {
            return _Vial!!
        }
        _Vial = ImageVector.Builder(
            name = "Vial",
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
                moveTo(20f, 9f)
                lineTo(9.5f, 19.5f)
                curveTo(8.12f, 20.881f, 5.881f, 20.881f, 4.5f, 19.5f)
                curveTo(3.12f, 18.119f, 3.12f, 15.881f, 4.5f, 14.5f)
                lineTo(15f, 4f)
                moveTo(14f, 3f)
                lineTo(21f, 10f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
            }
        }.build()

        return _Vial!!
    }

@Suppress("ObjectPropertyName")
private var _Vial: ImageVector? = null
