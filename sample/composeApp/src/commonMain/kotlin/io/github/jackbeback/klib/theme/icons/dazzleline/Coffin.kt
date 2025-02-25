package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Coffin: ImageVector
    get() {
        if (_Coffin != null) {
            return _Coffin!!
        }
        _Coffin = ImageVector.Builder(
            name = "Coffin",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 3f)
                horizontalLineTo(15f)
                lineTo(20f, 8f)
                lineTo(15f, 21f)
                horizontalLineTo(9f)
                lineTo(4f, 8f)
                lineTo(9f, 3f)
                close()
            }
        }.build()

        return _Coffin!!
    }

@Suppress("ObjectPropertyName")
private var _Coffin: ImageVector? = null
