package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Menorah: ImageVector
    get() {
        if (_Menorah != null) {
            return _Menorah!!
        }
        _Menorah = ImageVector.Builder(
            name = "Menorah",
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
                moveTo(12f, 18f)
                lineTo(15f, 21f)
                horizontalLineTo(9f)
                lineTo(12f, 18f)
                close()
                moveTo(12f, 18f)
                verticalLineTo(8f)
                moveTo(4f, 9f)
                verticalLineTo(11.8f)
                curveTo(4f, 12.92f, 4f, 13.48f, 4.218f, 13.908f)
                curveTo(4.41f, 14.284f, 4.716f, 14.59f, 5.092f, 14.782f)
                curveTo(5.52f, 15f, 6.08f, 15f, 7.2f, 15f)
                horizontalLineTo(16.8f)
                curveTo(17.92f, 15f, 18.48f, 15f, 18.908f, 14.782f)
                curveTo(19.284f, 14.59f, 19.59f, 14.284f, 19.782f, 13.908f)
                curveTo(20f, 13.48f, 20f, 12.92f, 20f, 11.8f)
                verticalLineTo(9f)
                moveTo(16f, 15f)
                verticalLineTo(9f)
                moveTo(8f, 15f)
                verticalLineTo(9f)
                moveTo(20f, 6f)
                verticalLineTo(5f)
                moveTo(4f, 6f)
                verticalLineTo(5f)
                moveTo(12f, 5f)
                verticalLineTo(3f)
                moveTo(16f, 6f)
                verticalLineTo(4f)
                moveTo(8f, 6f)
                verticalLineTo(4f)
            }
        }.build()

        return _Menorah!!
    }

@Suppress("ObjectPropertyName")
private var _Menorah: ImageVector? = null
