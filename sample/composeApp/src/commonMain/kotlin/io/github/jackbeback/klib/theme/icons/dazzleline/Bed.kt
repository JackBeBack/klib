package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Bed: ImageVector
    get() {
        if (_Bed != null) {
            return _Bed!!
        }
        _Bed = ImageVector.Builder(
            name = "Bed",
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
                moveTo(3f, 5f)
                verticalLineTo(19f)
                moveTo(3f, 16f)
                horizontalLineTo(21f)
                moveTo(21f, 19f)
                verticalLineTo(13.2f)
                curveTo(21f, 12.08f, 21f, 11.52f, 20.782f, 11.092f)
                curveTo(20.59f, 10.716f, 20.284f, 10.41f, 19.908f, 10.218f)
                curveTo(19.48f, 10f, 18.92f, 10f, 17.8f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(15.727f)
                moveTo(7f, 12f)
                horizontalLineTo(7.01f)
                moveTo(8f, 12f)
                curveTo(8f, 12.552f, 7.552f, 13f, 7f, 13f)
                curveTo(6.448f, 13f, 6f, 12.552f, 6f, 12f)
                curveTo(6f, 11.448f, 6.448f, 11f, 7f, 11f)
                curveTo(7.552f, 11f, 8f, 11.448f, 8f, 12f)
                close()
            }
        }.build()

        return _Bed!!
    }

@Suppress("ObjectPropertyName")
private var _Bed: ImageVector? = null
