package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.Flute: ImageVector
    get() {
        if (_Flute != null) {
            return _Flute!!
        }
        _Flute = ImageVector.Builder(
            name = "Flute",
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
                moveTo(7f, 9f)
                verticalLineTo(15f)
                moveTo(11f, 12f)
                horizontalLineTo(11.01f)
                moveTo(14f, 12f)
                horizontalLineTo(14.01f)
                moveTo(17f, 12f)
                horizontalLineTo(17.01f)
                moveTo(4.6f, 15f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 15f, 20.24f, 15f, 20.454f, 14.891f)
                curveTo(20.642f, 14.795f, 20.795f, 14.642f, 20.891f, 14.454f)
                curveTo(21f, 14.24f, 21f, 13.96f, 21f, 13.4f)
                verticalLineTo(10.6f)
                curveTo(21f, 10.04f, 21f, 9.76f, 20.891f, 9.546f)
                curveTo(20.795f, 9.358f, 20.642f, 9.205f, 20.454f, 9.109f)
                curveTo(20.24f, 9f, 19.96f, 9f, 19.4f, 9f)
                horizontalLineTo(4.6f)
                curveTo(4.04f, 9f, 3.76f, 9f, 3.546f, 9.109f)
                curveTo(3.358f, 9.205f, 3.205f, 9.358f, 3.109f, 9.546f)
                curveTo(3f, 9.76f, 3f, 10.04f, 3f, 10.6f)
                verticalLineTo(13.4f)
                curveTo(3f, 13.96f, 3f, 14.24f, 3.109f, 14.454f)
                curveTo(3.205f, 14.642f, 3.358f, 14.795f, 3.546f, 14.891f)
                curveTo(3.76f, 15f, 4.04f, 15f, 4.6f, 15f)
                close()
            }
        }.build()

        return _Flute!!
    }

@Suppress("ObjectPropertyName")
private var _Flute: ImageVector? = null
