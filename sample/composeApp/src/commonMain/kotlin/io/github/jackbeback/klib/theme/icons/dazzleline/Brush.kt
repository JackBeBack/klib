package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Brush: ImageVector
    get() {
        if (_Brush != null) {
            return _Brush!!
        }
        _Brush = ImageVector.Builder(
            name = "Brush",
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
                moveTo(9f, 3f)
                verticalLineTo(7f)
                moveTo(15f, 3f)
                verticalLineTo(6f)
                moveTo(4f, 10f)
                horizontalLineTo(20f)
                moveTo(12f, 21f)
                curveTo(10.234f, 21f, 8.916f, 19.374f, 9.281f, 17.646f)
                lineTo(9.343f, 17.353f)
                curveTo(9.561f, 16.325f, 9.044f, 15.283f, 8.094f, 14.835f)
                lineTo(5.99f, 13.84f)
                curveTo(4.775f, 13.266f, 4f, 12.043f, 4f, 10.699f)
                verticalLineTo(4.631f)
                curveTo(4f, 3.73f, 4.73f, 3f, 5.631f, 3f)
                horizontalLineTo(18.368f)
                curveTo(19.27f, 3f, 20f, 3.73f, 20f, 4.631f)
                verticalLineTo(10.699f)
                curveTo(20f, 12.043f, 19.225f, 13.266f, 18.01f, 13.84f)
                lineTo(15.906f, 14.835f)
                curveTo(14.956f, 15.283f, 14.439f, 16.325f, 14.657f, 17.353f)
                lineTo(14.719f, 17.646f)
                curveTo(15.084f, 19.374f, 13.766f, 21f, 12f, 21f)
                close()
            }
        }.build()

        return _Brush!!
    }

@Suppress("ObjectPropertyName")
private var _Brush: ImageVector? = null
