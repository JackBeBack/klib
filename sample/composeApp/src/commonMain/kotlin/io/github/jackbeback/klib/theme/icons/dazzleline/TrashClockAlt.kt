package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.TrashClockAlt: ImageVector
    get() {
        if (_TrashClockAlt != null) {
            return _TrashClockAlt!!
        }
        _TrashClockAlt = ImageVector.Builder(
            name = "TrashClockAlt",
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
                moveTo(6f, 6f)
                lineTo(6.801f, 18.013f)
                curveTo(6.871f, 19.065f, 6.906f, 19.591f, 7.133f, 19.99f)
                curveTo(7.333f, 20.341f, 7.635f, 20.624f, 7.999f, 20.8f)
                curveTo(8.412f, 21f, 8.941f, 21f, 10f, 21f)
                moveTo(18f, 6f)
                lineTo(17.8f, 9f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                moveTo(16f, 6f)
                lineTo(15.729f, 5.188f)
                curveTo(15.467f, 4.401f, 15.336f, 4.008f, 15.093f, 3.717f)
                curveTo(14.878f, 3.46f, 14.602f, 3.261f, 14.29f, 3.139f)
                curveTo(13.938f, 3f, 13.523f, 3f, 12.694f, 3f)
                horizontalLineTo(11.306f)
                curveTo(10.477f, 3f, 10.062f, 3f, 9.71f, 3.139f)
                curveTo(9.398f, 3.261f, 9.122f, 3.46f, 8.907f, 3.717f)
                curveTo(8.664f, 4.008f, 8.533f, 4.401f, 8.271f, 5.188f)
                lineTo(8f, 6f)
                moveTo(17f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(18.5f)
                moveTo(21f, 17f)
                curveTo(21f, 19.209f, 19.209f, 21f, 17f, 21f)
                curveTo(14.791f, 21f, 13f, 19.209f, 13f, 17f)
                curveTo(13f, 14.791f, 14.791f, 13f, 17f, 13f)
                curveTo(19.209f, 13f, 21f, 14.791f, 21f, 17f)
                close()
            }
        }.build()

        return _TrashClockAlt!!
    }

@Suppress("ObjectPropertyName")
private var _TrashClockAlt: ImageVector? = null
