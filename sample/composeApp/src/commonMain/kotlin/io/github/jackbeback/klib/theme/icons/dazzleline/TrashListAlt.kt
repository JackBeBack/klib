package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrashListAlt: ImageVector
    get() {
        if (_TrashListAlt != null) {
            return _TrashListAlt!!
        }
        _TrashListAlt = ImageVector.Builder(
            name = "TrashListAlt",
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
                moveTo(19f, 9f)
                horizontalLineTo(22f)
                moveTo(19f, 14f)
                horizontalLineTo(22f)
                moveTo(19f, 19f)
                horizontalLineTo(21f)
                moveTo(16f, 6f)
                lineTo(15.199f, 18.013f)
                curveTo(15.129f, 19.065f, 15.094f, 19.591f, 14.867f, 19.99f)
                curveTo(14.667f, 20.341f, 14.365f, 20.624f, 14.001f, 20.8f)
                curveTo(13.588f, 21f, 13.061f, 21f, 12.006f, 21f)
                horizontalLineTo(7.994f)
                curveTo(6.939f, 21f, 6.412f, 21f, 5.999f, 20.8f)
                curveTo(5.635f, 20.624f, 5.333f, 20.341f, 5.133f, 19.99f)
                curveTo(4.906f, 19.591f, 4.871f, 19.065f, 4.801f, 18.013f)
                lineTo(4f, 6f)
                moveTo(2f, 6f)
                horizontalLineTo(18f)
                moveTo(14f, 6f)
                lineTo(13.729f, 5.188f)
                curveTo(13.467f, 4.401f, 13.336f, 4.008f, 13.093f, 3.717f)
                curveTo(12.878f, 3.46f, 12.602f, 3.261f, 12.29f, 3.139f)
                curveTo(11.938f, 3f, 11.523f, 3f, 10.694f, 3f)
                horizontalLineTo(9.306f)
                curveTo(8.477f, 3f, 8.062f, 3f, 7.71f, 3.139f)
                curveTo(7.398f, 3.261f, 7.122f, 3.46f, 6.907f, 3.717f)
                curveTo(6.664f, 4.008f, 6.533f, 4.401f, 6.271f, 5.188f)
                lineTo(6f, 6f)
                moveTo(12f, 10f)
                verticalLineTo(17f)
                moveTo(8f, 10f)
                lineTo(8f, 17f)
            }
        }.build()

        return _TrashListAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TrashListAlt: ImageVector? = null
