package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Podium: ImageVector
    get() {
        if (_Podium != null) {
            return _Podium!!
        }
        _Podium = ImageVector.Builder(
            name = "Podium",
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
                moveTo(18f, 14f)
                lineTo(16f, 21f)
                horizontalLineTo(8f)
                lineTo(6f, 14f)
                moveTo(4f, 10f)
                horizontalLineTo(20f)
                moveTo(6f, 9f)
                curveTo(6f, 6.791f, 7.343f, 5f, 9f, 5f)
                moveTo(9f, 5f)
                curveTo(9f, 6.105f, 9.895f, 7f, 11f, 7f)
                horizontalLineTo(14f)
                curveTo(15.105f, 7f, 16f, 6.105f, 16f, 5f)
                curveTo(16f, 3.895f, 15.105f, 3f, 14f, 3f)
                horizontalLineTo(11f)
                curveTo(9.895f, 3f, 9f, 3.895f, 9f, 5f)
                close()
            }
        }.build()

        return _Podium!!
    }

@Suppress("ObjectPropertyName")
private var _Podium: ImageVector? = null
