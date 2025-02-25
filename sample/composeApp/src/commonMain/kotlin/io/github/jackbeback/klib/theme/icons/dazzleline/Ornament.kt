package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Ornament: ImageVector
    get() {
        if (_Ornament != null) {
            return _Ornament!!
        }
        _Ornament = ImageVector.Builder(
            name = "Ornament",
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
                moveTo(5.071f, 13f)
                horizontalLineTo(18.929f)
                moveTo(18.326f, 17f)
                horizontalLineTo(5.703f)
                moveTo(8f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(8.255f)
                curveTo(17.813f, 9.52f, 19f, 11.621f, 19f, 14f)
                curveTo(19f, 17.866f, 15.866f, 21f, 12f, 21f)
                curveTo(8.134f, 21f, 5f, 17.866f, 5f, 14f)
                curveTo(5f, 11.621f, 6.187f, 9.52f, 8f, 8.255f)
                verticalLineTo(6f)
                close()
                moveTo(13.5f, 4.5f)
                curveTo(13.5f, 5.328f, 12.828f, 6f, 12f, 6f)
                curveTo(11.172f, 6f, 10.5f, 5.328f, 10.5f, 4.5f)
                curveTo(10.5f, 3.672f, 11.172f, 3f, 12f, 3f)
                curveTo(12.828f, 3f, 13.5f, 3.672f, 13.5f, 4.5f)
                close()
            }
        }.build()

        return _Ornament!!
    }

@Suppress("ObjectPropertyName")
private var _Ornament: ImageVector? = null
