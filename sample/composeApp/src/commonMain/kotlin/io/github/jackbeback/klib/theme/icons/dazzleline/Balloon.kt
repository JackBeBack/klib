package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Balloon: ImageVector
    get() {
        if (_Balloon != null) {
            return _Balloon!!
        }
        _Balloon = ImageVector.Builder(
            name = "Balloon",
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
                moveTo(12.13f, 17.811f)
                lineTo(10f, 21f)
                horizontalLineTo(15f)
                lineTo(12.87f, 17.811f)
                moveTo(9.5f, 9.5f)
                curveTo(9.5f, 7.843f, 10.343f, 6.5f, 12f, 6.5f)
                moveTo(19f, 9f)
                curveTo(19f, 15f, 12.5f, 18f, 12.5f, 18f)
                curveTo(12.5f, 18f, 6f, 15f, 6f, 9f)
                curveTo(6f, 4.5f, 10f, 3f, 12.5f, 3f)
                curveTo(15f, 3f, 19f, 4.5f, 19f, 9f)
                close()
            }
        }.build()

        return _Balloon!!
    }

@Suppress("ObjectPropertyName")
private var _Balloon: ImageVector? = null
