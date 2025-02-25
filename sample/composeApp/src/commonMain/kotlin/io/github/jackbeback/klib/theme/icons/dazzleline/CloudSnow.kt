package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.CloudSnow: ImageVector
    get() {
        if (_CloudSnow != null) {
            return _CloudSnow!!
        }
        _CloudSnow = ImageVector.Builder(
            name = "CloudSnow",
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
                moveTo(9f, 18f)
                horizontalLineTo(9.01f)
                moveTo(15f, 18f)
                horizontalLineTo(15.01f)
                moveTo(9f, 20.5f)
                horizontalLineTo(9.01f)
                moveTo(12f, 18f)
                horizontalLineTo(12.01f)
                moveTo(12f, 21f)
                horizontalLineTo(12.01f)
                moveTo(15f, 20.5f)
                horizontalLineTo(15.01f)
                moveTo(8.8f, 15f)
                curveTo(6.149f, 15f, 4f, 12.947f, 4f, 10.414f)
                curveTo(4f, 8.314f, 5.6f, 6.375f, 8f, 6f)
                curveTo(8.753f, 4.274f, 10.535f, 3f, 12.613f, 3f)
                curveTo(15.275f, 3f, 17.45f, 4.991f, 17.6f, 7.5f)
                curveTo(19.013f, 8.096f, 20f, 9.557f, 20f, 11.14f)
                curveTo(20f, 13.272f, 18.209f, 15f, 16f, 15f)
                lineTo(8.8f, 15f)
                close()
            }
        }.build()

        return _CloudSnow!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSnow: ImageVector? = null
