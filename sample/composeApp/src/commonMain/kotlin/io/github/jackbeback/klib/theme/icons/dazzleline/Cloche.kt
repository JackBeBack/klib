package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Cloche: ImageVector
    get() {
        if (_Cloche != null) {
            return _Cloche!!
        }
        _Cloche = ImageVector.Builder(
            name = "Cloche",
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
                moveTo(12f, 9f)
                curveTo(14.5f, 9f, 16f, 10f, 17f, 12f)
                moveTo(12f, 6f)
                curveTo(7.582f, 6f, 4f, 9.582f, 4f, 14f)
                curveTo(4f, 15.457f, 4.39f, 16.823f, 5.07f, 18f)
                moveTo(12f, 6f)
                curveTo(16.418f, 6f, 20f, 9.582f, 20f, 14f)
                curveTo(20f, 15.457f, 19.61f, 16.823f, 18.93f, 18f)
                moveTo(12f, 6f)
                curveTo(12.828f, 6f, 13.5f, 5.328f, 13.5f, 4.5f)
                curveTo(13.5f, 3.672f, 12.828f, 3f, 12f, 3f)
                curveTo(11.172f, 3f, 10.5f, 3.672f, 10.5f, 4.5f)
                curveTo(10.5f, 5.328f, 11.172f, 6f, 12f, 6f)
                close()
                moveTo(4.5f, 21f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 21f, 21f, 20.328f, 21f, 19.5f)
                curveTo(21f, 18.672f, 20.328f, 18f, 19.5f, 18f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 18f, 3f, 18.672f, 3f, 19.5f)
                curveTo(3f, 20.328f, 3.672f, 21f, 4.5f, 21f)
                close()
            }
        }.build()

        return _Cloche!!
    }

@Suppress("ObjectPropertyName")
private var _Cloche: ImageVector? = null
