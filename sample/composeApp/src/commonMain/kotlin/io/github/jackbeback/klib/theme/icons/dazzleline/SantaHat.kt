package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.SantaHat: ImageVector
    get() {
        if (_SantaHat != null) {
            return _SantaHat!!
        }
        _SantaHat = ImageVector.Builder(
            name = "SantaHat",
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
                moveTo(20f, 17f)
                lineTo(16.979f, 6.429f)
                curveTo(16.399f, 4.399f, 14.544f, 3f, 12.433f, 3f)
                curveTo(10.906f, 3f, 9.472f, 3.737f, 8.585f, 4.98f)
                lineTo(5.357f, 9.499f)
                moveTo(5.357f, 9.499f)
                curveTo(5.093f, 9.267f, 4.748f, 9.125f, 4.375f, 9.125f)
                curveTo(3.547f, 9.125f, 2.875f, 9.797f, 2.875f, 10.625f)
                curveTo(2.875f, 11.453f, 3.547f, 12.125f, 4.375f, 12.125f)
                curveTo(5.203f, 12.125f, 5.875f, 11.453f, 5.875f, 10.625f)
                curveTo(5.875f, 10.179f, 5.673f, 9.775f, 5.357f, 9.499f)
                close()
                moveTo(6f, 17f)
                lineTo(9.5f, 7f)
                lineTo(5.564f, 9.713f)
                moveTo(6.6f, 21f)
                horizontalLineTo(19.4f)
                curveTo(19.96f, 21f, 20.24f, 21f, 20.454f, 20.891f)
                curveTo(20.642f, 20.795f, 20.795f, 20.642f, 20.891f, 20.454f)
                curveTo(21f, 20.24f, 21f, 19.96f, 21f, 19.4f)
                verticalLineTo(18.6f)
                curveTo(21f, 18.04f, 21f, 17.76f, 20.891f, 17.546f)
                curveTo(20.795f, 17.358f, 20.642f, 17.205f, 20.454f, 17.109f)
                curveTo(20.24f, 17f, 19.96f, 17f, 19.4f, 17f)
                horizontalLineTo(6.6f)
                curveTo(6.04f, 17f, 5.76f, 17f, 5.546f, 17.109f)
                curveTo(5.358f, 17.205f, 5.205f, 17.358f, 5.109f, 17.546f)
                curveTo(5f, 17.76f, 5f, 18.04f, 5f, 18.6f)
                verticalLineTo(19.4f)
                curveTo(5f, 19.96f, 5f, 20.24f, 5.109f, 20.454f)
                curveTo(5.205f, 20.642f, 5.358f, 20.795f, 5.546f, 20.891f)
                curveTo(5.76f, 21f, 6.04f, 21f, 6.6f, 21f)
                close()
            }
        }.build()

        return _SantaHat!!
    }

@Suppress("ObjectPropertyName")
private var _SantaHat: ImageVector? = null
