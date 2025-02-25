package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Palette: ImageVector
    get() {
        if (_Palette != null) {
            return _Palette!!
        }
        _Palette = ImageVector.Builder(
            name = "Palette",
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
                moveTo(15.5f, 8.5f)
                horizontalLineTo(15.51f)
                moveTo(10.5f, 7.5f)
                horizontalLineTo(10.51f)
                moveTo(7.5f, 11.5f)
                horizontalLineTo(7.51f)
                moveTo(12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 13.657f, 19.657f, 15f, 18f, 15f)
                horizontalLineTo(17.4f)
                curveTo(17.028f, 15f, 16.843f, 15f, 16.687f, 15.025f)
                curveTo(15.831f, 15.16f, 15.16f, 15.831f, 15.025f, 16.687f)
                curveTo(15f, 16.843f, 15f, 17.028f, 15f, 17.4f)
                verticalLineTo(18f)
                curveTo(15f, 19.657f, 13.657f, 21f, 12f, 21f)
                close()
                moveTo(16f, 8.5f)
                curveTo(16f, 8.776f, 15.776f, 9f, 15.5f, 9f)
                curveTo(15.224f, 9f, 15f, 8.776f, 15f, 8.5f)
                curveTo(15f, 8.224f, 15.224f, 8f, 15.5f, 8f)
                curveTo(15.776f, 8f, 16f, 8.224f, 16f, 8.5f)
                close()
                moveTo(11f, 7.5f)
                curveTo(11f, 7.776f, 10.776f, 8f, 10.5f, 8f)
                curveTo(10.224f, 8f, 10f, 7.776f, 10f, 7.5f)
                curveTo(10f, 7.224f, 10.224f, 7f, 10.5f, 7f)
                curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
                close()
                moveTo(8f, 11.5f)
                curveTo(8f, 11.776f, 7.776f, 12f, 7.5f, 12f)
                curveTo(7.224f, 12f, 7f, 11.776f, 7f, 11.5f)
                curveTo(7f, 11.224f, 7.224f, 11f, 7.5f, 11f)
                curveTo(7.776f, 11f, 8f, 11.224f, 8f, 11.5f)
                close()
            }
        }.build()

        return _Palette!!
    }

@Suppress("ObjectPropertyName")
private var _Palette: ImageVector? = null
